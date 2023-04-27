package ch14_jdbc_jsp.vo;

public class wordgameVO {
	private String words;
	
	public wordgameVO() {}

	public wordgameVO(String words) {
		super();
		this.words = words;
	}

	@Override
	public String toString() {
		return "wordgameVO [words=" + words + "]";
	}

	public String getWords() {
		return words;
	}

	public void setWords(String words) {
		this.words = words;
	}
	

}
