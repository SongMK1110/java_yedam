package homework_0125;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LottoApp {
	Scanner sc = new Scanner(System.in);
	Lotto lotto = new Lotto();
	int menu = 0;
	public List<Integer> list = new ArrayList<>();
//	public List<int[]> list = new ArrayList<>();

	public LottoApp() {
		run();
	}

	private void showInfo() {

	}

	private void makeLotto() {

	}

	private void menuInfo() {
		System.out.println("===1. 로또 생성 || 2. 로또 조회 || 99. 종료===");
	}

	private void run() {

		while (menu != 99) {
			menuInfo();
			menu = Integer.parseInt(sc.nextLine());
			switch (menu) {
			case 1:
				// 로또 생성
				System.out.println("금액을 입력하세요 >");

				int money = Integer.parseInt(sc.nextLine());
				for (int i = 0; i < (money / 1000); i++) {
					for (int j = 0; j < 6; j++) {
						int randNum = (int) (Math.random() * 45) + 1;
						if (!list.contains(randNum)) {
							list.add(randNum);
						} else {
							j--;
						}
					}
					
				}
				makeLotto();
				break;
			case 2:
				for(int i = 0; i < list.size() / 6; i++) {
					System.out.print(i+1 + "번째 ");
					for(int j = i*6; j < i*6+6; j++) {
						System.out.print(list.get(j) + " ");
					}
					System.out.println();
				}
//				System.out.println(list);
				showInfo();
				break;

			case 99:
				System.out.println("프로그램 종료");
				break;
			}
		}

	}

}
