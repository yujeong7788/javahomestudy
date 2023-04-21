package JANGYUJEONG.submit12_answer;

public class CartoonBoard extends Board{

	private String img;
	
	
	
//	public CartoonBoard() {
//		super();
//	}

	
	public CartoonBoard(String title, String content) {
		super(title, content);
		this.img = img;
	}


	@Override
	public String toString() {
		return super.toString() + "[img=" + img + "]";
	}



	public String getImg() {
		return img;
	}



	public void setImg(String img) {
		this.img = img;
	}




}
