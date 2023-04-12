package JANGYUJEONG.submit06;

import java.util.Arrays;

public class submit06_answer {

	public static void main(String[] args) {
		//"이"씨 성을 가진 사람이 몇명?
		int count = 0;
		String[] nameList = {"이정재", "김혜수", "이병헌", "송중기", "유아인", "류준열", "공유", "마동석", "이종석", "황정민", "박소담", "이선균", "이성민", "최민식", "이동휘", "권상우", "소지섭", "공효진", "조정석", "허성태", "이하늬"};
		for(int i = 0; i < nameList.length; i++) {
			if(nameList[i].indexOf("이") == 0) {
				count++;
			}
		}
		System.out.println("이씨 성을 가진 사람의 수는: " + count);
		
		
		//최댓값 구하기
		int max = 0;
		int[] intArr = {23, 456, 213, 32, 464, 1, 2, 4};
		for(int i = 0; i < intArr.length; i++) {
				if(max < intArr[i]) {
					max = intArr[i];
				}
		}
		System.out.println("최댓값: " + max);
		
		//최솟값 구하기
		int min = intArr[0];
		for(int i = 0; i < intArr.length; i++) {
			if(min > intArr[i]) {
				min = intArr[i];
			}
		}
		System.out.println("최솟값: " + min);
		
		//로또 생성기
		
		int[] myLotto = makeLotto();
		for(int i = 0; i < myLotto.length; i++) {
			System.out.print(myLotto[i]+" ");
		}
		
//		// 로또 시뮬레이션
//		int[] winLotto = {4, 24, 27, 35, 37, 45};
//		int buyCount = 0;
//		int[] lotto = makeLotto();
//		
//		while(true) {
//			buyCount++;
//		
//		
//		// 두 배열 같아도 winLotto = lotto -> false 나옴 참조타입 달라서
//		
//		int cnt = 0;
//		for(int i = 0; i <winLotto.length; i++) {
//			
//			if(winLotto[i] == lotto[i]) {
//				count++;
//			}
//		}
//		if(cnt == 6) {
//			System.out.println("당첨");
//			System.out.println("구매 횟수: " + buyCount);
//			System.out.println("구매 금액: " + (buyCount*1000));
//			break;
//		}else {
//			System.out.println(buyCount+"회차");
//		}
//			
//		}
		
		
		
		
		
		
		
	}// main 끝
	
	public static int[] makeLotto() {
		// 로또 번호 (1~45 사이의 랜덤숫자)
		int[] result = new int[6];
		// 중복 없이 로또 번호 6자리 담기
		// 중복 없이 번호를 넣으려면 몇번 반복해야할지 모름
		int idx = 0;
		outer: while(true) {
			int rand = (int)(Math.random()*45) + 1;
			
			// rand가 result 배열 안에 없는 숫자라면
			// 담기
			for(int i = 0; i < result.length; i++) {
				if(result[i] == rand) {
					continue outer;
				}
			}
			
			result[idx] = rand;
			idx++;
			
			if(idx == 6) {
				break;
			}
			
		}
		
		//오름차순 정렬
		Arrays.sort(result);
		return result;
	}
}
