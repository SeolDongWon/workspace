// 4x4 2차원배열 랜덤정수 출력
package ch03.examSEOL;

public class Ex_164_09
{
	public static void main(String[] args)
	{
		// 1 배열변수선언&초기화
		int[][] numArray = new int[4][4];

		// 2 연산
		for (int i = 0; i < numArray.length; i++)
		{
			for (int j = 0; j < numArray[i].length; j++)
			{
				numArray[i][j] = (int) (Math.random() * 10 + 1);
				// 3 출력
				System.out.printf("%d\t", numArray[i][j]);
			}
			System.out.printf("\n");
		}
		// 4 종료
		System.out.printf("END");
	}
}
