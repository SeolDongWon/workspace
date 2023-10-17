package ch15.sec02;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CalTest {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		String str = scan.nextLine();
		System.out.println(calc(str));
	}

	public static String calc(String exp) {

		StringTokenizer st = new StringTokenizer(exp, " ");
		if (st.countTokens() % 2 != 1)
			return "error";
		String res = "";
		ArrayList<Integer> intList = new ArrayList<Integer>();
		ArrayList<String> strList = new ArrayList<String>();
		int count = 0;
		for (; st.hasMoreTokens();) {
			if (count % 2 == 0) {
				intList.add(Integer.parseInt(st.nextToken()));
			} else if (count % 2 == 1) {
				strList.add(st.nextToken());
			}
			count++;
		}
		System.out.println(intList);
		System.out.println(strList);
//		switch (strList.get(0)) {
//		case "+":
//			res = Integer.toString(intList.get(0) + intList.get(1));
//			break;
//		case "-":
//			res = Integer.toString(intList.get(0) + intList.get(1));
//			break;
//		case "*":
//			res = Integer.toString(intList.get(0) + intList.get(1));
//			break;
//		default:
//			res = "error";
//		}
		return res;
	}
}
