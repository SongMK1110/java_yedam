package homework_0125;

import java.util.*;

public class test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String b = sc.nextLine();
		int[] arr = new int[26];
		char[] alpha = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		
		for(int i = 0; i < b.length(); i++) {
			arr[b.charAt(i)-'a']++;
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) {
				continue;
			}
			System.out.print(alpha[i] + " " +  arr[i] + "개 ");
		}
		

	}

}
