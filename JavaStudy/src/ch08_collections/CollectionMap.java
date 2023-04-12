package ch08_collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionMap {

	public static void main(String[] args) {
		// 맵(HashMap)의 선언
		// key와 value의 한쌍인 데이터를 저장
		HashMap<String, String> stuMap = new HashMap<>();
		
		
		// 다형성 이용
		Map<String, Integer> coinMap = new HashMap<>();
		
		// .put(key, value)
		// 데이터 추가
		stuMap.put("첫째", "예슬");
		stuMap.put("둘째", "종현");
		stuMap.put("셋째", "서영");
		
		// 순서 보장 X
		System.out.println(stuMap);
		
		// 중복된 Key값을 허용하지 않는다.
		// 중복된 Key값을 추가하게 되면 기존 Value를 덮어쓴다.
		// (Key에 대한 Value를 수정하는 경우 put을 이용)
		stuMap.put("첫째", "경호"); // 똑같은 키가 존재한다면 덮어씌움
		System.out.println(stuMap);
		
		coinMap.put("비트코인",36000000);
		coinMap.put("도지코인",123);
		System.out.println(coinMap);
		
		// .get(key)
		// key에 대한 value를 리턴
		System.out.println(stuMap.get("첫째"));
		// 존재하지 않는 key값을 입력하면 => null
		System.out.println(stuMap.get(10));
		System.out.println(stuMap.get("넷째"));
		
		// .size()
		// Map 내 데이터의 수 리턴
		System.out.println(stuMap.size());
		
		// .containsKey(값)
		// Map 안에 있는 키(key) 중에 괄호 안 값이
		// 있다면 true, 없으면 false
		System.out.println(stuMap.containsKey("첫째"));
		
		// .containsValue(값)
		// Map 안에 있는 값(Value) 중에 괄호 안 값이
		// 있다면 true, 없으면 false
		System.out.println(stuMap.containsValue("종현"));
		
		// .remove(key)
		// 괄호 안 key값에 대한 데이터 삭제
		coinMap.remove("도지코인");
		System.out.println(coinMap);
		
		System.out.println("\n======================================\n");
		
		// Map 순회
		// 1. keySet 이용
		Set<String> keySet = stuMap.keySet();
		System.out.println("stuMap :" + stuMap);
		System.out.println("keySet : " +keySet);
		
		// 향상된 for문으로 set순회
		for(String key : keySet) {
			System.out.println("키: " + key);
			System.out.println("값: " + stuMap.get(key));
		}
		
		// 2. EntrySet 이용
		stuMap.entrySet();
		Set< Entry<String,String> > entrySet = stuMap.entrySet();
		
		// 향상된 for문 사용
		for(Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		// 3. forEach (람다식)
		stuMap.forEach((key,value)->System.out.println(key + ":"+value));
		
		
		
		}

}
