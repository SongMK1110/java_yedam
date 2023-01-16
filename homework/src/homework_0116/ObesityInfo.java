package homework_0116;

public class ObesityInfo extends StandardWeightInfo {

	ObesityInfo(String name, double height, double weight) {
		super(name, height, weight);
	}
	
	@Override
	public void getInfomation() {
		String Obesity = "";
		if(getObesity() <= 18.5) {
			Obesity = "저체중";
		} else if (getObesity() > 18.5 && getObesity() <= 22.9) {
			Obesity = "정상";
		} else if (getObesity() >= 23 && getObesity() <= 24.9) {
			Obesity = "과체중";
		} else if (getObesity() >= 25) {
			Obesity = "비만";
		}
		System.out.println(name + "님의 신장 " + height + ", 몸무게 " + weight + ", " + Obesity + "입니다.");
	}
	
	public double getObesity() {
		return (weight - getStandardWeight()) / getStandardWeight() * 100;
	}
	
}
