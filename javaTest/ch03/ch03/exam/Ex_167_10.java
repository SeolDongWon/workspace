// 1. 2차원 배열 int[][] n = new int[4][4]
// 2. 랜덤 1~10 구하고 10개만 (동일한 정수가 만들어져도 상관없다)
// 3. 배열에 랜덤으로 선정을해서(행(0~3) 열(0~3) 랜덤으로 결정)삽입하라(절대 중복해서 선택해서 저장은 안된다)
// 3. 나머지 6개의 숫자는 모두 0이다
package ch03.exam;

public class Ex_167_10
{
	public static void main(String[] args)
	{
		// 1 배열변수선언&초기화
		int[][] numArray = new int[4][4];
		// 2 연산-정수44배열에 값 입력
		for (int i = 0; i < 10;)
		{ // 배열 좌표생성
			int x = 0, y = 0;
			x = (int) (Math.random() * 4); // 배열의 x좌표
			y = (int) (Math.random() * 4); // 배열의 y좌표
			// 배열 좌표에 값 입력
			if (numArray[x][y] == 0) // 배열의 (x,y)위치의 값이 0 일때
			{
				numArray[x][y] = (int) (Math.random() * 10 + 1); // 1~10 정수 랜덤할당
				i++; // 할당하면 i가 1 증가
			}
		}
		// 3 출력
		for (int i = 0; i < numArray[0].length; i++)
		{
			for (int j = 0; j < numArray[0].length; j++)
			{
				System.out.printf("%d\t", numArray[i][j]); // 44배열 출력
				if (j == 3) // 4번째 출력 후 다음줄로 이동
				{
					System.out.printf("\n");
				}
			}
		}
		// 4 종료
		System.out.printf("END");
	}

}
