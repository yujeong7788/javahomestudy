package JANGYUJEONG.submit09;

import java.util.ArrayList;
import java.util.Scanner;

public class CoffeeMain_answer {

	public static void main(String[] args) {
//		ArrayList<Coffee_answer> starBucks = new ArrayList<>();
//		starBucks.add(new Coffee_answer("아메리카노",7000));
//		starBucks.add(new Coffee_answer("카푸치노",8000));
//		starBucks.add(new Coffee_answer("바닐라라떼",8500));
//		
//		ArrayList<Coffee_answer> conte = new ArrayList<>();
//		conte.add(new Coffee_answer("아메리카노",2000));
//		conte.add(new Coffee_answer("레몬차",5000));
//		conte.add(new Coffee_answer("말차라떼",6000));
//		
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//			System.out.println("행동을 선택해주세요.");
//			System.out.println("1. 스타벅스 방문 | 2. 꽁떼 방문 | 3. 사무실 복귀..");
//			System.out.print(">>> ");
//			int select = Integer.parseInt(sc.nextLine());
//			
//			if(select == 1) {
//				//TODO 스타벅스 방문
//				System.out.println("어서오세요 스타벅스입니다.");
//				System.out.println("메뉴판");
//				for(int i = 0; i < starBucks.size(); i++) {
//					System.out.println((i+1)+"."+starBucks.get(i));
//				}
//				System.out.print("메뉴를 선택해주세요 : ");
//				
//				int choice = Integer.parseInt(sc.nextLine());
//				
//				System.out.println(starBucks.get(choice - 1).getName()+"를"+ starBucks.get(choice - 1).getPrice()+"원에 구입했습니다." );
//				starBucks.get(choice - 1).getName();
//				starBucks.get(choice - 1).getPrice();
//				
//				
//			}else if(select == 2) {
//				//TODO 꽁떼 방문
//				System.out.println("어서오세요 꽁떼입니다.");
//				System.out.println("메뉴판");
//				for(int i = 0; i < conte.size(); i++) {
//					System.out.println((i+1)+"."+conte.get(i));
//				}
//				System.out.print("메뉴를 선택해주세요 : ");
//				
//				int choice = Integer.parseInt(sc.nextLine());
//				
//				System.out.println(conte.get(choice - 1).getName()+"를"+ conte.get(choice - 1).getPrice()+"원에 구입했습니다." );
//				conte.get(choice - 1).getName();
//				conte.get(choice - 1).getPrice();
//			}else {
//				//사무실 복귀
//				System.out.println("사무실로 복귀합니다..");
//				break;
//			}
//			
//		}
		
		Cafe_answer starBucks = new Cafe_answer("스타벅스");
		starBucks.addCoffee(new Cafe_answer("아메리카노", 5000));
		starBucks.addCoffee(new Cafe_answer("카푸치노", 6000));
		starBucks.addCoffee(new Cafe_answer("오곡라떼", 7000));
		
		Cafe_answer conte = new Cafe_answer("꽁떼");
		conte.addCoffee(new Cafe_answer("아메리카노", 2500));
		conte.addCoffee(new Cafe_answer("바닐라라떼", 3000));
		conte.addCoffee(new Cafe_answer("아이스티", 3500));
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("행동을 선택해주세요.");
			System.out.println("1. 스타벅스 방문 | 2. 꽁떼 방문 | 3. 사무실 복귀..");
			System.out.print(">>> ");
			int select = Integer.parseInt(sc.nextLine());
			
			if(select == 1) {
				//TODO 스타벅스 방문
				System.out.println("어서오세요 스타벅스 입니다.");
				starBucks.showMenu();
				starBucks.buyCoffee(sc);
				
			}else if(select == 2) {
				//TODO 꽁떼 방문
				System.out.println("어서오세요 스타벅스 입니다.");
				conte.showMenu();
				conte.buyCoffee(sc);
				
			}else {
				//사무실 복귀
				System.out.println("사무실로 복귀합니다..");
				break;
			}
		}

		
	}

}
