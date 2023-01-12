package com.yedam.object;

public class Book {

	String name;
	String kind = "학습서";
	int price;
	String pub = "한빛미디어";
	String isbn;

	Book(String name, int price, String isbn) {
		this.name = name;
		this.price = price;
		this.isbn = isbn;
	}
	
	//매개변수의 타입에 따른 생성자 오버로딩
	Book(String kind, String isbn) {
		this.kind = kind;
		this.isbn = isbn;
	}

	// 매개 변수 순서에 따른 생성자 오버로딩
	// 데이터 타입 기준으로 순서를 따진다.
	Book(String kind, int price) {
		this.price = price;
		this.kind = kind;
	}
	
	//매개 변수 갯수
	Book(int price){
		this.price = price;
	}
	
	//기본 생성자
	Book(){
		
	}

	void getInfo() {
		// # 내용
		// 1) 종류 : 학습서
		// 2) 가격 : 24000원
		// 3) 출판사 : 한빛미디어
		// 4) 도서번호 : yedam-001
		System.out.println(name);
		System.out.println("# 내용");
		System.out.println("1) 종류 : " + kind);
		System.out.println("2) 가격 : " + price + "원");
		System.out.println("3) 출판사 : " + pub);
		System.out.println("4) 도서번호 : " + isbn);
	}

}
