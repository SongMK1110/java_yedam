package com.yedam.loop;

import java.util.Scanner;

public class LoopFor {
	public static void main(String[] args) {
		//for문
		
		for(int i = 0; i <= 100; i++) {
			System.out.println(i);
		}
		
		//1부터 100까지의 합 구하기
		int result = 0;
		for(int i = 1; i <= 100; i++) {
			result += i; //result = result + i
		}
		System.out.println("1~100까지의 합 : " + result);
		
		//1~100사이의 짝수 구하기
		//짝수 성질 => 2로 나누었을때 0으로 떨어지면 짝수
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				System.out.println(i+"는 짝수");
			} else if(i % 2 == 1){
				System.out.println(i+"는 홀수");
			}
		}
		
		//입력한 숫자에 대한 구구단 출력
		//스캐너를 활용해서 값을 하나 입력
		//입력 받은 값에 대한 구구단 출력
		//2를 입력 -> 2*1 = 2 ... 2*9 = 18
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 입력>");
		int gugu = Integer.parseInt(sc.nextLine());
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(gugu + " * " + i + " = " + (gugu*i));
		}
		
		//입력한 값에 대한 총합, 평균, 최대값, 최소값, 데이터 받을 갯수
		//스캐너 -> 데이터 입력
		//데이터 받을 갯수 -> 5 -> 반복문 횟수 설정
		//데이터 입력 횟수가 5번 : 1, 20, 40, 30, 10
		//총합 : 값을 입력 받을 때마다 변순에 저장
		//평균 : 총합 / 갯수
		//최대값, 최소값 초기 값을 무엇으로 해 비교하는지
		//최대값 : 입력할때마다 비교, 최대값인지 아닌지
		//최소값 : 입력할때마다 비교, 최소값인지 아닌지
		
		System.out.println("갯수 입력>");
		int n = Integer.parseInt(sc.nextLine());
		int sum = 0;
		int max = 0;
		int min = 0;
		double avg = 0;
		for(int i = 0; i < n; i++) {
			System.out.println("데이터 입력>");
			int num = Integer.parseInt(sc.nextLine());
			sum += num;
			//최대값, 최소값 초기값 설정
			if(i == 0) {
				max = num;
				min = num;
			}
			//최대값
			if(max < num) {
				max = num;
			}
			//최소값
			if(min > num) {
				min = num;
			}
		}
		avg = (double)sum / n;
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		//2번 문제) up and down
		//임의의 랜덤 값(1~100) 추출하여 5번의 기회안에
		//해당 랜덤 값을 맞추는 프로그램을 구현하라
		//에시) 랜덤 값 : 50
		//	   입력 값 : 30
		//     => 더 큰 수를 입력하세요
		//     입력 값 : 40
		//     => 더 큰 수를 입력하세요
		//     입력 값 : 70
		//     => 더 작은 값을 입력하세요
		//     => 정답 일 경우 :
		//     => 정답 입니다.
		//     => 5번 기회 동안 못 맞출 경우
		//     => 실패 하였습니다.
		
		System.out.println("숫자 입력>");
		int random = (int) (Math.random()*100)+1;
		int count = 1;
		
		while(true) {
			int number = Integer.parseInt(sc.nextLine());
			if(number == random) {
				System.out.println("정답입니다.");
				break;
			}
			if(number > random) {
				System.out.println("더 작은 값을 입력하세요");
			}else if(number < random) {
				System.out.println("더 큰 수를 입력하세요");
			}
			if(count == 5) {
				System.out.println("실패 하였습니다.");
				break;
			}
			count++;
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Up & Down>>");
			int num = Integer.parseInt(sc.nextLine());
			
			if(random == num) {
				System.out.println("정답입니다.");
				break;
			}else if(random > num) {
				System.out.println("더 큰수 입력");
			}else {
				System.out.println("더 작은 수 입력");
			}
			if(i == 4) {
				System.out.println("실패");
			}
		}
		
		
	}
}
