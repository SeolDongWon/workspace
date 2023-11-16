package book;

public class Book {
	/*
	 * BOOK_ID	NUMBER
		TITLE	VARCHAR2(50 BYTE)
		AUTHOR	VARCHAR2(20 BYTE)
		PUBLISHER	VARCHAR2(20 BYTE)
		PUBLISHER_DATE	DATE
		PRICE	NUMBER
	 * */
	
	private int bookId;				// 도서 번호
	private String title;			// 도서명
	private String author;			// 작가명
	private String publisher;		// 출판사
	private String publisherDate;	// 출판일 - String형식으로 받아 입력예정
	private int price;				// 가격

	//생성자
	public Book() {}
	
	// 매개변수 생성자 - bookId는 BOOK_SEQ 이용하여 입력 예정
	public Book(String title, String author, String publisher, String publisherDate, int price) {
		super();
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.publisherDate = publisherDate;
		this.price = price;
	}

	// 매개변수 생성자 
	public Book(int bookId, String title, String author, String publisher, String publisherDate, int price) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.publisherDate = publisherDate;
		this.price = price;
	}

	// getter/setter
	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getPublisherDate() {
		return publisherDate;
	}

	public void setPublisherDate(String publisherDate) {
		this.publisherDate = publisherDate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// 북정보
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", publisher=" + publisher
				+ ", publisherDate=" + publisherDate + ", price=" + price + "]";
	}
}