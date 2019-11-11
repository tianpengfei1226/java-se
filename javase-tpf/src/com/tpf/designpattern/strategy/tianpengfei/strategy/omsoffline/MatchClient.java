package com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline;

import com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.domain.MatchProp;
import com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.domain.MatchResult;
import com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.domain.OmsOrder;
import com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.omsenum.MatchModeEnum;
import com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.omsenum.MatchType;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 * <p> strategy </p>
 * 定义：策略模式定义了一系列的算法，并将每一个算法封装起来，而且使它们还可以相互替换。策略模式让算法独立于使用它的客户而独立变化。
 *
 * @author : tianpengfei
 * @version :  MatchClient.java,v 1.0, 2018/12/11-10:55 tianpengfei Exp $
 */
public class MatchClient {
	public static void main(String[] args) throws Exception {

		OmsOrder omsOrder1 = new OmsOrder();
		MatchProp prop1 = new MatchProp();
		prop1.setPropName(MatchType.NOTE.getCode());
		prop1.setMatchMode(MatchModeEnum.REGEX_MATCH);
		prop1.setPriority(3);

		OmsOrder omsOrder2 = new OmsOrder();
		MatchProp prop2 = new MatchProp();
		prop2.setPropName(MatchType.AMOUNT.getCode());
		prop2.setMatchMode(MatchModeEnum.ACCURATE_MATCH);
		prop2.setPriority(5);

		OmsOrder omsOrder3 = new OmsOrder();
		MatchProp prop3 = new MatchProp();
		prop3.setPropName(MatchType.ACCT_NO.getCode());
		prop3.setMatchMode(MatchModeEnum.ACCURATE_MATCH);
		prop3.setPriority(6);

		OmsOrder omsOrder4 = new OmsOrder();
		MatchProp prop4 = new MatchProp();
		prop4.setPropName(MatchType.ACCT_NAME.getCode());
		prop4.setMatchMode(MatchModeEnum.ACCURATE_MATCH);
		prop4.setPriority(1);

		omsOrder1.setMatchProp(prop1);
		omsOrder2.setMatchProp(prop2);
		omsOrder3.setMatchProp(prop3);
		omsOrder4.setMatchProp(prop4);


		SortedMap<Integer, OmsOrder> map = new TreeMap<Integer, OmsOrder>();
		map.put(omsOrder1.getMatchProp().getPriority(), omsOrder1);
		map.put(omsOrder2.getMatchProp().getPriority(), omsOrder2);
		map.put(omsOrder3.getMatchProp().getPriority(), omsOrder3);
		map.put(omsOrder4.getMatchProp().getPriority(), omsOrder4);

		MatchResult result = null;
		boolean needCondition = map != null && map.size() > 0 ? true : false;
		do {
			OmsOrder order = map.remove(map.lastKey());
			if (map == null || map.size()==0){
				needCondition = false;
			}
			try {
				result = order.pay(order);
				if (!"000".equals(result.getResultCode())){
					break;
				}
			} catch (Exception e) {

				e.printStackTrace();
			}

		} while (needCondition);


		//  处理结果集




	}
}
