package com.tpf.订单生成;

import org.apache.commons.lang3.RandomUtils;

import java.net.InetAddress;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * <p> </p >
 *
 * @author : tianpf
 * @version :  OrderGen2Test.java,v 1.0, 2020/9/2-15:25 tianpengfei Exp $
 */
public class OrderGen2Test {
    /**
     * 订单号生成
     **/
    private static ZoneId ZONE_ID = ZoneId.of("Asia/Shanghai");
    private static final AtomicInteger SEQ = new AtomicInteger(1000);
    private static final DateTimeFormatter DF_FMT_PREFIX = DateTimeFormatter.ofPattern("yyMMddHHmmssSS");

    /**
     * generateOrderNo()方法内不需要加锁，因为AtomicInteger内使用的是CAS自旋转锁(保证可见性的同时也保证原子性
     * @return
     */
    public static String generateOrderNo() {
        LocalDateTime dataTime = LocalDateTime.now(ZONE_ID);
        if (SEQ.intValue() > 9990) {
            SEQ.getAndSet(1000);
        }
        return dataTime.format(DF_FMT_PREFIX) + getLocalIpSuffix() + SEQ.getAndIncrement();
    }

    private volatile static String IP_SUFFIX = null;

    /**
     * 方法内不需要对不为null的逻辑加同步锁(双向校验锁，整体是一种安全的单例模式)
     * @return
     */
    private static String getLocalIpSuffix() {
        if (null != IP_SUFFIX) {
            return IP_SUFFIX;
        }
        try {
            synchronized (OrderGen2Test.class) {
                if (null != IP_SUFFIX) {
                    return IP_SUFFIX;
                }
                InetAddress addr = InetAddress.getLocalHost();
                //  172.17.0.4  172.17.0.199 ,
                String hostAddress = addr.getHostAddress();
                if (null != hostAddress && hostAddress.length() > 4) {
                    String ipSuffix = hostAddress.trim().split("\\.")[3];
                    if (ipSuffix.length() == 2) {
                        IP_SUFFIX = ipSuffix;
                        return IP_SUFFIX;
                    }
                    ipSuffix = "0" + ipSuffix;
                    IP_SUFFIX = ipSuffix.substring(ipSuffix.length() - 2);
                    return IP_SUFFIX;
                }
                IP_SUFFIX = RandomUtils.nextInt(10, 20) + "";
                return IP_SUFFIX;
            }
        } catch (Exception e) {
            System.out.println("获取IP失败:" + e.getMessage());
            IP_SUFFIX = RandomUtils.nextInt(10, 20) + "";
            return IP_SUFFIX;
        }
    }

    public static void main(String[] args) {
        List<String> orderNos = Collections.synchronizedList(new ArrayList<>());
        IntStream.range(0, 8000).parallel().forEach(i -> {
            orderNos.add(generateOrderNo());
        });

        List<String> filterOrderNos = orderNos.stream().distinct().collect(Collectors.toList());

        System.out.println("订单样例：" + orderNos.get(33));
        System.out.println("生成订单数：" + orderNos.size());
        System.out.println("过滤重复后订单数：" + filterOrderNos.size());
        System.out.println("重复订单数：" + (orderNos.size() - filterOrderNos.size()));
    }

}
