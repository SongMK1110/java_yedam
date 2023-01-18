package com.yedam.java.example;

import java.util.Scanner;

public class ScheduleExample {

	public static void main(String[] args) {
		// Top-down 
		// 전체적인 프로세스 -> 세부적으로 객체 (main -> object)
		// bottom-up
		// 객체 -> 전체적인 프로세스 (object -> main)
		Scanner scanner = new Scanner(System.in);
		//scheduler null이고 배열 표시가 없으니까 class아니면 인터페이스
		Scheduler scheduler = null;

		System.out.println("전화 상담 할당 방식을 선택하세요.");
		System.out.println("R : 한명씩 차례로 할당 ");
		System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당 ");
		System.out.println("P : 우선순위가 높은 고객 먼저 할당 ");

		String ch = scanner.next();

		if ("R".equals(ch) || "r".equals(ch)) {
			// new로 인스턴스 생성하니까 class
			// 다른 타입 변수니까 자동타입변환인걸 알 수 있음 (캐스팅도 x)
			scheduler = new RoundRobin();
		} else if ("L".equals(ch) || "l".equals(ch)) {
			scheduler = new LeastJob();
		} else if ("P".equals(ch) || "p".equals(ch)) {
			scheduler = new PriorityAllocation();
		} else {
			System.out.println("지원되지 않는 기능입니다.");
			return;
		}
		//scheduler 인터페이스일 확률 높음
		//scheduler 변수는 이 2개 메소드 가지고 있음, 왜냐면 따로 인스턴스 안만들어서?
		//그러면 추상 메소드이고... (추상클래스 or 인터페이스)
		//인터페이스는 기능...
		//앞에 변수 없음 높은 확률로 void
		scheduler.getNextCall();       // 상담원 : 다음 전화
		scheduler.sendCallToAgent();   // 배분방법
	}

}
