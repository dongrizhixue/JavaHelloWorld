package com.helloworld;

//计算圆形
public class Circle extends Calculate {
	private float r;
	private float pi = 3.1415926f;

	@Override
	public void Perimeter() {
		// TODO Auto-generated method stub
		System.out.println("圆的周长是：" + r * pi);
	}

	@Override
	public void Area() {
		// TODO Auto-generated method stub
		System.out.println("圆的面积是：" + r * r * pi);
	}

	public Circle(float paraR) {
		r = paraR;
	}
}
