package controller;

import java.util.Scanner;
import model.RENTALVO;

public class RENTALRegisterManager {
// 비디오 대여 신청 리스트 
	public void RENTALList() throws Exception {
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		String id; // 아이디
		String pw; // 비밀번호
		String mainMenu; // 메인 메뉴
		boolean success = false;
		RENTALDAO td = new RENTALDAO();
		MEMBERDAO sdao = new MEMBERDAO();
		System.out.println("비디오 대여 신청한 리스트");
		do {
			System.out.print("아이디 : ");
			id = input.nextLine();
			System.out.print("비밀번호 : ");
			pw = input.nextLine();
			success = sdao.getMEMBERLogin(id, pw);
			if (!success) {
				System.out.println("아이디 또는 비밀번호가 틀림 다시 입력");
				System.out.print("메인 메뉴로 이동(y/n) : ");
				mainMenu = input1.next();
				if (mainMenu.equals("y") || mainMenu.equals("Y")) {
					return;
				}
				System.out.println();
			}
		} while (!success);
		System.out.println();
		System.out.println("비디오 대여 신청한 리스트");
		td.getRENTALTotalList();
		System.out.println();
	}

//비디오 대여 신청 관리 
	public void RENTALRegistr() throws Exception {
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		VIDEODAO vd = new VIDEODAO();
		RENTALDAO td = new RENTALDAO();
		RENTALVO tvo = new RENTALVO();
		MEMBERDAO sdao = new MEMBERDAO();
		int no; // 비디오 일련번호
		String name; // 비디오명
		String type; // 장르
		String id; // 아이디
		String pw; // 비밀번호
		String mainMenu; // 메인 메뉴
		boolean success = false;
		
		System.out.println();
		System.out.println("비디오 대여 신청을 위한 정보 입력");
		do {
			System.out.print("아이디 : ");
			id = input.nextLine();
			System.out.print("비밀번호 : ");
			pw = input.nextLine();
			success = sdao.getMEMBERLogin(id, pw);
			if (!success) {
				System.out.println("아이디 또는 비밀번호가 틀림 다시 입력");
				System.out.print("메인 메뉴로 이동(y/n) : ");
				mainMenu = input1.next();
				if (mainMenu.equals("y") || mainMenu.equals("Y")) {
					return;
				}
				System.out.println();
			}
		} while (!success);
		vd.getVIDEOTotalList();
		System.out.print("비디오일련번호 : ");
		no = input.nextInt();
		tvo.setNo(no);
// 비디오 대여 신청 등록 
		td.setRENTALRegiste(tvo);
		System.out.println();
		System.out.println("비디오 대여 신청한 리스트");
		td.getRENTALTotalList(0);
		System.out.println();
	}

// 반납 관리 
	public void RENTALDelete() throws Exception {
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		RENTALDAO td = new RENTALDAO();
		MEMBERDAO sdao = new MEMBERDAO();
		int no; // 번호
		String id; // 아이디
		String pw; // 비밀번호
		String mainMenu; // 메인 메뉴
		boolean success = false;
		System.out.println("반납을 위한 정보 입력");
		do {
			System.out.print("아이디 : ");
			id = input.nextLine();
			System.out.print("비밀번호 : ");
			pw = input.nextLine();
			success = sdao.getMEMBERLogin(id, pw);
			if (!success) {
				System.out.println("아이디 또는 비밀번호가 틀림 다시 입력");
				System.out.print("메인 메뉴로 이동(y/n) : ");
				mainMenu = input1.next();
				if (mainMenu.equals("y") || mainMenu.equals("Y")) {
					return;
				}
				System.out.println();
			}
		} while (!success);
		System.out.println();
		System.out.println("비디오 대여 신청한 리스트");
		td.getRENTALTotalList(0);
		System.out.println();
		System.out.println("반납할 비디오번호 입력");
		System.out.print("번호 : ");
		no = input.nextInt();
		td.setRENTALDelete(0);
		System.out.println();
		System.out.println("반납 후 리스트");
		td.getRENTALTotalList(no);
		System.out.println();
	}
}
