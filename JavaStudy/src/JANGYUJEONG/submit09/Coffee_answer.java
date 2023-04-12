package JANGYUJEONG.submit09;

public class Coffee_answer {
	private String name;
	private int price;
	
	public Coffee_answer() {}

	public Coffee_answer(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return  name + "," + price ;
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
	}

	
	
}
