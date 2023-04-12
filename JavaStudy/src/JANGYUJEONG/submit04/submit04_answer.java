package JANGYUJEONG.submit04;

import java.util.Scanner;

public class submit04_answer {
	
	public static void main(String[] args) {
		
//		//Q01. 로꾸꺼
//		System.out.println("거꾸로 뒤집을 문자열 입력: ");
//		String input = scan.nextLine();
//		
//		// 한글자씩 잘라보기
//		String result = "";
//		// 로꾸꺼 , length = 3
//		// substring(2,3) -> 꺼
//		// substring(1,2) -> 꾸
//		// substring(0,1) -> 로
//		for(int i = input.length(); i >= 1; i++) {
//			String str = input.substring(i-1, i);
//			System.out.println(str);
//			result += str; // result += str + result;
//		}
//		System.out.println("뒤집은 문자열: " + result);
		
		Scanner scan = new Scanner(System.in);
		String strResult = "";

		System.out.println("거꾸로 뒤집을 문자열 입력: ");
		String input = scan.nextLine();
		for(int i = input.length(); i > 0; i++) {
			String strst = input.substring(i-1,i);
			strResult += strst;
		}
		System.out.println("뒤집은 문자열: " + strResult);
		
		
		System.out.println("\n===============Q02==============\n");
		
		int elevatorA = 10; // 엘리베이터 A 위치 10층
		int elevatorB = 4; // 엘리베이터 B 위치 4층
		
		while(true) {
			System.out.println("\n============희영빌딩 엘리베이터==============\n");
			System.out.println("승강기 A의 현재 위치: " + elevatorA);
			System.out.println("승강기 B의 현재 위치: " + elevatorB);
			System.out.print("몇층에 계시나요?[종료는 q 또는 exit]: ");
			
			String inputText = scan.nextLine();
			
			if(inputText.equals("q")|| inputText.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			int floor = Integer.parseInt(inputText);
			
			
			// 층수 차이 계산
			int diffA = Math.abs(elevatorA - floor); // 10 - 9 = 1
			int diffB = Math.abs(elevatorB - floor); // 4 - 9 = -5 -> 5
			
			// 조건문으로 절댓값 만들어주기
//			if(diffB < 0) {
//				diffB *= -1;
//			}
			
			// 삼항연산자로 절댓값 만들어주기
			// int diffB = (elevatorB < floor) ? (floor - elevatorB) : (elevatorB - floor);
			
			// 층수 차이 계산
			if(diffA > diffB) {
				System.out.println("엘리베이터 B가" + floor + "층으로 이동하였습니다.");
				elevatorB = floor;
			}else if(diffA < diffB) {
				System.out.println("엘리베이터 A가" + floor + "층으로 이동하였습니다.");
				elevatorA = floor;
			}else {
				
				if(elevatorA > elevatorB) {
					System.out.println("엘리베이터 A가" + floor + "층으로 이동하였습니다.");
					elevatorA = floor;
				}else {
					System.out.println("엘리베이터 B가" + floor + "층으로 이동하였습니다.");
					elevatorB = floor;
				}
			}
		}
		
		
	}

}
