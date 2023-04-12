package JANGYUJEONG.submit06;

public class submit06 {

	public static void main(String[] args) {
		//Q01
		//한국 배우들의 명단을 배열로 만들어보았습니다.
		//for문을 이용하여 "이"씨 성을 가진 사람이 몇명인지 출력해주세요.
		
		String[] nameList = {"이정재", "김혜수", "이병헌", "송중기", "유아인", "류준열", "공유", "마동석", "이종석", "황정민", "박소담", "이선균", "이성민", "최민식", "이동휘", "권상우", "소지섭", "공효진", "조정석", "허성태", "이하늬"};
		int count = 0;
		for(int i = 0; i < nameList.length; i++) {
			if(nameList[i].substring(0,1).equals("이")) {
				count++;
			}
		}
		System.out.println("이씨 성을 가진 배우가 " + count + "명 있습니다.");
		
		
		System.out.println("\n===========Q02============\n");
		
		//Q02
//		최댓값, 최솟값 구하기
//		for문을 이용해 intArr의 최댓값과 최솟값을 출력해주세요.
		
		int[] intArr = {23, 456, 213, 32, 464, 1, 2, 4};
		for(int i = 0; i < intArr.length - 1; i++ ) {
			
			if(intArr[i] > intArr[i+1]) {
				int t = intArr[i];
				intArr[i] = intArr[i+1];
				intArr[i+1] = t;
			}
			
		}
		
		for(int k = 0; k < intArr.length -1 ; k++) {
					
					for(int i = 0; i < intArr.length -1; i++) {
						// i > i+1 하면 오름차순
						// i < i+1 하면 내림차순
						if(intArr[i] < intArr[i+1]) {
							int t = intArr[i];
							intArr[i] = intArr[i+1];
							intArr[i+1] = t;
						}
						
					}
					
				}
		System.out.println("최댓값: " + intArr[0] );
		System.out.println("최솟값: " + intArr[intArr.length - 1] );
		
		System.out.println("\n===========Q03============\n");
		
		//Q03
//		로또 번호 생성기
//		1~45 까지의 랜덤 숫자 6개를 배열에 중복되지 않도록 담고,
//		이를 정렬한 배열을 리턴하는 makeLotto() 함수를 만들어주세요.
		
		int [] myLotto = makeLotto();
		for(int i = 0; i < myLotto.length; i++) {
			System.out.print(myLotto[i] + " ");
		}
		
		

		
	} // main 끝
	
	
	
	public static void printArray(int[] intArray) {
		for(int i = 0; i < intArray.length ; i++) {
			// i가 마지막일때에는 뒤에 콤마(,)를
			// 붙이지 않고, 개행문자도 넣는다.
			
			if (i == intArray.length - 1) {
				System.out.println(intArray[i]);
			}else {
				System.out.print(intArray[i] + " ");
			}
			
		}
	}	
	
	
	public static int[] makeLotto(){
		int[] intArray = new int[6];
		for(int i = 0; i < 6; i++) {
			intArray[i] = (int)(Math.random() * 45) + 1;
			
			for(int j = 0; j < i; j++) {
				if(intArray[i] == intArray[j]) {
					i--;
					break;
				}
			}
		}
		return intArray;
	}
	

}
