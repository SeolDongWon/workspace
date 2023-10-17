package ch15.sec02;

import java.io.*;
import java.net.*;
import java.util.*;

public class CalcClientEx {
	public static void main(String[] args) {
		BufferedReader buffRead = null;
		BufferedWriter buffWrite = null;
		Socket sock = null;
		Scanner scan = new Scanner(System.in);

		// 서버와 통신 시작
		try {
			sock = new Socket("localhost", 8888);
			// 입력을 보낼 변수와 결과를 받을 변수를 선언
			buffRead = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			buffWrite = new BufferedWriter(new OutputStreamWriter(sock.getOutputStream()));
			// 계산기 사용법과 유의사항 출력
			System.out.println("=====설동원 + - * / % 계산기=====");
			System.out.println("1. 빈칸으로 띄어 입력 (예:2 + 4 * 3)");
			System.out.println("2. 계산은 앞부터 차례로 시행");
			System.out.println("3. 나눗셈은 정수만 계산");
			while (true) {
				System.out.print("계산식 (종료:end)>>");
				String outputMsg = scan.nextLine();
				// end를 입력시 반복문 종료
				if (outputMsg.equalsIgnoreCase("end")) {
					buffWrite.write(outputMsg + "\n");
					buffWrite.flush();
					break;
				}
				// 입력한 문자열을 전송하고 서버에서 계산한 결과를 받아서 출력
				buffWrite.write(outputMsg + "\n");
				buffWrite.flush();
				String inputMsg = buffRead.readLine();
				System.out.println("계산 결과:" + inputMsg);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		// 통신 종료
		finally {
			scan.close();
			try {
				if (sock != null)
					sock.close();
			} catch (IOException e) {
				System.out.println("서버와 채팅 중 오류가 발생했습니다.");
			}
		}
	}
}
