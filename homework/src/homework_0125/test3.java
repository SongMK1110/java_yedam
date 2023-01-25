package homework_0125;

import java.util.*;

public class test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		Calendar now = Calendar.getInstance();
		int currentYear = now.get(Calendar.YEAR);
		System.out.println(currentYear);
		String s = String.valueOf(currentYear);
		System.out.println(s);
		int a = Integer.parseInt(s.substring(0, 2));
		System.out.println(a);
		int birthYear = Integer.parseInt(n.substring(0, 4));
		System.out.println(birthYear);
		int age = (currentYear - birthYear + 1);
		String outputAge = Integer.toString(age);
		
		System.out.println(outputAge);

	}

}
