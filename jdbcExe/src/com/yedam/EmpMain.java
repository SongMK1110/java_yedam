package com.yedam;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EmpMain {
	EmpDAO dao = new EmpDAO();
	Scanner sc = new Scanner(System.in);
	
	public void exe() {
		
		while (true) {
			menu();
			int menu = sc.nextInt();

			if (menu == 5) {
				delete();
			} else if (menu == 4) { // 사원번호, 급여 입력. updateEmp(int id, int sal)
				update();
			} else if (menu == 3) {
				add();
			} else if (menu == 2) {
				search();
			} else if (menu == 1) {
				list();
			} else if (menu == 9) {
				// 종료
				break;
			}
		} // end of while()

		System.out.println("end of program.");
	} // end of main()
	public void menu() {
		System.out.println("1) 목록조회 2) 단건조회 3)입력 4)급여변경 5) 삭제 9) 종료");
	}
	public void list() { // static메소드 or 인스턴스메소드
		// 목록조회
//		List<Map<String, Object>> result = dao.empList(); // 반환유형
//		for(Map<String, Object> map : result) {
//			System.out.println("사원번호: " + map.get("emp_id")
//			+ ", 이름: " + map.get("first_name") + "-" + map.get("last_name"));
//		}

		List<EmpVO> list = dao.empVoList();
		for (EmpVO emp : list) {
			System.out.println(emp.toString());
		}
	}
	
	public void search() {
		// 단건조회
		System.out.println("조회사원번호 입력>> ");
		int id = sc.nextInt();
		// 사용자 입력값을 받아서 처리

		EmpVO emp = dao.getEmp(id);
		if (emp == null) {
			System.out.println("조회된 정보 없음");
			return;
		} // 반환유형: EmpVO
		System.out.println("결과 : " + emp);
	}
	
	public void add() {
		// 입력처리 : => 사번, last_name, 이메일, 입사일자, 직무:
		System.out.println("사번입력>> ");
		int eid = sc.nextInt();
		sc.nextLine();
		System.out.println("이름>> ");
		String name = sc.nextLine();
		System.out.println("이메일>> ");
		String mail = sc.nextLine();
		System.out.println("입사일자>> ");
		String hDate = sc.nextLine();
		System.out.println("직무>> ");
		String job = sc.nextLine();

		EmpVO emp = new EmpVO();
		emp.setEmployeeId(eid);
		emp.setLastName(name);
		emp.setEmail(mail);
		emp.setHireDate(hDate);
		emp.setJobId(job);

		if (dao.addEmp(emp) > 0) {
			System.out.println("입력성공");
		} else {
			System.out.println("처리중에러");
		}
	}
	public void update() {
		System.out.println("사원번호 입력>> ");
		int eid = sc.nextInt();
		sc.nextLine();
		System.out.println("변경 급여 입력>> ");
		int sal = sc.nextInt();

		if (dao.updateEmp(eid, sal) > 0) {
			System.out.println("변경 성공");
		} else {
			System.out.println("처리중에러");
		}
	}
	public void delete() {
		System.out.println("삭제할 사원번호 입력>> ");
		int eid = sc.nextInt();
		
		if (dao.deleteEmp(eid) > 0) {
			System.out.println("삭제 성공");
		} else {
			System.out.println("처리중에러");
		}
	}
} // end of class
