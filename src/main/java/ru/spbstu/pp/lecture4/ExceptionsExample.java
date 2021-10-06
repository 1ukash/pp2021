package ru.spbstu.pp.lecture4;

public class ExceptionsExample {
	
	
	public static void main(String[] args) {
		String str = "abs";
		Object npe = null;
		
		try {
			npe(null);
		} catch (NullPointerException e) {
			System.out.println(e + " plus another information");
			npe(new Object());
			npe.toString();
		} finally {
			System.out.println("final ops");
		}
		
		try {
			classCast(str);
		} catch (Exception e) {
			System.out.println(e + " plus another information");
		}
		
	}

	private static void npe(Object object) {
		object.toString();
	}

	private static void classCast(Object str) {
		Integer val = (Integer) str;
	}

}
