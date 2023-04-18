package ch10_extends_interface.simple;

public class SimpleMain {

	public static void main(String[] args) {
		Parent papa = new Parent("아빠",50);
		System.out.println(papa);
		
		//Object --> 클래스확인용
		
		Child baby = new Child();
		Parent parent = (Parent)baby; // 자동 형변환 하며 Parent에 담은것
		System.out.println(baby);
		
		// Parent가 가진 것 모두 가짐, private에는 접근 불가
		baby.setName("아기");
		baby.setAge(3);
		baby.sayHello();
		//baby.name() 사용 불가 private이기 때문
		
		System.out.println(baby);
		
		// 다형성
		// (면접, 정처기 문제에 자주 출제)
		Parent nami = new Child("나미",17); // 본체는 -> Child
		
		System.out.println(nami);
		System.out.println(nami.getClass());
		nami.sayHello();
		
		
		
	}

}
