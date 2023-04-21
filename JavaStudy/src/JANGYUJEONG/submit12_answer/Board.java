package JANGYUJEONG.submit12_answer;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Board {
	private int no;
	private String title;
	private String content;
	private String date;
	
	
	public Board(String title, String content) {
		BoardDB db = BoardDB.getInstance();
		this.no = db.makeNumber();
		this.title = title;
		this.content = content;
		Date currentTime = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		this.date = sdf.format(currentTime);
	}
	
	
	@Override
	public String toString() {
		return "Board [no=" + no + ", title=" + title + ", content=" + content + ", date=" + date + "]";
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

}
