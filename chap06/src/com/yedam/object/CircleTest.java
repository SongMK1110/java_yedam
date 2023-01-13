package com.yedam.object;

public class CircleTest {

	public static void main(String[] args) {
		//static = 정적 = 공유
		//클래스파일 로딩시에 메모리에 할당
		//객체생성 없이 클래스이름으로 스태틱 필드 접근 가능
		System.out.println(Circle.pi);
		// circle 객체 생성
		Circle circle = new Circle(5);
		
		// area
		double result = circle.area();
		
		//결과출력
		System.out.println(result);
		
		Circle circle2 = new Circle();
//		circle2.r = 10;
		
		CircleSingle circleSingle = CircleSingle.getInstance();
		circleSingle.r = 10;
		
		//CircleSingle circleSingle2 = CircleSingle.getInstance();
		//전에 한 r = 10 바뀜
		//그래서 일반필드 잘 안씀
		circleSingle.r = 20;
	}

}
