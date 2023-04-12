package JANGYUJEONG.submit11;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("환영합니다");
		
		while(true) {
			System.out.println("====================================");
			System.out.println("씨앗을 선택해주세요");
			System.out.println("1. (0) | 2. (@) | 3. (○) | 4. (●)");
			System.out.println(">>> ");
			System.out.println("====================================");
			
			int grow = 0; // 성장수치
			int seed = Integer.parseInt(scan.nextLine());
			//벌레🐛
			
			if(seed == 1) {
				//TODO 돌이었습니다.
				System.out.println("씨앗이 아니라 돌을 고르셨군요T_T");
				System.out.println("다시 선택해주세요");
				continue;
			}else if(seed == 2) {
				//TODO 꽃
				System.out.println("_________________\n" + 
						"\\-------------- /\n" + 
						" \\     (@)     /\n" + 
						"  \\___________/");

			}else if(seed == 4) {
				//TODO 벌레알
				System.out.println("삐약 삐약 삐약");
				System.out.println("⚪ = > 🐣");
				System.out.println("병아리가 태어났어요");
				System.out.println("다시 선택해주세요");
			}else {
				//TODO 나무
				
			}
		}

	}

}
