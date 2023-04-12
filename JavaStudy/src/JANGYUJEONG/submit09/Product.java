package JANGYUJEONG.submit09;

public class Product {

	//Q01 
	/*하이마트에 놀러갔더니 전자제품들이 정말 많이 있군요.
	 *  전자제품들은 각각 제품명과 가격이 함께 전시되어있습니다. 
	 *  이를 코드로 구현하기 위해, 필드 변수에 제품명과 가격을 포함하는
	 *   전자제품 클래스(Product)를 만들어보세요.
	 *   (당연히 제품명과 가격을 입력받는 생성자를 포함하며,
	 *    필드 변수들은 캡슐화를 해야 겠죠?)
	 * */
	
	//1. 필드 변수 선언
	private String name;
	private int price;
	

	//2. 생성자
	//기본
	public Product(){};
	
	//입력
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}




	// toStirng
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}

	
	///??
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	

}
