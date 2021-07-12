package com.swa.oop2;

public class Triangle extends Shape {

	@Override
	public double getArea() {
		return (getHeight() * getWidth()) / 2;
	}

}
