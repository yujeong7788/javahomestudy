package JANGYUJEONG.submit12;

public class AudioBoard extends BoardUnit{
//필드 변수: 글 번호, 글 제목, 글 게시일(String), 글 내용, 오디오 파일(String)
	private String audio;

	public AudioBoard() {
		super();
		
	}

	public String getAudio() {
		return audio;
	}

	public void setAudio(String audio) {
		this.audio = audio;
	}

	public AudioBoard(int no, String title, String date, String content, String audio) {
		super(no, title, date, content);
		this.audio = audio;
	}


}
