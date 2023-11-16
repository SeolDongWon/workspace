package view;

import java.util.Scanner;

public class MenuViewer {
	public static Scanner scan = new Scanner(System.in);

	public static void mainMenuView() {
		System.out.println("서울시 문화행사 정보");
		System.out.println("0. 종료");
		System.out.println("1. 데이터 가져오기");
		System.out.println("2. 데이터 검색");
	}

}
