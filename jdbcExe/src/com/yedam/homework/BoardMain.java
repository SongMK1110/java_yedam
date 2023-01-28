package com.yedam.homework;

import java.util.List;
import java.util.Scanner;

public class BoardMain {

	BoardDAO dao = new BoardDAO();
	SignDAO signdao = new SignDAO();
	Scanner sc = new Scanner(System.in);
	String user = "";

	public void exe() {
		while (true) {
			System.out.println("1. 로그인 | 2. 회원가입 | 3. 종료");
			int selectNum = sc.nextInt();
			if (selectNum == 1) {
				login();
				return;
			} else if (selectNum == 2) {
				sign();
				return;
			} else if (selectNum == 3) {
				break;
			} else {
				System.out.println("1 ~ 3 입력하세요");
			}
		}
		System.out.println("end of program.");
	}

	public void main() {
		while (true) {
			board();
			list();
			System.out.println();
			menu();
			int menu = sc.nextInt();
			if (menu == 1) {
				search();
			} else if (menu == 2) {
				add();
			} else if (menu == 3) {
				update();
			} else if (menu == 4) {
				delete();
			} else if (menu == 5) {
				System.out.println("로그아웃 완료");
				user = "";
				exe();
				return;
			} else if (menu == 6) {
				break;
			} else {
				System.out.println("메뉴를 잘못 선택하셨습니다.");
			}
		}

		System.out.println("end of program.");
	}

	public void sign() {
		System.out.println("=================================");
		System.out.println("              회원가입");
		System.out.println("=================================");
		System.out.println("아이디 입력>> ");
		String id = sc.next();
		System.out.println("비밀번호 입력>> ");
		String pw = sc.next();
		System.out.println("전화번호 입력>> ");
		String tel = sc.next();
		System.out.println("이메일 입력>> ");
		String email = sc.next();

		SignVO sign = new SignVO();
		sign.setId(id);
		sign.setPassword(pw);
		sign.setTel(tel);
		sign.setEmail(email);

		if (signdao.addSign(sign) > 0) {
			System.out.println("회원가입 성공");
			exe();
			return;
		} else {
			System.out.println("처리중에러");
		}
	}

	public void login() {
		while (true) {
			System.out.println("=================================");
			System.out.println("              로그인");
			System.out.println("=================================");
			System.out.println("아이디 입력>>");
			String id = sc.next();
			System.out.println("비밀번호 입력>>");
			String pw = sc.next();
			List<SignVO> list = signdao.LoginVOLogin();
			for (int i = 0; i < list.size(); i++) {
				if (id.equals(list.get(i).getId()) && pw.equals(list.get(i).getPassword())) {
					System.out.println("로그인 성공");
					user = id;
					main();
					return;
				}
			}

			System.out.println("로그인 실패");
			System.out.println();
			exe();
			return;
		}
	}

	public void board() {
		System.out.println("=========================================================");
		System.out.println("                          게시판        "+ user + " 님 환영합니다.");
		System.out.println("=========================================================");
		System.out.println("no     |     제목     |     작성자     |     작성일");
	}

	public void menu() {

		System.out.println("1. 글 상세보기 | 2. 글 작성 | 3. 글 수정 | 4. 글 삭제 | 5. 로그아웃 | 6. 종료");
	}

	public void list() {
		List<BoardVO> list = dao.boardVoList();
		for (BoardVO board : list) {
			System.out.println(board.toString());
		}
	}

	public void search() {
		// 단건조회
		System.out.println("글 번호 입력해주세요 >> ");
		int no = sc.nextInt();
		// 사용자 입력값을 받아서 처리
		BoardVO board = dao.getBoard(no);
		if (board == null) {
			System.out.println("조회된 정보 없음");
			return;
		}
		System.out.println("===========================");
		System.out.println("          글 상세");
		System.out.println("===========================");
		System.out.println(board.toStringSearch(no));
		System.out.println();
		while (true) {
			System.out.println("1. 뒤로가기");
			int selectNum = sc.nextInt();
			if (selectNum == 1) {
				break;
			} else {
				System.out.println("다시 입력해주세요");
			}
		}
	}

	public void add() {
		System.out.println("제목 입력>> ");
		String title = sc.next();
		System.out.println("내용 입력>> ");
		String text = sc.next();

		BoardVO board = new BoardVO();
		board.setTitle(title);
		board.setUsername(user);
		board.setText(text);

		if (dao.addBoard(board) > 0) {
			System.out.println("입력성공");
		} else {
			System.out.println("처리중에러");
		}
	}

	public void update() {
		System.out.println("글 번호 입력>> ");
		int no = sc.nextInt();
		sc.nextLine();
		System.out.println("변경 제목 입력>> ");
		String title = sc.next();
		System.out.println("변경 내용 입력>> ");
		String text = sc.next();

		if (dao.updateBoard(no, title, text) > 0) {
			System.out.println("변경 성공");
		} else {
			System.out.println("처리중에러");
		}
	}

	public void delete() {
		System.out.println("삭제할 글 번호 입력>> ");
		int no = sc.nextInt();

		if (dao.deleteBoard(no) > 0) {
			System.out.println("삭제 성공");
		} else {
			System.out.println("처리중에러");
		}
	}
}
