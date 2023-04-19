package JANGYUJEONG.submit12;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import ch09_class.homepage.Board;

public class BoardMain {

	public static void main(String[] args) {
		
		//Board 클래스를 이용하여 게시글 작성 프로그램을 만들고(BoardMain 생성), 게시글을 3개 이상 작성해주세요.
		// (따로 BoardDB를 만드셔도 되고, 그냥 Main 메소드 안에 boardList를 만드셔서 쓰셔도 됩니다)
		
		ArrayList<BoardUnit> boardList = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("행동을 선택해주세요.");
			System.out.println("1. 글 목록 | 2. 글 쓰기 | 3. 종료");
			System.out.println(">>>");
			
			String select = scan.nextLine();
			int intSelect = Integer.parseInt(select);
			if(intSelect == 1) {
				// TODO 글 목록 출력
			}else if(intSelect == 2) {
				// TODO 글 작성
				
				System.out.println("글 제목을 입력해주세요: ");
				String title = scan.nextLine();
				System.out.println("글 내용을 입력해주세요: ");
				String contents = scan.nextLine();
				// 입력시 
				Date date = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
				String strDate = sdf.format(date);
				
				Board board = new Board(0, title, strDate , contents);
				
			}else {
				// TODO 종료
				System.out.println("종료합니다.");
				break;
			}
		}
		
	}

}
