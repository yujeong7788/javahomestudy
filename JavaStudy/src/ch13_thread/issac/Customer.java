package ch13_thread.issac;

public class Customer extends Thread{
	private Issac issac = Issac.getInstance();
	private int count;
	private String name;
	
	public Customer(int count, String name) {
		this.count = count;
		this.name = name;
	}
	
	@Override // run + Ctrl + sapce
	public void run() {
		issac.buyToast(count,name);
	}
}
