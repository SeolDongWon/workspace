package ch04.exam_11;

import java.util.Scanner;

public class Ex_245_08
{
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args)
	{
		PhoneBook phonebook = new PhoneBook();
		Phone[] phone = null;
		int peopleNum = 0;

		System.out.printf("인원수>>");
		peopleNum = scan.nextInt();

		phone = phonebook.run(peopleNum);

		inputNameTel(phone);

		searchName(phone);
		
		scan.close();
		System.out.printf("\nEND");

	}

	private static void searchName(Phone[] phone)
	{
		String name = null;
		boolean flag = false;
		int index = 0;
		while (!flag)
		{
			System.out.printf("검색할 이름>>");
			name = scan.next();
			if (name.equals("그만"))
			{
				flag=true;
				continue;
			}

			index = searchIndex(phone, name);

			if (index == -1)
			{
				System.out.printf("%s 이 없습니다.\n", name);
			} else
			{
				System.out.printf("%s의 번호는 %s입니다.\n", name, phone[index].getTel());
			}
		}
	}

	private static int searchIndex(Phone[] phone, String name)
	{
		int index = -1;
		for (int i = 0; i < phone.length; i++)
		{
			if (phone[i].getName().equals(name))
			{
				index = i;
				break;
			}
		}
		return index;
	}

	private static void inputNameTel(Phone[] phone)
	{
		String name = null;
		String tel = null;

		for (int i = 0; i < phone.length; i++)
		{
			System.out.printf("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			name = scan.next();
			tel = scan.next();

			phone[i].setName(name);
			phone[i].setTel(tel);
		}
		System.out.printf("저장이되었습니다...\n");
	}
}

class Phone
{
	private String name;
	private String tel;

	public Phone(){}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getTel()
	{
		return tel;
	}

	public void setTel(String tel)
	{
		this.tel = tel;
	}
}

class PhoneBook
{
	public static Scanner scan = new Scanner(System.in);
	Phone[] phone;

	public Phone[] run(int peopleNum)
	{
		this.phone = new Phone[peopleNum];
		for (int i = 0; i < this.phone.length; i++)
		{
			this.phone[i] = new Phone();
		}
		return this.phone;
	}
}
