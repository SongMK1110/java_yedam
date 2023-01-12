package com.yedam.object;

public class ExeApp {
	public static void main(String[] args) {
		//Book 클래스
		//책의 종류, 가격, 출판사, 도서번호의 정보
		//정보는 원하는 방식 아무거나 활용해서 정보 입력.
		//getInfo 메소드 객체가 가진 정보 출력.
		//getInfo의 출력 예시
		//혼자 공부하는 자바
		//# 내용
		//1) 종류 : 학습서
		//2) 가격 : 24000원
		//3) 출판사 : 한빛미디어
		//4) 도서번호 : yedam-001
		
		//다른 예시
		//이것이 리눅스다
		//# 내용
		//1) 종류 : 학습서
		//2) 가격 : 32000원
		//3) 출판사 : 한빛미디어
		//4) 도서번호 : yedam-002
		
//		Book b1 = new Book("혼자 공부하는 자바", 24000, "yedam-001");
//		Book b2 = new Book("이것이 리눅스다", 32000, "yedam-002");
//		
//		b1.getInfo();
//		b2.getInfo();
		
		
		Car car1 = new Car();
		System.out.println("car1.company : " + car1.company);
		System.out.println();
		Car car2 = new Car("자가용");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();
		
		Calculator ca = new Calculator(); 
		double result = ca.sub(1, 1);
		System.out.println(result);
		
		ca.powerOn();
		ca.powerOff();
		
		int sumResult = ca.sum2(1,5,2,4,3,4,2,4,20);
		System.out.println("총 합 : " + sumResult);
		sumResult = ca.sum2(1,2,3,4,5);
		System.out.println("총 합 : " + sumResult);
		System.out.println();
		
		Score sc = new Score(80, 90, 100);
		sc.getInfo();
		
		System.out.println("A");
		System.out.println(1);
		System.out.println('c');
		System.out.println(0.1);
		System.out.println(true);
		
	}
}
