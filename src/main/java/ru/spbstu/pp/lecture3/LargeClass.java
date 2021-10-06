package ru.spbstu.pp.lecture3;

public class LargeClass {
	
	class DataClass {
		int x, y;

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}

		public void bar() {
			System.out.println(name + ": " + x + ", " + y);
		}
	}
	
	private static class StaticInnerClass {
		int z;
		
	}
	
	private String name = "test";
	private DataClass dc = new DataClass();
	private LargeClass anotherInstance = new LargeClass();
	
	public static void main(String[] args) {
		new LargeClass().foo();
	}
	
	private void foo() {
		DataClass dc = new DataClass();
		dc.bar();
		
		DataClass dc2 = anotherInstance.new DataClass();
	}

	public DataClass getDc() {
		return dc;
	}
}
