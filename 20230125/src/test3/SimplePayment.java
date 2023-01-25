package test3;

public class SimplePayment implements Payment {

	public double simplePaymentRatio;

	public SimplePayment(double simplePaymentRatio) {
		this.simplePaymentRatio = simplePaymentRatio;
	}

	@Override
	public int online(int price) {
		double discount = Payment.ONLINE_PAYMENT_RATIO + this.simplePaymentRatio;
		return price  - (int)(discount * price);
	}

	@Override
	public int offline(int price) {
		double discount = Payment.OFFLINE_PAYMENT_RATIO + this.simplePaymentRatio;
		return price  - (int)(discount * price);
	}

	@Override
	public void showInfo() {
		System.out.println("*** 간편결제 시 할인정보");
		System.out.println("온라인 결제 시 총 할인율 : " + (Payment.ONLINE_PAYMENT_RATIO + this.simplePaymentRatio));
		System.out.println("오프라인 결제 시 총 할인율 : " + (Payment.OFFLINE_PAYMENT_RATIO + this.simplePaymentRatio));
	}

}
