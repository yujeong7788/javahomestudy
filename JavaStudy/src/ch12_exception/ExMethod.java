package ch12_exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExMethod {
	
	public static void indexing(int[] intArray) {
		
		try {
			System.out.println(intArray[10]);
		} catch (Exception e) {
			System.err.println("인덱싱 실패");
			System.out.println("에러메시지: "+e.getMessage());
		}
	}
	
	// 입력받은 이름을 콘솔창에 출력하는 메소드
	public static void printName(String name) throws BizException {
		
		
		// 파라미터로 들어온 name이 empty면 에러 발생 시키기
		if(name.length() == 0) {
			throw new BizException("API_001","empty 들어옴 ㅡㅡ"); // 메소드 안에서 강제로 에러 발생 //에러 발생시킬때 throw 
		}else if(name.matches(".*[0-9].*")) { // 숫자가 하나라도 들어가있음
			throw new BizException("API_002","숫자가 들어옴 ㅡㅡ");
		}
		
		System.out.println(name);
	}
	
	// 날짜 문자열을 입력하면 밀리초로 바꿔서 리턴하는 메소드 만들기
	// (yyyy.MM.dd)
	public static long dateMillSec(String date) {
		// "2023.04.20"
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		// 에러 처리를 어디서 할지 선택, 보통은 실행하는 곳에서 처리함
		Date temp;
		try {
			temp = sdf.parse(date);
			return temp.getTime();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return 0;
		
	}

}