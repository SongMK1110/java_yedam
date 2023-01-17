package com.yedam.java.ch03_example;

public abstract class PlayerLevel {
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	
	public abstract void showLevelMessage();
	
	
	//메서드에 final 오버라이딩 불가능
	public final void go(int count) {
		run();
		for(int i = 0; i < count; i++) {
			jump();
		}
		turn();
	}
	
}
