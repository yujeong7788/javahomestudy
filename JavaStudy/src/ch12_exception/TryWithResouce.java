package ch12_exception;

import java.util.Scanner;

public class TryWithResouce {

//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		
//		try {
//			System.out.println("아무말이나 입력");
//			System.out.println(">>>");
//			String inputText = scan.nextLine();
//			System.out.println(inputText);
//		}catch(Exception e){
//			e.printStackTrace();
//		}finally { // finally 굳이 쓰자면 이렇게 씀
//			scan.close();
//		}
//	}
	
	
	
	// try - with - resource 구문
	// 닫아야할 개체를 try() 소괄호 안에 선언 후
	// try{} 블록 내에서 해당 객체를 사용
	// (그럼 자동으로 해당 객체를 close() 해준다)
	public static void main(String[] args) {
		try(Scanner scane = new Scanner(System.in)){ // 객체 두개 이상 소환할때는 세미콜론으로 구분
			System.out.println("아무말이나 입력");
			System.out.println(">>>");
			String inputText = scane.nextLine();
			System.out.println(inputText);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
