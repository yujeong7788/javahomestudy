package JANGYUJEONG.submit07;

import java.util.ArrayList;
import java.util.Collections;

public class submit07 {
	public static void main(String[] args) {
		System.out.println("\n=============Q01-1=============\n");
		// QO1
		// 정수를 담을 수 있는 ArrayList 객체를 생성하고,
		// 10부터 20 사이의 랜덤 숫자를 10개 담으시오.
		// (10도 나오고 20도 나올수 있어야 함)
		

		ArrayList<Integer> answer = new ArrayList<>();
		
		int idx = 0;
		outer: while(true) {
			int rand = (int)(Math.random()*(20-10)) + 10;
			
			answer.add(rand);
			idx++;
			
			if(idx == 10) {
				break;
			}
			
		}
		System.out.println(answer);
		
		System.out.println("\n=============Q01-2=============\n");
		// 중복 제거 후 출력
		// hint 새로운 빈 리스트 만드시고, 거기에 중복되지 않게끔 값들을 옮기세요
		ArrayList<Integer> removeAnswer = new ArrayList<>();
		removeAnswer.addAll(answer);
			// 중복 제거
		for(int i = 0; i <removeAnswer.size(); i++ )
			for(int j = 0; j < i; j++) {
				if(removeAnswer.get(i) == removeAnswer.get(j)) {
					removeAnswer.remove(removeAnswer.get(i));
					i--;
//					System.out.println("현재배열:"+removeAnswer);
				}
			} 	
				
		System.out.println(removeAnswer);
		
		System.out.println("\n=============Q01-3=============\n");
		// 오름차순
		Collections.sort(removeAnswer);
		System.out.println(removeAnswer);
		
		System.out.println("\n=============Q01-4=============\n");
		// 내림차순
		for(int i = 0; i < removeAnswer.size() -1; i++) {
			
			for(int k = 0; k < removeAnswer.size() -1; k++) {
				// i > i+1 하면 오름차순 
				// i < i+1 하면 내림차순
				if(removeAnswer.get(k) < removeAnswer.get(k+1)) {
					int t = removeAnswer.get(k);
					removeAnswer.get(removeAnswer.get(k+1));
					removeAnswer.get(t);
				}
				
			}
		}
		System.out.println(removeAnswer);
		
	//		Q. 02
	//
	//
	//		아내가 사고 싶은 물건  ["냉장고", "로봇청소기", "세탁기", "에어컨"] 을 리스트에 담아주세요.
	//				
	//		남편이 사고 싶은 물건 ["노트북", "TV", "에어컨", "플레이스테이션", "로봇청소기"] 을 다른 리스트에 담아주세요.
	//				
	//
	//		1. 서로 사고 싶은 물건 목록을 새로운 리스트에 담아 콘솔에 출력해주세요(교집합)
	//
	//		Hint
	//		빈 리스트를 하나 만들고, 아내의 구매목록 리스트를 for문을 이용하여 순회하고, 
	//		각 구매 물품이 남편의 구매목록 리스트에 존재하는지 체크한다.
	//		만약 존재한다면 빈 리스트에 해당 물품을 저장한다.
	//
	//
	//		2. 사고 싶은걸 다 산다고 했을때의 구매 목록을 새로운 리스트에 담아 콘솔에 출력해주세요(합집합)
	//
	//		Hint
	//		빈 리스트를 하나 만들고, 아내의 구매목록을 전부 담는다.
	//		이후 남편의 구매목록 리스트를 for문을 이용하여 순회하고, 
	//		남편의 구매 물품이 빈 리스트에 존재하지 않는다면 빈 리스트에 해당 물품을 추가한다.

		
		
//		System.out.println((int)(Math.random()*20) + 1);
		
		// @문제
		// 숫자 a부터 b사이의 랜덤 정수를 리턴해주는 메소드
//		int rand = makeRandom(10,20);
//		System.out.println(rand);
		
	}// main 끝
	
//	public static int makeRandom(int to, int from) {
//		
//		while(true) {
//			int ran = (int)(Math.random() * from) + 1;
//			if(ran < to) {
//				continue;
//			}else {
//				int value = ran;
//			}
//		}
//		
//		return value;
	
}
