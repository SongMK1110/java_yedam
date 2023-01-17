package homework_0117;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int randNum = (int) (Math.random() * 2) + 1;
		Keypad game = null;
		
		if(randNum == 1) {
			game = new RPGgame();
		}else if(randNum == 2) {
			game = new ArcadeGame();
		}

		while (true) {
			System.out.println("============================================================================================");
			System.out.println("<< 1.LeftUP | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT >>");
			System.out.println("============================================================================================");
			System.out.print("choice>> ");
			int selectNo = sc.nextInt();

			if (selectNo == 1) {
				game.leftUpButton();
			} else if (selectNo == 2) {
				game.leftDownButton();
			} else if (selectNo == 3) {
				game.rightUpButton();
			} else if (selectNo == 4) {
				game.rightDownButton();
			} else if (selectNo == 5) {
				game.changeMode();
			} else if (selectNo == 0) {
				if(randNum == 1) {
					game = new ArcadeGame();
					randNum = 2;
				}else if(randNum == 2) {
					game = new RPGgame();
					randNum = 1;
				}
			} else if (selectNo == 9) {
				System.out.println("EXIT");
				break;
			}
		}
	}

}
