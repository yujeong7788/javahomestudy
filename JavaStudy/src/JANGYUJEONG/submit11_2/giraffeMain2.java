package JANGYUJEONG.submit11_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import ch09_class.quiz.Movie;
import ch09_class.quiz.MovieDB;

public class giraffeMain2 {

	public static void main(String[] args) {
		
		FoodDB foodDB = FoodDB.getInstance();
		
		ArrayList<Food> foodList = foodDB.getFoodList();
		
		giraffe gira = new giraffe();
		
		System.out.println("아기 기린을 분양 받았습니다.");
		System.out.println("2주 동안 잘 키워주세요 ^^\n");
		System.out.println("아기 기린의 이름을 지어주세요");
		System.out.println(">>>");
		
		Scanner scan = new Scanner(System.in);
		
		String name = scan.nextLine();
		
		
		gira.level1(name);
		
		for(int i = 1; i <= 14; i++) {
			System.out.println("=========================================================");
			System.out.println( i +"일차");
			System.out.println( name +"(이)에게 무엇을 해주시겠습니까?");
			System.out.println("1. 나뭇잎 주기 | 2. 예뻐해주기 | 3. 재우기 | 4. 놀아주기 | 5. 현재 상태");
			System.out.println(">>>");
			System.out.println("=========================================================\n");
			
			int select = Integer.parseInt(scan.nextLine());
			
			if(select == 1) {
				
				//TODO 밥주기
				gira.eat();
				System.out.println(name + "(이)가 " + gira.height + "cm로 성장했습니다.");
				gira.motion("냠냠 맛있다🌿");
				
				
			}else if(select == 2) {
				
				//TODO 예뻐해주기
				gira.height += 10;
				gira.love();
				System.out.println(name + "(이)가 " + gira.height + "cm로 성장했습니다.");
				gira.motion("행복해요 ♥♥♥ ");
				
			}else if(select == 3) {
				//TODO 재우기
				gira.height += 20;
				gira.zz();
				System.out.println(name + "(이)가 " + gira.height + "cm로 성장했습니다.");
				gira.motion("zzzZZZZ ");
				
				
			}else if(select == 4) {
				//TODO 놀아주기
				System.out.println("=========================================================");
				System.out.println(name +"(이)와 어떤 놀이를 하시겠습니까?");
				System.out.println("1. 가위바위보 | 2. 숫자맞추기 | 3. 음식퀴즈");
				System.out.println(">>>");
				System.out.println("=========================================================");
				
				int playNo = Integer.parseInt(scan.nextLine());
				
				if(playNo == 1) {
					//TODO 가위바위보
					System.out.println("가위~~ 바위~~ 보~~!");
					System.out.println("1. 가위 | 2. 바위 | 3. 보");
					System.out.println(">>>");
					
				}else if(playNo == 2) {
					//TODO 숫자맞추기(1 ~ 50사이 랜덤숫자를 맞추기)
					int rand = (int)(Math.random() * 50) + 1 ;
					System.out.println("=========================================================");
					System.out.println(name + ": 내가 생각한 숫자를 맞춰봐!");
					System.out.println("        1~50 사이의 정수이고");
					System.out.println("        내가 생각한 숫자보다 크면 DOWN");
					System.out.println("        내가 생각한 숫자보다 작으면 UP");
					System.out.println("        기회는 10번이야! 화이팅!");
					System.out.println("=========================================================");
					for(int k = 0; k <=10; k++) {
					System.out.println("내가 생각한 숫자는?");
					System.out.println(">>>");
					int answerNo = Integer.parseInt(scan.nextLine());
						if(i <= 9) {
							if(rand > answerNo) {
								System.out.println("UP !!");
							}else if(rand < answerNo) {
								System.out.println("DOWN !!");
							}else {
								gira.height += 30;
								gira.happy();
								gira.motion("정답!");
								break;
								}
						}else {
							if(rand == answerNo) {
								gira.height += 20;
								gira.happy();
								gira.motion("정답!");
								break;
							}else {
								gira.shortNeck();
								gira.shortNeck();
								gira.sad();
								gira.height -= 20;
								gira.motion("땡.. 내 마음을 이렇게 모르다니..");
								System.out.println("실망한 " + name + "이의 키가 줄어듭니다.");
							}
						}
					}
				}else {
					//TODO 음식퀴즈 
					Collections.shuffle(foodList);
					int score = 0;
					
					for(int t = 0; t < foodList.size(); t++) {
						System.out.print("재료: ");
						System.out.println(foodList.get(t).getIngredient());
						System.out.println(">>> ");
						String answer = scan.nextLine();
						
						if(answer.equals(foodList.get(t).getName())) {
							System.out.println("정답~");
							score += 3;
							continue; // 다음 포문으로 넘김, 다음 문제로 넘어감
						}
						
						System.out.println(foodList.get(t).getSize());
						System.out.println(">>> ");
						answer = scan.nextLine();
						
						if(answer.equals(foodList.get(t).getName())) {
							System.out.println("정답~");
							score += 2;
							continue; // 다음 포문으로 넘김, 다음 문제로 넘어감
						}
						
						System.out.println(foodList.get(t).getWord());
						System.out.println(">>> ");
						answer = scan.nextLine();
						
						if(answer.equals(foodList.get(t).getName())) {
							System.out.println("정답~");
							score += 1;
							continue; // 다음 포문으로 넘김, 다음 문제로 넘어감
						}
						
						System.out.println("땡! 다음 문제~");	
					}
					System.out.println("내 점수: "+ score);
					if(score >= 15) {
						gira.height += 30;
						gira.happy();
						gira.motion("와~~ 너무 잘 맞춘다!");
					}else if(score >= 10) {
						gira.height += 20;
						gira.sorry();
						gira.motion("조금 아깝다ㅠㅠ");
					}else {
						gira.height -= 20;
						System.out.println("실망한 " + name + "이의 키가 줄어듭니다.");
						gira.shortNeck();
						gira.shortNeck();
						gira.sad();
						gira.motion("실망이야..");
					}
					
				}
			}else {
				System.out.println("이름: " + name);
				System.out.println("키: " + gira.height + "cm");
				System.out.println(name + "(이)는 " + gira.state() + "상태입니다.");
			}
			
			if(i == 14) {
				
			System.out.println("2주일이 지났습니다");
				if(gira.height > 600) {
					//TODO 지붕 뚫고 기린
					System.out.println(" ＊    ＊   \n" + 
							"  \\ __ /                       \n" + 
							"(  ㅡ  ㅡ   )           🕊️\n" + 
							"|     |         🕊️\n" + 
							"|     |\n" + 
							"|     |       🕊️           🕊️         🕊️\n" + 
							"|     |\n" + 
							"|     |           🕊️\n" + 
							"|     |                       🕊️\n" + 
							"|     |                    \n" + 
							"---------------------------------------\n" + 
							"                                        \\\n" + 
							"                                         \\\n" + 
							"                                          \\\n" + 
							"ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ\n" + 
							"                                        |\n" + 
							"                                        |\n" + 
							"                                        |\n" + 
							"                                        |");
			System.out.println(name + "(이)는 지붕을 뚫는 기린이 되었습니다.");
//			System.out.println(엔딩 string 출력해주기..); 
				}else if(450 <= gira.height && gira.height <= 600) {
					System.out.println("");
					
					//TODO 아프리카 기린
					System.out.println(name + "(이)는 아프리카 초원의 야생 기린이 되었습니다.");
					System.out.println("                @@@@@@@@@@@@@@@@@\\  \\@@@@@|         |@@@@@@@@@@@@@@@@@@@@@\n" + 
							"                 @@@@@@@@@@@@@@@@@ \\ \\ @@@|         |@@@@@@@@@@@@@@@@@@@@@@@\n" + 
							" ＊    ＊        @@@@@@@@@@@@@@@@@@ \\ \\ @@|         |@@@@@@@@@@@@@@@@@@@@@@@@\n" + 
							"  \\ __ /           @@@@@@@@@@@@@@@@@ \\ \\ @|         |@@@@@@@@@@@@@@@@@@@@@@@@@@\n" + 
							"(  ●  ●   )       @@@@@@@@@@@@@@@@@@\\ \\ |         |@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" + 
							"|     |               @@@@@@@@@@@@@@@@@\\ \\          |@@@@@@@@@@@@@@@@@@@@@@@@@\n" + 
							"|     |                      @@@@@@@@@@@\\           |  / /@@@@@@@@@@@@@@@@@@@@\n" + 
							"|     |                          @@@@@@@@ |         | / / @@@@@@@@@@@@@@@@@@\n" + 
							"|     |                            @@@@@@ |         |/ /@@@@@@@@@@@@@@\n" + 
							"|     |                                   |         / /@@@@@@@@@@@\n" + 
							"|     |                                   |          /@@@@@@@\n" + 
							"|     |                                   |         |@@@@\n" + 
							"|     |                                   |         |@\n" + 
							"|   @  ----------------_                  |         |\n" + 
							"  @      @      @       |-------＊＊＊    |         |\n" + 
							"      @     @      @     |                |         |\n" + 
							" @   ___  _______@______|                 |         |\n" + 
							"|  |  |  |    |  |   | @|                 |         |\n" + 
							"|  |  |@ |    |@ |   |  |                 |         |\n" + 
							"| @|  |  |    |  |   |  |                 |         |\n" + 
							"|  |  | @|    | @|   | @|                 |         |\n" + 
							"");
				}else if(350 <= gira.height && gira.height < 450) {
					//TODO 목이 짧아 슬픈
					System.out.println(name + "(이)는 목이 짧아 기린이 아니라 말이 되었습니다.");
					System.out.println(" () __ ()                \n" + 
							"(  ㅠ   ㅠ )      \n" + 
							"|     |         \n" + 
							"|     |         \n" + 
							"|      ----------------_\n" + 
							"                        |-------＊＊＊\n" + 
							"                         |\n" + 
							"     ___  _______ ______|\n" + 
							"|  |  |  |    |  |   |  |\n" + 
							"|  |  |  |    |  |   |  |\n" + 
							"|  |  |  |    |  |   |  |\n" + 
							"|  |  |  |    |  |   |  |\n" + 
							"");
				}else {
					//TODO 가출
					System.out.println("                    \n" + 
							"   @@@@@@@@@@@     @@    \n" + 
							"   @@@@@@@@@@@     @@    \n" + 
							"   @@@             @@    \n" + 
							"   @@@$$$$$$$$  ###@@    \n" + 
							"   @@@@@@@@@@@  @@@@@    \n" + 
							"   @@@             @@    \n" + 
							"   @@@@@@@@@@@     @@    \n" + 
							"   @@@@@@@@@@@     @@    \n" + 
							"                      \n" + 
							"         @@@@@@@@@@;    \n" + 
							"        @@=!!!!!!=@@    \n" + 
							"        @@        @@    \n" + 
							"        @@@@@@@@@@@@    \n" + 
							"         @@@@@@@@@@    \n" + 
							"\n" + 
							"집을 나가버렸습니다...\n" + 
							"다음엔 잘 키워주세요..\n" + 
							"");
				}
			}
		}


	}



}
