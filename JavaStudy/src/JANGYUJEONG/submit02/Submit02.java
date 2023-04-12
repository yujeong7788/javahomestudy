package JANGYUJEONG.submit02;

import java.util.Scanner;

public class Submit02 {

	public static void main(String[] args) {
		
		// Q1
		//사용자로부터 이름, 국어 점수, 영어 점수, 수학 점수를 입력 받고,
		//이름, 국어 점수, 영어 점수, 수학 점수, 평균을 콘솔창에 출력해보세요.
		
		Scanner scan = new Scanner(System.in); 
		System.out.println("이름을 입력해주세요.");
		System.out.print(">>> ");
		
		String name = scan.nextLine();
		
		System.out.println("국어 점수를 입력해주세요.");
		System.out.print(">>> ");
		
		String korean = scan.nextLine();
		int intkorean = Integer.parseInt(korean);
		
		System.out.println("영어 점수를 입력해주세요.");
		System.out.print(">>> ");
		
		String english = scan.nextLine();
		int intenglish = Integer.parseInt(english);
		
		System.out.println("수학 점수를 입력해주세요.");
		System.out.print(">>> ");
		
		String math = scan.nextLine();
		int intmath = Integer.parseInt(math);
		
		System.out.println("이름: " + name);
		System.out.println("국어: " + intkorean);
		System.out.println("영어: " + intenglish);
		System.out.println("수학: " + intmath);
		System.out.println("평균: "+ (intkorean + (double)intenglish + intmath)/3);
		
		System.out.println("\n=========== @ 문제 ===========\n");
		
		System.out.println("이름: " + name);
		System.out.println("국어: " + intkorean);
		System.out.println("영어: " + intenglish);
		System.out.println("수학: " + intmath);
		double average = (intkorean + (double)intenglish + intmath)/3;
		System.out.printf("평균: %.02f\n",average); // 소수점
		
//		(90점 이상 A, 90점 미만 80점 이상 B, 나머지 C)
		String grade = (average >= 90) ? ("A") : ((average >=  80) ? ("B") : ("C") );
		System.out.println("등급: " + grade);
		
		System.out.println("\n======================\n");
		
		// Q2
		//삼항 연산자를 이용해서 
		//주민번호 뒷자리의 첫번째 숫자에 대한 성별을 “남”, “여” 문자열로 변수에 담아 콘솔창에 출력해보세요. 
		//(주민번호 뒷자리의 첫번째 숫자가 홀수면 남성, 짝수면 여성)
		//주민번호 뒷자리에 대한 문자열 변수 idBack
		// 기본형태 () ? () : ()
		
		String idBack = "1231476";
		
		// 맨앞의 문자를 자르고
		// 변수에 담아서
		// 삼항 연산자 이용해서 남 / 여 판단하고
		// 콘솔창에 출력
		
		int intidBack = Integer.parseInt(idBack.substring(0,1));
		String check = (intidBack % 2 == 1) ? ("남") : ("여");
		System.out.println("성별은: " + check);
		
		
		
		// 선생님 답
		// Q01
		Scanner scan1 = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요");
		System.out.println(">>>");
		String name1 = scan.nextLine();
		
		System.out.println("국어 점수를 입력");
		System.out.println(">>>");
		int kor = Integer.parseInt(scan.nextLine());
		
		System.out.println("영어 점수를 입력");
		System.out.println(">>>");
		int eng = Integer.parseInt(scan.nextLine());
		
		System.out.println("수학 점수를 입력");
		System.out.println(">>>");
		int math1 = Integer.parseInt(scan.nextLine());
		
		System.out.println("이름: " + name1);
		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
		System.out.println("수학: " + math1);
		
		double avg = (kor + eng + math1) / 3; // 3.0으로 바꿔도 됨
		System.out.println("평균: " + avg);
		
		//@ 문제
		System.out.printf("평균: %.2f" , avg);
		
		String grade1 = (avg >= 90) ? ("A") : ((avg >= 80) ? ("B") : ("C"));
		System.out.println("등급: " + grade1);
		
		//Q02
		
		System.out.println("\n==========\n");
		
		String idBack0 = "1231467";
		
		String first = idBack0.substring(0,1);
		
		char start = idBack0.charAt(0);
		System.out.println(start);
		
		String strStart = start + "";
		System.out.println(strStart);
		
		int num0 = Integer.parseInt(strStart);
		
		String gender0 = (num0 % 2 == 1) ? ("남") : ("여");
		System.out.println(gender0);
		
		
		
		
	}

}
