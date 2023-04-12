package study;

import java.util.Scanner;

public class elevetor02 {

	public static void main(String[] args) {
		
		Scanner scan0 = new Scanner(System.in);
		boolean first = true;
		boolean second = true;
		int A = 10;
		int B = 4;
		
	
		outer : while(true) {
			
			System.out.println("\n=========희영빌딩 엘리베이터===========\n");
			System.out.println("A 승강기의 현재 위치 :" + A + "층");
			System.out.println("B 승강기의 현재 위치 :" + B + "층");
			System.out.println("몇층에 계시나요? [종료하시려면 q 또는 exit 입력]: ");
			String my = scan0.nextLine();
			
			if(my.equals("q")||my.equals("exit")) {
				System.out.println("프로그램이 종료되었습니다.");
				break outer;
			}
			
			while(first){
				int MY = Integer.parseInt(my);
				System.out.println(my + "층에서 엘리베이터를 호출합니다.");
				int result1 = Math.abs(MY - A);
				int result2 = Math.abs(MY - B);
				
				if(result1 > result2) {
					System.out.println("승강기 B가 " + MY + "층으로이동하였습니다.");
					B = MY;
					break;
				}else if(result2 > result1) {
					System.out.println("승강기 A가 " + MY + "층으로이동하였습니다.");
					A = MY;
					break;
				}else if(result1 == result2) {
					System.out.println("승강기 A가 " + MY + "층으로이동하였습니다.");
					A = MY;
				}
			}
			
		}

	}

}
