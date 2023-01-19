package com.yedam.java.ch02;
				//타입(클래스)를 값으로 받는 일종의 변수
public class Box<T> {
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}
}
