package book;

// JDBCTemplate 클래스의 static 메소드 사용하기위해 static import 사용
import static book.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.List;

import book.model.dao.BookDAO;
import book.model.vo.Book;

public class BookService {
	private BookDAO bd = new BookDAO(); 

	public List<Book> bookSelectAll() {
		Connection conn = getConnection();
				
		List<Book> bookSelectAll = bd.bookSelectAll(conn); 
		
		close(conn);
		
		return bookSelectAll;
	}

	// 1. 도서 추가
	public int bookInsert(Book bookAdd) {
		Connection conn = getConnection();
		
		int result = bd.bookInsert(conn, bookAdd);
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		close(conn);
		
		return result;
	}
	
	// 3. 도서 정보 삭제
	public int bookDelete(int bookId) {
		Connection conn = getConnection();
		
		int result = bd.bookDelete(conn, bookId);
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		close(conn);
		
		
		return result;
	}

	// 2. 도서 정보 수정
	public int bookUpdate(Book book) {
		Connection conn = getConnection();
		
		int result = bd.bookUpdate(conn, book);
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		close(conn);
		
		return result;
	}
	// 4. 도서 아이디로 조회
	public Book bookSelectId(int bookId) {
		Connection conn = getConnection();
		
		Book book = bd.bookSelectId(conn, bookId);
		
		close(conn);
		
		return book;
	}
	
	// 5. 도서 제목으로 조회
	public List<Book> bookSelectTitle(String bookTitle) {
		Connection conn = getConnection();
		
		List<Book> bookList = bd.bookSelectTitle(conn, bookTitle);
		
		close(conn);
		
		return bookList;
	}

}