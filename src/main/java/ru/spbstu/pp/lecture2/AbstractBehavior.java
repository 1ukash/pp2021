package ru.spbstu.pp.lecture2;

public abstract class AbstractBehavior {

	private int num = 0;
	private String name;

	public AbstractBehavior() {
	}
	
	void doStupidStuffTenTimes() {
		for (int i = 0; i < 10; i++) {
			num ++;
		}
	}
	
	public void printNameToConsole() {
		System.out.println(getName());
	}
	
	abstract String getName();
}
