// 4x4 2차원배열, 1~10 랜덤정수 10개만 출력, 나머지는 0출력
package ch03.examSEOL;

public class Ex_164_10
{
	public static final int ROW = 4;
	public static final int COL = 4;

	public static void main(String[] args)
	{
		// 1 배열변수선언&초기화
		int[][] numArray = new int[ROW][COL];

		// 2 연산-정수44배열에 값 입력
		for (int i = 0; i < 10; i++)
		{ // 배열 좌표생성
			int x = 0, y = 0;
			x = (int) (Math.random() * ROW); // 배열의 x좌표(0~3)
			y = (int) (Math.random() * COL); // 배열의 y좌표(0~3)
			// 배열 좌표에 값 입력
			if (numArray[x][y] == 0) // 배열의 (x,y)위치가 0 일때
			{
				numArray[x][y] = (int) (Math.random() * 10 + 1); // 1~10 정수 랜덤입력
			} else
			{
				i--; // 값을 안넣었으면 i는 1감소
			}
		}

		// 3 출력
		for (int i = 0; i < numArray.length; i++)
		{
			for (int j = 0; j < numArray[i].length; j++)
			{
				System.out.printf("%d\t", numArray[i][j]); // 44배열 출력
			}
			System.out.printf("\n");
		}

		// 4 종료
		System.out.printf("END");
	}
}
