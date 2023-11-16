package ch16.sec03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ProcedureTest3 {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean success = false;
		String sql;
		try {
			con = ProcedureTest2.makeConnection();
//			con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "1234");

			sql = "create table transaction_test1 (id varchar2(10), password varchar2(10))";
			pstmt = con.prepareStatement(sql);
			pstmt.executeUpdate();
			con.setAutoCommit(false);

			sql = "insert into transaction_test1 values('syh1011','1111')";
			pstmt = con.prepareStatement(sql);
			pstmt.executeUpdate();

			sql = "insert into transaction_test1 values('syh1011','2222')";
			pstmt = con.prepareStatement(sql);
			pstmt.executeUpdate();

			sql = "insert into transaction_test1 values('syh1011','3333')";
			pstmt = con.prepareStatement(sql);
			pstmt.executeUpdate();
			success = true;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (success) {
					con.commit();
				} else {
					con.rollback();
				}
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException sqle) {
				sqle.printStackTrace();
			}
		}
		System.out.println("END");

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
