package com.calc;

public class HelloWorld {
	public static void main(String[] args) {

		// ��������
		HelloWorld hello = new HelloWorld();

		// �����޲εķ���
		hello.print();
		// ���ô���һ���ַ��������ķ���
		hello.print("imooc");
		// ���ô���һ�����Ͳ����ķ���
		hello.print(18);
	}

	public void print() {
		System.out.println("�޲ε�print����");
	}

	public void print(String name) {
		System.out.println("����һ���ַ���������print����������ֵΪ��" + name);
	}

	public void print(int age) {
		System.out.println("����һ�����Ͳ�����print����������ֵΪ��" + age);
	}
}
