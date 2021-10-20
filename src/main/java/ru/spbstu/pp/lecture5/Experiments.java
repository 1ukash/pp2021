package ru.spbstu.pp.lecture5;

import java.util.Iterator;

public class Experiments {
	public static void main(String[] args) {
		SomethingIterable si = new SomethingIterable(1,2);
		
		Iterator<Integer> it = si.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		for (Integer val: si) {
			System.out.println(val);
		}
		
	}
}
