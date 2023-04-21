package JANGYUJEONG.submit12_answer;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		CartoonBoard cb
			= new CartoonBoard("일빠","내용");
		
		System.out.println(cb);
		
		
		BoardDB boardDB = BoardDB.getInstance();
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("행동을 선택해주세요");
			System.out.println("1. 글 목록 | 2. 글 쓰기 | 3. 종료");
			System.out.println(">>>");
			
			int command = Integer.parseInt(scan.nextLine());
			
			if(command==1) {
				boardDB.showBoardList();
			}else if(command==2) {
				
				System.out.println("글 제목 입력");
				System.out.println(">>>");
				String title = scan.nextLine();
				
				System.out.println("글 내용 입력");
				System.out.println(">>>");				
				String content = scan.nextLine();
				boardDB.addBoard(new Board(title,content));
				
			}else {
				break;
			}
		}

	}

}
