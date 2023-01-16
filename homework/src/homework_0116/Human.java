package homework_0116;

public class Human {
	
	protected String name;
	protected double height;
	protected double weight;
	
	Human(String name, double height, double weight){
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public void getInfomation() {
		System.out.println(name + "님의 신장 " + height + ", 몸무게 " + weight + "입니다.");
	}
}
