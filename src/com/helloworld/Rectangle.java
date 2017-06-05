package com.helloworld;

public class Rectangle extends Calculate {
	private float width;

	private float height;

	@Override
	public void Perimeter() {
		// TODO Auto-generated method stub
		float perimeter = (width + height) * 2;
		System.out.println("矩形的周长是:" + perimeter);
	}

	@Override
	public void Area() {
		// TODO Auto-generated method stub
		float area = width * height;
		System.out.println("矩形的面积是:" + area);
	}

	public Rectangle(float width, float height) {
		this.width = width;
		this.height = height;
	}
}
