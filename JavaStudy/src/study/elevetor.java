package study;

import java.util.Scanner;

public class elevetor {
	public static void main(String[] args) {
		// Q02.
		//엘리베이터가 두 대 있는 빌딩에서 엘리베이터 버튼을 눌렀을 때,
		//한 대의 엘리베이터만 이동하는 프로그램을 구현해 봅시다.              
		//1. 사용자가 현재 위치를 입력하면 사용자의 위치와 가까운 엘리베이터가 이동한다.
		//2. 사용자의 위치와 두 엘리베이터의 위치 차이가 동일하다면 위 층 엘리베이터가 내려온다.
		//ex) 엘리베이터 A는 1층, B는 7층일때 사용자의 위치가 4층이면 엘리베이터 B가 내려온다. 
		//3. 사용자의 위치로 엘리베이터의 위치를 바꿔준다.
		//4. 엘리베이터 프로그램을 종료하려면 q, exit 중 하나를 입력한다.
				
			
			Scanner scan0 = new Scanner(System.in);
			boolean first = true;
			boolean second = true;
			
			outer : while(true) {
				
				int A = (int)(Math.random() * (7-1+1)) + 1;
				int B = (int)(Math.random() * (7-1+1)) + 1;
				System.out.println("\n=========희영빌딩 엘리베이터===========\n");
				System.out.println("A 승강기의 현재 위치 :" + A + "층");
				System.out.println("B 승강기의 현재 위치 :" + B + "층");
				System.out.println("몇층에 계시나요? [종료하시려면 q 또는 exit 입력]: ");
				String my = scan0.nextLine();
				
				while(first) {
					if(A == B) { 
						first = false;
					}else {
						while(second) {
							if(my.equals("q")||my.equals("exit")) {
								System.out.println("프로그램이 종료되었습니다.");
								break outer;
							}	
							
							int MY = Integer.parseInt(my);
							System.out.println(my + "층에서 엘리베이터를 호출합니다.");
							System.out.println("FF");
							int result1 = Math.abs(MY - A);
							int result2 = Math.abs(MY - B);
							
							if(result1 > result2) {
								System.out.println("승강기 B가 " + MY + "층으로이동하였습니다.");
								B = MY;
								second = false;
							}else if(result2 > result1) {
								System.out.println("승강기 A가 " + MY + "층으로이동하였습니다.");
								A = MY;
								second =false;
							}
							
							
						}
					}
				}
			}
			
			
			
//			boolean second = true;
//			boolean first = true;
//			
//			outer: while(true) {
//				
//				int A = (int)(Math.random() * (7-1+1)) + 1;
//				int B = (int)(Math.random() * (7-1+1)) + 1;
//				System.out.println("\n=========희영빌딩 엘리베이터===========\n");
//				System.out.println("A 승강기의 현재 위치 :" + A + "층");
//				System.out.println("B 승강기의 현재 위치 :" + B + "층");
//				System.out.println("몇층에 계시나요? [종료하시려면 q 또는 exit 입력]: ");
//				String my = scan0.nextLine();
//				
//					while (first) {
//					if(A == B) {
//						first = false;
//					}else {while(second) {
//						if(my.equals("q")||my.equals("exit")) {
//							System.out.println("프로그램이 종료되었습니다.");
//							break outer;
//						}
//						
//						int MY = Integer.parseInt(my);
//						System.out.println(my + "층에서 엘베이터를 호출합니다.");
//						int result1 = Math.abs(MY - A);
//						int result2 = Math.abs(MY - B);
//						
//						if(result1 > result2) {
//							System.out.println("승강기 B가 " + MY + "층으로이동하였습니다.");
//							B = MY;
//							second = false;
//						}else if(result2 > result1){
//							System.out.println("승강기 A가 " + MY + "층으로이동하였습니다.");
//								A = MY;
//							second = false;
//							
//							}
//							}
//						 
//					}
//					
//					
//					
//					  
//}
//				}
				}
}

