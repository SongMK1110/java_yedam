package homework_0117;

public class RPGgame implements Keypad {

	private int currentMode;

	public RPGgame() {
		currentMode = NORMAL_MODE;
		System.out.println("RPGgame 실행");
	}

	@Override
	public void leftUpButton() {
		System.out.println("캐릭터가 위쪽으로 이동한다.");
	}

	@Override
	public void leftDownButton() {
		System.out.println("캐릭터가 아래쪽으로 이동한다.");
	}

	@Override
	public void rightUpButton() {
		if (currentMode == NORMAL_MODE) {
			System.out.println("캐릭터가 한칸단위로 점프한다.");
		} else if (currentMode == HARD_MODE) {
			System.out.println("캐릭터가 두칸단위로 점프한다.");
		}
	}

	@Override
	public void rightDownButton() {
		if (currentMode == NORMAL_MODE) {
			System.out.println("캐릭터가 일반 공격.");
		} else if (currentMode == HARD_MODE) {
			System.out.println("캐릭터가 HIT 공격.");
		}
	}

	@Override
	public void changeMode() {
		if (currentMode == NORMAL_MODE) {
			currentMode = HARD_MODE;
			System.out.println("현재 모드 : HARD_MODE");
		} else if (currentMode == HARD_MODE) {
			currentMode = NORMAL_MODE;
			System.out.println("현재 모드 : NORMAL_MODE");
		}
	}

}
