package com.yedam.test3;

public class Exam04 {

	public static void main(String[] args) {
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.printf("%d X %d = %d\n", i, j, i*j);
			}
		}
	}

}
