package JANGYUJEONG.submit05;

import java.util.Scanner;

public class submit05 {

	public static void main(String[] args) {
		
		System.out.println("\n===========Q1===========\n");
		//Q01
		makeTree(5);
		makeTree(7);
		makeTree(20);
		
		System.out.println("\n===========@문제===========\n");
		
		//@
		//십진수를 이진수(String 타입)로 리턴해주는 makeBinary(int 타입) 함수를 만들어보세요.
		String rst = makeBinary(23);
		System.out.println(rst);
		
		String rst2 = makeBinary(193);
		System.out.println(rst2);
		
		System.out.println("\n===========Q02===========\n");
		
		//Q02
		//로꾸꺼를 메소드로 만들어서
		//파라미터로 들어온 String 문자열에 대해 뒤집은 결과를
		//리턴하는 메소드를 만들어보세요.
		
		String example = "로꾸꺼 로꾸꺼";
		String result = reverseStr(example);
		System.out.println(result);
		
		
		
	} // main 끝
	
	public static void makeTree(int num) {
		System.out.println("\n======================\n");
		
		//     *
		//    ***
		//   *****
		//  *******
		// *********
		
		// for문에 5번 실행
		// i가 0,1,2,3,4일때
		// 공백은 4,3,2,1,0
		// *은 1,3,5,7,9
		
		
		for(int i = 0; i < num; i++) {
			// 외부 for문의 변수 i를 이용하여
			// 내부 for문의 반복횟수를 조정할 수 있다.
			String space ="";
			for(int k = 0; k < num-1-i; k++) {
				space += " ";
			}
			
			String stars = "";
			for(int k = 0; k < 2*i+1; k++)
				stars += "*";
			System.out.println(space + stars);
		}
		
	}
	
	public static String makeBinary(int num) {
		/*Hint
		문자열 변수를 하나 선언해서 
		입력받은 정수를 2로 나눈 나머지를 문자열 변수에 더한다.
		그 다음 입력받은 정수를 2로 나눈 몫을 이용하여 위 과정을 반복한다.
		2로 나눈 몫이 1이 된다면 반복을 종료한다.
		이진수로 만들어진 문자열 변수를 거꾸로(로꾸꺼) 뒤집은 다음 리턴한다.
		*/
		String result = "";
		
		while(true) {
			int a = num / 2; 
			int b = num % 2;
			num = num / 2;
//			System.out.println("num: " + num);
			String sb = b + "";
//			System.out.println("b: " + b);
			result = sb + result;
			
			if(num/1 == 1) {
				result = num + result;
				break;
			}
			
			
			
		}
		
		return result;
		

	}

	public static String reverseStr(String st) {
		String strResult = "";
		for(int i = st.length(); i > 0; i--) {
			String strst = st.substring(i-1,i);
			strResult += strst;
		}
		return strResult;
	}

}
