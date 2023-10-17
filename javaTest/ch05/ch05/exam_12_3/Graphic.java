package ch05.exam_12_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Graphic {
	public static Shape start; // 첫 인스턴스 주소
	public static Shape last; // 마지막 인스턴스의 주소 저장
	public static Shape obj;
	public static int cnt = 1; // 입력받은 도형갯수

	public static void main(String[] args) {
		int input = 0; // 메뉴 입력
		int num = 0; // 도형 입력
		int delete = 0; // 삭제 위치 입력
		Scanner scan = new Scanner(System.in);
		System.out.println("그래픽 에디터를 실행합니다.");
		while (true) {
			try {
				System.out.printf("삽입(1), 삭제(2), 모두보기(3), 종료(4)>>");
				input = scan.nextInt();

			} catch (InputMismatchException e) {
				scan.nextLine();
				System.out.println("숫자를 입력하세요.");
				continue;
			}
			switch (input) {
			case 1:
				try {
					System.out.printf("Line(1), Rect(2), Circle(3)>>");
					num = scan.nextInt();
					input(num);

				} catch (InputMismatchException e) {
					scan.nextLine();
					System.out.println("숫자를 입력하세요.");
					break;
				}
				break;
			case 2:
				
				// 위치 입력받고, 위치 다음 주소를 전 객체에 입력
				try {
					System.out.printf("삭제할 도형의 위치>>");
					delete = scan.nextInt();
				} catch (InputMismatchException e) {
					scan.nextLine();
					System.out.println("숫자를 입력하세요.");
					break;
				}
				
				if (delete > cnt || delete < 1) {          // nullpoint예외 제거
					System.out.println("삭제할수없습니다.");
					break;
				}
				
				Shape cancle = start;       // n+1 번째 인스턴스의 주소 저장할 변수 
				Shape link = null;			// n-1 번째 인스턴스의 주소 저장할 변수
				if (delete == 1) {          /// 인스턴스를 1개만 생성하고 삭제할경우 그 인스턴스의 주소를 null로 바꿔줌.
					start = start.getNext();
					break;
				}
				
				for (int i = 0; i < delete; i++) {  // n번째 인스턴스를 삭제할경우 n-1번째 인스턴스에 getnext를 통해 n+1번째 인스턴스 주소를 연결해줌
					if (delete - 2 == i) {
						link = cancle;
					}
					cancle = cancle.getNext();
				}
				
				link.setNext(cancle);
				break;
				
			case 3:                             //  출력 
				Shape view = start;             // 처음 객체의 주소가 저장된 start를 view에 저장
				if (start == null) {			// 처음에 객체 생성을 하지 않으면 비어있음 출력
					System.out.println("비어있음");
					break;
				}
				while (view != null) {   //   인스턴스 생성했다면 , draw메소드로 출력  
										// view에는 getNext를 통해 다음에 생성한 인스턴스의 주소를 저장해줌.
					view.draw();		// getnext가 null이 되기전까지 출력
					view = view.getNext();
				}
				break;
			case 4:
				scan.close();
				System.out.println("시스템을 종료합니다.");
				return;
			}

		}
	}

	public static void input(int num) {
		if (cnt == 1) {              /// 첫 시작은 일단 인스턴스 생성후 주소 start와 last에 저장
			switch (num) {
			case 1:
				start = new Line();
				last = start;
				break;
			case 2:
				start = new Rect();
				last = start;
				break;
			case 3:
				start = new Circle();
				last = start;
				break;
			}
		} else {
			switch (num) {              // n번째(n>2) 부터 obj에 인스턴스 주소 저장 후, (n-1번째)last.set메소드를 통해 n번째 객체 저장.
			case 1:
				obj = new Line();
				last.setNext(obj);
				last = obj;
				break;
			case 2:
				obj = new Rect();
				last.setNext(obj);
				last = obj;
				break;
			case 3:
				obj = new Circle();
				last.setNext(obj);
				last = obj;
				break;
			}

		}
		cnt += 1;  // 메소드 호출될때마다 도형의 갯수 +1
	}
}