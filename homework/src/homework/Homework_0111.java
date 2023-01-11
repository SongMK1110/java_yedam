package homework;

import java.util.Scanner;

public class Homework_0111 {

	public static void main(String[] args) {
		
		//주어진 배열을 이용하여 다음 내용을 구현하세요.
		int[] arr1 = { 10, 20, 30, 50, 3, 60, -3 };
		
		//문제1. 주어진 배열 중에서 값이 60인 곳의 인덱스를 출력해보자.
		System.out.println("문제1>");
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] == 60) {
				System.out.println(i);
			}
		}
		
		//문제2. 주어진 배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력해보자.
		System.out.println("문제2>");
		for(int i = 0; i < arr1.length; i++) {
			if(i == 3) {
				continue;
			}
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		//문제3. 주어진 배열 안의 변경하고 싶은 값의 인덱스 번호를 입력받아, 그 값을 1000으로 변경해보자.
  		//   입력) 인덱스: 3 ->   {10, 20, 30, 1000, 3, 60, -3}
		System.out.println("문제3>");
		Scanner sc = new Scanner(System.in);
		System.out.println("변경하고 싶은 인덱스 값");
		int index = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < arr1.length; i++) {
			if(i == index) {
				arr1[i] = 1000;
			}
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		//문제4. 주어진 배열의 요소에서 최대값과 최대값의 위치값(인덱스), 최소값과 최소값의 위치값(인덱스)을 구해보자.
		System.out.println("문제4>");
		int max = arr1[0];
		int min = arr1[0];
		int maxInd = 0;
		int minInd = 0;
		for(int i = 0; i < arr1.length; i++) {
			if(max < arr1[i]) {
				max = arr1[i];
				maxInd = i;
			}
			if(min > arr1[i]) {
				min = arr1[i];
				minInd = i;
			}
		}
		System.out.println("최대값 : " + max + " 최대값의 위치값 : " + maxInd);
		System.out.println("최소값 : " + min + " 최소값의 위치값 : " + minInd);
		//문제5. 별도의 배열을 선언하여 양의 정수 10개를 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력해보자.
		System.out.println("문제5>");
		int[] arr2 = new int[10];
		
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = Integer.parseInt(sc.nextLine());
		}
		for(int i = 0; i < arr2.length; i++) {
			if(arr2[i] % 3 == 0) {
				System.out.print(arr2[i] + " ");
			}
		}
		System.out.println();
		
		System.out.println("추가 문제>");
		//[추가 문제]

		// answer 배열에 담긴 데이터를 읽고 각 숫자마다 개수만큼'*'를 찍는다.
		// 아래 빈 영역에 코드를 입력하여 프로그램을 완성하여라

		//	public static void main(String[] args) {
		int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
		int[] counter = new int[4];
		for (int i = 0; i < answer.length; i++) {
//			answer[i] = counter[answer[i]-1];
			counter[answer[i]-1]++;
		}
		for (int i = 0; i < counter.length; i++) {
			/* 해당 부분 코딩 */
			for(int j = 0; j < counter[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
		// ※ 배열의 각 인덱스와 숫자의 연관성을 지으면서 풀어 볼 것.
		// 출력 예시) ***
        //            **
        //            **
    	//            ****
		
	}

}
