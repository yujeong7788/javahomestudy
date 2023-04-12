package ch09_class.typing;

import java.util.ArrayList;
import java.util.Scanner;

public class TypingMain {

	public static void main(String[] args) {
		// 타자 연습 게임
		Scanner scan = new Scanner(System.in);
		
		// 단어 목록
		// 딕셔너리 선언
		// static 메소드는 해당 클래스를 굳이 객체로 만들지
		// 않더라도 사용이 가능하다.
		// ex) Math.random()
		
		Dictionary dict = new Dictionary(); // 객체 만든거
		ArrayList<String> wordList = Dictionary.makeWordList(Dictionary.OPTION_RANDOM_ALPHABET);
//		System.out.println(Dictionary.optionStudentName);
		
//		System.out.println(dict.optionCodingWord); // static안붙이면 객체 만들어서 사용해야함
//		ArrayList<String> wordList = new ArrayList<>();
		
//		wordList.add("장유정");
//		wordList.add("배준호");
//		wordList.add("고동욱");
//		wordList.add("박혜라");
//		wordList.add("정현진");
//		wordList.add("홍민경");
//		wordList.add("박진영");
//		wordList.add("김대일");
//		wordList.add("박창연");
//		wordList.add("최성복");
//		wordList.add("이자영");
//		wordList.add("백민기");
//		wordList.add("유동윤");
//		wordList.add("강지혜");
//		wordList.add("김태윤");
//		wordList.add("박준하");
//		wordList.add("주예슬");
//		wordList.add("윤종현");
//		wordList.add("류서영");
//		wordList.add("신경호");
//		wordList.add("김청아");
//		wordList.add("김현곤");
		
		// 현재 시간 저장
		// 1970년 1월 1일을 기준으로
		// 현재까지 경과된 시간을 밀리초 단위로 리턴 (1초 = 1000밀리초)
		long before =  System.currentTimeMillis();
		System.out.println(before);
		
		
		while(true) {
			
			// wordList에 담긴 단어가 랜덤하게 출력
			// = Math.random() 실행 결과가 wordList의 인덱스 중 하나
			// = wordList의 인덱스 0 ~ wordList.size()-1
			int randIdx = (int)(Math.random()*wordList.size());
			System.out.println(wordList.get(randIdx));
			
			// 출력된 단어를 입력
			System.out.println(">>> ");
			String input = scan.nextLine();
			// 입력한 단어가 출력된 단어와 일치하는지 체크
			if(wordList.get(randIdx).equals(input)) {
				// 일치한다면 wordList에서 해당 단어를 삭제
				wordList.remove(randIdx);
			}
			// 일치하지않으면 해당 단어가 삭제되지 않고 또 입력 받음
			
			// 위 과정을 반복 (wordList.size()가 0이 될때까지)
			if(wordList.size() == 0) {
				break;
			}
		}
		
		long after = System.currentTimeMillis();
		long diff = after - before; // diff는 밀리초단위
		
		// 초 단위로 변환
		// 38967밀리초 -> 38.967초
		double result = diff / 1000.0; 
		System.out.println(result+"초 걸리셨습니다.");
		
		
		
		
		
		
		
		
	}

}
