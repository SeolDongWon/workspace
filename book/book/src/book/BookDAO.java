


package book;

import static book.common.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import book.model.vo.Book;

public class BookDAO {

	// 도서 목록 전체 조회
	public List<Book> bookSelectAll(Connection conn) {
		String query = "SELECT * FROM BOOK";
		Statement stmt = null;
		ResultSet rs = null;
		List<Book> bookList = new ArrayList<>(); // 책 전체정보 담기위한 컬렉션
		
		try {
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(query);
			while(rs.next()) {
				int bookId = rs.getInt("BOOK_ID");
				String title = rs.getString("TITLE");
				String author = rs.getString("AUTHOR");
				String publisher = rs.getString("PUBLISHER");
				String publisherDate = rs.getString("PUBLISHER_DATE");
				int price = rs.getInt("PRICE");
				
				Book book = new Book(bookId, title, author, publisher, publisherDate, price);
				
				bookList.add(book);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(stmt);
		}
		
		return bookList;
	}

	// 도서 추가
	public int bookInsert(Connection conn, Book b) {
		String query = "INSERT INTO BOOK "
				     + "VALUES(BOOK_SEQ.NEXTVAL, ?, ?, ?, TO_DATE(?, 'RRRR/MM/DD'), ?)";
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, b.getTitle());
			pstmt.setString(2, b.getAuthor());
			pstmt.setString(3, b.getPublisher());
			pstmt.setString(4, b.getPublisherDate());
			pstmt.setInt(5, b.getPrice());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	public int bookDelete(Connection conn, int bookId) {
		String query = "DELETE FROM BOOK "
				     + "WHERE BOOK_ID = ?";
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, bookId);
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		
		return result;
	}

	// 2. 도서 정보 수정
	public int bookUpdate(Connection conn, Book book) {
		String query = "UPDATE BOOK "
				     + "SET TITLE = ?, AUTHOR = ?, PUBLISHER = ?, PUBLISHER_DATE = TO_DATE(?, 'RRRR/MM/DD'), PRICE = ? "
				     + "WHERE BOOK_ID = ?";
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, book.getTitle());
			pstmt.setString(2, book.getAuthor());
			pstmt.setString(3, book.getPublisher());
			pstmt.setString(4, book.getPublisherDate());
			pstmt.setInt(5, book.getPrice());
			pstmt.setInt(6, book.getBookId());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	// 4. 도서 아이디로 조회
	public Book bookSelectId(Connection conn, int bookId) {
		String query = "SELECT * FROM BOOK "
				     + "WHERE BOOK_ID = ?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Book book = null;
	
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, bookId);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				book = new Book(rs.getInt("BOOK_ID"),
								rs.getString("TITLE"),
								rs.getString("AUTHOR"),
								rs.getString("PUBLISHER"),
								rs.getString("PUBLISHER_DATE"),
								rs.getInt("PRICE"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}
		
		return book;
	}

	// 5. 도서 제목으로 조회
	public List<Book> bookSelectTitle(Connection conn, String bookTitle) {
		String query = "SELECT * FROM BOOK "
				     + "WHERE TITLE LIKE ('%' || ? || '%')";
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Book> listBook = new ArrayList<>();
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, bookTitle);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Book b = new Book();
				b.setBookId(rs.getInt("BOOK_ID"));
				b.setTitle(rs.getString("TITLE"));
				b.setAuthor(rs.getString("AUTHOR"));
				b.setPublisher(rs.getString("PUBLISHER"));
				b.setPublisher(rs.getString("PUBLISHER_DATE"));
				b.setPrice(rs.getInt("PRICE"));
				
				listBook.add(b);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}
		
		return listBook;
	}

}