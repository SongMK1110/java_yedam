package test2;

public class Card {
	private String cardNo;
	private String validDate;
	private int cvc;
	
	public Card(String cardNo, String validDate, int cvc) {
		this.cardNo = cardNo;
		this.validDate = validDate;
		this.cvc = cvc;
	}
	
	public String getCardNo() {
		return cardNo;
	}

	public String getValidDate() {
		return validDate;
	}

	public int getCvc() {
		return cvc;
	}

	public void showCardInfo() {
		System.out.println("카드정보 ( Card NO : " + getCardNo() + ", 유효기간 : " + getValidDate() + ", CVC : " + getCvc() + " )");
	}
	
}
