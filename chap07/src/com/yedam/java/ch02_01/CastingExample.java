package com.yedam.java.ch02_01;

public class CastingExample {

	public static void main(String[] args) {
		// 오류안뜨면 상속관계
		Parent parent = new Child();
		parent.method1();
		parent.method2();
		// parent.method3();

		System.out.println();

		Child child = (Child) parent;
		child.method1();
		child.method2();
		child.method3();

		System.out.println();
		// pa에 들어있는 인스턴스(주소)가 Child가 아님
		Parent pa = new Parent();
		if (pa instanceof Child) {
			Child ch = (Child) pa;
			ch.method1();
			ch.method2();
			ch.method3();
		}else {
			System.out.println("변수 pa의 인스턴스는 Child 클래스의 인스턴스가 아닙니다.");
		}

	}

}
