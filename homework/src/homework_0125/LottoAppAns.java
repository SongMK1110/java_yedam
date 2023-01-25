package homework_0125;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LottoAppAns {
	Scanner sc = new Scanner(System.in);
	int menu = 0;
	// list -> {1,2,3}, new int[10];
	List<int[]> list = new ArrayList<>();

	public LottoAppAns() {
		run();
	}

	private void showInfo() {
		System.out.println("구매 한 금액> " + (list.size() * 1000) + "원");

		for (int i = 0; i < list.size(); i++) {
			System.out.print((i % 5 + 1) + "번> ");

			for (int j = 0; j < 6; j++) {
				System.out.print(list.get(i)[j] + " ");
			}
			System.out.println();
			
			if((i+1) != 0 && (i+1) % 5 == 0) {
				System.out.println("---------------------------");
			}
		}
	}

	private void makeLotto() {
		System.out.println("금액을 투입해주세요.");
		int money;

		money = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < (money / 1000); i++) {
			// list에 int형 배열이 객체로 들어간다.
			list.add(makeNumber());
		}

		System.out.println("번호 출력 완료\n");
	}

	private int[] makeNumber() {
		int[] lottoNo = new int[6];
		for (int i = 0; i < lottoNo.length; i++) {

			// 랜덤 데이터 뽑기
			lottoNo[i] = (int) (Math.random() * 45) + 1;

			// 인덱스 0일때 중복 체크 할 필요가 없다.
			if (i > 0) {
				// 인덱스가 1이상일때 중복 체크
				for (int j = 0; j < i; j++) {
					// 방금 생성한 랜덤값과 내가 가지고 있는 값과 같으면...
					if (lottoNo[j] == lottoNo[i]) {
						// 다시 i값 -1(다시 랜덤값 생성)
						i -= 1;
						break;
					}
				}
			}

		}
		return lottoNo;
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
				makeLotto();
				break;

			case 2:
				showInfo();
				break;

			case 99:
				System.out.println("프로그램 종료");
				break;
			}
		}

	}

}
