package ch02_variable;

public class VariableType {
	// 변수의 타입 (기본 타입)
	
	// 정수 타입
	byte byteVar = 1;
	short shortVar = 2;
	int intVar = 3;
	// l or L 안붙여주면 int 21억이상 담을 수 없음, 에러
//	long longVar = 3000000000000000;
	long longVar3 = 3000000000000000l;
	long longVar2 = 4L;
	
	// 정수이면서 문자에 해당
	char charVar = 44032; // 문자 '가'를 의미함
	char ga = '가' ; // 44032와 같다
	//한글자 : 문자 , 여러글자 : 문자열

	// 소수 타입
	double doubleVar = 3.14; // 용량 크고 알파벳 안붙여도됨
	float floatVar = 3.14f; // 용량 작고 알파벳 붙여야함
	
	// 불리언 타입 (참/거짓, true/false)
	boolean boolVar = true;
	
	// 문자열 타입 (문자, char는 한글자 /문자열은 0글자 이상)
	String strToday = "오늘은 3월 21일"; // 글자 수 제한은 없다고 봐도 무방함
	String strToday2 = "오"; // 
	
//	public String tset() {
//		System.out.println(strToday2);
//	}

}

