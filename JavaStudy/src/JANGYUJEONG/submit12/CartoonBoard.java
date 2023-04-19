package JANGYUJEONG.submit12;

public class CartoonBoard extends BoardUnit{
	private String image;
	
	

	public String getImage() {
		return image;
	}



	public void setImage(String image) {
		this.image = image;
	}



	public CartoonBoard(int no, String title, String date, String content) {
		super(no, title, date, content);
		
	}



	public CartoonBoard() {
		super();
		
	}
	
	
}
