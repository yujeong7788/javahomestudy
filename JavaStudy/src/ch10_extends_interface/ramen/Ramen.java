package ch10_extends_interface.ramen;

// 추상메소드를 한개라도 가지고 있으면 추상클래스라고 선언해줘야함
public abstract class Ramen {
	String name;
	int price;
	
	public Ramen() {}
	
	public Ramen(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	// 추상메소드
	public abstract void printRecipe();

}
