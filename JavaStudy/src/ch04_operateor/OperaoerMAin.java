package ch04_operateor;

public class OperaoerMAin {

	public static void main(String[] args) {
		int number = 10;
		System.out.println(number);
		
		// 증감 연산자 (1만 가능)
		number++; // 크기 1 증가
		System.out.println(number);
		number--; // 크기 1 감소
		System.out.println(number);
		++number; // 1 증가
		System.out.println(number);
		
		
		// 앞, 뒤에 따라 실행 순서가 다르다,
		System.out.println(number++);
		System.out.println(number);
		
		System.out.println(++number);
		
		
		System.out.println("\n==========대입연산자===========\n");
		
		number = 10; // 초기화
		
		number += 1;
		System.out.println(number); //11
		
		number += 34;
		System.out.println(number); //45
		
		number -= 20;
		System.out.println(number); //25
		
		number *= 3;
		System.out.println(number); //75
		
		// 나누기의 몫
		number /= 5;
		System.out.println(number); //15
		
		number /= 2;
		System.out.println(number); // 몫 : 7
		
		// 나누기의 나머지
		number %= 3;
		System.out.println(number); // 나머지 : 1
		
		
		System.out.println("\n==========산술 연산자===========\n");
		
		int numA = 10;
		int numB = 3;
		
		numA = numA + 1;
		System.out.println(numA);
		
		System.out.println("numA: 11, numB: 3");
		System.out.println("더하기: "+ (numA + numB)); // 문자열과 숫자를 먼저 더했기때문, 괄호 필요
		System.out.println("빼기: "+ (numA - numB));
		System.out.println("곱하기: "+ (numA * numB));
		System.out.println("나누기: "+ (numA / numB));
		System.out.println("나머지: "+ (numA % numB));

		// 먼저 계산할 부분에대해 괄호는 필수!
		int temp = 1 + (2 * 3);
		System.out.println(temp);
		
		
		
		
		System.out.println("\n==========나머지 연산자 사용 예시===========\n");
		
		// 홀수, 짝수 판별
		int anyNum = 5436;
		// anyNum을 2로 나눈 나머지가 1이면 홀수, 0이면 짝수
		System.out.println(anyNum % 2);
		
		// 게시판 페이징 구현
		int totalCountGul = 33; // 게시판에 글이 총 33개 있다.
		int showCountOnePage = 10; // 한 페이지에서 보여줄 글의 수가 10개이다.
		
		// 총 페이지수의 수
		// 33 / 10 = 3.3 -> 올림 4
		// 변수명 다 적을 필요 없이 대문자 적으면 자동완성
		int countPage = (int)Math.ceil((double)totalCountGul / showCountOnePage);
		System.out.println(countPage);
		
		// 마지막 페이지에 있는 글의 수
		// 33 을 10으로 나눈 나머지 = 3
		// 33 % 10
		
		int countLastPageGul = totalCountGul % showCountOnePage;
		System.out.println(countLastPageGul);
		
		
		
		
		System.out.println("\n=========== 문자열 더하기 ===========\n");
		
		String subway = "반석역";
		subway = subway + " 지족역";
		System.out.println(subway);
		
		
		// 대입 연산자로도 문자열 더하기(이어붙이기)가
		// 가능하지만 뒤에만 추가된다.
		subway += " 노은역";
		System.out.println(subway);
		
		subway = "종점 " + subway + " 월드컵경기장역";
		System.out.println(subway);
		
		System.out.println("\n=========== 비교 연산  ===========\n");
		
		int numFive = 5;
		double pi = 3.14;
		int numOne = 1;
		
		// 비교 결과에 따라 true/false 리턴된다.
		System.out.println(numFive > numOne);
		
		boolean result = numFive > numOne;
		System.out.println(result);
		
		boolean result2 = numFive < numOne;
		System.out.println(result2);
		
		// 타입이 다른 숫자도 비교가 가능
		System.out.println(numFive >= pi);
		
		// == 왼쪽과 오른쪽이 같은지 비교
		// (같다면 true , 다르면 false 리턴)
		System.out.println(1 + 2 == 3);
		System.out.println(numOne == numFive);
		
		
		// !=는 왼쪽과 오른쪽이 다른지 비교
		// (다르면 true / 같으면 false 리턴)
		System.out.println(numOne != numFive);
		
		
		// 문자에 대해서도 비교 연산이 가능
		System.out.println('가'>'나');
		//char 44032 45001
		
		
		// 문자열을 정렬하는 로직을 만들때
		// 문자열 앞글자만 char 타입으로 꺼낸후 비교하여 정렬하면 된다.
		String stuA = "고동욱";
		String stuB = "김대일";
		System.out.println(stuA.charAt(0) > stuB.charAt(0));
		
		
		
		// 문자열이 서로 같은지 비교
		// .equals(문자열) 중요!!!!!!!!!!!!!!!!!!!!!
		// 해당 문자열이 괄호안 문자열과 같은지 비교
		String ship = "배";
		String pear = "배";
		String bae = new String("배");
		
		
		System.out.println(ship == pear);
		System.out.println(ship == bae);
		System.out.println(ship.equals(bae));
		
		
		
		// 예시
		// 서버에서 데이터를 가져오는데 문제가 생기면
		// null(참조타입X) 값으로 넘어온다.
		// 데이터를 받아오는 쪽에서 null 체크
		String serverData = null;
		System.out.println(serverData != null);
		
		
		
		// 사용자의 입력을 가지고 왔더니
		// 입력하지 않은 데이터가 empty로 온다.
		String inputData = "";
		System.out.println(inputData.equals(""));
		System.out.println(inputData.length() == 0);
		System.out.println(inputData.isEmpty());
		
		System.out.println("\n=========== 삼항 연산자  ===========\n");
		
		String inputId = "akow283";
		
		// inputId의 길이가 7 이상이면 통과, 아니면 재입력
		String check = (inputId.length() >= 7) ? ("통과") : ("재입력");
		System.out.println(check);
		
		// inputId가 empty가 아니라면 1, 맞다면 0
		// 기본형태 () ? () : ()  , 괄호 없어도 동작 함
		int checkInt = (inputId.length() > 0) ? (1) : (0);
		System.out.println(checkInt);
		
		// 이중 삼항 연산자
		int score = 90;
		
		// score가 90점보다 크면 grade는 A
		// 80점보다 크면 B, 나머지는 C
		String grade = (score > 90) ? ("A") : ((score >  80) ? ("B") : ("C") );
		System.out.println(grade);
		
		System.out.println("\n=========== 논리 연산자  ===========\n");
		
		// 조건 체크를 여러번 하지 않고, 한번에 끝낼 수 있도록
		
		int inputAge = 24;
		String inputPhone = "01021930420";
		
		// 나이는 14세 이상, 휴대폰 번호는 11자리 체크
		System.out.println(inputAge >= 14);
		System.out.println(inputPhone.length()==11);
		
		// &&
		// 좌우 조건이 전부 참이어야 true 리턴
		// 좌우 둘 중 하나라도 false면 false
		System.out.println(inputAge >= 14 && inputPhone.length()==11 );
		System.out.println(inputAge >= 14 && inputPhone.length()==10 );
		
		// 휴대폰 번호는 10자리 혹은 11자리 여야 한다.
		// 10 <= x <= 11
		//System.out.println(10 <= inputPhone.length() <= 11); // 자바에서 안됨
		System.out.println(10 <= inputPhone.length() && inputPhone.length() <= 11);
		
		
		// ||
		// 좌우 조건 중 하나라도 true면 true 리턴
		// 둘 다 false일 때만 false 리턴
		
		// x == 10 or x == 11
		System.out.println(inputPhone.length() == 10 || inputPhone.length() == 11);
		
		// 회원가입 예시
		String name = "차무식";
		String phone = "01043290292";
		int age = 50;
		
		// name 은 empty면 안되고
		// phone은 10자리 또는 11자리
		// age는 14 이상
		boolean checkName = name.length() > 0; // isEmpty 비어있을때 true 
		boolean checkPhone = phone.length() == 10 || phone.length() == 11;
		boolean checkAge = age >= 14;
		
		System.out.println(checkName && checkPhone && checkAge);
		
		// boolean 타입 반전
		// boolean 타입 앞에 !를 붙이면 true/false가 바뀐다.
		checkName = !name.isEmpty(); // checkName 새로 선언
		System.out.println(checkName); //System.out.println(!checkName); 사용 가능
		
		
		System.out.println("\n=========== 비트 연산자  ===========\n"); // 잘안씀
		
		// 이진수
		int bitTen = 10; // 1010
		int bitNine = 9; // 1001
		//--------------------------------------------
						 // 1000 AND 연산 => 8
						 // 1011 OR 연산 => 11 
						 // 0011 XOR 연산 => 3
		
		
		
		// & AND
		// 이진수 기준으로 각 자리수를 비교해서
		// 같은 자리의 숫자가 둘 다 1이어야 1로 계산한다.
		System.out.println(bitTen & bitNine); // 8
		
		
		// | OR
		// 이진수 기준으로 각 자리수 비교해서
		// 한 자리라도 1이면 1로 계산
		System.out.println(bitTen | bitNine);
		
		
		// ^ XOR
		// 이진수 기준으로 각 자리가 서로 다른 경우에만 1로 계산
		System.out.println(bitTen ^ bitNine);
		
		
		// 2진수 사용예시
		// 4가지 취미를 보관하기 위해 숫자로 저장
		// 0 0 0 1 : 농구를 좋아함
		// 0 0 1 0 : 배구를 좋아함
		// 0 1 0 0 : 야구를 좋아함
		// 1 0 0 0 : 축구를 좋아함
		
		
		// 1 1 0 1
		int jonghyunLike = 13;
		
		
		// 리눅스에서 파일, 폴더의 권한을 설정하는
		// 명령어 chmod 
		
		
		// 면접에서 물어본 2진수, 16진수 문제
		// A. 16진수 12f를  10진수로 바꾼 후 2진수로 변환
		// B. 10진수 147을 2진수로 변환
		// C. A와 B에 대해 비트연산자 AND 적용 (2진수)
		// D. C를 10진수로 표현
		
		
		
		
	}

}
