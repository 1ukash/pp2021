package ru.spbstu.pp.lecture4;

import java.util.Random;

public class Handler {
	public static void main(String[] args) {
		foo();
	}

	private static void foo() {
		try {
			bar();
		} catch (ApplicationException e) {
			e.printStackTrace();
		}
	}

	private static void bar() throws ApplicationException  {
		baz();
	}

	private static void baz() throws ApplicationException {
		Random r = new Random();
		
		if (r.nextBoolean()) {
			throw new ApplicationException();
		}
		
	}
}
