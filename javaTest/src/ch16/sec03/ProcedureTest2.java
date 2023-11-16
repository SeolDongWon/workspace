package ch16.sec03;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class ProcedureTest2 {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Connection con = makeConnection();
		CallableStatement cstmt = null;

		try {
			// 1. 프로시저 실행
			cstmt = con.prepareCall("{call proc02 (?,?)}");

			// 2. 프로시저 매개변수 데이터 바인딩
			int empNo = 0;

			System.out.print("사원번호 입력>>");
			empNo = scan.nextInt();
			scan.nextLine();

			cstmt.setInt(1, empNo);
			cstmt.registerOutParameter(2, Types.VARCHAR);

			// 3. 프로시저 실행
			int result = cstmt.executeUpdate();
			System.out.println("result = " + result);
			if (result == 0) {
				throw new SQLException();
			}

			// 4. 프로시저 출력값 받아서 출력
			System.out.println(cstmt.getString(2));

		} catch (SQLException e) {
			System.out.println("callstatement 오류");
		} finally {
			try {
				if (cstmt != null)
					cstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		System.out.println("The end");

	}

	public static Connection makeConnection() {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521/xe";
		String user = "hr";
		String pwd = "hr";
		Connection con = null;
		try {
			// 1. 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("OracleDriver 적재 성공");
			// 2. 오라클데이터베이스 연결
			con = DriverManager.getConnection(url, user, pwd);
			System.out.println("오라클 접속 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("오라클 적재 실패");
		} catch (SQLException e) {
			System.out.println("오라클 접속 실패");
			e.printStackTrace();
		}
		return con;
	}
}
