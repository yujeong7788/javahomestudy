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
		System.out.println("이름을 지어주세요");
		System.out.println(">>>");
		
		Scanner scan = new Scanner(System.in);
		
		String name = scan.nextLine();
		
		
		gira.level1(name);
		
		while(true) {
			System.out.println("=========================================================");
			System.out.println( name +"(이)에게 무엇을 해주시겠습니까?");
			System.out.println("1. 나뭇잎 주기 | 2. 예뻐해주기 | 3. 재우기 | 4. 놀아주기 | 5. 현재 상태");
			System.out.println(">>>");
			System.out.println("=========================================================");
			
			int select = Integer.parseInt(scan.nextLine());
			
			if(select == 1) {
				
				//TODO 밥주기
				gira.eat();
				System.out.println(name + "(이)가 " + gira.height + "cm로 성장했습니다.");
				gira.motion("냠냠 맛있다🌿");
				
				
			}else if(select == 2) {
				
				//TODO 예뻐해주기
				gira.love();
				System.out.println(name + "(이)가 " + gira.height + "cm로 성장했습니다.");
				gira.motion("행복해요 ♥♥♥ ");
				
			}else if(select == 3) {
				//TODO 재우기
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
					//TODO 숫자맞추기
					
				}else {
					//TODO 음식퀴즈
					Collections.shuffle(foodList);
					int score = 0;
					
					for(int i = 0; i < foodList.size(); i++) {
						System.out.println(foodList.get(i).getIngredient());
						System.out.println(">>> ");
						String answer = scan.nextLine();
						
						if(answer.equals(foodList.get(i).getName())) {
							System.out.println("정답~");
							score += 3;
							continue; // 다음 포문으로 넘김, 다음 문제로 넘어감
						}
						
						System.out.println(foodList.get(i).getSize());
						System.out.println(">>> ");
						answer = scan.nextLine();
						
						if(answer.equals(foodList.get(i).getName())) {
							System.out.println("정답~");
							score += 2;
							continue; // 다음 포문으로 넘김, 다음 문제로 넘어감
						}
						
						System.out.println(foodList.get(i).getWord());
						System.out.println(">>> ");
						answer = scan.nextLine();
						
						if(answer.equals(foodList.get(i).getName())) {
							System.out.println("정답~");
							score += 1;
							continue; // 다음 포문으로 넘김, 다음 문제로 넘어감
						}
						
						System.out.println("땡! 다음 문제~");	
					}
					System.out.println("내 점수: "+ score);
					if(score >= 15) {
						gira.height += 10;
						System.out.println(name + ": 와~~ 너무 잘 맞춘다!");
					}else if(score >= 10) {
						System.out.println(name + ": 조금 아깝다ㅠㅠ");
					}else {
						gira.height -= 10;
						System.out.println(name + ": 재미없어ㅠㅠ");
						System.out.println("실망한 " + name + "이의 키가 -10cm 줄어듭니다.");
					}
					
				}
			}else {
				System.out.println("이름: " + name);
				System.out.println("키: " + gira.height + "cm");
				System.out.println(name + "(이)는 " + gira.state() + "상태입니다.");
			}
			
		}

	}



}
