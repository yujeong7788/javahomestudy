package ch10_extends_interface.ramen;

public class Jjappagheti extends Ramen{
	
	public Jjappagheti() {}
	
	public Jjappagheti(String name, int price) {
		super(name,price);
	}
	
	
	// Override 안써도 메소드명이 같아서 자동 연결되지만 쓰는게 좋음
	@Override
	public void printRecipe() {
		System.out.println("끓는 물에 면을 삶은 후 물은 버리고 스프를 넣어 드세요");
	}

}
