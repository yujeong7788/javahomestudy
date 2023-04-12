package ch09_class.quiz;

import java.util.ArrayList;

public class MovieDB {
	
	private ArrayList<Movie> movieList = new ArrayList<>();
	
	// 싱글톤 패턴
	private MovieDB() {
		movieList.add(new Movie("신세계", "거 죽기 딱 좋은 날씨네", "이정재 황정민 박성웅", "ㅅㅅㄱ"));
		movieList.add(new Movie("타짜", "동작 그만! 밑장빼기냐? 내가 빙다리 핫바지로 보이냐?", "김혜수 조승우", "ㅌㅉ"));
		movieList.add(new Movie("관상", "어찌, 내가 왕이 될 상인가?", "이정재 송강호", "ㄱㅅ"));
		movieList.add(new Movie("극한직업", "지금까지 이런 맛은 없었다. 이것은 갈비인가 통닭인가.", "류승룡 이하늬 진선규 이동휘 공명", "ㄱㅎㅈㅇ"));
		movieList.add(new Movie("엑시트", "따따따 따 따 따 따따따!", "조정석 윤아", "ㅇㅅㅌ"));
		movieList.add(new Movie("세 얼간이", "All is well", "아미르 칸 R.마드하반 샤르만 조시", "ㅅㅇㄱㅇ"));
		movieList.add(new Movie("명량", "신에게는 12척의 배가 남아있습니다.", "최민식 김한민 류승룡 조진웅", "ㅁㄹ"));
		movieList.add(new Movie("베테랑", "야, 우리가 돈이 없지 가오가 없냐?", "유아인 황정민 유해진", "ㅂㅌㄹ"));
		movieList.add(new Movie("아저씨", "아직 한 발 남았다.", "원빈 김새론", "ㅇㅈㅆ"));
		movieList.add(new Movie("킹스맨", "매너가 사람을 만든다.", "태런 에저턴 콜린 퍼스 마크 스트롱", "ㅋㅅㅁ"));
	}
	
	private static MovieDB instance = new MovieDB(); // 변경 위험때문에 막아둠
	
	public static MovieDB getInstance() {
		return instance;
	}
	
	public ArrayList<Movie> getMovieList(){
		return movieList;
	}

}
