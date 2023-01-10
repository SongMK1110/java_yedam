package com.yedam.print;

import java.io.IOException;
import java.util.Scanner;

public class KeyCode {
	public static void main(String[] args) throws IOException {
		//keyCode 하나의 문자 받아올 때
		int keyCode = 0;
		System.out.println("입력>");
		
		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode);
		
		//Scanner
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("입력>");
		//scanner.nextLine() => enter키 이전까지 데이터를 받아 오세요
		//scanner.nextInt() => 웬만하면 쓰지말것 nextLine()써라 
		String inputDate = scanner.nextLine();
		System.out.println("Scanner 활용 : " + inputDate);
		
		//기본 타입, == ( 1==1, 1.2==1.2)
		//문자열 내용 비교
		if(inputDate.equals("yedam")){
			System.out.println("yedam과 일치합니다.");
			
		}
	}
}
