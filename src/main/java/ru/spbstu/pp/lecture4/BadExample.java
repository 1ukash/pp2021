package ru.spbstu.pp.lecture4;

public class BadExample {
	// never do it in this way
	public static void main(String[] args) {
		try {
			foo();
		} catch (Exception e) {} //never happens
		
		try {
			bar();
		} catch (Throwable e) {} //I don't care
	}

	private static void bar() {
		// TODO Auto-generated method stub
	}

	private static void foo() throws Exception {
		// a lot of complex code
	}
}
