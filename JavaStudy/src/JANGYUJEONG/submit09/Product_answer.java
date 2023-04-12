package JANGYUJEONG.submit09;

public class Product_answer {
	private String name;
	private int price;
	
	public Product_answer() {}
	
	
	
	
	

	public Product_answer(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}






	@Override
	public String toString() {
		return "Product_answer [name=" + name + ", price=" + price + "]";
	}






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
	};
	

}
