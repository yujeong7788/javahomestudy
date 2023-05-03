package ch11_api;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import jyj.JYJUtil;

public class ApiJson {

	public static void main(String[] args) throws ParseException {
		// 객체지향 프로그래밍 (OOP)
		// 개발 대상, 데이터 등을 객체로 보고
		// 객체로 만들어서 구현
		
		// 학생 이름, 나이, 점수
		
		// 자바 -> 클래스로 선언
		// public class Student
		// 		String name;
		// 		int age;
		// 		int score;
		
		// Student stu = new Student("준호", 30, 80);
		
		
		// 자바스크립트 - JSON 객체 사용 (웹 개발자에게 중요)
		// let stu = {name : "준호", age : 30, score : 80 };
		// JSON 객체 형식이 서버 통신이 데이터 요청/응답에
		// 많이 사용되는 형태이다.
		
		// 자바단에서 서버 통신으로 데이터가 넘어왔는데
		// JSON 형태인 경우가 있다.
		// "{name : "준호", age : 30, score : 80 }" -> JSONString
		
		// JSONString 이 넘어때, 이를 JSONObject로 변환하여
		// 각 Key값에 접근할 수 있어야 Value를 꺼내올 수 있다.
		
		// JSONObject를 소환해서 사용하기 위해
		// 외부에서 라이브러리를 불러 와야 한다.
		// maven repository 사이트에 99% 있다.
		
		// .jar 파일을(라이브러리 파일)
		// 프로젝트 안에서 쓸 수 있도록 하기
		// 프로젝트 마우스 우클릭 - Build Path
		// - Configure Build Path - library 탭
		// - Add Jars 클릭 - 프로젝트 내 library 폴더를 찾아
		// 해당 .jar 파일을 선택해준다.
		
		// 라이브러리 만들기 어렵지 않다
		System.out.println(JYJUtil.weRound(3.2534, 1));
		
		// JSON 객체 만들기
		// HashMap<String, Object>과 사용법 유사
		JSONObject json = new JSONObject();
		
		// HashMap과 사용법 유사
		json.put("name","이수");
		json.put("age",40);
		
		// JSONArray 리스트 생성
		JSONArray songList = new JSONArray();
		songList.add("원러브");
		songList.add("그대가분다");
		songList.add("마이웨이");
		System.out.println(songList);
		
		// JSON에 리스트 넣기
		json.put("노래목록", songList);
		
		System.out.println(json); // 순서 보장 X
		System.out.println(json.toJSONString());
		System.out.println(json.toString());
		
		String jsonStr = json.toJSONString();
		System.out.println(jsonStr);
		
		
		System.out.println("\n========================================\n");
		JSONObject daysix = new JSONObject();
		daysix.put("이름","데이식스");
		daysix.put("노래","좀비");
		json.put("동료",daysix);
		System.out.println(json);
		
		// 값 꺼내보기
		System.out.println(json.get("name"));
		String name = (String) json.get("name"); // Object를 리턴하기때문에 형변환 해줘야함
		System.out.println(name);
		
		int age = (int) json.get("age");
		System.out.println(age);
		
		// 없는 key값을 넣으면 value는 null 찍힘
		JSONArray temp = (JSONArray) json.get("노");
		System.out.println(temp); 
		
		// 리스트 값 출력
		temp = (JSONArray) json.get("노래목록");
		System.out.println(temp); 
		
		System.out.println("\n============================================\n");
		
		// 서버에서 온 JSONString 데이터를 JSONObject 객체로
		// 바꾼 후 키에 대한 값 꺼내기 
		String serverData = "{\"노래목록\":[\"원러브\",\"그대가분다\",\"마이웨이\"],\"동료\":{\"노래\":\"좀비\",\"이름\":\"데이식스\"},\"name\":\"이수\",\"age\":40}";
		System.out.println(serverData);
		
		// JSONParser를 이용해서 파싱
		JSONParser parser = new JSONParser();
		
		JSONObject result = (JSONObject) parser.parse(serverData);
		System.out.println(result);
		
		name = (String) result.get("name");
		System.out.println("name"+name);
		
		// 문자열을 오브젝트로 파싱한거
		// 파싱한 숫자는 long 타입으로 꺼내와야함
		long ageL = (long) result.get("age");
		System.out.println(ageL);
		
		// result로부터 "좀비"꺼내서 출력
		JSONObject dong = (JSONObject) result.get("동료");
		System.out.println(dong);
		String song = (String) dong.get("노래");
		System.out.println(song);
		
		
		
		
	}

}
