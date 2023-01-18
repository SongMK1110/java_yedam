package com.yedam.java.ch01_01;

public class SmartTelevisionExample {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		tv.turnOn();
		tv.search("네이버");
		tv.setVolume(-100);
		tv.setVolume(20);
		tv.turnOff();
		
		//기능이 너무 많을 때 기능을 제한 할려고 자동 타입 변환함
		RemoteControl rc = tv;
		Searchable searchable = tv;
		
	}

}
