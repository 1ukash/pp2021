package ru.spbstu.pp.lecture2;

public class AppleFactory {
	
	public static void main(String[] args) {
		Fruit apple1 = new AntonoffkaApple(ColorValues.GREEN);
		Apple apple2 = new GrannyApple(ColorValues.RED);
		AntonoffkaApple apple3 = new AntonoffkaApple(ColorValues.WHITE);
/*		
		System.out.println(apple1 instanceof Fruit);
		System.out.println(apple1 instanceof Apple);
		System.out.println(apple1 instanceof AntonoffkaApple);
		System.out.println(apple1 instanceof GrannyApple);
		System.out.println();
		System.out.println(apple3.getClass() == AntonoffkaApple.class);
		System.out.println(apple3.getClass() == Apple.class);
		
		AbstractBehavior b1 = new ExactBehavior();
*/		
	}
	
}
