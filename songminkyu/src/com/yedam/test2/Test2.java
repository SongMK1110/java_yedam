package com.yedam.test2;

public class Test2 {

	public static void main(String[] args) {
		//큰 금액부터 동전을 우선적으로 거슬러 줘야한다.
		int[] coinUnit = new int[4];
		coinUnit[0] = 500;
		coinUnit[1] = 100;
		coinUnit[2] = 50;
		coinUnit[3] = 10;
		int money = 2680;
		System.out.println("money=" + money);
		for(int i = 0; i < coinUnit.length; i++) {
			if(money/coinUnit[i] > 0) {
                System.out.print(coinUnit[i]+"원 : "+money/coinUnit[i]+"개 ");
                money%=coinUnit[i];

            }
		}
		
	}

}
