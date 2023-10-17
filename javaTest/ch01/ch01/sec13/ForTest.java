package ch01.sec13;

import java.util.Scanner;

public class ForTest {
    public static final int COUNT = 3;

    public static void main(String[] args) {
	// 1. 변수 선언(나이,이름,성별,국어,영어,수학,총점,평균,등급,합격, 입력장치객체)
	int age = 0, kor = 0, eng = 0, math = 0, sum = 0;
	String name = null, gender = null, grade = null, pass = null;
	double avg = 0.0;
	Scanner scan = new Scanner(System.in);

	for (int i = 0; i < 5; i = i + 1) {

	    // 3. 연산, 처리(입력 : 나이,이름,성별,국어,영어,수학,)
	    System.out.print("이름 입력 : ");
	    name = scan.nextLine();
	    System.out.print("나이 입력 : ");
	    age = scan.nextInt();
	    scan.nextLine();
	    System.out.print("성별 입력 : ");
	    gender = scan.nextLine();
	    System.out.print("국어점수 입력 : ");
	    kor = scan.nextInt();
	    System.out.print("영어점수 입력 : ");
	    eng = scan.nextInt();
	    System.out.print("수학점수 입력 : ");
	    math = scan.nextInt();
	    scan.nextLine();

	    // 3. 연산(총점, 평균, 등급, 합격)
	    sum = kor + eng + math;
	    avg = sum / (double) COUNT;
	    pass = "합격";

	    switch ((int) avg / 10) {
	    case 10:
	    case 9:
		grade = "A등급";
		break;
	    case 8:
		grade = "B등급";
		break;
	    case 7:
		grade = "C등급";
		break;
	    case 6:
		grade = "D등급";
		break;
	    default:
		grade = "F등급";
		pass = "불합격";
	    }

	    // 4. 출력(이름, 나이, 성별, 국어, 영어, 수학, 총점, 평균, 등급, 합격)
	    System.out.printf("이름: %s ", name);
	    System.out.printf("나이: %s ", age);
	    System.out.printf("성별: %s ", gender);
	    System.out.printf("국어: %d ", kor);
	    System.out.printf("영어: %d ", eng);
	    System.out.printf("수학: %d ", math);
	    System.out.printf("총점: %d ", sum);
	    System.out.printf("평균: %.2f ", avg);
	    System.out.printf("등급: %s ", grade);
	    System.out.printf("합격: %s ", pass);
	    System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

	} // end of for

	// 5. 종료(자원반납)
	scan.close();
	System.out.println("종료");
    }
}
