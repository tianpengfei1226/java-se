package com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.factory;

import com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.annotation.ValidRegion;
import com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.common.OmsContents;
import com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.domain.OmsOrder;
import com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.proxy.MatchStrategyProxy;
import com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.strategy.MatchStrategy;

import java.io.File;
import java.io.FileFilter;
import java.lang.annotation.Annotation;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * <p> 订单匹配工厂 </p>
 * 简单工厂
 *
 * @author : tianpengfei
 * @version :  MatchOrderFactory.java,v 1.0, 2019/1/28-17:44 tianpengfei Exp $
 */
public class MatchOrderFactory {

	private ClassLoader classLoader = getClass().getClassLoader();

	private List<Class<? extends MatchStrategy>> strategyList;

	/**
	 * 根据匹配方式生成策略
	 *
	 * @param order
	 * @return
	 */
	public MatchStrategy createStrategy(OmsOrder order) {
		SortedMap<Integer, Class<? extends MatchStrategy>> clazzMap = new TreeMap<Integer, Class<? extends MatchStrategy>>();
		for (Class<? extends MatchStrategy> clazz : strategyList) {
			Annotation validRegion = handleAnnotation(clazz);
			if (validRegion instanceof ValidRegion) {
				ValidRegion validRegionAnn = (ValidRegion) validRegion;
				if (order.getMatchProp().getPropName().equals(validRegionAnn.name())) {
					clazzMap.put(order.getMatchProp().getPriority(), clazz);
				}
			}
		}
		try {
			if (clazzMap != null && clazzMap.size() > 0) {
				return MatchStrategyProxy.getProxy(clazzMap.get(clazzMap.lastKey()));
			}
			return null;
		} catch (Exception e) {
			throw new RuntimeException("订单匹配策略获得失败");
		}
	}

	/**
	 * 处理注解
	 *
	 * @param clazz
	 * @return
	 */
	private Annotation handleAnnotation(Class<? extends MatchStrategy> clazz) {
		Annotation[] annotations = clazz.getDeclaredAnnotations();
		if (annotations == null || annotations.length == 0) {
			return null;
		}
		for (int i = 0; i < annotations.length; i++) {
			if (annotations[i] instanceof ValidRegion) {
				return annotations[i];
			}
		}
		return null;
	}

	/**
	 * 在工厂初始化时要初始化策略列表
	 */
	public void init() {
		strategyList = new ArrayList<Class<? extends MatchStrategy>>();
		// 获取到包下所有的class文件
		File[] resources = getResources();
		Class<MatchStrategy> strategyClazz = null;
		try {
			// 使用相同的加载器加载策略接口
			strategyClazz = (Class<MatchStrategy>) classLoader.loadClass(MatchStrategy.class.getName());
		} catch (ClassNotFoundException e1) {
			throw new RuntimeException("未找到策略接口");
		}
		for (int i = 0; i < resources.length; i++) {
			try {
				// 载入包下的类
				Class<?> clazz = classLoader.loadClass(OmsContents.CAL_PRICE_PACKAGE + OmsContents.DIAN_STRING + resources[i].getName().replace(OmsContents.CLASS_SUFFIX, OmsContents.EMPTY_STRING));
				// 判断是否是MatchStrategy的实现类并且不是MatchStrategy它本身，满足的话加入到策略列表
				if (MatchStrategy.class.isAssignableFrom(clazz) && clazz != strategyClazz) {
					strategyList.add((Class<? extends MatchStrategy>) clazz);
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 获取扫描的包下面所有的class文件
	 *
	 * @return
	 */
	private File[] getResources() {
		try {
			File file = new File(classLoader.getResource(OmsContents.CAL_PRICE_PACKAGE.replace(OmsContents.DIAN_STRING, OmsContents.XIEGANG_STRING)).toURI());
			return file.listFiles(new FileFilter() {
				@Override
				public boolean accept(File pathname) {
					// 只扫描class文件
					if (pathname.getName().endsWith(OmsContents.CLASS_SUFFIX)) {
						return true;
					}
					return false;
				}
			});
		} catch (URISyntaxException e) {
			throw new RuntimeException("未找到策略资源");
		}
	}

	/**
	 * 单例
	 */
	private MatchOrderFactory() {
		init();
	}

	public static MatchOrderFactory getInstance() {
		return MatchOrderFactoryHolder.instance;
	}

	private static class MatchOrderFactoryHolder {
		private static MatchOrderFactory instance = new MatchOrderFactory();
	}
}
