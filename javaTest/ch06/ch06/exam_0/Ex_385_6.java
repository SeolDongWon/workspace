package ch06.exam_0;

import java.util.Calendar;
import java.util.Scanner;

public class Ex_385_6{
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){
		Player[] player = null;

		player = new Player[playerNum(player)];
		nameInput(player);
		gameStart(player);
		System.out.printf("\nEND");
	}

	private static void gameStart(Player[] player){
		System.out.printf("10초에 가까운 사람이 이기는 게임입니다.\n");

		for (int i = 0; i < player.length; i++){
			long milSecStart = 0;
			long milSecEnd = 0;
			long milSecSub = 0;
			int tenSec = 10000;
			int tenSubMil = 0;

			System.out.printf("\n%s시작 <Endter>키>>", player[i].getName());
			scan.nextLine();
			milSecStart = System.currentTimeMillis();
			System.out.printf("현재 초 시간 = %d\n", Calendar.getInstance().get(Calendar.SECOND));

			System.out.printf("10초 예상 후 <Endter>키>>");
			scan.nextLine();
			milSecEnd = System.currentTimeMillis();
			System.out.printf("현재 초 시간 = %d\n", Calendar.getInstance().get(Calendar.SECOND));

			milSecSub = milSecEnd - milSecStart;
			player[i].setMilSecSub((int) milSecSub);

			tenSubMil = Math.abs((int) (tenSec - milSecSub));
			player[i].setTenSubMil(tenSubMil);

		}
		
		System.out.printf("\n");
		int min = Integer.MAX_VALUE;
		int index = 0;
		for (int i = 0; i < player.length; i++){

			System.out.printf("%s의 결과 %d\n", player[i].getName(), player[i].getMilSecSub() / 1000);
			if (min > player[i].getTenSubMil()){
				min = player[i].getTenSubMil();
				index = i;
			}
		}
		System.out.printf("승자는 %s", player[index].getName());
	}

	private static void nameInput(Player[] person){
		for (int i = 0; i < person.length; i++){
			System.out.printf("%d번째 선수 이름>>", i + 1);
			person[i] = new Player(scan.next().trim());
			scan.nextLine();
		}
	}

	private static int playerNum(Player[] person){
		int playerNum = 0;
		boolean playerNumFlag = false;

		while (!playerNumFlag){
			System.out.printf("게임에 참여할 선수 숫자>>");

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

class Player{
	private String name;
	private int milSecSub;
	private int tenSubMil;

	public Player(String name){
		super();
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public int getMilSecSub()
	{
		return milSecSub;
	}

	public void setMilSecSub(int milSecSub)
	{
		this.milSecSub = milSecSub;
	}

	public int getTenSubMil()
	{
		return tenSubMil;
	}

	public void setTenSubMil(int tenSubMil)
	{
		this.tenSubMil = tenSubMil;
	}



}
