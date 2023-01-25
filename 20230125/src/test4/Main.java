package test4;

public class Main {

	public static void main(String[] args) {
		String[] arr = {"010102-4", "991012-1", "960304-1", "881012-2", "040403-3"};
		int m = 0;
		int w = 0;
		for(int i = 0; i < arr.length; i++) {
			char str = arr[i].charAt(7);
			if(str == '1' || str == '3') {
				m++;
			} else if(str == '2' || str == '4') {
				w++;
			}
		}
		
		System.out.print("남 " + m + " 여 " + w);
	}
}
