package com.yedam.java.ch05.math;

public class Example {

	public static void main(String[] args) {
		// abs() : 절대값
		System.out.println("2.14의 절대값 : " + Math.abs(2.14));
		System.out.println("-2.14의 절대값 : " + Math.abs(-2.14));
		
		// max(), min() : 최대값, 최소값
		System.out.println("3.8, 6.7 중 최대값 : " + Math.max(3.8, 6.7));
		System.out.println("3.8, 6.7 중 최소값 : " + Math.min(3.8, 6.7));
		
		// ceil() : 올림값
		System.out.println("5.3 의 올림값 : " + Math.ceil(5.3));
		System.out.println("-5.3 의 올림값 : " + Math.ceil(-5.3));
		
		// floor() : 버림값
		System.out.println("5.3 의 버림값 : " + Math.floor(5.3));
		System.out.println("-5.3 의 버림값 : " + Math.floor(-5.3));
		
		// round() : 반올림 - 사사오입
		System.out.println("5.3 의 반올림값 : " + Math.round(5.3));
		System.out.println("-5.3 의 반올림값 : " + Math.round(-5.3));
		
		// rint() : 가까운 정수의 실수값 -> 정수가 짝수일 때는 6이상, 홀수일 때는 5이상
		System.out.println("5.5 의 가까운 정수의 실수값 : " + Math.rint(5.5));
		System.out.println("5.6 의 가까운 정수의 실수값 : " + Math.rint(5.6));
		System.out.println("4.5 의 가까운 정수의 실수값 : " + Math.rint(4.5));
		System.out.println("4.6 의 가까운 정수의 실수값 : " + Math.rint(4.6));
	}

}
