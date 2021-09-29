package ru.spbstu.pp.lecture1;

import java.util.Date;

public class HelloWorld {

	private static Date now = new Date();

	static int[] buf;

	public static void main(String[] args) {

		int x = 0;
		while (x < 10) {
			System.out.println(x++);
		}

		Integer y = new Integer(0);

		while (y < 10) {
			System.out.println(y++);
		}
		buf = new int[10];
		System.out.println("Hello world " + now);
	}

	void foo(int[] buf) {

	}
}
