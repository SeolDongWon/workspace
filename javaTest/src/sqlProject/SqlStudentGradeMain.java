package sqlProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SqlStudentGradeMain {

	public static Scanner scan = new Scanner(System.in);

	public static Connection makeConnection() {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521/xe";
		String user = "hr";
		String pwd = "hr";
		Connection con = null;
		try {
			// 1. 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			System.out.println("OracleDriver 적재 성공");
			// 2. 오라클데이터베이스 연결
			con = DriverManager.getConnection(url, user, pwd);
//			System.out.println("오라클 접속 성공");
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
		boolean stopFlag = false;
		while (!stopFlag) {
			System.out.println("0:exit 1:select 2:insert 3:update 4:delete 5:average");
			System.out.printf(">>");
			String selectMenu = scan.nextLine();

			switch (selectMenu) {
			case "0":
				stopFlag = true;
				break;
			case "1":
				studentGradeSelect();
				break;
			case "2":
				studentGradeInsert();
				break;
			case "3":
				studentGradeUpdate();
				break;
			case "4":
				studentGradeDelete();
				break;
			case "5":
				average();
				break;
			default:
			}
		}

		System.out.println("END");
	}

	private static void average() {
		boolean stopFlag = false;
		while (!stopFlag) {
			System.out.println("0:나가기 1:개인 평균 2:과목평균");
			System.out.printf(">>");
			String selectMenu = scan.nextLine();

			switch (selectMenu) {
			case "0":
				stopFlag = true;
				break;
			case "1":
				individualAverage();
				break;
			case "2":
				subjectAverage();
				break;
			default:
			}
		}

	}

	private static void individualAverage() {
		boolean loopflag = false;
		Connection con = makeConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		while (!loopflag) {
			studentGradeSelect();
			int student_id = 0;
			try {
				System.out.printf("(0입력시 종료) 학생 아이디 입력>>");
				student_id = scan.nextInt();
				scan.nextLine();
			} catch (Exception e) {
				student_id = 0;
				scan.nextLine();
			}
			if (student_id == 0) {
				break;
			}

			StudentGrade studentGrade = studentGradeSelectStudent_id(student_id);

			if (studentGrade == null) {
				System.out.printf("student_id %d 없음\n", student_id);
				return;
			}

			try {
				String query = String.format(
						"select (programing+application_sw+database_design+network_design+sql_java_design)/5 as avg from studentGrade where student_id=?");
				pstmt = con.prepareStatement(query);
				pstmt.setInt(1, student_id);
				rs = pstmt.executeQuery();

				while (rs.next()) {
					double avg = rs.getDouble("AVG");
					String data = String.format("\n%s학생의 평균점수 : " + "%.2f \n", studentGrade.getStudent_name(), avg);
					System.out.println(data);
				}
			} catch (SQLException e) {
				System.out.println("statement 오류");
			} finally {
				try {
					rs.close();
					pstmt.close();
					con.close();
				} catch (SQLException e) {
				}
			}
		}
	}

	private static void subjectAverage() {
		Connection con = makeConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		boolean loopflag = false;
		while (!loopflag) {
			String subject = null;
			System.out.printf("프로그래밍활용 응용SW기초기술활용 데이터베이스구현 네트워크프로그래밍구현 sql활용 \n 평균점수를 알아볼 과목명 입력 (exit:나가기)>>");
			String selectMenu = scan.nextLine();

			boolean subjectFlag = false;
			switch (selectMenu) {
			case "exit":
				loopflag = true;
				subjectFlag = true;
				break;
			case "프로그래밍활용":
				subject = "programing";
				break;
			case "응용SW기초기술활용":
				subject = "application_sw";
				break;
			case "데이터베이스구현":
				subject = "database_design";
				break;
			case "네트워크프로그래밍구현":
				subject = "network_design";
				break;
			case "sql활용":
				subject = "sql_java_design";
				break;
			default:
				subjectFlag = true;
				System.out.println("잘못입력");
			}
			if (!subjectFlag) {
				try {
					String query = String.format("select round(avg(?),1) as avg from studentGrade");
					pstmt = con.prepareStatement(query);
					pstmt.setString(1, subject);
					rs = pstmt.executeQuery();

					while (rs.next()) {
						double avg = rs.getDouble("AVG");
						String data = String.format("\n%s 과목의 전체학생 평균점수 : " + "%.2f \n", subject, avg);
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
		}
	}

	private static void studentGradeUpdate() {
		studentGradeSelect();
		int student_id = 0;
		try {
			System.out.printf("수정할 학생 아이디 입력>>");
			student_id = scan.nextInt();
			scan.nextLine();
		} catch (Exception e) {
			student_id = 0;
			scan.nextLine();
		}

		StudentGrade studentGrade = studentGradeSelectStudent_id(student_id);

		if (studentGrade == null) {
			System.out.printf("student_id %d 없음\n", student_id);
			return;
		}

		Connection con = makeConnection();
		PreparedStatement pstmt = null;
		try {
			System.out.printf("(%s) 학생이름 수정 입력>>", studentGrade.getStudent_name());
			String student_name = scan.nextLine().trim();
			if (student_name.equals("")) {
				student_name = studentGrade.getStudent_name();
			}
			System.out.printf("(%d)프로그래밍언어활용 점수 입력>>", studentGrade.getPrograming());
			String s_programing = scan.nextLine().trim();
			int programing = 0;
			if (s_programing.equals("")) {
				programing = studentGrade.getPrograming();
			} else {
				programing = Integer.parseInt(s_programing);
			}
			System.out.printf("(%d)응용SW기초기술활용 점수 입력>>", studentGrade.getApplication_SW());
			String s_application_sw = scan.nextLine().trim();
			int application_sw = 0;
			if (s_application_sw.equals("")) {
				application_sw = studentGrade.getApplication_SW();
			} else {
				application_sw = Integer.parseInt(s_application_sw);
			}
			System.out.printf("(%d)데이터베이스구현 점수 입력>>", studentGrade.getDatabase_design());
			String s_database_design = scan.nextLine().trim();
			int database_design = 0;
			if (s_database_design.equals("")) {
				database_design = studentGrade.getDatabase_design();
			} else {
				database_design = Integer.parseInt(s_database_design);
			}
			System.out.printf("(%d)네트워크프로그래밍구현 점수 입력>>", studentGrade.getNetwork_design());
			String s_network_design = scan.nextLine().trim();
			int network_design = 0;
			if (s_network_design.equals("")) {
				network_design = studentGrade.getNetwork_design();
			} else {
				network_design = Integer.parseInt(s_network_design);
			}
			System.out.printf("(%d)SQL활용 점수 입력>>", studentGrade.getSql_java_design());
			String s_sql_java_design = scan.nextLine().trim();
			int sql_java_design = 0;
			if (s_sql_java_design.equals("")) {
				sql_java_design = studentGrade.getSql_java_design();
			} else {
				sql_java_design = Integer.parseInt(s_sql_java_design);
			}
			String query = String.format(
					"update studentgrade set student_name = ?, programing=?, application_sw=?, database_design = ?, network_design=?, sql_java_design=? where student_id =?");
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, student_name);
			pstmt.setInt(2, programing);
			pstmt.setInt(3, application_sw);
			pstmt.setInt(4, database_design);
			pstmt.setInt(5, network_design);
			pstmt.setInt(6, sql_java_design);
			pstmt.setInt(7, student_id);
			int count = pstmt.executeUpdate();
			if (count == 0) {
				System.out.printf("student_id %d Update 오류 발생 \n", student_id);
			} else {
				System.out.printf("student_id %d Update 성공 \n", student_id);
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

	private static StudentGrade studentGradeSelectStudent_id(int student_id) {
		Connection con = makeConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		StudentGrade studentGrade = null;
		try {
			String query = String.format("select * from studentgrade where student_id = ?");
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, student_id);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				int _student_id = rs.getInt("STUDENT_ID");
				String student_name = rs.getString("STUDENT_NAME");
				int programing = rs.getInt("PROGRAMING");
				int application_sw = rs.getInt("APPLICATION_SW");
				int database_design = rs.getInt("DATABASE_DESIGN");
				int network_design = rs.getInt("NETWORK_DESIGN");
				int sql_java_design = rs.getInt("SQL_JAVA_DESIGN");
				studentGrade = new StudentGrade(_student_id, student_name, programing, application_sw, database_design,
						network_design, sql_java_design);
				System.out.println(studentGrade.toString());

			}
		} catch (SQLException e) {
			System.out.println("PreparedStatement 오류");
		} finally {
			try {
				pstmt.close();
				con.close();
			} catch (SQLException e) {
			}
		}
		return studentGrade;
	}

	private static void studentGradeDelete() {
		studentGradeSelect();

		Connection con = makeConnection();
		PreparedStatement pstmt = null;
		try {
			System.out.printf("삭제할 학생 아이디 입력>>");
			int student_id = scan.nextInt();
			scan.nextLine();
			String query = String.format("delete from studentGrade where student_id = ?");
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, student_id);
			int count = pstmt.executeUpdate();
			if (count == 0) {
				System.out.printf("student_id %d는 삭제 대상이 아닙니다.\n", student_id);
			} else {
				System.out.println("delete 성공");
			}
		} catch (SQLException e) {
			System.out.println("PreparedStatement 오류");
		} finally {
			try {
				pstmt.close();
				con.close();
			} catch (SQLException e) {
			}
		}
	}

	private static void studentGradeInsert() {
		Connection con = makeConnection();
		PreparedStatement pstmt = null;
		try {
			System.out.printf("학생이름 입력>>");
			String student_name = scan.nextLine().trim();
			System.out.printf("프로그래밍언어활용 점수 입력>>");
			int programing = scan.nextInt();
			System.out.printf("응용SW기초기술활용 점수 입력>>");
			int application_sw = scan.nextInt();
			System.out.printf("데이터베이스구현 점수 입력>>");
			int database_design = scan.nextInt();
			System.out.printf("네트워크프로그래밍구현 점수 입력>>");
			int network_design = scan.nextInt();
			System.out.printf("SQL활용 점수 입력>>");
			int sql_java_design = scan.nextInt();
			scan.nextLine();
			String query = String.format("INSERT INTO studentgrade VALUES " + "(student_id_seq.nextval,?,?,?,?,?,?)");
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, student_name);
			pstmt.setInt(2, programing);
			pstmt.setInt(3, application_sw);
			pstmt.setInt(4, database_design);
			pstmt.setInt(5, network_design);
			pstmt.setInt(6, sql_java_design);
			int count = pstmt.executeUpdate();
			// 4. count 체크
			if (count != 1) {
				System.out.println("Insert 오류 발생");
			} else {
				System.out.println("Insert 성공");
			}
		} catch (SQLException e) {
			System.out.println("PreparedStatement 오류");
		} finally {
			try {
				pstmt.close();
				con.close();
			} catch (SQLException e) {
			}
		}
	}

	private static void studentGradeSelect() {
		Connection con = makeConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String query = String.format("select * from studentgrade order by student_id");
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			System.out.println("일련번호 \t\t  이름 \t 프로그래밍활용 \t 응용SW기초기술 활용 \t 데이터베이스구현 \t 네트워크프로그래밍구현 \t sql활용");
			while (rs.next()) {
				int student_id = rs.getInt("STUDENT_id");
				String student_name = rs.getString("STUDENT_NAME");
				int programing = rs.getInt("PROGRAMING");
				int application_sw = rs.getInt("APPLICATION_SW");
				int database_design = rs.getInt("DATABASE_DESIGN");
				int network_design = rs.getInt("NETWORK_DESIGN");
				int sql_java_design = rs.getInt("SQL_JAVA_DESIGN");
				String data = String.format("%3d \t %10s \t\t %3d \t\t %3d \t\t %3d \t\t %3d \t\t\t %3d", student_id,
						student_name, programing, application_sw, database_design, network_design, sql_java_design);

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
}