package ch16.sec01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedStatementTest2 {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// 클래스 만들고create 입력하고insert 보여주고select 삭제drop
		boolean stopFlag = false;
		while (!stopFlag) {
			System.out.println("1:create 2:insert 3:select 4:drop 5:exit ");
			System.out.printf(">>");
			int num = scan.nextInt();
			scan.nextLine();

			switch (num) {
			case 1:
				createTable();
				break;
			case 2:
				insertMember();
				break;
			case 3:
				selectMember();
				break;
			case 4:
				dropMemberTable();
				break;
			case 5:
				stopFlag = true;
				break;
			default:
			}
		}
		System.out.println("END");
	}

	private static void dropMemberTable() {
		Connection con = ConnectDataBase.makeConnection();
		PreparedStatement pstmt = null;
		try {
			// 3. crud 실행
			String query = String.format("drop table member");
			pstmt = con.prepareStatement(query);
			int count = pstmt.executeUpdate();
			System.out.println("drop 성공");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("PreparedStatement 오류 or drop 실패");
		} finally {
			try {
				pstmt.close();
				con.close();
			} catch (SQLException e) {
			}
		}
	}

	private static void selectMember() {
		Connection con = ConnectDataBase.makeConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		// 3. curd 실행
		try {
			String query = String.format("select * from member");
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			// 4. ResultSet 화면출력

			while (rs.next()) {
				String id = rs.getString("id");
				String password = rs.getString("password");
				String name = rs.getString("name");
				String data = String.format("%-10s \t %-10s \t %-10s", id, password, name);
				System.out.println(data);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("PreparedStatement 오류");
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (SQLException e) {
			}
		}
	}

	private static void insertMember() {
		Connection con = ConnectDataBase.makeConnection();
		PreparedStatement pstmt = null;
		try {
			System.out.printf("id 입력>>");
			String id = scan.nextLine().trim();
			System.out.printf("password 입력>>");
			String password = scan.nextLine().trim();
			System.out.printf("name 입력>>");
			String name = scan.nextLine().trim();
			// 3. crud 실행
			String query = String.format("insert into member values(?, ?, ?)");
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			pstmt.setString(3, name);
			int count = pstmt.executeUpdate();
			// 4. count 체크
			if (count >= 1) {
				System.out.println("Insert 성공");
			} else {
				System.out.println("Insert 오류 발생");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("PreparedStatement 오류");
		} finally {
			try {
				pstmt.close();
				con.close();
			} catch (SQLException e) {
			}
		}
	}

	// 테이블 생성
	private static void createTable() {
		Connection con = ConnectDataBase.makeConnection();
		PreparedStatement pstmt = null;
		try {
			// 3. crud 실행
			String query = String.format("CREATE TABLE MEMBER(" + "    ID VARCHAR2(10)," + "    PASSWORD VARCHAR2(10),"
					+ "    NAME VARCHAR2(5)," + "    CONSTRAINT member_id_pk PRIMARY KEY(ID))");
			pstmt = con.prepareStatement(query);
			int count = pstmt.executeUpdate();
			System.out.println("create 성공");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("PreparedStatement 오류 or create 실패");
		} finally {
			try {
				pstmt.close();
				con.close();
			} catch (SQLException e) {
			}
		}
	}
}
