package JANGYUJEONG.submit13.vo;

public class BoardVO {
	private int boardNo;
	private String boardTitle;
	private String boardContent;
	private String boardAuthor;
	private String boardDate;
	
	public BoardVO() {}
	
	public BoardVO(int boardNo, String boardTitle, String boardContent, String boardAuthor, String boardDate) {
		super();
		this.boardNo = boardNo;
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		this.boardAuthor = boardAuthor;
		this.boardDate = boardDate;
	}
	
	
	@Override
	public String toString() {
		return "[" + boardNo + ". | " + boardTitle + " | " +
				 boardAuthor + " | " + boardDate + "]";
	}
	
	
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public String getBoardAuthor() {
		return boardAuthor;
	}
	public void setBoardAuthor(String boardAuthor) {
		this.boardAuthor = boardAuthor;
	}
	public String getBoardDate() {
		return boardDate;
	}
	public void setBoardDate(String boardDate) {
		this.boardDate = boardDate;
	}
	
	
}
