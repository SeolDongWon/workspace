package ch01.sec11;

import java.util.Scanner;

public class GradeTest {
    public static final int COUNT = 3;

    public static void main(String[] args) {
	// 1. 변수 선언(나이,이름,성별,국어,영어,수학,총점,평균,등급,합격, 입력장치객체)
	int age = 0, kor = 0, eng = 0, math = 0, sum = 0;
	String name = null, gender = null, grade = null, pass = null;
	double avg = 0.0;
	Scanner scan = new Scanner(System.in);

	for (int i = 0; i < 5; i = i + 1) {

	    // 3. 연산, 처리(입력 : 나이,이름,성별,국어,영어,수학,)
	    System.out.print("나이 입력 : ");
	    age = scan.nextInt();
	    scan.nextLine();
	    System.out.print("이름 입력 : ");
	    name = scan.nextLine();
	    System.out.print("성별 입력 : ");
	    gender = scan.nextLine();
	    System.out.print("국어점수 입력 : ");
	    kor = scan.nextInt();
	    System.out.print("영어점수 입력 : ");
	    eng = scan.nextInt();
	    System.out.print("수학점수 입력 : ");
	    math = scan.nextInt();

	    // 3. 연산(총점, 평균, 등급, 합격)
	    sum = kor + eng + math;
	    avg = sum / (double) COUNT;
	    pass = "합격";

	    // 평균 테스트

//	pass = "합격";
//	System.out.print("테스트평균 입력 : ");
//	avg = scan.nextInt();

	    // IF 1번

//	if (100.0 >= avg && avg >= 90.0)
//	    grade = "A등급";
//	if (89.0 >= avg && avg >= 80.0)
//	    grade = "B등급";
//	if (79.0 >= avg && avg >= 70.0)
//	    grade = "C등급";
//	if (69.0 >= avg && avg >= 60.0)
//	    grade = "D등급";
//	if (59.0 >= avg && avg >= 0.0) {
//	    grade = "F등급";
//	    pass = "불합격";
//	}

	    // IF 2번

//	    if (avg >= 90.0) {
//		grade = "A등급";
//	    } else if (avg >= 80.0) {
//		grade = "B등급";
//	    } else if (avg >= 70.0) {
//		grade = "C등급";
//	    } else if (avg >= 60.0) {
//		grade = "D등급";
//	    } else {
//		grade = "F등급";
//		pass = "불합격";
//	    }

	    // SWITCH


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
	    System.out.printf("\n 이름 : %5s\n", name);
	    System.out.printf(" 나이 : %5s\n", age);
	    System.out.printf(" 성별 : %5s\n", gender);
	    System.out.printf(" 총점 : %5d\n", sum);
	    System.out.printf(" 평균 : %5.2f\n", avg);
	    System.out.printf(" 등급 : %5s\n", grade);
	    System.out.printf(" 합격 : %5s\n", pass);

	} // end of for

	// 5. 종료(자원반납)
	scan.close();
	System.out.println("종료");
    }
}