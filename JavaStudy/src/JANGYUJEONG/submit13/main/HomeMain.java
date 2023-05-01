package JANGYUJEONG.submit13.main;

import java.util.ArrayList;
import java.util.Scanner;

import JANGYUJEONG.submit13.service.BoardService;
import JANGYUJEONG.submit13.service.MemService;
import JANGYUJEONG.submit13.vo.BoardVO;
import JANGYUJEONG.submit13.vo.MemVO;
import ch09_class.homepage.Board;
import ch09_class.homepage.Member;
import ch09_class.nextit.NextStudent;
import ch14_jdbc_jsp.service.StudentService;
import ch14_jdbc_jsp.vo.StudentVO;

public class HomeMain {

	public static void main(String[] args) {
		MemService memService = MemService.getInstance();
		BoardService boardService = BoardService.getInstance();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("행동을 선택해주세요.");
			System.out.println("1. 회원가입 | 2. 로그인 | 3. 종료 ");
			System.out.println(">>> ");
			
			int command = Integer.parseInt(scan.nextLine());
			
			if(command ==1) {
				//TODO 회원가입
				System.out.println("아이디를 입력해주세요.");
				System.out.println(">>> ");
				String id = scan.nextLine();
				
				System.out.println("비밀번호를 입력해주세요");
				System.out.println(">>> ");
				String pw = scan.nextLine();
				
				
				ArrayList<MemVO> memList = memService.getMemList();
				
				if(memList.size() == 0) {
					MemVO stu = new MemVO(id,pw,"");
					memService.registMem(stu);
				}else {
					for(int i = 0; i < memList.size(); i++) {
						String temp = memList.get(i).getMemId();
						if(temp.equals(id)) {
							System.out.println("중복된 아이디입니다.");
						}else {
							MemVO stu = new MemVO(id,pw,"");
							memService.registMem(stu);
						}
					}
				}
				
				
				
				
				

				
			}else if(command ==2) {
				System.out.println("아이디를 입력해주세요.");
				System.out.println(">>> ");
				String id = scan.nextLine();
				
				System.out.println("비밀번호를 입력해주세요");
				System.out.println(">>> ");
				String pw = scan.nextLine();
				
				//TODO 로그인
				MemVO member = new MemVO(id,pw,"");
				member.setMemId(id);
				member.setMemPassword(pw);
				
				MemVO login = memService.login(member);
				
				if(login.getMemId() != null) {
					//로그인 성공
					System.out.println("로그인 되었습니다");
					
					
					// 게시판
					// 게시판목록
					// 글쓰기 (글 제목, 글 내용, 작성자, 글 번호)
					// 글조회
					// 로그아웃
					while(true) {
						// 게시물 목록 출력
						
						ArrayList<BoardVO> boardList = boardService.getBoardList();
						
						for(int k = 0; k < boardList.size() -1 ; k++) {
							for(int i = 0; i < boardList.size() -1; i++) {
								if(boardList.get(i).getBoardNo() > boardList.get(i+1).getBoardNo()) {
									BoardVO t = boardList.get(i);
									boardList.set(i, boardList.get(i+1));
									boardList.set(i+1, t);
								}
							}
						}
						
						for(int i = 0; i < boardList.size(); i++) {
							System.out.println(boardList.get(i));
						}
						
						System.out.println("행동을 선택해주세요");
						System.out.println("1. 글쓰기 | 2. 글조회 | 3. 로그아웃");
						System.out.println(">>>");
						
						int select = Integer.parseInt(scan.nextLine());
						
						if(select == 1) {
							//TODO 글쓰기
							System.out.println("글 제목을 입력해주세요.");
							System.out.println(">>>");
							String title = scan.nextLine();
							
							System.out.println("글 내용을 입력해주세요");
							System.out.println(">>>");
							String content = scan.nextLine();
							
							BoardVO mem = new BoardVO(0,title,content,login.getMemId(),"");
							boardService.registBoard(mem);
							
							
							
							
						}else if(select == 2) {
							//TODO 글번호로 글조회
							System.out.println("글 번호를 입력해주세요");
							System.out.println(">>>");
							
							int no = Integer.parseInt(scan.nextLine());
							
							ArrayList<BoardVO> boardNoList = boardService.getNoBoardList(no);
							for(int i = 0; i < boardNoList.size(); i++) {
								System.out.println("=====================");
								System.out.println("제목: " + boardNoList.get(i).getBoardTitle()); 
								System.out.println("작성자: " + boardNoList.get(i).getBoardAuthor()); 
								System.out.println("작성일: " + boardNoList.get(i).getBoardDate()); 
								System.out.println("글내용: " + boardNoList.get(i).getBoardContent()); 
								System.out.println("=====================");
							}
							

							
							
							
						}else {
							// 로그아웃
							System.out.println("로그아웃하였습니다.");
							break;
						}
						
					}
					
					
				}else{
					System.out.println("회원 정보가 올바르지 않습니다.");
				}
				
				
				
				
				
			}else {
				//종료
				System.out.println("종료합니다.");
				break;
			}
		}

	}

}
