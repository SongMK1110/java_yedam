package com.yedam.array;

import java.util.Scanner;

public class StudentAry {

	public static void main(String[] args) {
		// 한 학생의 성적을 입력
		// 과목 수
		int subjectNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("===================================================");
			System.out.println("1. 과목수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("===================================================");
			System.out.println("메뉴 입력>");

			int selectNo = Integer.parseInt(sc.nextLine());

			if (selectNo == 1) {
				System.out.println("과목수 입력하세요");
				subjectNum = Integer.parseInt(sc.nextLine());
			} else if (selectNo == 2) {
				scores = new int[subjectNum];
				System.out.println("점수 입력하세요");
				for(int i = 0; i < scores.length; i++) {
					scores[i] = Integer.parseInt(sc.nextLine());
				}
			} else if (selectNo == 3) {
				System.out.println("점수 리스트");
				for(int i = 0; i < scores.length; i++) {
					System.out.println(scores[i]);
				}

			} else if (selectNo == 4) {
				int sum = 0;
				for(int i = 0; i < scores.length; i++) {
					sum += scores[i];
				}
				System.out.println("총합 : " + sum);
				double avg = (double) sum / subjectNum;
				System.out.println("평균 : " + avg);
				//총합, 평균
			} else if (selectNo == 5) {
				System.out.println("end of prog");
				break;
			}
		}
	}

}
