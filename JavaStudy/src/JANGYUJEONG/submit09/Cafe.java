package JANGYUJEONG.submit09;

import java.util.ArrayList;
import java.util.List;

public class Cafe {
	String cafename;
	List<Coffee> dirinklist = new ArrayList<>();
	
	
	// 생성자
	public Cafe() {};
	
	public Cafe(String cafename) {
		super();
		this.cafename = cafename;
		//this.drinklist = drinklist;
	}
	
	public void addCoffee(Coffee coffee) {
		//this.cafename = cafename;
		dirinklist.add(coffee);
	}
	
	
	// toString
	@Override
	public String toString() {
		return "Cafe [cafename=" + cafename + ", drinklist=" + dirinklist.toString() + "]";
	}
	
	
}
