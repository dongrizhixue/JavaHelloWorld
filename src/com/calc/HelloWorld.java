package com.calc;

import java.util.Arrays;

public class HelloWorld {
	public static void main(String[] args) {

		// �������󣬶�����Ϊhello
		HelloWorld hello = new HelloWorld();

		// ���÷������������ſγ̵ĳɼ�
		hello.calcAvg(94, 81);
	}

	/*
	 * ���ܣ��������ſγ̿��Գɼ���ƽ���ֲ����ƽ���� ����һ���������������ķ����������������ſγ̵ĳɼ�
	 */
	public void calcAvg(float a, float b) {
		float avg = (a + b) / 2;
		System.out.println("ƽ���֣�" + avg);
	}
}
