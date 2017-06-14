package com.calc;

import java.util.Arrays;

public class HelloWorld {
	public static void main(String[] args) {

		// 创建对象，对象名为hello
		HelloWorld hello = new HelloWorld();

		// 调用方法，传入两门课程的成绩
		hello.calcAvg(94, 81);
	}

	/*
	 * 功能：计算两门课程考试成绩的平均分并输出平均分 定义一个包含两个参数的方法，用来传入两门课程的成绩
	 */
	public void calcAvg(float a, float b) {
		float avg = (a + b) / 2;
		System.out.println("平均分：" + avg);
	}
}
