package homework_0125;

import java.util.Scanner;

public class test3_answer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//3. 만 나이 계산기(올해 기준 +- 100살)
		
		//1. 계산식(하드 코딩) -> 올해만 사용
		//1-1) 2000년 이후 2023년 이전 출생 -> (23-태어난 년도)+1
		//1-2) 1922년 이후 2000년 이전 출생 -> (123-태어난 년도)
		
		System.out.println("생년월일>");
		String birth = sc.nextLine();
		
		int birthNo = Integer.parseInt(birth.substring(0, 2));
		
		if(birthNo <= 23) {
			System.out.println("나이 : " + ((23-birthNo)+1));
		} else if(birthNo > 23) {
			System.out.println("나이 : " + (123-birthNo));
		}
		
		
		//1. 계산식(일반화)
		//Calendar, date(simpledateFormat) -> 오늘 날짜, 년도
		//1-1) 2000년 이후 2023년 이전 출생 -> (기준 년도-태어난 년도)+1
		//1-2) 1922년 이후 2000년 이전 출생 -> (기준 년도-태어난 년도)
		
		//Stringbuilder
		//String 단점 보완 (힙 영역에 메모리 계속 생김)
		
		//메모리 5개 사용
		String a = "a";
		a += "a";		
		a += "a";		
		a += "a";		
		a += "a";
		
		//메모리 1개 사용
		StringBuilder sb = new StringBuilder();
		sb.append("aaa"); // "aaa"
		sb.append(11);
		sb.append(false);
		
		System.out.println(sb);
		
		
	}

}
