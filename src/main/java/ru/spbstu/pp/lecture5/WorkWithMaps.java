package ru.spbstu.pp.lecture5;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class WorkWithMaps {
	
	
	public static void main(String[] args) {
		
		Comparator<PojoObject> c = new Comparator<PojoObject>() {

			@Override
			public int compare(PojoObject o1, PojoObject o2) {
				Integer i1 = o1.getId();
				Integer i2 = o2.getId();
				return i1.compareTo(i2);
			}
		};
		
		Map<Integer, PojoObject> map = new HashMap<>();
		Map<PojoObject, Integer> tm = new TreeMap<>(c);
		
		PojoObject po;
		for (int i = 0; i < 10; i++ ) {
			po = new PojoObject(i);
			map.put(i, po);
			tm.put(po, i);
		}
		
		PojoObject obj = map.get(5); //O(1)
		System.out.println(obj);
		
		PojoObject obj2 = map.get(100);
		System.out.println(obj2);
		
		for (PojoObject i: tm.keySet()) {
			System.out.println(i);
		}
		
		
	}
	

}
