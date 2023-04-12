package ch05_controll;

public class Conditional {
	
	// 전역변수
	// class 중괄호 안에 선언된 변수
	// 해당 클래스 내 어디서든 사용 가능하다.
	static String subject = "조건문";
	

	public static void main(String[] args) {
		
		//조건문
		
		//if문
		int price = 30000;
		int myMoney = 10000;
		
		if(myMoney < price) {
			System.out.println("돈이 부족합니다."); // if(true) 일때만 실행			
		}
		
		
		//한줄로 써도 된다.
		if(myMoney < price) {System.out.println("돈이 부족합니다."); }
		
		
		// if문의 블록{} 안 명령어가 한줄이면
		// 블록{}을 생략할 수 있다.
		if(myMoney < price) System.out.println("돈이 부족합니다.");
		
		
		System.out.println("\n======================\n");
		
		// 변수의 사용범위(Scope)
		// 중괄호 블록{} 내부에 선언된 변수는
		// 해당 중괄호 바깥에서 사용할 수 없다. (지역 변수)
		String review = "맛있어요~";
		String warning = "";
		
		if(review.length() < 12) {
//			String warning = "리뷰는 12자 이상 작성하세요";
			warning = "리뷰는 12자 이상 작성하세요";
		}else {
			warning = "통과";
		}
		
		System.out.println(warning); // 에러, warning 중괄호 안에서만 사용 가능
		
		// 이를 삼항 연산자로 표현
		warning = (review.length() < 12) ? ("리뷰는 12자 이상 작성하세요") : ("통과");
		System.out.println(warning);
		
		
		// 전역변수 사용해보기
		System.out.println(subject);
		
		System.out.println("\n=========================\n");
		
		// else와 else if
		int numZero = 0;
		
		if(numZero < 0) {
			System.out.println("0보다 작다.");
		}else {
			System.out.println("0과 같거나 크다.");
		}
		
		
		if(numZero <= 0) {
			System.out.println("0보다 작다.");
		}else if(numZero == 0) {
			System.out.println("0과 같다.");
		}else if(numZero > 0) {
			System.out.println("0보다 크다"); // if(numZero > 0)  생략 가능
			
		}
		
		System.out.println("\n===================\n");
		
		// 리모콘의 전원 버튼의 경우
		// 전원 버튼 하나로 on/off 가능
		
		// 전원 버튼을 눌렀을때의 로직
		// TV의 전원 상태를 체크
		boolean isPowerOn = false;
		
		if(isPowerOn) {
			// TV가 켜져있는경우 (isPowerOn == true) 가능
			System.out.println("TV를 끕니다.");
			isPowerOn = false; // isPowerOn = !isPowerOn; 가능
		}else {
			// TV가 꺼져있는 경우
			System.out.println("TV를 켭니다.");
			isPowerOn = true; // isPowerOn = !isPowerOn; 가능
		}
		
		// boolean의 true/false 값을 스위치의 on/off 처럼
		// 사용하는 boolean 타입의 변수를
		// 토글(toggle) 또는 플래그(flag) 변수라고 한다.
		
		System.out.println("\n=======================\n");
		
		// 이중 삼항 연산자로 썼던거
		int score = 85;
		String grade = "";
		
		// 90점 이상 A
		// 80점 이상 B
		// 그 외 C
		if(score >= 90) {
			grade = "A";
		}else if(score >= 80) {
			grade = "B";
		}else {
			grade = "C";
		}
		System.out.println(grade);
		
		
		// 코드 압축
		grade = "C";
		if(score >= 90) {
			grade = "A";
		}else if(score >= 80) {
			grade = "B";
		}
		System.out.println(grade);
		
		// 순서에 주의해야 하는 경우
		score = 92;
		if(score >= 80) {
			grade = "B";
		}else if(score >= 90){
			grade = "A";
		}else {
			grade = "C";
		}
		
		System.out.println(grade); // 실행 순서가 위에서부터기때문에 실행 후 바로 코드 종료
		
		// 순서 신경쓰기 싫을 때
		// 범위를 명확히 하기
		if(score >= 80 && score < 90) {
			grade = "B";
		}else if(score >=90) {
			grade = "A";
		}else {
			grade = "C";
		}
		
		System.out.println(grade);
		
		System.out.println("\n============================\n");
		
		// 회원가입 조건 체크
		// 이름은 한글자 이상
		// 휴대폰 번호는 10자리 또는 11자리
		// 나이는 14세 이상
		String name = "문동은";
		String phone = "01023451234";
		int age = 30;
		
		// Level 1
		if(name.length() >= 1) {
			// 통과
			if(phone.length() == 10 || phone.length() == 11 ) {
				//통과
				if(age >= 14) {
					System.out.println("회원가입 성공");
					
				}else {
					System.out.println("회원가입 실패");
				}
			}else {
				System.out.println("회원가입 실패");
			}
		}else {
			System.out.println("회원가입 실패");
		}
		
		
		// Level2
		boolean isOkay = false;
		if(name.length() > 0) {
			if(phone.length() == 10 || phone.length() == 11) {
				if(age >= 14) {
					isOkay = true;
				}
			}
		}
		
		if(isOkay == true) {
			System.out.println("회원가입 성공");
		}else {
			System.out.println("회원가입 실패");
		}
		
		// Level3
		if(name.length() > 0 && ( phone.length() == 10 || phone.length() == 11 )
				&& age >=14) {
			System.out.println("회원가입 성공");
		}else {
			System.out.println("회원가입 실패");
		}
		
		System.out.println("\n================switch==============\n");
		
		// switch
		// 값을 매칭하는 경우가 많을 때 사용
		
		// 여러분들의 교육기간(단위: 월)
		int month = 0;
		
		if(month == 0) {
			System.out.println("열심히 배우는 중");
		}else if(month == 1) {
			System.out.println("DB 마스터");
		}else if(month == 2) {
			System.out.println("자바 마스터");
		}else if(month == 3) {
			System.out.println("화면 구현 마스터");
		}else if(month == 4) {
			System.out.println("JSP 마스터");
		}else if(month == 5) {
			System.out.println("팀 프로젝트 시작");
		}else {
			System.out.println("수료");
		}
		
		
		month = 2;
		
		// switch문으로 변경, 소괄호 안에 변수를 넣음
		switch(month) {
		case 0:
			System.out.println("열공중");
			break;
		case 1:
			System.out.println("DB 끝");
			break;
		case 2:
			System.out.println("자바 끝");
			break;
		case 3: // 여러개 가능 
			System.out.println("화면구현 끝");
			System.out.println("화면구현 끝");
			System.out.println("화면구현 끝");
			System.out.println("화면구현 끝");
			break;
		case 4:
			System.out.println("jsp 끝");
			break;
		case 5:
			System.out.println("팀 프로젝트 시작");
			break;
		default:
			System.out.println("수료");
			
		}
		
		
		
		
		
		
	}

}
