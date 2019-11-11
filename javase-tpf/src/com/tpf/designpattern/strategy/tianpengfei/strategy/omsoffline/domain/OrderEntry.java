package com.tpf.designpattern.strategy.tianpengfei.strategy.omsoffline.domain;

import java.util.*;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  OrderEntry.java,v 1.0, 2019/3/7-11:13 tianpengfei Exp $
 */
public class OrderEntry {
	private String name;
	private int flag;
	private OrderEntry next;

	public OrderEntry(String name, int flag, OrderEntry next) {
		this.name = name;
		this.flag = flag;
		this.next = next;
	}

	public OrderEntry(String name, OrderEntry n) {
		this.name = name;
		this.next = n;
	}


	public OrderEntry(String name) {
	}
	public OrderEntry() {
	}

	static OrderEntry[] table = new OrderEntry[4];
	public static void main(String[] args) {
		SortedMap<Integer, OrderEntry> orderMap = buildTreeMap();
		for (int i = 0;i<orderMap.size();i++){
			addEntry(i);
		}
		System.out.println();
		OrderEntry entry = table[0];

		OrderEntry current = entry;
		while(current != null){
			System.out.println(current.name);
			current = current.next;
		}
	}

	private static SortedMap<Integer, OrderEntry> buildTreeMap() {
		SortedMap<Integer, OrderEntry> map = new TreeMap<Integer, OrderEntry>();
		map.put(1, new OrderEntry("acctNo"));
		map.put(2, new OrderEntry("acctName"));
		map.put(7, new OrderEntry("note"));
		map.put(6, new OrderEntry("amount"));
		return map;
	}

	OrderEntry get(int flag){
//		table[0].
		return null;
	}
	private static void addEntry(int i) {
		OrderEntry e = table[0];

		table[0] = new OrderEntry("acctNo__"+i,i, e);
	}

	public String getName() {
		name.matches("asdfas");
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

}
