package JANGYUJEONG.submit10;

import java.util.ArrayList;
import java.util.Scanner;

import ch09_class.homepage.BoardDB;
import ch09_class.typing.Dictionary;

public class LibraryMain {

	public static void main(String[] args) {
		
		Library book = Library.getInstance();
		
		ArrayList<Book> bookList = Library.makeBookList();
//		bookList.add(Book);
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("행동을 선택해주세요.");
			System.out.println("1. 책 입고 | 2. 책 대여 | 3. 책 목록 | 4. 책 검색 | 5. 종료");
			System.out.println(">>> ");
			
			int select = Integer.parseInt(scan.nextLine());
			
			if(select == 1) {
				//TODO 책 입고
				System.out.println("책 번호를 입력해주세요.");
				System.out.println(">>> ");
				int reNo = Integer.parseInt(scan.nextLine());
				book.reBook(reNo);
			}else if(select == 2) {
				//TODO 책 대여
				System.out.println("책 번호를 입력해주세요.");
				System.out.println(">>> ");
				int rentNo = Integer.parseInt(scan.nextLine());
				Library.rentBook(rentNo);
			}else if(select == 3) {
				//TODO 책 목록
				book.showBook();
			}else if(select == 4) {
				//TODO 책검색
				System.out.print("책 이름을 입력해주세요: ");
				String keyword = scan.nextLine();
				book.bookSearch(keyword);
				
			}else {
				break;
			}
		}
	}

}
