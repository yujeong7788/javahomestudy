package JANGYUJEONG.submit09;

import java.util.ArrayList;
import java.util.Scanner;

public class Cafe_answer { 
	private String name;
	private ArrayList<Coffee> menuList = new ArrayList<>();
	
	
	public Cafe_answer(String name, ArrayList<Coffee> menuList) {
		super();
		this.name = name;
		this.menuList = menuList;
	}
	
	public Cafe_answer(String name) {
		this.name = name;
//		menuList = new ArrayList<>();
	}
	public Cafe_answer(String name2, int i) {
	}

	// 커피 메뉴를 추가한다
	public void addCoffee(Coffee cafe_answer) {
		menuList.add(cafe_answer);
		
	}
	
	// 메뉴판을 출력하는 메소드
	public void showMenu() {
		for(int i = 0; i < menuList.size(); i++) {
			System.out.println((i+1)+"."+menuList.get(i));
		}
	}
	
	// 커피 구매 메소드
	public void buyCoffee(Scanner sc);{
		
		System.out.print("메뉴를 선택해주세요 : ");
		
		int choice = Integer.parseInt(sc.nextLine());
		
		System.out.println(menuList.get(choice - 1).getName()+"를"+ menuList.get(choice - 1).getPrice()+"원에 구입했습니다." );

	}
	
	@Override
	public String toString() {
		return "Cafe_answer [name=" + name + ", menuList=" + menuList + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Coffee> getMenuList() {
		return menuList;
	}
	public void setMenuList(ArrayList<Coffee> menuList) {
		this.menuList = menuList;
	}

	

}
