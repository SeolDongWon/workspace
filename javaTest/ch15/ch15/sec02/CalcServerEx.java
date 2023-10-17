package ch15.sec02;

import java.io.*;
import java.net.*;
import java.util.*;

public class CalcServerEx {
	public static String calc(String exp) {
		// 받은 매개변수를 띄어쓰기로 분리해서 토큰으로 만든다
		StringTokenizer strToken = new StringTokenizer(exp, " ");
		// 2 + 4 처럼 연산자와 피연산자가 같이 나와야하기에 토큰은 홀수가 정상
		// 입력한 토큰의 수가 짝수면 에러
		if (strToken.countTokens() % 2 == 0)
			return "error";

		// 토큰의 연산자와 피연산자를 할당받을 리스트변수
		ArrayList<Integer> operandList = new ArrayList<Integer>();
		ArrayList<String> operatorList = new ArrayList<String>();

		int count = 0; // 토큰의 짝수번째와 홀수번째를 구분할 카운트
		// 토큰의 연산자와 피연산자를 리스트에 넣는다
		for (; strToken.hasMoreTokens();) {
			if (count % 2 == 0) { // 짝수번째는 항상 피연산자가 온다
				operandList.add(Integer.parseInt(strToken.nextToken()));
			} else if (count % 2 == 1) { // 홀수번째는 항상 연산자가 온다
				operatorList.add(strToken.nextToken());
			}
			count++;
		}

		int result = operandList.get(0); // 계산결과 변수에 첫번째 피연산자를 할당하고 계산에 사용
		// 연산자의 수 만큼 계산을 반복한다
		for (int i = 0; i < operatorList.size(); i++) {
			// 계산결과를 result에 저장하고 다음 계산에 이어서 사용
			switch (operatorList.get(i)) {
			case "+":
				result = result + operandList.get(i + 1);
				break;
			case "-":
				result = result - operandList.get(i + 1);
				break;
			case "*":
				result = result * operandList.get(i + 1);
				break;
			// "/"와 "%"의 피연산자가 0이면 에러 발생
			case "/":
				if (operandList.get(i + 1) == 0) {
					return "error";
				}
				result = result / operandList.get(i + 1);
				break;
			case "%":
				if (operandList.get(i + 1) == 0) {
					return "error";
				}
				result = result % operandList.get(i + 1);
				break;
			// 연산자에 + - * / % 이외 다른 문자열이 오면 에러 발생
			default:
				return "error";
			}
		}
		return Integer.toString(result);
	}

	public static void main(String[] args) {
		BufferedReader buffRead = null;
		BufferedWriter buffWrite = null;
		ServerSocket serverSock = null;
		Socket sock = null;

		// 클라이언트와 통신 시작
		try {
			serverSock = new ServerSocket(8888);
			System.out.println("연결을 기다리고 있습니다...");
			sock = serverSock.accept(); // 클라이언트의 연결을 기다린다
			System.out.println("연결되었습니다.");
			// 클라이언트에서 보낸 입력을 받을 변수와 결과를 보낼 변수 선언
			buffRead = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			buffWrite = new BufferedWriter(new OutputStreamWriter(sock.getOutputStream()));
			while (true) {
				String inputMsg = buffRead.readLine();
				// 클라이언트가 "end"를 입력하면 반복문 종료
				if (inputMsg.equalsIgnoreCase("end")) {
					System.out.println("클라이언트에서 연결을 종료하였음");
					break;
				}
				// 클라이언트가 입력한 문자열을 출력, 계산함수에 매개변수로 할당, 계산결과를 보낸다
				System.out.println(inputMsg);
				String result = calc(inputMsg);
				buffWrite.write(result + "\n");
				buffWrite.flush();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		// 통신 종료
		finally {
			try {
				if (sock != null)
					sock.close();
				if (serverSock != null)
					serverSock.close();
			} catch (IOException e) {
				System.out.println("클라이언트와 채팅 중 오류가 발생했습니다.");
			}
		}
	}
}
