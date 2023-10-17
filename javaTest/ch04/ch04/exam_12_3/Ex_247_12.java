package ch04.exam_12_3;

import java.util.Scanner;

public class Ex_247_12
{
	public static final int SEAT_COL_NUM = 10 + 1;
	// 배열크기를 11로 주고 [0]번은 좌석등급, [1]~[10]번은 좌석 
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args)
	{
		Seat[] seatS = new Seat[SEAT_COL_NUM]; // 각 좌석등급마다 객체배열참조변수 생성
		Seat[] seatA = new Seat[SEAT_COL_NUM];
		Seat[] seatB = new Seat[SEAT_COL_NUM];

		createSeat(seatS); // 각 좌석마다 seat객체 생성
		createSeat(seatA);
		createSeat(seatB);

		seatS[0].setName("S>>"); // 0번은 좌석등급을 이름에 부여
		seatA[0].setName("A>>");
		seatB[0].setName("B>>");

		menu(seatS, seatA, seatB);

		scan.close();
		System.out.printf("\nEND");
	}

	private static void menu(Seat[] seatS, Seat[] seatA, Seat[] seatB)
	{

		System.out.printf("명품콘서트홀 예약 시스템입니다.\n");

		String menuSelect = null; // 메뉴선택
		boolean menuFlag = false; // 메뉴 무한반복 온오프 스위치
		Seat[] seatSet = null; // S A B 중 선택한 등급의 좌석객체배열의 주소를 받을 참조변수
		String name = null; // 이름
		String tel = null; // 전화번호
		int seatColNum = 0; // 선택한 좌석번호

		while (!menuFlag)
		{
			System.out.printf("\n예약:1, 조회:2, 취소:3, 끝내기:4>>");
			menuSelect = scan.nextLine();

			switch (menuSelect)
			{
			case "1":
				seatSet = seatClassSelect(seatS, seatA, seatB); // 좌석등급 선택
				seatTableFrame(); // 좌석 번호목록 출력
				seatShow(seatSet); // 좌석 등급과 예약유무 출력
				name = nameInput(); // 이름입력
				tel = telInput(); // 전화번호입력
				seatColNum = seatConNumSelect(); // 좌석번호 선택
				seatReserve(seatSet, name, tel, seatColNum); // 좌석등급, 이름, 전화번호, 좌석번호로 좌석을 예약
				break;
			case "2":
				seatTableFrame(); // 좌석 번호목록 출력
				seatShow(seatS); // S좌석 등급과 예약유무 출력 
				seatShow(seatA);  
				seatShow(seatB);  
				seatShowEnd(); // 조회종료
				break;
			case "3":
				seatSet = seatClassSelect(seatS, seatA, seatB); // 좌석등급 선택
				seatTableFrame(); // 좌석 번호목록 출력
				seatShow(seatSet); // 좌석 등급과 예약유무 출력
				name = nameInput(); // 이름입력
				seatCancel(seatSet, name); // 좌석등급과 이름을 가지고 예약취소메소드 실행
				break;
			case "4":
				menuFlag = true;
				System.out.printf("명품콘서트홀 예약 시스템을 종료합니다.\n");
				break;
			default:
				System.out.printf("입력오류\n");
				break;
			}
		}

	}

	private static void seatShowEnd()
	{
		System.out.printf("<<<조회를 완료하였습니다.>>>\n");
	}

	private static void seatCancel(Seat[] seatSet, String name) // 예약취소메소드
	{
		String tel = null;
		boolean nameSearch = false; // 입력한 이름의 검색성공 유무

		for (int i = 0; i < SEAT_COL_NUM; i++)
		{
			if (seatSet[i].getName() != null && seatSet[i].getName().equals(name))
			{
				nameSearch = true; // 이름검색 성공
				
				System.out.printf("예약시 등록한 전화번호 입력>>");
				tel = scan.nextLine();

				if (seatSet[i].getTel().equals(tel)) // 예약시 등록한 전화번호와 같으면 예약취소 성공, 다르면 예약취소 실패
				{
					seatSet[i].setName(null);
					seatSet[i].setTel(null);
					System.out.printf("예약 취소 성공\n");
					break;
				} else
				{
					System.out.printf("전화번호가 다릅니다\n");
					break;
				}
			}	
		}
		
		if (!nameSearch) // 이름검색 실패시 조건문 실행
		{
			System.out.printf("이름이 없습니다\n");
		}

	}

	private static void seatReserve(Seat[] seatSet, String name, String tel, int seatColNum)
	{
		if (seatSet[seatColNum].getName() == null) // 해당 좌석의 이름이 널이면 빈좌석, 빈좌석이면 예약
		{
			seatSet[seatColNum].setName(name);
			seatSet[seatColNum].setTel(tel);
			System.out.printf("%s님은 %c등급 %d번 좌석에 예약 성공\n", name, seatSet[0].getName().charAt(0), seatColNum);
		} else
		{
			System.out.printf("이미 예약된 좌석\n");
		}
	}

	private static int seatConNumSelect()
	{
		int seatColNum = 0;
		boolean seatConNumSelectFlag = false; // 반복 스위치

		while (!seatConNumSelectFlag)
		{
			System.out.printf("좌석번호 입력>>");
			
			try
			{
				seatColNum = scan.nextInt();
				scan.nextLine();
			} catch (Exception e)
			{
				System.out.printf("입력오류\n");
				scan.nextLine();
				continue;
			}

			if (0 < seatColNum && seatColNum < SEAT_COL_NUM) // 좌석번호는 1~10 사이
			{
				seatConNumSelectFlag = true;
			} else
			{
				System.out.printf("입력오류\n");
			}
		}
		return seatColNum;
	}

	private static String telInput()
	{
		System.out.printf("전화번호 입력>>");
		return scan.nextLine();
	}

	private static String nameInput()
	{
		System.out.printf("이름 입력>>");
		return scan.nextLine();
	}

	private static void seatTableFrame()
	{
		System.out.printf("등급   ");
		for (int i = 1; i < SEAT_COL_NUM; i++)
		{
			System.out.printf("%d번   ", i);
		}
		System.out.printf("\n");
	}

	private static void seatShow(Seat[] seatSet) // 좌석 출력
	{
		for (Seat data : seatSet)
		{
			if (data.getName() == null) // 좌석객체의 이름변수가 널이면 빈좌석, 빈좌석이면 ---- 출력
			{
				System.out.printf("----  ");
			} else
			{
				System.out.printf("%s ", data.getName()); // 이름이 있으면 이름 출력
			}
		}
		System.out.printf("\n");

	}

	private static Seat[] seatClassSelect(Seat[] seatS, Seat[] seatA, Seat[] seatB)
	{
		String seatClassSelect = null;
		boolean seatClassSelectFlag = false; // 반복 스위치
		Seat[] seatSet = null; // 사용자가 선택한 좌석등급의 객체배열을 받아서 리턴해줄 참조변수

		while (!seatClassSelectFlag)
		{
			seatClassSelectFlag = true;
			System.out.printf("좌석구분 S(1), A(2), B(3)");
			seatClassSelect = scan.nextLine();

			switch (seatClassSelect)
			{
			case "1":
				seatSet = seatS;
				break;
			case "2":
				seatSet = seatA;
				break;
			case "3":
				seatSet = seatB;
				break;
			default:
				seatClassSelectFlag = false;
				System.out.printf("입력오류\n");
				break;
			}
		}
		return seatSet;
	}

	private static void createSeat(Seat[] seat) // 좌석객체 생성
	{
		for (int i = 0; i < SEAT_COL_NUM; i++)
		{
			seat[i] = new Seat();
		}
	}
}
