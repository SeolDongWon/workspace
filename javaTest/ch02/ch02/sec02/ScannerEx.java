package ch02.sec02;

import java.util.Scanner;

public class ScannerEx
{

	public static void main(String[] args)
	{
//1 변수 - 입력객체 이름 도시 나이 체중 독신여부
		Scanner scan = new Scanner(System.in);
		String name = null, city = null;
		int age = 0;
		double weight = 0.0;
		boolean isSingle = false;
		
//2 입력 - 이름 도시 나이 체중 독신여부		
		System.out.println("이름, 도시, 나이, 체중, 독신여부를 빈칸으로 분리하여 입력하세요");
		name = scan.next();
		city = scan.next();
		age = scan.nextInt();
		weight = scan.nextDouble();
		isSingle = scan.nextBoolean();
		scan.nextLine();
		
//3 출력
		System.out.printf("이름은 %s, 도시는 %s, 나이는 %d살, 체중은 %.1fkg, 독신여부는 %b입니다.\n"
				,name,city,age,weight,isSingle);
	
//4 종료
		scan.close();
		System.out.println("END");
	}

}
