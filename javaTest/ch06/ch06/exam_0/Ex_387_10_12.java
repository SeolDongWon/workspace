package ch06.exam_0;

import java.util.Scanner;

public class Ex_387_10_12{
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){
		Person[] person = null;

		person = new Person[playerNum(person)];
		nameInput(person);
		gameStart(person);
		System.out.printf("\nEND");
	}

	private static void gameStart(Person[] person){
		int[] randomNum = new int[3];
		boolean flag = false;
		
		while (!flag){
			for (int i = 0; i < person.length; i++){
				System.out.printf("[%s]:<Endter>", person[i].getName());
				scan.nextLine();
				System.out.printf("\t");
				
				for (int j = 0; j < randomNum.length; j++){
					randomNum[j] = (int) (Math.random() * (3 - 1 + 1) + (1));
					System.out.printf("%d   ", randomNum[j]);
				}
				
				if (randomNum[0] == randomNum[1] && randomNum[2] == randomNum[1]){
					System.out.printf("%s님이 이겼습니다!", person[i].getName());
					flag = true;
					break;
				} else{
					System.out.printf("아쉽군요!\n");
				}
			}
		}
	}

	private static void nameInput(Person[] person){
		for (int i = 0; i < person.length; i++){
			System.out.printf("%d번째 선수 이름>>", i + 1);
			person[i] = new Person(scan.next().trim());
			scan.nextLine();
		}
	}

	private static int playerNum(Person[] person){
		int playerNum = 0;
		boolean playerNumFlag = false;

		while (!playerNumFlag){
			System.out.printf("갬블링 게임에 참여할 선수 숫자>>");
			
			try{
				playerNum = scan.nextInt();
				scan.nextLine();
				playerNumFlag = true;
			} catch (Exception e){
				System.out.printf("입력오류\n");
				scan.nextLine();
				continue;
			}
		}
		return playerNum;
	}
}

class Person{
	private String name;
	public Person(String name){
		super();
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
}