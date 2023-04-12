package JANGYUJEONG.submit04;

import java.util.Scanner;

public class submit04 {

	public static void main(String[] args) {
		
		//Q01.
		//사용자에게 문자열을 입력받으시고,
		//입력받은 문자열의 순서를 뒤집어서 출력해보세요.
		//LoopFor의 1부터 n까지 더하는 형태를 참고
		//for문 내부가 반복될때마다 입력받은 문자열을 한글자씩 잘라 문자열 변수에 더한다.
				
		System.out.println("\n================Q01==============\n");
		
		Scanner scan = new Scanner(System.in);
		
			System.out.println("입력해주세요");
			System.out.println(">>>");
			
			String input = scan.nextLine();
			
			String sum = "";
			
			for(int i = input.length(); i > 0; i--) {
				sum += input.substring(i-1,i);
				
			}
			System.out.println("입력값: " + sum);
			
			
			
			
			
	System.out.println("\n=================Q02===================\n");
	
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
