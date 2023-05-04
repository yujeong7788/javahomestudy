package JANGYUJEONG.submit14.data;

public class Menu {
	private int no; // 게시글 번호
	private String name;    // 요리명
	private String type;	// 종류
	private String parts;	// 재료
	private String manual;  // 조리법
	private String author;
	
	public Menu() {}


	public Menu(int no, String name, String type, String parts, String manual, String author) {
		super();
		this.no = no;
		this.name = name;
		this.type = type;
		this.parts = parts;
		this.manual = manual;
		this.author = author;
	}

	

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Menu [no=" + no + ", name=" + name + ", author=" + author + "]";
	}


	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getParts() {
		return parts;
	}

	public void setParts(String parts) {
		this.parts = parts;
	}

	public String getManual() {
		return manual;
	}

	public void setManual(String manual) {
		this.manual = manual;
	}
	
	public int getNo() {
		return no;
	}
	
	
	public String getAuthor() {
		return author;
	}
	
	
	public void setNo(int no) {
		this.no = no;
	}
	
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
}
