package ru.spbstu.pp.lecture2;

public final class JustAClass {
	
	private final int x;
	
	protected String str = "abc";
	long y = 10L;
	public double morozoff = 0.1;
	private Object obj = null; //null
	
	static int Var1 = 11;
	final static int CONST_1 = 10;
	final static Object object = new Object();
	
	{
		y = 5;
	}
	
	static {
		Var1 = 12;
	}
	
	public JustAClass(int x, long y) {
		super();
		this.x = x;
		this.y = y;
	}

	public JustAClass() {
		super();
		this.x = 10;
	}
	
	
	final public void foo( ) {
		
	}
	
	private static void bar(int a) {
		
	}

}
