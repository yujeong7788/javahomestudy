package JANGYUJEONG.submit10;

import java.util.ArrayList;
import java.util.List;

import ch09_class.homepage.Board;
import ch09_class.homepage.BoardDB;

public class Library {
	
	private static ArrayList<Book> bookList = new ArrayList<>(); // Book 객체를 담아주는 bookList
	
	private static Library instance = new Library(); 
	
	public static Library getInstance() {
		return instance;
	}
	
	
	public static ArrayList<Book> makeBookList() {

		// 쪼개서 Book 객체를 만들어라..
		String strBooks = "삼국지, 해리포터와 마법사의 돌, 해리포터와 비밀의 방 , 해리포터와 아즈카반의 죄수,해리포터와 불사조 기사단, 해리포터와 혼혈왕자, 해리포터와 죽음의 성물,어린왕자, 나의 라임 오렌지나무, "
				+ "이것이 자바다, 좋은생각, 반지의 제왕: 반지 원정대, 반지의 제왕: 두 개의 탑, 반지의 제왕: 왕의 귀환, 토익보카, 개미";
		
		String[] splitBook = strBooks.split(",");
		
		for(int i = 0; i < splitBook.length; i++) {
			addBookNo(new Book(splitBook[i]));
//			Book book = new Book(splitBook[i]);
			
			
		}
		
		return bookList;
	}
	
	// 책 번호 변경
	public static void addBookNo(Book book) {
		
		// board 객체 내부 no를 boardList.size() + 1 로 변경
		book.setBookNo(bookList.size() + 1);
		
		bookList.add(book);
		
	}

	// 책 선택(int number)하면 리턴 (True)로
	public static void rentBook(int rentNo) {
		for(int i = 0; i < bookList.size(); i++) {
			Book bo = bookList.get(i);
			if(bo.getBookNo() == rentNo) {
				System.out.println( bo.getBookTitle()+"을 대여하셨습니다.");
				bo.setRent(true);
			}		
		}
	}
	
	
	// 책 목록 보기
	public  void showBook() {
		for(int i = 0; i < bookList.size(); i++) {
			System.out.println(bookList.get(i));
		}
	}
	
	
	// 책 입고
	public static void reBook(int reNo) {
		for(int i = 0; i < bookList.size(); i++) {
			Book bo = bookList.get(i);
			if(bo.getBookNo() == reNo) {
				System.out.println( bo.getBookTitle()+"이(가) 입고되었습니다.");
				bo.setRent(false);
			}		
		}
	}
	
	
	// 책 찾기
	public void bookSearch(String keyword) {
		
		ArrayList<Book> result = new ArrayList<>();
		
		for (int i = 0; i < bookList.size(); i++) {
			if ( bookList.get(i).getBookTitle().contains(keyword)) {
				// result에 해당 데이터 담기
				result.add(bookList.get(i));
			}
		}
		
		for(int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
		
		
	}

 
	
}
