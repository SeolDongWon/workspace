package ch04.Exam;

public class Ex_245_09
{
	public static void main(String[] args)
	{
		int[] array1= new int[] {1,5,7,9};
		int[] array2= new int[] {3,6,-1,100,77};
		int[] array3= ArrayUtil.concatenate(array1, array2);
		
		ArrayUtil.print(array1);
		ArrayUtil.print(array2);
		ArrayUtil.print(array3);
	}
}
