package com.helloworld;

//����Բ��
public class Circle extends Calculate {
	private float r;
	private float pi = 3.1415926f;

	@Override
	public void Perimeter() {
		// TODO Auto-generated method stub
		System.out.println("Բ���ܳ��ǣ�" + r * pi);
	}

	@Override
	public void Area() {
		// TODO Auto-generated method stub
		System.out.println("Բ������ǣ�" + r * r * pi);
	}

	public Circle(float paraR) {
		r = paraR;
	}
}
