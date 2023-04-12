package JANGYUJEONG.submit01;

public class Submit01 {
	
	public static void main(String[] args) {
		System.out.println("\n========과제01=========\n");
		
//		//과제 01
//		String name = "개똥이";
//		byte age = 27;
//		double height = 180;
//		String phone = "010-1234-5678";
//		String email = "jung7788u@naver.com";
//		
//		System.out.println("이름: "+name);
//		System.out.println("나이: "+age);
//		System.out.println("키: "+height);
//		System.out.println("연락처: "+phone);
//		System.out.println("이메일: "+email);
//		
//		
//		System.out.println("\n========과제02=========\n");
//		
//		// 과제 02
//		String enigma = "너오구늘리뭐너먹구지리";
//		enigma = enigma.replace("너", " ");
//		enigma = enigma.replace("구", " ");
//		enigma = enigma.replace("리", " ");
//		System.out.println(enigma.replace(" ",""));	
//		
//		
//		System.out.println("\n========과제03=========\n");
//		
//		// 과제 03
//		int example = 278;
//		String example_S = example + "";
//		String example1 = example_S.substring(0,1);
//		String example2 = example_S.substring(1,2);
//		String example3 = example_S.substring(2,3);
//		
//		int intexample1 = Integer.parseInt(example1);
//		int intexample2 = Integer.parseInt(example2);
//		int intexample3 = Integer.parseInt(example3);
//		
//		int result = intexample1 + intexample2 + intexample3;
//				
//		System.out.println("결과는: " + result); // 출력할 때 타입 적지않기 주의
		
		System.out.println("\n========풀이=========\n");
		
		//Q 01
		 
		String name = "홍길동";
		int age = 30;
		double height = 181.3;
		String phone = "01043290392"; //폰번호 int 아님, 숫자로 이루어진 문자
		String email = "jung7788u@naver.com";
		
		System.out.println("이름: "+ name);
		System.out.println("나이: "+ age);
		System.out.println("키: "+ height);
		System.out.println("연락처: "+ phone);
		System.out.println("이메일: "+ email);
		
		//Q 02
		String enigma = "너오구늘리뭐너먹구지리";
		
		// 너 제거
		String tryOne = enigma.replace("너", "");
		// 구 제거
		String tryTwo = tryOne.replace("구", "");
		// 리 제거
		String tryThree = tryTwo.replace("리", "");
		
		// 한줄로 끝내기
		System.out.println(enigma.replace("너", "").replace("구", "").replace("리", ""));
		
		//Q 03
		int example = 278;
		
		String strEx = example + ""; // 숫자를 문자열로 변환
		
		//문자열을 각 자리수마다 자른다.
		//substring 추천
		
		System.out.println(Integer.parseInt(strEx.substring(0,1)) 
				+ Integer.parseInt(strEx.substring(1,2)) 
				+ Integer.parseInt(strEx.substring(2,3)));
		
		
		// 한줄로 끝내기 도전
		
		
	}
}


