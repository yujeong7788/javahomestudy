package ch11_api;

import java.util.regex.Pattern;

public class ApiPattern {

	public static void main(String[] args) {
		// 정규표현식 (Regular Expression)
		// 특정한 규칙을 가진 문자열의 집합을
		// 표현하기 위해 쓰는 형식
		
		// 전화번호 (3자리 - 4자리 - 4자리), (전부 숫자)
		// 주민등록번호 (6자리 - 7자리), (전부 숫자)
		// 이메일 (영어와 숫자로 이루어진 문자열 @ 영어.영어)
		// 위와 같이 정해진 형식에 대해 정규표현식과
		// Pattern을 이용하여 검증할 수 있다.
		
		// 숫자만 존재하는지 검증 (Validation)
		String example = "1283928";
		// 문자열의 시작(^)과 끝($) 사이에 숫자([0-9])가 1개 이상(+)인지 체크 , 띄어쓰기도 허용 안해줌
		String regex = "^[0-9]+$";
		
		// Pattern.matches를 하면 검증 결과가 true/false로 리턴
		boolean result = Pattern.matches(regex, example);
		System.out.println(result);
		
		// 문자열에 .matches(regex) 해도 된다.
		result = example.matches(regex); // 위의 코드와 같음
		System.out.println(result);
		
		// 숫자만 존재하는 지 검증 2
		regex = "\\d+"; // \\d = [0-9]
		result = example.matches(regex); 
		System.out.println(result);
		
		System.out.println("\n=================================알파벳검증===================================\n");
		// 알파벳만 존재하는지 검증
		example = "JeongChanung";
		regex = "[a-zA-Z]+";
		result = example.matches(regex);
		System.out.println(result);
		
		// 띄어쓰기를 포함시키기
		example = "Jeong Chanung";
		regex = "[a-zA-Z\\s]+";
		result = example.matches(regex);
		System.out.println(result);
		
		System.out.println("\n=================================한글검증================================\n");
		// 한글만 존재하는지 검증
		example = "찬웅ㄱㅏㅣ";
		regex = "[가-힣ㄱ-ㅎㅏ-ㅣ]+"; //완성된 글자, 자음, 모음
		result = example.matches(regex);
		System.out.println(result);
		
		System.out.println("\n==============================비밀번호 패턴===============================\n");
		
		// 6자리 숫자 like pin번호
		example = "637843";
		regex = "[0-9]{6}";
		result = example.matches(regex);
		System.out.println(result);
		
		// 6자리 이상
		example = "637843444";
		regex = "[0-9]{6,}";
		result = example.matches(regex);
		System.out.println(result);
		
		// 6자리부터 8자리까지만
		example = "637843444";
		regex = "[0-9]{6,8}";
		result = example.matches(regex);
		System.out.println(result);
		
//		// 8자리 이하
//		example = "637843444";
//		regex = "[0-9]{,8}";
//		result = example.matches(regex);
//		System.out.println(result);
//		
		
		// 같은 숫자 3회 이상 반복 금지
		example = "221133";
		regex = ".*([0-9]).*\\1.*\\1.*{6}"; // .* = 아무 문자가 0개 이상 , \\1 앞에 안에 있는숫자와 같은숫자 1개
		result = example.matches(regex);
		System.out.println(result);
		
		
		// 영어와 숫자로만 구성
		example = "1q2w3e4";
		regex = "[0-9a-zA-Z]";
		regex = "\\w+"; //약자, 위와 같음
		result = example.matches(regex);
		System.out.println(result);
		
		// 영어와 숫자 + 특수문자
		example ="123asdf!!!!!!!!!";
		regex = "[0-9a-zA-Z]";
		
		// 영어 소문자, 대문자, 숫자, 특수문자 각각 한자리 이상
		// 8자리 ~ 12자리로 설정해주세요!
		example = "sdf913!@!";
		
		// 알파벳 소문자가 1자리 이상이면 true
		regex = ".*[a-z].*";
//		regex = ""
		regex = "\"^(?=.*[a-zA-Z])(?=.*\\\\d)(?=.*\\\\W).{8,20}$\"";
		regex = "\"^(?=.*[a-z])^(?=.*[A-Z])(?=.*\\d)(?=.*\\w).{8,12}$\"";
		result = example.matches(regex);
		System.out.println(result);
		
	}

}
