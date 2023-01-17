package com.yedam.java.ch03_01;

public class PhoneExample {

	public static void main(String[] args) {
		//Phone phone = new Phone("홍길동");
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		//자동 타입 변환 가능(변수로는 됨)
//		Phone phone = new SmartPhone("홍길동");
		
		//강제 타입 변환 안됨(new가 안됨)
//		SmartPhone smartPhone1 = (SmartPhone) new Phone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
	}

}
