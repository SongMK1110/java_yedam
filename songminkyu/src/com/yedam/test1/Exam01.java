package com.yedam.test1;

public class Exam01 {

	public static void main(String[] args) {
		int x = 10;
		double y = 2.0;
		
		System.out.printf("%d + %.1f = %d\n", x, y, (int)(x+y));
		System.out.printf("%d - %.1f = %d\n", x, y, (int)(x-y));
		System.out.printf("%d * %.1f = %d\n", x, y, (int)(x*y));
		System.out.printf("%d / %.1f = %d\n", x, y, (int)(x/y));

	}

}
