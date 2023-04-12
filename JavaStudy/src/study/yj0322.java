package study;

public class yj0322 {

	public static void main(String[] args) {
	String ship = "배";
	String pear = "배";
	String bae = new String("배");
	
	System.out.println(ship == pear);
	System.out.println(ship == bae);
	System.out.println(ship.equals(bae)); 
	
	System.out.println("\n=====================\n");
	
	// 예시
	// 서버에서 데이터를 가져오는데 문제가 생기면
	// null(참조타입X) 값으로 넘어온다.
	// 데이터를 받아오는 쪽에서 null 체크
	String serverData = null;
	System.out.println(serverData != null);
	
	
	
	// 사용자의 입력을 가지고 왔더니
	// 입력하지 않은 데이터가 empty로 온다.
	String inputData = "";
	System.out.println(inputData.equals(""));
	System.out.println(inputData.length() == 0);
	System.out.println(inputData.isEmpty());

	}

}
