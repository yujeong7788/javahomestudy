package ch09_class.homepage;

import java.util.ArrayList;

public class BoardDB {
	private ArrayList<Board> boardList = new ArrayList<>(); // Board 객체를 담아주는 ArrayList 생성
	
	// 싱글톤 적용
	// 프로젝트 내에서 이 클래스로부터 객체를 딱 하나만
	// 생성할 목적으로 사용
	
	private BoardDB() {
		boardList.add(new Board(1,"공지사항 필독!!","욕설 금지", "admin"));
	} // 어느곳에서도 이 클래스 객체를 소환할 수 없게 사용
	
	private static BoardDB instance = new BoardDB(); 
	
	
	public static BoardDB getInstance() {
		return instance;
	}
	
	// 게시글 목록 출력
	public void showBoardList() {
		for(int i = 0; i < boardList.size(); i++) {
			System.out.println(boardList.get(i));
		}
	}
	
	// 게시글 추가
	public void addBoard(Board board) {
		//board 객체 내부 no가 0이 들어있음
		
		// board 객체 내부 no를 boardList.size() + 1 로 변경
		board.setNo(boardList.size() + 1);
		
		boardList.add(board);
		
	}
	
	// 게시글 보기
	public void selectBoard(int no) {
		// boardList에 존재하는 board 객체 중에
		// 파라미터로 들어온 no와 같은 no를 가지는 board 객체 찾기
		
		for(int i = 0; i < boardList.size(); i++) {
			Board bo = boardList.get(i);
			if(bo.getNo() == no) {
				System.out.println("\n" + no);
				System.out.println("제목: " + bo.getTitle());
				System.out.println("작성자: " + bo.getAuthor());
				System.out.println("=====================");
				System.out.println(bo.getContent() + "\n");
				
				return; // 메소드 종료
			}
		}
		
		System.out.println("존재하지 않는 글번호입니다.");
		
	}

}
