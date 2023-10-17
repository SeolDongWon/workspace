package ch16.sec01;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SqlBooksInsertTest {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		boolean stopFlag = false;
		while (!stopFlag) {
			System.out.println("0:exit 1:select 2:insert 3:update 4:update2 5:delete ");
			System.out.printf(">>");
			String selectMenu = scan.nextLine();

			switch (selectMenu) {
			case "0":
				stopFlag = true;
				break;
			case "1":
				booksSelect();
//				booksSelect2();
				break;
			case "2":
				booksInsert();
				break;
			case "3":
				booksUpdate();
				break;
			case "4":
				booksUpdate2();
				break;
			case "5":
				bookDelete();
				break;
			default:
			}
		}
		// select()
//		booksSelect();
		// insert();
//		booksInsert();

		System.out.println("END");
	}

	private static void booksUpdate2() {
		// 수정 대상을 보여준다
		booksSelect();

		System.out.printf("수정할 책 아이디 입력>>");
		int bookID = scan.nextInt();
		scan.nextLine();

		Books books = booksSelectBookId(bookID);

		if (books == null) {
			System.out.printf("bookd_id %d 없음\n", bookID);
			return;
		}

		Connection con = ConnectDataBase.makeConnection();
		Statement stmt = null;
		// 3. crud 실행
		try {
			System.out.printf("(%s) 책이름 수정 입력>>", books.getTitle());
			String title = scan.nextLine().trim();
			if (title.equals("")) {
				title = books.getTitle();
			}
			System.out.printf("(%s) 출판사 수정 입력>>", books.getPublisher());
			String publisher = scan.nextLine().trim();
			if (publisher.equals("")) {
				publisher = books.getPublisher();
			}
			System.out.printf("(%s) 출판년도 수정 입력>>", books.getYear());
			String year = scan.nextLine().trim();
			if (year.equals("")) {
				year = books.getYear();
			}
			System.out.printf("(%d) 가격 수정 입력>>", books.getPrice());
			String s_price = scan.nextLine().trim();
			int price = 0;
			if (s_price.equals("")) {
				price = books.getPrice();
			} else {
				price = Integer.parseInt(s_price);
			}
			stmt = con.createStatement();
			String query = String.format(
					"update books set title = '%s', publisher = '%s' , year = '%s', price = %d where book_id = %d",
					title, publisher, year, price, bookID);
			int count = stmt.executeUpdate(query);
			// 4. count 체크
			if (count == 0) {
				System.out.printf("book_id %d Update 오류 발생 \n", bookID);
			} else {
				System.out.printf("book_id %d Update 성공 \n", bookID);
			}
		} catch (SQLException e) {
			System.out.println("statement 오류");
		} finally {
			try {
				stmt.close();
				con.close();
			} catch (SQLException e) {
			}
		}
	}

	private static Books booksSelectBookId(int bookID) {
		Connection con = ConnectDataBase.makeConnection();
		Statement stmt = null;
		ResultSet rs = null;
		Books books = null;
		// 3. curd 실행
		try {
			stmt = con.createStatement(); // umpor.java.sql할것
			String query = String.format("SELECT * FROM BOOKS where Book_id = %d", bookID);
			rs = stmt.executeQuery(query);

			// 4. ResultSet 화면출력
			if (rs.next()) {
				int _bookID = rs.getInt("BOOK_ID");
				String title = rs.getString("TITLE");
				String publisher = rs.getString("PUBLISHER");
				String year = rs.getString("YEAR");
				int price = rs.getInt("PRICE");

				books = new Books(_bookID, title, publisher, year, price);
				System.out.println(books.toString());
			}
		} catch (SQLException e) {
			System.out.println("statement 오류");
		} finally {
			try {
				stmt.close();
				con.close();
			} catch (SQLException e) {
			}
		}
		return books;
	}

	private static void booksUpdate() {
		// 수정 대상을 보여준다
		booksSelect();

		Connection con = ConnectDataBase.makeConnection();
		Statement stmt = null;
		// 3. crud 실행
		try {
			System.out.printf("수정할 책 아이디 입력>>");
			int bookID = scan.nextInt();
			scan.nextLine();
			System.out.printf("수정 책이름 입력>>");
			String title = scan.nextLine().trim();
			System.out.printf("수정 출판사 입력>>");
			String publisher = scan.nextLine().trim();
			System.out.printf("수정 출판연도 입력>>");
			String year = scan.nextLine().trim();
			System.out.printf("수정 가격 입력>>");
			int price = scan.nextInt();
			scan.nextLine();
			stmt = con.createStatement();
			String query = String.format(
					"update books set title = '%s', publisher = '%s' , year = '%s', price = %d where book_id = %d",
					title, publisher, year, price, bookID);
			int count = stmt.executeUpdate(query);
			// 4. count 체크
			if (count == 0) {
				System.out.printf("book_id %d Update 오류 발생 \n", bookID);
			} else {
				System.out.printf("book_id %d Update 성공 \n", bookID);
			}
		} catch (SQLException e) {
			System.out.println("statement 오류");
		} finally {
			try {
				stmt.close();
				con.close();
			} catch (SQLException e) {
			}
		}
	}

	private static void bookDelete() {
		// 삭제 대상을 보여준다
		booksSelect();

		Connection con = ConnectDataBase.makeConnection();
		Statement stmt = null;
		try {
			System.out.printf("삭제할 책 아이디 입력>>");
			int bookID = scan.nextInt();
			scan.nextLine();
			// 3. crud 실행
			stmt = con.createStatement();
			String query = String.format("delete from books where book_id = %d", bookID);
			int count = stmt.executeUpdate(query);
			// 4. count 체크
			if (count == 0) {
				System.out.printf("book_id %d는 삭제 대상이 아닙니다.\n", bookID);
			} else {
				System.out.println("delete 성공");
			}
		} catch (SQLException e) {
			System.out.println("statement 오류");
		} finally {
			try {
				stmt.close();
				con.close();
			} catch (SQLException e) {
			}
		}
	}

	private static void booksInsert() {
		Connection con = ConnectDataBase.makeConnection();
		Statement stmt = null;
		// 3. crud 실행
		try {
			System.out.printf("책이름 입력>>");
			String title = scan.nextLine().trim();
			System.out.printf("출판사 입력>>");
			String publisher = scan.nextLine().trim();
			System.out.printf("출판연도 입력>>");
			String year = scan.nextLine().trim();
			System.out.printf("가격 입력>>");
			int price = scan.nextInt();
			scan.nextLine();
			stmt = con.createStatement();
			String query = String.format("INSERT INTO books VALUES " + "(book_id_seq.nextval,'%s','%s','%s',%d)", title,
					publisher, year, price);
			int count = stmt.executeUpdate(query);
			// 4. count 체크
			if (count != 1) {
				System.out.println("Insert 오류 발생");
			} else {
				System.out.println("Insert 성공");
			}
		} catch (SQLException e) {
			System.out.println("statement 오류");
		} finally {
			try {
				stmt.close();
				con.close();
			} catch (SQLException e) {
			}
		}
	}

	private static void booksSelect() {
		Connection con = ConnectDataBase.makeConnection();
		Statement stmt = null;
		ResultSet rs = null;
		// 3. curd 실행
		try {
			stmt = con.createStatement(); // umpor.java.sql할것
			rs = stmt.executeQuery("SELECT * FROM BOOKS order by book_id");
			// 4. ResultSet 화면출력

			while (rs.next()) {
				int bookID = rs.getInt("BOOK_ID");
				String title = rs.getString("TITLE");
				String publisher = rs.getString("PUBLISHER");
				String year = rs.getString("YEAR");
				int price = rs.getInt("PRICE");
				String data = String.format("%3d \t %25s \t %15s \t %5s \t %6d  \n", bookID, title, publisher, year,
						price);
				System.out.println(data);
			}
		} catch (SQLException e) {
			System.out.println("statement 오류");
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
			}
		}
	}

	private static void booksSelect2() {
		Connection con = ConnectDataBase.makeConnection();
		Statement stmt = null;
		ResultSet rs = null;

		System.out.println("\t이건 사람이 할 짓이 못되.....");
		System.out.println("\t집 가고 싶어요.....");
		// 3. select 문장 실행 (CURD 실행) -- con.createStatement 필요,중요
		// 인포트는 java.sql로 한다.
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("SELECT * FROM books");
			// 4. ResultSet 화면에 출력
			while (rs.next()) {
				int bookid = rs.getInt("BOOK_ID");
				String title = rs.getString("TITLE");
				String publisher = rs.getString("PUBLISHER");
				String year = rs.getString("YEAR");
				int price = rs.getInt("PRICE");
				String data = String.format("%3d\t%25s\t%15s\t%5s\t%6d ", bookid, title, publisher, year, price);
				System.out.println(data);
			} // while

		} catch (SQLException e) {
			System.out.println("실행 오류");
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}