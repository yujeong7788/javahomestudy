package JANGYUJEONG.submit10_answer;

import java.util.Scanner;

import JANGYUJEONG.submit10.Library;

public class LibraryMain {

	public static void main(String[] args) {
		Library library = Library.getInstance();
		
		library.showBookList();
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("행동을 선택해주세요");
			System.out.println("1. 책 입고|2.책 대여|3.책목록|4.책검색|5.종료");
			System.out.println(">>> ");
			
			int command = Integer.parseInt(scan.nextLine());
			
			if(command == 1) {
				//TODO 책 입고
				System.out.println("책 번호를 입력해주세요.");
				System.out.println(">>> ");
				int reNo = Integer.parseInt(scan.nextLine());
				library.returnBook(reNo);
			}else if(command == 2) {
				//TODO 책 대여
				System.out.println("책 번호를 입력해주세요.");
				System.out.println(">>> ");
				int no = Integer.parseInt(scan.nextLine());
				
				// library 내에 bookList가 가진 book 객체 중에
				// no와 같은 책 번호를 가진 객체를 찾아서
				// 그ㅡ 객체의 isBorrow를 true 로
				
				//알파
				// name 을 포함하는 book 객체들을 찾아서
				// 가져오기
				// 책 검색 + 검색된 책 목록 리턴
				public ArrayList<Book> = searchList(string(keyword)){
					ArrayList<Book> result = new ArrayList<>();
					for(int i = 0; i < searchList.size(); i++) {
						if(searchList.get(i).setBorrow(true)) {
							
						}
					}
				}
				

			}else if(command == 3) {
				//TODO 책 목록
				book.showBook();
			}else if(command == 4) {
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
