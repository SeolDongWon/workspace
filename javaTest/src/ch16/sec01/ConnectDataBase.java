package ch16.sec01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDataBase {
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

	public static void main(String[] args) {
		Connection con = makeConnection();
		// 3. curd 실행
		try {
			Statement stmt = con.createStatement(); // umpor.java.sql할것
			ResultSet rs = stmt.executeQuery("SELECT * FROM emplyoees");
			System.out.println("check1");
			// 4. ResultSet 화면출력
			while (rs.next()) {
				int emplyoeeID = rs.getInt("EMPLOYEE_ID");
				String firstName = rs.getString("FIRST_NAME");
				String email = rs.getString("EMAIL");
				String jobId = rs.getString("JOB_ID");
				int salary = rs.getInt("SALARY");
				int departmentID = rs.getInt("DEPARTMENT_ID");
				System.out.printf("%-10d %-10s %-10s %-10s %-10d %-10d \n", emplyoeeID, firstName, email, jobId, salary,
						departmentID);
			}

		} catch (SQLException e) {
			System.out.println("statement 오류");
		}
		System.out.println("END");
	}
}
