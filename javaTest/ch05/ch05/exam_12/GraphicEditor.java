package ch05.exam_12;

import java.util.Scanner;

public class GraphicEditor
{
	public static Shape start = null;
	public static Shape last = null;
	public static Shape obj = null;
	public static int count = 0;
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args)
	{
		String menuSelect = null;
		boolean menuFlag = false;

		System.out.printf("그래픽 에디터 beauty를 실행합니다.\n");

		while (!menuFlag)
		{
			System.out.printf("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
			menuSelect = scan.nextLine();

			switch (menuSelect)
			{
			case "1":
				input();
				break;
			case "2":
				delete();
				break;
			case "3":
				show();
				break;
			case "4":
				menuFlag = true;
				break;
			default:
				System.out.printf("입력오류\n");
				break;
			}
		}
		scan.close();
		System.out.printf("\nEND");
	}

	private static void delete()
	{
		int deleteNum = 0;
		System.out.printf("삭제할 도형의 위치>>");
		deleteNum = scan.nextInt();
		scan.nextLine();

		Shape shapeDelete = start;
		Shape shapeLink = null;
		for (int i = 0; i < deleteNum; i++)
		{
			if (i == deleteNum - 2)
			{
				shapeLink = shapeDelete;
			}
			shapeDelete = shapeDelete.getNext();
		}
		shapeLink.setNext(shapeDelete);
	}

	private static void input()
	{
		String insertSelect = null;
		boolean insertFlag = false;
		while (!insertFlag)
		{
			insertFlag = true;
			System.out.printf("Line(1), Rect(2), Circle(3)>>");
			insertSelect = scan.nextLine();

			switch (insertSelect)
			{
			case "1":
				obj = new Line();
				if (count == 0)
				{
					start = obj;
					last = start;
				}

				last.setNext(obj);
				last = obj;
				break;

			case "2":
				obj = new Rect();
				if (count == 0)
				{
					start = obj;
					last = start;
				}

				last.setNext(obj);
				last = obj;
				break;

			case "3":
				obj = new Circle();
				if (count == 0)
				{
					start = obj;
					last = start;
				}

				last.setNext(obj);
				last = obj;
				break;
			default:
				insertFlag = false;
				System.out.printf("입력오류\n");
				break;
			}
		}
		count++;
	}

	private static void show()
	{
		Shape shapeShow = start;
		while (shapeShow != null)
		{
			shapeShow.draw();
			shapeShow = shapeShow.getNext();
		}
	}
}
