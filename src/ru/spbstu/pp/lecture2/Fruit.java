package ru.spbstu.pp.lecture2;

public class Fruit implements Color {
	private ColorValues color;

	public Fruit(ColorValues color) {
		super();
		this.color = color;
	}

	public ColorValues getColor() {
		return color;
	}

	public void setColor(ColorValues color) {
		this.color = color;
	}
}
