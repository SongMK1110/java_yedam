package com.yedam.java.ch03.string;

import java.io.UnsupportedEncodingException;

public class Example {

	public static void main(String[] args) {
		// byte[] -> String
		byte[] bytes1 = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		String str1 = new String(bytes1);
		System.out.println(str1);
		
		// 별도의 문자셋(기준)을 지정하는 경우
		String str = "안녕하세요";//한글은 한문자당 3byte
		byte[] bytesX = str.getBytes();
		System.out.println("bytesX.length : " + bytesX.length);
		String strX = new String(bytesX);
		System.out.println("bytesX -> strX : " + strX);
		
		try {
			byte[] bytesY = str.getBytes("UTF-8");
			System.out.println("bytesY.length : " + bytesY.length);
			String strY = new String(bytesY, "EUC-KR");
			System.out.println("bytesY -> strY : " + strY);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
	}

}
