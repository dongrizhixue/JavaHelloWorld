package com.helloworld;

import java.util.Scanner;

public class ThreadDemo {

	public static void main(String[] args) {
		// ��������ɼ�
		int score = 53;

		// ��������ӷִ���
		int count = 0;

		// ��ӡ����ӷ�ǰ�ɼ�
		System.out.println("�ӷ�ǰ�ɼ���" + score);
		// ֻҪ�ɼ�С��60����ѭ��ִ�мӷֲ�������ͳ�Ƽӷִ���
		while (score < 60) {
			System.out.println("��ӷ֣�");
			score += new Scanner(System.in).nextInt();
			count++;
		}
		// ��ӡ����ӷֺ�ɼ����Լ��ӷִ���
		System.out.println("�ӷֺ�ɼ���" + score);
		System.out.println("������" + count + "�Σ�");
	}

}
