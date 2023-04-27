package JANGYUJEONG.submit13.main;

import java.util.ArrayList;
import java.util.Scanner;

import JANGYUJEONG.submit13.service.BoardService;
import JANGYUJEONG.submit13.service.MemService;
import JANGYUJEONG.submit13.vo.BoardVO;
import JANGYUJEONG.submit13.vo.MemVO;
import ch09_class.homepage.Board;
import ch09_class.homepage.Member;
import ch14_jdbc_jsp.service.StudentService;
import ch14_jdbc_jsp.vo.StudentVO;

public class HomeMain {

	public static void main(String[] args) {
		MemService memService = MemService.getInstance();
		BoardService boardService = BoardService.getInstance();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("행동을 선택해주세요.");
			System.out.println("1. 회원가입 | 2. 로그인 | 3. 회원목록 | 4. 종료");
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
				
				System.out.println("이름을 입력해주세요");
				System.out.println(">>> ");
				String name = scan.nextLine();
				
				MemVO stu = new MemVO(id,pw,name);
				memService.registMem(stu);

				
				
				
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
					System.out.println("로그인 성공!");
					System.out.println(login.getMemName() + "님환영합니다.");
					
					// 게시판
					// 게시판목록
					// 글쓰기 (글 제목, 글 내용, 작성자, 글 번호)
					// 글조회
					// 로그아웃
					while(true) {
						// 게시물 목록 출력
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
							
							BoardVO mem = new BoardVO(0,title,content,login.getMemName(),"");
							boardService.registBoard(mem);
							
							
							
							
						}else if(select == 2) {
							//TODO 글조회
							System.out.println("글 번호를 입력해주세요");
							System.out.println(">>>");
							
							int no = Integer.parseInt(scan.nextLine());
							
							ArrayList<BoardVO> boardList = boardService.getBoardList(no);
							for(int i = 0; i < boardList.size(); i++) {
								System.out.println(boardList.get(i));
							}
							

							
							
							
						}else {
							// 로그아웃
							break;
						}
						
					}
					
					
				}else{
					System.out.println("아이디 혹은 비밀번호가 틀립니다.");
				}
				
				
				
				
				
			}else if(command ==3) {
				// 회원목록 조회
				ArrayList<MemVO> memList = memService.getMemList();
				for(int i = 0; i < memList.size(); i++) {
					System.out.println(memList.get(i));
				}

			}else {
				//종료
				System.out.println("종료");
				break;
			}
		}

	}

}
