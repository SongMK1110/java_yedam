package test2;

public class Main {

	public static void main(String[] args) {
		Card card = new Card("5432-4567-9534-3657", "20251203", 253);
		card.showCardInfo();
		System.out.println();
		TossCard tos = new TossCard("5432-4567-9534-3657", "20251203", 253, "신빛용");
		tos.showCardInfo();
		System.out.println();
		DGBCard dgb = new DGBCard("5432-4567-9534-3657", "20251203", 253, "신빛용");
		dgb.showCardInfo();
	}

}
