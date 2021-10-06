package ru.spbstu.pp.lecture4;

import org.apache.commons.collections4.Bag;

public class RuntimeExcHandler {
	
	public static void main(String[] args) throws ApplicationException {
		foo();
	}

	private static void foo() throws ApplicationException {
		try {
			bar();
		} catch (AppRuntimeException e) {
			throw new ApplicationException(e);
		}
	}

	private static void bar() {
		Bag<String> bag;
		throw new AppRuntimeException();
	}

}
