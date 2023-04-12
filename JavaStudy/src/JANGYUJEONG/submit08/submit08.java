package JANGYUJEONG.submit08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class submit08 {

	public static void main(String[] args) {
		
		// Q01 makeLotto를 ArrayList와 HashSet을 이용해서 만들어보세요
		// Hint
		// 먼저 빈 HashSet을 하나 만들고, while문 내에서 
		// 빈 HashSet에 랜덤 로또 번호를 HashSet의 사이즈가 6개가 될 때까지 넣는다.
		// 이후 HashSet을 ArrayList로 변환한 다음, 오름차순으로 ArrayList를 정렬하여 리턴한다.
		ArrayList<Integer> myLotto = makeLotto();
		System.out.println(myLotto);
		
		System.out.println("\n=============Q02================\n");
		
		/*
		 * infoMap의 Key는 사용자의 아이디, 
		 * Value는 사용자의 비밀번호라고 했을 때 아래와 같이 데이터를 추가해주세요.
			
			HashMap<String, String> infoMap = new HashMap<>();
					
			infoMap.put("a001", "1234a");
			infoMap.put("b001", "1234b");
			infoMap.put("c001", "1234c");
			infoMap.put("d001", "1234d");
			infoMap.put("e001", "1234e");
			
			
			사용자가 아이디와 비밀번호를 파라미터로 넣었을때, 
			infoMap의 Key(아이디)와 Value(비밀번호)와 비교하여
			
			아이디와 비밀번호가 infoMap 내에 존재하는 데이터와 일치하면 로그인 성공 출력
			아이디가 존재하지 않으면, 존재하지 않는 아이디입니다. 출력 
			아이디는 존재하지만 비밀번호가 일치하지 않으면 비밀번호가 틀렸습니다. 출력
		 */
		
		HashMap<String, String> infoMap = new HashMap<>();
		
		infoMap.put("a001", "1234a");
		infoMap.put("b001", "1234b");
		infoMap.put("c001", "1234c");
		infoMap.put("d001", "1234d");
		infoMap.put("e001", "1234e");
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("아이디를 입력해주세요");
			System.out.println(">>>");
			String id = scan.nextLine();
			
			System.out.println("비밀번호를 입력해주세요");
			System.out.println(">>>");
			String pw = scan.nextLine();
			
			
			// 아이디 키값 같은지 확인
				if(infoMap.containsKey(id)) {
					// 아이디 이거일때 비밀번호 맞는지 확인
					// 키와 값 일치하는지 확인
					String pwVal = infoMap.get(id);
					if(pwVal.equals(pw)){
						System.out.println("로그인 성공");
						break;
					}else {
						System.out.println("비밀번호가 틀렸습니다.");
						break;
					}
					
				}else {
					System.out.println("존재하지않는 아이디입니다.");
					break;
				}
			
		}
		
		
		
		
		
	} // main 끝
	
	public static ArrayList<Integer> makeLotto() {
		HashSet<Integer> HashSet = new HashSet<>();
		int idx = 0;
		outer: while(true) {
			HashSet.add((int)(Math.random()*45) + 1);
			if(HashSet.size() == 6) {
				break;
			}
			
		}
		// 리스트로 옮기기
		ArrayList<Integer> result = new ArrayList<>();
		result.addAll(HashSet);
		Collections.sort(result);
		return result;
	}

}
