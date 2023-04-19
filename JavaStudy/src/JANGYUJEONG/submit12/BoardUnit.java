package JANGYUJEONG.submit12;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BoardUnit {
	//필드 변수: 글 번호, 글 제목, 글 게시일(String), 글 내용
	private int no = 0;
	private String title;
	private String date;
	private String content;
	
	
	public BoardUnit() {}
	
	
	public BoardUnit(int no, String title, String date, String content) {
		super();
		this.no = no;
		this.title = title;
		this.date = date;
		this.content = content;
	}

	
	@Override
	public String toString() {
		return "[" + no + "." + " | " + title + " | " + date + "]";
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	

}
