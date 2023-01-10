package homework;

public class Test {
	public static void main(String[] args) {
		String word = "";
		for (int i = 1; i <= 50; i++) {
			if (i / 10 == 3 || i / 10 == 6 || i / 10 == 9) {
				word += "짝";
				if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
					word += "짝";
				}
			} else if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
				word += "짝";
			} else {
				word += String.valueOf(i);
			}
			word += " ";
		}
		System.out.println(word);
	}
}
