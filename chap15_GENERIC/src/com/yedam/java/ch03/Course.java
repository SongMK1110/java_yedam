package com.yedam.java.ch03;

public class Course {
	public static void registerCourse1(Applicant<?> applicant) {
		String message = applicant.kind.getClass().getSimpleName()
				+ "이(가) Course1을 등록함";
		System.out.println(message);
	}
	
	// Person, Worker
	public static void registerCourse2(Applicant<? super Worker> applicant) {
		String message = applicant.kind.getClass().getSimpleName()
				+ "이(가) Course1을 등록함";
		System.out.println(message);
	}
	
	// Student, HighStudent, MiddleStudent
	public static void registerCourse3(Applicant<? extends Student> applicant) {
		String message = applicant.kind.getClass().getSimpleName()
				+ "이(가) Course1을 등록함";
		System.out.println(message);
	}
}
