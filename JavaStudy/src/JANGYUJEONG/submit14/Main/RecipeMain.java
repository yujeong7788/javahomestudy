package JANGYUJEONG.submit14.Main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;


import JANGYUJEONG.submit13.service.MemService;
import JANGYUJEONG.submit13.vo.MemVO;
import JANGYUJEONG.submit14.Service.MenuService;
import JANGYUJEONG.submit14.Service.MyService;
import JANGYUJEONG.submit14.VO.JoinVO;
import JANGYUJEONG.submit14.VO.MyVO;
import JANGYUJEONG.submit14.data.Menu;

public class RecipeMain {

	public static void main(String[] args) {
		MemService memService = MemService.getInstance();
		MenuService menuService = MenuService.getInstance();
		MyService myService = MyService.getInstance();
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("===============================================================");
			System.out.println(" ____  ____  ____  _  __   ____  ____  ____  _  __\n" + 
					"/   _\\/  _ \\/  _ \\/ |/ /  /   _\\/  _ \\/  _ \\/ |/ /\n" + 
					"|  /  | / \\|| / \\||   /   |  /  | / \\|| / \\||   / \n" + 
					"|  \\__| \\_/|| \\_/||   \\   |  \\__| \\_/|| \\_/||   \\ \n" + 
					"\\____/\\____/\\____/\\_|\\_\\  \\____/\\____/\\____/\\_|\\_\\");
			System.out.println("");
			System.out.println( "              쿡쿡에 오신걸 환영합니다^^*\n");
			System.out.println("===============================================================");
			System.out.println("1. 회원가입 | 2. 로그인 | 3. 종료 ");
			System.out.println(">>> ");
			
			try {
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
						System.out.println("\n행동을 선택해주세요");
						System.out.println("1. 레시피 조회 | 2. 레시피 추천 | 3. 즐겨찾기 | 4. 레시피 작성 | 5. 로그아웃");
						System.out.println(">>>");
						
						try {
							int select = Integer.parseInt(scan.nextLine());
							
							if(select == 1) {
								
								//TODO 레시피 조회
								// 전체 레시피 출력
								ArrayList<Menu> menuAllList = menuService.getMenuList();
								for(int i = 0; i < menuAllList.size(); i++) {
									System.out.println("[" + menuAllList.get(i).getNo() + "] " + menuAllList.get(i).getName() + " | " + menuAllList.get(i).getAuthor() );
								}
								
								
								System.out.println("\n행동을 선택해주세요");
								System.out.println("1. 글 번호로 조회 | 2. 검색 ");
								System.out.println(">>>");
								
								try {
									int no1 = Integer.parseInt(scan.nextLine());
									if(no1 == 1) {
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
									}else if(no1 == 2){
										
										//TODO 레시피 검색
										
										System.out.println("검색 키워드를 선택해주세요");
										System.out.println("1. 재료 | 2. 종류 ");
										System.out.println(">>> ");
										
										
										try {
											int selectSearch = Integer.parseInt(scan.nextLine());
											
											if(selectSearch == 1) {
												System.out.println("재료명을 입력해주세요");
												System.out.print(">>> ");
												String ingredient = scan.nextLine();
												boolean exist = false;
												
												ArrayList<Menu> ingredientList = new ArrayList<>();
												for(int i = 0; i < menuAllList.size(); i++) {
													if (menuAllList.get(i).getParts().contains(ingredient)) {
														ingredientList.add(menuAllList.get(i));
														exist = true;
													}
												}
												
												for(int j = 0; j < ingredientList.size(); j++) {									
													System.out.println("\n[" + ingredientList.get(j).getNo() + "] " + ingredientList.get(j).getName() + " | " + ingredientList.get(j).getAuthor()
															+ "\n{ 재료: " + ingredientList.get(j).getParts()+" }\n");
												}	
												
												
												
												if(exist == false) {
													System.out.println("입력하신 재료를 포함한 레시피가 없습니다.");
												}
												
											}else if(selectSearch == 2){
												System.out.println("종류를 입력해주세요");
												System.out.println("국&찌개 | 반찬 | 일품 |  밥 | 후식 ");
												System.out.print(">>> ");
												
												String type = scan.nextLine();
												
												ArrayList<Menu> typeList = new ArrayList<>();
												for(int i = 0; i < menuAllList.size(); i++) {
													if (menuAllList.get(i).getType().contains(type)) {
														typeList.add(menuAllList.get(i));
													}
													
												}
												
												for(int j = 0; j < typeList.size(); j++) {									
													System.out.println("[" + typeList.get(j).getNo() + "] " + typeList.get(j).getName() + " | " + typeList.get(j).getAuthor()
															);
												}
											}else {
												System.err.println("1 2 중에 선택해주세요");
											}
											
										} catch (NumberFormatException e) {
											System.err.println("숫자만 입력해주세요");
										}
										
									}else {
										System.err.println("1 2 중에 선택해주세요");
									}
									
								} catch (NumberFormatException e) {
									System.err.println("숫자만 입력해주세요");
								}
								
							}else if(select == 2) {
								//TODO 레시피 추천
								
								System.out.println("오늘의 기분을 알려주세요");
								System.out.println(">>>");
								
								String mood = scan.nextLine();
								
								ArrayList<Menu> menuAllList = menuService.getMenuList();
								int random = (int)(Math.random() * menuAllList.size());
								
								System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⠛⠛⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" + 
										"⣿⣿⣿⣿⣿⣿⣿⡿⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠈⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" + 
										"⣿⣿⣿⣿⣿⣿⣿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" + 
										"⣿⣿⣿⣿⣿⣿⣿⣷⡄⠀⠘⣧⠀⢸⠀⢠⡟⠀⠀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" + 
										"⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠘⠂⠘⠀⠚⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" + 
										"⣿⣿⣿⣿⣿⣿⣿⣿⣧⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" + 
										"⣿⣿⣿⣿⣿⣿⣿⢿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" + 
										"⣿⣿⣿⣿⣿⣿⣷⣼⡇⠀⠸⠇⠀⠀⠀⠀⠿⠀⠀⢸⣷⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" + 
										"⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⢠⣀⣠⠀⠀⠀⠀⣾⣿⣿⡏⢉⠉⣉⠉⣉⠉⣿⣿⣿\n" + 
										"⣿⣿⣿⣿⣿⣿⣿⣿⣧⣤⡀⠀⠀⠈⠁⠀⠀⢀⣾⣿⣿⣿⡇⢸⠀⣿⠀⣿⠀⣿⣿⣿\n" + 
										"⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡶⢦⣤⣤⠴⢾⣿⣿⣿⣿⣿⡇⠘⠀⠙⠀⠛⢀⣿⣿⣿\n" + 
										"⣿⣿⣿⣿⣿⣿⣿⡿⠿⠛⢿⣄⠀⠀⣀⣤⠾⠛⠛⠿⢿⣿⣿⣿⡇⠀⢰⣿⣿⣿⣿⣿\n" + 
										"⣿⣿⣿⡿⠋⠉⠀⠀⠀⠀⠀⣨⠿⠛⠉⠀⠀⠀⠀⠀⠀⠀⠉⠛⡇⠀⢸⣿⣿⣿⣿⣿\n" + 
										"⣿⣿⣿⠁⠀⠀⠀⠀⠀⠀⢸⡇⠀⣤⠀⠀⡄⠀⠀⠀⠀⠀⢠⡟⠛⠛⠛⢿⣿⣿⣿⣿\n" + 
										"⣿⣿⣿⠀⠀⠀⠀⣶⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⢸⣿⣿⣿⣿\n" + 
										"⣿⣿⣿⠀⠀⠀⠀⡿⠀⠀⢸⡇⠀⠉⠀⠀⠁⠀⠀⠀⠀⠀⠸⣧⣤⣤⣤⣾⣿⣿⣿⣿");
								System.out.println("\n\"기분이 " + mood + "(할) 때 " + menuAllList.get(random).getName()  + "는 어떠신가요?\"\n");
								System.out.println("");
							}else if(select == 3) {
								//TODO 즐겨찾기
								
								System.out.println("\n행동을 선택해주세요");
								System.out.println("1. 즐겨찾기 레시피 등록 | 2. 즐겨찾기 레시피 조회 | 3. 즐겨찾기 레시피 삭제");
								System.out.println(">>>");
								
								try {
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
										
										
									}else if(selectStar == 2) {
										//TODO 즐겨찾기에 담긴 레시피 조회하기
										
										ArrayList<JoinVO> JoinList = myService.starMenuList(login.getMemId());
										for(int i = 0; i < JoinList.size(); i++) {
											System.out.println("[" + JoinList.get(i).getRcNo() + "] " + JoinList.get(i).getRcName() + " | " + JoinList.get(i).getRcAuthor() );
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
									}if(selectStar == 3) {
										//TODO 즐겨찾기 삭제(진행중)
										
										//즐찾 목록 보여줌
										ArrayList<JoinVO> JoinList = myService.starMenuList(login.getMemId());
										for(int i = 0; i < JoinList.size(); i++) {
											System.out.println("[" + JoinList.get(i).getRcNo() + "] " + JoinList.get(i).getRcName() + " | " + JoinList.get(i).getRcAuthor() );
										}
										
										System.out.println("삭제할 레시피의 번호를 입력해주세요");
										System.out.println(">>> ");
										
										int deleteNo = Integer.parseInt(scan.nextLine());
										
										String deleteName = "";
										// no받아서 name만 가져오자
										ArrayList<Menu> deleteNameList = menuService.getNoMenuList(deleteNo);
										for(int i = 0; i < deleteNameList.size(); i++) {
											deleteName =  deleteNameList.get(i).getName();
										}
										
										
										MyVO delete = new MyVO(0,login.getMemId(),deleteName);
										myService.deleteMy(delete);
										
										
										//한번 더 보여줌 삭제 확인위해
										for(int i = 0; i < JoinList.size(); i++) {
											System.out.println("[" + JoinList.get(i).getRcNo() + "] " + JoinList.get(i).getRcName() + " | " + JoinList.get(i).getRcAuthor() );
										}
									}
									else {
										System.err.println("1 2 3 중에 선택해주세요");
									}
									
								} catch (NumberFormatException e) {
									System.err.println("숫자만 입력해주세요");
								}
								
								
							}else if(select == 4) {
								//TODO 레시피 작성
								System.out.println("메뉴명을 작성해주세요");
								System.out.println(">>> ");
								
								String rc_name = scan.nextLine();
								
								System.out.println("종류를 작성해주세요(국&찌개 | 반찬 | 일품 | 밥 | 후식)");
								System.out.println(">>> ");
								
								String rc_type = scan.nextLine();
								
								System.out.println("재료를 작성해주세요");
								System.out.println(">>> ");
								
								String rc_ing = scan.nextLine();
								
								System.out.println("내용을 작성해주세요");
								System.out.println(">>> ");
								
								String rc_menual = scan.nextLine();
								
								Menu insert = new Menu(0,rc_name,rc_type,rc_ing,rc_menual,login.getMemId());
								menuService.registRec(insert);
								
								
								
							}else if(select == 5) {
								// 로그아웃
								System.out.println("로그아웃하였습니다.");
								break;
							}else {
								System.out.println("1 2 3 4 5 중에 선택해주세요");
							}
							
							
						} catch (NumberFormatException e) {
							System.err.println("숫자만 입력해주세요");
						}		
					}
					
					
				}else{
					System.out.println("회원 정보가 올바르지 않습니다.");
				}
				
				
				
				
				
			}else if(command == 3){
				//종료
				System.out.println("종료합니다.");
				break;
			}else {
				System.err.println("1 2 3 중에 선택해주세요");
			}
			
			} catch (NumberFormatException e) {
				System.err.println("숫자만 입력해주세요");
			}
			
			
		}

	}//

}
