package ch16.sec01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStatementTest {
	public static void main(String[] args) {
		Connection con = ConnectDataBase.makeConnection();
//		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			// 3. curd 실행
//			String query = "select * from books where books book_id = ?";
			int id = 9;
//			String _query = String.format("select * from books where books book_id = %d", id);
//			stmt = con.createStatement(); // umpor.java.sql할것
//			rs = stmt.executeQuery(_query);

			String sql = "select * from BOOKS where BOOK_ID = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();

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
				pstmt.close();
				con.close();
			} catch (SQLException e) {
			}
		}
	}

}
