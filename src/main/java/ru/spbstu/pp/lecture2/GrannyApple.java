package ru.spbstu.pp.lecture2;

public class GrannyApple extends Fruit implements Apple {

	public GrannyApple(ColorValues color) {
		super(color);
	}

	@Override
	public AppleNames getName() {
		return AppleNames.GRANNY_SMITH;
	}

}
