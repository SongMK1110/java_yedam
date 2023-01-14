package homework;

import java.util.Scanner;

public class Homework_0113 {

	static Scanner sc = new Scanner(System.in);
	static Product[] proAry = null;
	static int proNum = 0;

	public static int selectNo() {
		System.out.println("=======================================================");
		System.out.println("1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
		System.out.println("=======================================================");
		int selectNo = Integer.parseInt(sc.nextLine());
		return selectNo;
	}

	public static void productNum() {
		System.out.println("상품 수 입력하세요");
		proNum = Integer.parseInt(sc.nextLine());
	}

	public static void insert() {
		proAry = new Product[proNum];
		for (int i = 0; i < proAry.length; i++) {
			proAry[i] = new Product();
			System.out.println("상품 입력하세요");
			proAry[i].name = sc.nextLine();
			System.out.println("가격입력 하세요");
			proAry[i].price = Integer.parseInt(sc.nextLine());
		}
	}

	public static void price() {
		for (Product pro : proAry) {
			pro.getInfo();
		}
	}

	public static void analyze() {
		int max = proAry[0].price;
		String maxName = proAry[0].name;
		int total = 0;
		for (int i = 0; i < proAry.length; i++) {
			if (max < proAry[i].price) {
				max = proAry[i].price;
				maxName = proAry[i].name;
			}
			total += proAry[i].price;
		}
		System.out.println("최고가격 : " + max + ", 제품 이름 : " + maxName);
		System.out.println("최고가격 제외 제품들의 총합 : " + (total - max));
	}

	public static void end() {
		System.out.println("프로그램 종료");
	}

	public static void main(String[] args) {
		// 문제2) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
		// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
		// 1) 메뉴는 다음과 같이 구성하세요.
		// 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
		// 2) 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
		// 3) 제품별 가격을 출력하세요.
		// 출력예시, "상품명 : 가격"
		// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
		// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.

		while (true) {

			int selectNo = selectNo();

			if (selectNo == 1) {

				productNum();

			} else if (selectNo == 2) {

				insert();

			} else if (selectNo == 3) {

				price();

			} else if (selectNo == 4) {

				analyze();

			} else if (selectNo == 5) {
				end();
				break;
			}
		}
	}
}
