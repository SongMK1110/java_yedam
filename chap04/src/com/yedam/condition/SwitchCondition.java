package com.yedam.condition;

import java.util.Scanner;

public class SwitchCondition {
	public static void main(String[] args) {
		int number = (int) (Math.random() * 6) +1;
		System.out.println(number);
		switch(number) {
		case 1:
			System.out.println("1번나옴");
			break;
		case 2:
			System.out.println("2번나옴");
			break;
		case 3:
			System.out.println("3번나옴");
			break;
		case 4:
			System.out.println("4번나옴");
			break;
		case 5:
			System.out.println("5번나옴");
			break;
		default: //else
			System.out.println("6번나옴");
			break;
//		case 6:
//			System.out.println("6번나옴");
//			break;
		}
		
		//char
		
		char grade = 'B';
		String grade2 = "b";
		
		switch(grade2) {
		case "A":
			System.out.println("우수 회원");
			break;
		case "B":
		case "b":
			System.out.println("일반 회원");
			break;
		default:
			System.out.println("손님");
			break;
		}
		
		//입력한 성적을 등급으로 환산
		Scanner sc = new Scanner(System.in);
		//90, 80, 70, 60
		System.out.println("입력>");
		int scores = Integer.parseInt(sc.nextLine())/10;
		switch (scores) {
		case 10:
		case 9:
			System.out.println("A등급");
			break;
		case 8:
			System.out.println("B등급");
			break;
		case 7:
			System.out.println("C등급");
			break;
		default:
			System.out.println("D등급");
			break;			
		}
	}
}