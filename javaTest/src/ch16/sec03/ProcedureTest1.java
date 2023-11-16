package ch16.sec03;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class ProcedureTest1 {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Connection con = makeConnection();
		CallableStatement cstmt = null;

		try {
//			Statement stmt = con.createStatement();
//			ResultSet rs = stmt.executeQuery("select * from books");
			// 1. 프로시저 실행
			cstmt = con.prepareCall("{call proc01(?, ?)}");
			// 2. 프로시저 매개변수 데이터 바인딩
			int deptNo = 0;
			double rate = 0.0;

			System.out.print("부서번호 입력>>");
			deptNo = scan.nextInt();
			scan.nextLine();
			System.out.print("인상률 입력>>");
			rate = scan.nextDouble();
			scan.nextLine();

			cstmt.setInt(1, deptNo);
			cstmt.setDouble(2, rate);
			// 3. 프로시저 실행
			int result = cstmt.executeUpdate();
			System.out.println("result = " + result);

		} catch (SQLException e) {
			System.out.println("statement 오류");
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
