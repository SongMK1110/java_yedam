package com.yedam.java.ch02_02;

public interface RemoteControl {
	// 상수(static final)
	//public static final int MAX_VALUE = 10;
	public int MAX_VALUE = 10;
	public int MIN_VALUE = 0;
	
	// 인터페이스에서 일반 메소드 쓸려면 default 써야함
//	public default void method() {
//		System.out.println("일반 메소드입니다.");
//	}
	
	// 추상 메소드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
