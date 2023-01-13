package com.yedam.test2;

public class Exam03 {

	public static void main(String[] args) {
		int[] coinUnit = new int[4]; // 각 금액별 동전개수
		int money = 2680;
		
		System.out.println("money=" + money);
		for(int i = 0; i < coinUnit.length; i++) {
			if(money >= 500) {
				coinUnit[i] = money / 500;
				money = money % 500; // money = money - (coinUnit[i] * 500);
				System.out.println("500원 : " + coinUnit[i] + "개");
			} else if(money >= 100) {
				coinUnit[i] = money / 100;
				money = money % 100;
				System.out.println("100원 : " + coinUnit[i] + "개");
			} else if(money >= 50) {
				coinUnit[i] = money / 50;
				money = money % 50;
				System.out.println("50원 : " + coinUnit[i] + "개");
			} else if(money >= 10) {
				coinUnit[i] = money / 10;
				money = money % 10;
				System.out.println("10원 : " + coinUnit[i] + "개");
			}
		}
	}

}
