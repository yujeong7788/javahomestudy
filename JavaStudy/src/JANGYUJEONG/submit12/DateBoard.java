package JANGYUJEONG.submit12;

public class DateBoard {
	private String title;
	private String date;
	private long longdate;
	
	public DateBoard(String title, String date) {
		this.title = title;
		this.date = date;
		this.longdate = 0;
	}
	
	
	@Override
	public String toString() {
		return "DateBoard [title=" + title + ", date=" + date + "]";
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
	public void setDate(long date) {
		
	}


	public long getLongdate() {
		return longdate;
	}


	public void setLongdate(long longdate) {
		this.longdate = longdate;
	}

	
}
