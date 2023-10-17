package ch16.sec01;

import java.util.Objects;

public class Books {
	// 멤버변수
	private int bookId;
	private String title;
	private String publisher;
	private String year;
	private int price;

	// 생성자
	public Books(int bookId, String title, String publisher, String year, int price) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.publisher = publisher;
		this.year = year;
		this.price = price;
	}

	// 겟터,셋터
	public int getBookId() {
		return bookId;
	}

	public String getTitle() {
		return title;
	}

	public String getPublisher() {
		return publisher;
	}

	public String getYear() {
		return year;
	}

	public int getPrice() {
		return price;
	}

	// hashcode, equals
	@Override
	public int hashCode() {
		return Objects.hash(bookId);
	}

	@Override
	public boolean equals(Object obj) {
		Books books = null;
		if (!(obj instanceof Books)) {
			return false;
		}
		books = (Books) obj;
		return this.bookId == books.bookId;
	}

	@Override
	public String toString() {
		return String.format("%3d \t %25s \t %15s \t %5s \t %6d  \n", bookId, title, publisher, year, price);
	}

}
