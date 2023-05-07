package JANGYUJEONG.submit14.Main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;


import JANGYUJEONG.submit13.service.MemService;
import JANGYUJEONG.submit13.vo.MemVO;
import JANGYUJEONG.submit14.Service.MenuService;
import JANGYUJEONG.submit14.Service.MyService;
import JANGYUJEONG.submit14.VO.MyVO;
import JANGYUJEONG.submit14.data.Menu;

public class RecipeMain {

	public static void main(String[] args) {
		MemService memService = MemService.getInstance();
		MenuService menuService = MenuService.getInstance();
		MyService myService = MyService.getInstance();
		
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
						System.out.println("행동을 선택해주세요");
						System.out.println("1. 레시피 조회 | 2. 레시피 검색 | 3. 즐겨찾기 | 4.레시피 추천 | 5. 로그아웃");
						System.out.println(">>>");
						
						int select = Integer.parseInt(scan.nextLine());
						
						
						
						if(select == 1) {
							
							//TODO 레시피 조회
							// 전체 레시피 출력
							ArrayList<Menu> menuAllList = menuService.getMenuList();
							for(int i = 0; i < menuAllList.size(); i++) {
								System.out.println("[" + menuAllList.get(i).getNo() + "] " + menuAllList.get(i).getName() + " | " + menuAllList.get(i).getAuthor() );
							}
							
							
							
							// 글 번호 입력 받아 출력
							System.out.println("\n조회할 레시피의 번호를 입력해주세요");
							System.out.println(">>> ");
							
							int no = Integer.parseInt(scan.nextLine());
							
							ArrayList<Menu> menuList = menuService.getNoMenuList(no);
							for(int i = 0; i < menuList.size(); i++) {
								System.out.println("메뉴: " + menuList.get(i).getName());
								System.out.println("종류: " + menuList.get(i).getType());
								System.out.println("==================================== 재료 =======================================");
								System.out.println(menuList.get(i).getParts());
								System.out.println("================================== 조리방법 =====================================");
								System.out.println(menuList.get(i).getManual());
								System.out.println();
							}
							
							
						}else if(select == 2) {
							//TODO 레시피 검색
							
							System.out.println("검색 키워드를 선택해주세요");
							System.out.println("1. 재료 | 2. 종류 ");
							System.out.println(">>> ");
							
							int selectSearch = Integer.parseInt(scan.nextLine());
							
							if(selectSearch == 1) {
								System.out.println("재료명을 입력해주세요");
								System.out.print(">>> ");
								String ingredient = scan.nextLine();
								
							}else if(selectSearch == 2){
								System.out.println("종류 번호를 선택해주세요");
								System.out.println("1. 국&찌개 | 2. 반찬 | 3. 일품 | 4. 밥 | 5. 후식 ");
								System.out.print(">>> ");
							}
							
						}else if(select == 3) {
							//TODO 즐겨찾기
							
							System.out.println("행동을 선택해주세요");
							System.out.println("1. 즐겨찾기 레시피 등록 | 2. 즐겨찾기 레시피 조회");
							System.out.println(">>>");
							
							int selectStar = Integer.parseInt(scan.nextLine());
							
							if(selectStar == 1) {
								// 전체 레시피 목록 보여줌
								ArrayList<Menu> menuAllList = menuService.getMenuList();
								for(int i = 0; i < menuAllList.size(); i++) {
									System.out.println("[" + menuAllList.get(i).getNo() + "] " + menuAllList.get(i).getName() + " | " + menuAllList.get(i).getAuthor() );
								}
								
								//TODO 즐겨찾기에 레시피 등록
								System.out.println("즐겨찾기에 등록할 레시피의 번호를 입력해주세요.");
								System.out.println(">>>");
								
								int registerNo = Integer.parseInt(scan.nextLine());
								
								String selectName = "";
								// no받아서 name만 가져오자
								ArrayList<Menu> selectNmae = menuService.getNoMenuList(registerNo);
								for(int i = 0; i < selectNmae.size(); i++) {
									selectName =  selectNmae.get(i).getName();
								}
								MyVO my = new MyVO(0,login.getMemId(),selectName);
								try {
									myService.registMy(my);
								} catch (SQLException e) {
									e.printStackTrace();
								}
								
								
							}
							
							
							
						}else if(select == 4) {
							//TODO 레시피 추천
							
							
							
						}
						else {
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

	}//

}
