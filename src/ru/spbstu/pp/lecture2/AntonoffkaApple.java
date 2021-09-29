package ru.spbstu.pp.lecture2;

public class AntonoffkaApple extends Fruit implements Apple {
	private final AppleNames name;

	public AntonoffkaApple(ColorValues color) {
		super(color);
		this.name = AppleNames.ANTONOFFKA;
	}

	@Override
	public AppleNames getName() {
		return name;
	}
}
