package JANGYUJEONG.submit05;

public class submit05_answer {
	
	public static void main(String[] args) {
		// Q01 트리 메소드
		
		makeTree(3);
		makeTree(7);
		
		// Q02 로꾸꺼 메소드
		
		String input = "내일은 금요일";
		String result = reverseStr(input);
		System.out.println(result);
		
		// Q03 십진수를 이진수로 변환
		// (자바에서 이진수, 16진수 등등은 문자열)
		// 17 -> "100001"
		String binaryString = Integer.toBinaryString(17);
		System.out.println(binaryString);
		
		binaryString = makeBinary(23);
		System.out.println(binaryString);
		
		
		
	}// main 끝
	
	// 트리 메소드
	public static void makeTree(int floor) {
		System.out.println("\n======================\n");
		
		//     *
		//    ***
		//   *****
		//  *******
		// *********
		
		// for문에 7번 실행
		// i가 0,1,2,3,4,5,6일때
		// 공백은 6,5,4,3,2,1,0
		// *은 1,3,5,7,9,11,13
		
		
		for(int i = 0; i < floor; i++) {
			// 외부 for문의 변수 i를 이용하여
			// 내부 for문의 반복횟수를 조정할 수 있다.
			String space ="";
			for(int k = 0; k < floor-1-i; k++) {
				space += " ";
			}
			
			String stars = "";
			for(int k = 0; k < 2*i+1; k++)
				stars += "*";
			System.out.println(space + stars);
		}
		
	}
	
	// 로꾸꺼 메소드
	public static String reverseStr(String input) {
		String result = "";
		for(int i = input.length(); i > 0; i--) {
			String strst = input.substring(i-1,i);
			result += strst;
		}
		return result;
	}
	
	// 이진수 메소드
	public static String makeBinary(int num) {
		//num에 17이 들어왔다.
		//17을 2로 나눠서 나머지 1 / 몫은 8
		// 8을 2로 나눠서 나머지 0 / 몫은 4
		// 4를 2로 나눠서 나머지 0 / 몫은 2
		// 2를 2로 나눠서 나머지 0 / 몫은 1 
		// 1을 2로 나눠서 나머지 1 / 몫은 0 (스탑)
		
		// 반복횟수와 기준이 애매하면 while(true)
		String result = "";
		while(num > 0) {
			result += num % 2;
			num = num / 2;
		}
		return reverseStr(result);
		
	}
}
