package ru.spbstu.pp.lecture5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class WorkWithCollections {
	
	
	public static void main(String[] args) {
		
//		simpleStrings();
		setAndObjects();
		
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(1);
		list.add(3);
		list.add(5);

		for (Integer i: list) {
			System.out.println(i);
		}
		
	}

	private static void setAndObjects() {
		Set<PojoObject> s = new HashSet<>();
		s.add(new PojoObject(1));
		s.add(new PojoObject(2));
		s.add(new PojoObject(3));
		s.add(new PojoObject(3));
		
		for (PojoObject o: s) {
			System.out.println(o);
		}
	}

	private static void simpleStrings() {
		Set<String> s = new HashSet<>();
		s.add("b");
		s.add("a");
		s.add("c");
		
		for (String str: s) {
			System.out.println(str);
		}
		
		System.out.println();
		Set<String> s2 = new LinkedHashSet<>();
		s2.add("b");
		s2.add("a");
		s2.add("c");
		
		for (String str: s2) {
			System.out.println(str);
		}
		
		System.out.println();
		Set<String> s3 = new TreeSet<>();
		s3.add("b");
		s3.add("a");
		s3.add("c");
		s3.add("c");
		
		for (String str: s3) {
			System.out.println(str);
		}
	}
	

}
