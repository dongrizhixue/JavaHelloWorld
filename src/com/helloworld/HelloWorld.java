package com.helloworld;

import java.util.Scanner;

public class HelloWorld {

	private static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������Բ�İ뾶��");
		scanner = new Scanner(System.in);
		String r = scanner.next();
		Calculate calculate = new Circle(Float.parseFloat(r));
		calculate.Perimeter();
		calculate.Area();
		System.out.println("�����볤���εĿ�");
		scanner = new Scanner(System.in);
		String width = scanner.next();
		System.out.println("�����볤���εĸߣ�");
		scanner = new Scanner(System.in);
		String height = scanner.next();
		Calculate calculate2 = new Rectangle(Float.parseFloat(width), Float.parseFloat(height));
		calculate2.Perimeter();
		calculate2.Area();
	}

}
