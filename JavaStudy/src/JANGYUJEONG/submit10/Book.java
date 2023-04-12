package JANGYUJEONG.submit10;

public class Book {
	private int bookNo = 0;
	private String bookTitle;
	private boolean rent = false;
	private String state = "입고중";
	
	public Book(int bookNo, String bookTitle, boolean rent) {
		super();
		this.bookNo = bookNo;
		this.bookTitle = bookTitle;

	}
	
	
	public Book(String bookTitle) {
		// no 하나씩 증가하게 코드 짜기.
		this.bookTitle = bookTitle;
	}
	

	@Override
	public String toString() {
		return "[책 번호: " + bookNo + ", 책 제목: " + bookTitle + ", 대여상태: " + setState(rent) + "]";
	}


	public int getBookNo() {
		return bookNo;
	}


	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}


	public String getBookTitle() {
		return bookTitle;
	}


	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}


	public boolean isRent() {
		return rent;
	}


	public void setRent(boolean rent) {
		this.rent = rent;
	}
	
	public String getState() {
		return state;
	}
	
	public String setState(boolean rent) {
		
		if(rent == true) {
			state = "대여중";
		}else {
			state = "입고중";
		}
		
		return state;
	}
	

}
