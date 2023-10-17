package ch06.exam_0;



public class Example{
	public static void main(String[] args){
		java.util.StringTokenizer st = new java.util.StringTokenizer("a=3,b=5,c=6", "=,");
		int sum = 0;
		String str = null;
		while (st.hasMoreTokens()){
			str = st.nextToken();
			System.out.println(str);
			try{
				sum = sum + Integer.parseInt(str);
			} catch (Exception e){
			}
		}
		System.out.printf("합은 %d", sum);
	}
}
