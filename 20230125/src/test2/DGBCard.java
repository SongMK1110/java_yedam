package test2;

public class DGBCard extends Card {
	
	private String company = "대구은행";
	private String cardStaff;
	
	public DGBCard(String cardNo, String validDate, int cvc, String cardStaff) {
		super(cardNo, validDate, cvc); //super(); 부모 객체 생성 -> 부모 필드, 메소드 사용가능
		this.cardStaff = cardStaff;
	}
	
	@Override
	public void showCardInfo() {
		//코드 재사용성
		//super.showCardInfo();
		System.out.println("카드정보 (Card NO : " + getCardNo() + ", 유효기간 : " + getValidDate() + ", CVC : " + getCvc() + " )");
		System.out.println("담당직원 - " + this.cardStaff + ", " + this.company);
	}

}
