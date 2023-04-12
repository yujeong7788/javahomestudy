package JANGYUJEONG.submit09;

import java.util.ArrayList;

import ch09_class.nextit.NextStudent;
import ch09_class.school.Student;

public class submit09Main {
	
	public static void main(String[] args) {
		//Q01 
		/*하이마트에 놀러갔더니 전자제품들이 정말 많이 있군요.
		 *  전자제품들은 각각 제품명과 가격이 함께 전시되어있습니다. 
		 *  이를 코드로 구현하기 위해, 필드 변수에 제품명과 가격을 포함하는
		 *   전자제품 클래스(Product)를 만들어보세요.
		 *   (당연히 제품명과 가격을 입력받는 생성자를 포함하며,
		 *    필드 변수들은 캡슐화를 해야 겠죠?)
		 * */
		
		ArrayList<Product> productList = new ArrayList<>();
		productList.add(new Product("냉장고",2000000));
		productList.add(new Product("TV",1000000));
		productList.add(new Product("에어컨",800000));
		productList.add(new Product("컴퓨터",1300000));
		productList.add(new Product("선풍기",100000));

		
		// 가격별로 정렬하여 출력
		for(int k = 0; k < productList.size() -1 ; k++) {
			for(int i = 0; i < productList.size() -1; i++) {
				if(productList.get(i).getPrice() > productList.get(i+1).getPrice()) { 
					Product t = productList.get(i);
					productList.set(i, productList.get(i+1));
					productList.set(i+1, t);
				}
			}
		}
		for(int i = 0; i < productList.size(); i++) {
			System.out.println(productList.get(i));
		}
		
		
		// TV가 몇번째 인덱스인지 찾아서 출력
		for(int i = 0; i < productList.size(); i++) {
			if(productList.get(i).getName().equals("TV")) {
				System.out.println(i);
			}
		}
		
		/*
		 * 카페에 방문해서 커피를 구매하는 프로그램을 만들어봅시다. 
		 * 
		 * 각각의 커피음료 객체를 대표할 수 있는 Coffee 클래스를 생성해주시고 
			(필드변수에는 음료이름과 음료가격이 들어갑니다)
			
			카페별로 다른 메뉴판을 가지도록 하는 Cafe 클래스 또한 생성해주세요
			(필드변수에는 카페이름과 음료리스트가 들어갑니다).
			(음료리스트 : ArrayList<Coffee> )
			
			이후 스타벅스와 꽁떼를 만드신 후 각자 좋아하는 음료를 추가해주세요.
		 */
		
		
		
		
	}// main 끝

}
