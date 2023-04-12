package ch_03_system;

import java.util.Scanner; //경로를 알려줌

public class SystemMain {

	public static void main(String[] args) {
		// 표준 출력
		// 콘솔창에 텍스트 출력하기
		// println()
		// 콘솔창에 괄호안 내용을 출력 후 줄바꿈(개행문자) 해준다.
		System.out.println("이미 알고 있음");
		System.out.println("start");		
		System.out.println(); // 아무 내용 없을 때 줄바꿈만 일어남
		System.out.println("end"); 
		
		//print()
		// 괄호안 내용을 출력하기만 함
		System.out.print("줄바꿈 안됨");
		System.out.print("보기 불편함");
		
		System.out.println("\n====================================\n");
		
		//제어문자
		// 문자열 내에 역슬래시(\)를 이용하여
		// 특정 기능을 사용할 수 있다.
		
		// \n 줄바꿈
		System.out.print("println처럼 동작\n");
		System.out.println("중간에 \n을 넣어보자");
		
		// \t 탭 한번
		System.out.println("월\t화\t수\t목\t금");
		System.out.println("1\t2\t3\t4\t5");
		System.out.println("8\t9\t10\t11\t12");
		
		// 문자열 내에서 기능을 가지는 문자(\, ", ')
		// 얘네들을 출력하고 싶다면 앞에 \를 붙여준다.
		System.out.println("개행문자는 \\n");
		
		System.out.println("소크라테스 왈 \"너 자신을 알라\"");
		
		// 특수문자도 출력 가능하다.
		System.out.println("★");
		
		System.out.println("\n====================================\n");
		
		// printf()
		// 콘솔창에 포맷 문자열(format string) 형태로 내용을 출력
		System.out.printf("%d명이 수업을 듣고 있습니다.\n",24);
		System.out.printf("%d명이 %s을 듣고 있습니다.\n",24,"수업");
		
		// 예시
		System.out.printf("%02d장 표준입출력\n",3);
		System.out.printf("%02d장 표준입출력\n",12); //d 바로 앞 숫자는 자리수 , 
		System.out.printf("%03d장 표준입출력\n",15); //그 앞은 못채웠을때 채울 수 있음
		
		System.out.printf("원주율은 %.02f\n",3.142592); // 소수점
		System.out.printf("원주율은 %.02f\n",3.1); // 소수점
		
		System.out.printf("통장 잔고는 %,d원입니다.",1000000); // 알아서 천단위마다 콤마 붙여줌
		
		
		System.out.println("\n================표준 입력====================\n");
		
		// Scanner 클래스로부터 객체 생성
		Scanner scan = new Scanner(System.in); // 소괄호안에 필수적으로 내용 넣어줘야함
		System.out.println("이름을 입력해주세요.");
		System.out.print(">>> ");
		
		// 키보드 입력 받기 , 콘솔에서 입력을 기다림 , 입력 전까지 다음 코드 안 넘어감
		String name = scan.nextLine(); // 숫자를 입력해도 문자열로 가져온다
		
		
		System.out.println(name+": 좀 덥네요.");
		

		// scan.next() 또는 scan.nextInt() 등은 사용하지 않기
		System.out.println("에어컨 희망 온도를 입력해주세요");
		System.out.print(">>> ");
		
		String temper = scan.nextLine();
		int inttemper = Integer.parseInt(temper);
		
		System.out.println("희망 온도: " + inttemper);
		
		System.out.println("냉방/난방 선택해주세요");
		System.out.print(">>> ");
		String mode = scan.nextLine(); // 개행문자 남아있어서 
		System.out.println("모드는:" + mode);//자료를 바로 가져오기때문에 대기 없이 넘어가버렸음 
		
		
		// scan.next() 또는 scan.nextInt() 등은 사용하지 않기
		System.out.println("에어컨 희망 온도를 입력해주세요");
		System.out.print(">>> ");
		
		int temper2 = scan.nextInt(); // 개행문자를 버리지 않고 숫자만 가져와서 개행문자 남아있음
		
		System.out.println("희망 온도: " + temper2);
		
		System.out.println("냉방/난방 선택해주세요");
		System.out.print(">>> ");
		String mode2 = scan.nextLine(); // 개행문자 남아있어서 
		System.out.println("모드는:" + mode2);//자료를 바로 가져오기때문에 대기 없이 넘어가버렸음 
		
	}

}
