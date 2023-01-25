package homework_0125;

import java.util.*;
public class test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		char[] arr = a.toCharArray();
		
		for(int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
		
	}

}
