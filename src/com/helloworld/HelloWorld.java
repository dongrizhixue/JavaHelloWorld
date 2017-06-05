package com.helloworld;

import java.util.Scanner;

public class HelloWorld {

	private static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入圆的半径：");
		scanner = new Scanner(System.in);
		String r = scanner.next();
		Calculate calculate = new Circle(Float.parseFloat(r));
		calculate.Perimeter();
		calculate.Area();
		System.out.println("请输入长方形的宽：");
		scanner = new Scanner(System.in);
		String width = scanner.next();
		System.out.println("请输入长方形的高：");
		scanner = new Scanner(System.in);
		String height = scanner.next();
		Calculate calculate2 = new Rectangle(Float.parseFloat(width), Float.parseFloat(height));
		calculate2.Perimeter();
		calculate2.Area();
	}

}
