package JANGYUJEONG.submit03;

public class submit03 {
	
	public static void main(String[] args) {
		
		int result = 1;
		
		//Q01. 10!값을 구하기(for문 사용)
		for(int i = 1; i <= 10; i++) {
			result = result * i;
		}
		
		System.out.println(result);
		System.out.println("\n=======@문제======\n");
		
		// @문제 15!값을 구하기(for문 사용) 
		// hint ! 숫자가 길다
		
		long result2 = 1l;
		
		for(int i = 1; i <= 15; i++) {
			result2 = result2 * i;
		}
		
		System.out.println(result2);
		
		System.out.println("\n==========Q02.=========\n");
		
		//Q02. 월리가 몇개인지 찾기 
		//hint 언제 에러 나는지 확인
		int count = 0;
		String findWally = "윌리울리일리울리울리일리월리일리윌리월리울리일리일리월리일리윌리일리윌리일리월리월리윌리울리윌리울리일리울리울리윌리일리";
		for(int i = 0; i < findWally.length(); i++) {
			if(i % 2 == 0) {
			String str = findWally.substring(i,i+2);
//			System.out.println(i + ":" + str);
			
			if(str.equals("월리")) {
				count++;
			}}
		}
		System.out.println("월리의 갯수: " + count);
		
		System.out.println("\n==========Q03.=========\n");
		
		//Q03. 거꾸로 트리를 5층 만들어주세요.
		String stars = "*****";
		for(int i = 0; i <= stars.length()-1; i++) {
			System.out.println(stars.substring(i));
			
		}
		
		System.out.println("\n=============풀이============\n");
		
		//Q01. 10!값을 구하기(for문 사용)
		// 10! = 10 x 9 x 8 x .... x 1
		int rst = 1;
		for(int i = 10; i >=1; i--) {
			rst *= i;
		}
		System.out.println(rst);
		
		// @ 문제 15!
		
		long lrst = 1; // l 안붙여도됨
		for(int i = 1; i <= 15; i++) {
			lrst *= i;
		}
		System.out.println(lrst);
		
		// Q02. 월리가 몇개인지 찾기 
		int count0 = 0;
		String findWally0 = "윌리울리일리울리울리일리월리일리윌리월리울리일리일리월리일리윌리일리윌리일리월리월리윌리울리윌리울리일리울리울리윌리일리";
		for(int i = 0; i < findWally0.length() -1; i++) {
			
			System.out.print(i + ":");
			System.out.println(findWally0.substring(i,i+2));
			String str = findWally0.substring(i,i+2);
			
			if(str.equals("월리")) {
				count++;
			}
		}
		
		System.out.println("월리의 갯수: " + count);
		
		
		
		// Q03. 거꾸로 트리
		// i가   0,1,2,3,4
		// stars 5,4,3,2,1
		// stars.substring(?) 의 결과
		String stars0 = "*****";
		for(int i =0; i<5; i++) {
			System.out.println(stars.substring(i));
		}
		
		
		
	}

	

}
