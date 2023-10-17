package ch04.Exam;

import java.util.Scanner;

public class Ex_245_08_main
{
	Phone[] phone = null;
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args)
	{
		int count = 0;
		Phone[] phoneArray = null;

		System.out.printf("인원수>>");
		count = scan.nextInt();
		phoneArray = new Phone[count];

		for (int i = 0; i < phoneArray.length; i++)
		{
			System.out.printf("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			String name = scan.next();
			String tel = scan.next();
			phoneArray[i] = new Phone(name, tel);
			scan.nextLine();

		}
		System.out.printf("\n저장되었습니다...\n");

		for (; true;)
		{
			System.out.printf("검색할 이름>>");
			String name = scan.next();

			if (name.equals("그만"))
			{
				break;
			}

			// 서치함수
			int index = phoneNameSearchIndex(phoneArray, name);
			if (index == -1)
			{
				System.out.printf("%s가 없습니다.\n", name);
			} else
			{
				System.out.printf("%s의 번호는 %s입니다.\n", name, phoneArray[index].getTel());
			}
			scan.nextLine();
		} // end of for out

		scan.close();
		System.out.printf("\nEND");
	}

	public static int phoneNameSearchIndex(Phone[] phoneArray, String name)
	{
		int index = -1;
		for (int i = 0; i < phoneArray.length; i++)
		{
			if (phoneArray[i].getName().equals(name))
			{
				index = i;
				break;
			}
		} // end of for in
		return index;
	}
}
