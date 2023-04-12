package JANGYUJEONG.submit11_2;

import java.util.Scanner;

public class giraffeMain {

	public static void main(String[] args) {
		
		System.out.println("아기 기린을 분양 받았습니다.");
		System.out.println("이름을 지어주세요");
		System.out.println(">>>");
		
		Scanner scan = new Scanner(System.in);
		
		String name = scan.nextLine();
		
		int gaze = 0; // 성장 게이지
		
//		System.out.println(" ＊    ＊\n" + 
//				"  \\ __ /\n" + 
//				"(  ●  ●   )   \n" + 
//				"|     |          \""+ name + "\"\n" + 
//				"------------------------\n" + 
//				"| | | | | | | | | | | |\n" + 
//				"| | | | | | | | | | | |");
//		
		grow(name);
		
		while(true) {
			System.out.println("=========================================================");
			System.out.println( name +"(이)에게 무엇을 해주시겠습니까?");
			System.out.println("1. 나뭇잎 주기 | 2. 예뻐해주기 | 3. 재우기 | 4. (●)");
			System.out.println(">>>");
			System.out.println("=========================================================");
			
			int select = Integer.parseInt(scan.nextLine());
			
			if(select == 1) {
				
				//TODO 밥주기
//				System.out.println(" ＊    ＊\n" + 
//						"  \\ __ /\n" + 
//						"(  ●  ●   )   냠냠 맛있어요\n" + 
//						"|     |     🌿\n" + 
//						"|     |\n" + 
//						"|     |\n" + 
//						"|     |\n" + 
//						"|     |         성장게이지\n" + 
//						"|     |           \""+name+"\"\n" + 
//						"------------------------\n" + 
//						"| | | | | | | | | | | |\n" + 
//						"| | | | | | | | | | | |\n" + 
//						"");
				int rand = (int)(Math.random() * 10) + 1;
				gaze += rand;
				System.out.println(name + "이(가) " + gaze + "만큼 성장했습니다.");
				grow(name,gaze,"냠냠 맛있어요 🌿");
				
			}else if(select == 2) {
				
				//TODO 예뻐해주기
				int rand = (int)(Math.random() * 10) + 1;
				gaze += rand;
				System.out.println(name + "이(가) " + gaze + "만큼 성장했습니다.");
				grow(name,gaze,"행복해요 ♥♥♥ ");
				
			}else if(select == 3) {
				//TODO 재우기
				
			}else {
				//TODO ????
			}
			
		}

	} // main 끝..
	
	
	// 아기 기린 분양
	public static void grow(String name) {
			
			String giraffe = " ＊    ＊\n" + 
					"  \\ __ /\n" + 
					"(  ●  ●   )   \n" + 
					"|     |          \""+ name + "\"\n" + 
					"------------------------\n" + 
					"| | | | | | | | | | | |\n" + 
					"| | | | | | | | | | | |";
			
			String giraffe2 = " ＊    ＊    \n" + 
					"  \\ __ /                \n" + 
					"(  ●  ●   )      \n" + 
					"|     |         \n" + 
					"|     |          \""+ name +"\"\n" + 
					"|   @  ----------------_\n" + 
					"  @      @      @       |-------＊＊＊\n" + 
					"      @     @      @     |\n" + 
					" @   ___  _______@______|\n" + 
					"|  |  |  |    |  |   | @|\n" + 
					"|  |  |@ |    |@ |   |  |\n" + 
					"| @|  |  |    |  |   |  |\n" + 
					"|  |  | @|    | @|   | @|\n" + 
					"";
			
			System.out.println(giraffe2);
			
	}
	
	
	// 목길어지는 메소드
	public static String grow(String name,int gaze , String word) {
		
		String giraffe = " ＊    ＊\n" + 
				"  \\ __ /\n" + 
				"(  ●  ●   )   \n" +  word +
				"|     |          \""+ name + "\"\n" + 
				"------------------------\n" + 
				"| | | | | | | | | | | |\n" + 
				"| | | | | | | | | | | |";
		
		String giraffeHead = " ＊    ＊\n" + 
				"  \\ __ /\n" + 
				"(  ●  ●   )  "  +  word + "\n|     |";
		
		String giraffeNeck = "\n|     |"; // 하나씩 추가해야함
		for(int i = 0; i < gaze ; i++) {
			if(gaze < 30) {
				
			}else if(gaze % 30 == 0) {
				giraffeNeck += "\n|     |";
			}
		}
		
		
		String giraffHome = "\n|   @  ----------------_\n" + 
				"  @      @      @       |-------＊＊＊\n" + 
				"      @     @      @     |\n" + 
				" @   ___  _______@______|\n" + 
				"|  |  |  |    |  |   | @|\n" + 
				"|  |  |@ |    |@ |   |  |\n" + 
				"| @|  |  |    |  |   |  |\n" + 
				"|  |  | @|    | @|   | @|";
		
		String result = giraffeHead + giraffeNeck + giraffHome;
		System.out.println(result);
		
		return result;
		
	}

}
