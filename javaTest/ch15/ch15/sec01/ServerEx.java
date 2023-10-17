package ch15.sec01;

import java.io.*;
import java.net.*;
import java.util.*;

public class ServerEx {
	public static void main(String[] args) {
		BufferedReader bufferedReader = null;
		BufferedWriter bufferedWriter = null;
		ServerSocket serverSocket = null;
		Socket socket = null;
		Scanner scan = new Scanner(System.in); // 키보드에서 읽을 scanner 객체 생성
		String clientName = null;
		boolean nameflag = false;

		try {
			serverSocket = new ServerSocket(7777);
			System.out.println("연결을 기다리고 있습니다...");
			socket = serverSocket.accept(); // 클라이언트로부터 연결 요청 대기
			System.out.println("연결되었습니다.");
			bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			while (true) {
				String inputMessage = bufferedReader.readLine(); // 클라이언트로부터 한 행 읽기
				if (inputMessage.equalsIgnoreCase("bye")) {
					System.out.println("클라이언트에서 bye로 연결을 종료하였음");
					break; // "bye"를 받으면 연결 종료
				}
				if (!false) {
					clientName = inputMessage;
					nameflag = true;
				}
				System.out.println("[ " + clientName + " ] : " + inputMessage);
//				System.out.println("클라이언트 : " + inputMessage);
				System.out.print("보내기>>"); // 프롬프트
				String outputMessage = scan.nextLine(); // 키보드에서 한 행 읽기
				bufferedWriter.write(outputMessage + "\n"); // 키보드에서 읽은 문자열 전송
				bufferedWriter.flush(); // bufferedWriter의 스트림 버퍼에 있는 모든 문자열 전송
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				scan.close(); // scan 닫기
				socket.close(); // 통신용 소켓 닫기
				serverSocket.close(); // 서버 소켓 닫기
			} catch (IOException e) {
				System.out.println("클라이언트와 채팅 중 오류가 발생했습니다.");
			}
		}
	}
}