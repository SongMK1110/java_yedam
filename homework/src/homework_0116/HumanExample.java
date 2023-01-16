package homework_0116;

public class HumanExample {

	public static void main(String[] args) {
		
		Human human = new StandardWeightInfo("홍길동", 168, 45);
		human.getInfomation();
		
		human = new ObesityInfo("박둘이", 168, 90);
		human.getInfomation();
	}

}
