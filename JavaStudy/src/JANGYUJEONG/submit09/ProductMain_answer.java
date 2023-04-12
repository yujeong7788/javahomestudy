package JANGYUJEONG.submit09;

import java.util.ArrayList;
import java.util.Collections;

public class ProductMain_answer {

	public static void main(String[] args) {
		// Q.01 전자제품
		// 변수명적을때 카멜식 규칙 잘 지키기
		
		Product ref = new Product("냉장고",2000000); // 101)
		Product tv = new Product("TV",1000000);
		Product air = new Product("에어컨",800000);
		Product com = new Product("컴퓨터",1300000);
		Product fan = new Product("선풍기",100000);
		
		ArrayList<Product> prodList = new ArrayList<>();
		prodList.add(ref);
		prodList.add(tv);
		prodList.add(air);
		prodList.add(com);
		prodList.add(fan);
		
		// 버블정렬 , Collections.sort(prodList, (prodA,prodB) -> prodA.getPrice()-prodB.getPrice())
		Collections.sort(prodList, (prodA,prodB) -> prodA.getPrice()-prodB.getPrice());
		
		for(int i =0; i <prodList.size(); i++) {
			System.out.println(prodList.get(i));
		}
		
		// 몇번째 인덱스?
		// indexOf()
		// ArrayList<String> ramen = ["신라면","안성탕면","진라면"]
		// ArrayList<Integer> number = [10,20,30]
		// rame.indexOf("안성탕면") = 1
		// 객체 덩어리 들어있음
		// ArrayList<Product> prodList = [Product객체(냉장고), Product객체(TV),...]
		// prodList.indexOf("TV") TV와 일치하는 것 없음! 객체는 객체
		// prodList.indexOf(new Product("냉장고",2000000))); 주소값이 다름 인덱스 오브가 캐치 못함 새로운 객체 생성된것임
		// prodList.indexOf(ref) 이렇게는 됨
		
		for(int i = 0; i < prodList.size(); i++) {
			if(prodList.get(i).getName().equals("TV")) {
				System.out.println(i);
			}
		}
		
		
		
		

	}

}
