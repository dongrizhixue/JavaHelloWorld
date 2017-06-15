package com.calc;

public class HelloWorld {
	public static void main(String[] args) {

		// 创建对象
		HelloWorld hello = new HelloWorld();

		// 调用无参的方法
		hello.print();
		// 调用带有一个字符串参数的方法
		hello.print("imooc");
		// 调用带有一个整型参数的方法
		hello.print(18);
	}

	public void print() {
		System.out.println("无参的print方法");
	}

	public void print(String name) {
		System.out.println("带有一个字符串参数的print方法，参数值为：" + name);
	}

	public void print(int age) {
		System.out.println("带有一个整型参数的print方法，参数值为：" + age);
	}
}
