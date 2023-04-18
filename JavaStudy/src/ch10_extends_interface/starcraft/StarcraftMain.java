package ch10_extends_interface.starcraft;

import java.util.ArrayList;

public class StarcraftMain {

	public static void main(String[] args) {
		
		Marine marine = new Marine();
		System.out.println(marine);
		
		marine.move(100,200);
		marine.stimpack();
		System.out.println(marine);
		
		Marine marine2 = new Marine();
		System.out.println(marine2);
		
		Zealot zealot = new Zealot();
		System.out.println(zealot);
		
		zealot.move(10,5);
		
		Zealot zealot2 = new Zealot();
		Zealot zealot3 = new Zealot();
		Zealot zealot4 = new Zealot();
		Zealot zealot5 = new Zealot();
		Zealot zealot6 = new Zealot();
		
		// 질럿을 드래그로 선택 후  한번에 이동명령 내리기
		ArrayList<Zealot> protossList = new ArrayList<>();
		
		protossList.add(zealot);
		protossList.add(zealot2);
		protossList.add(zealot3);
		protossList.add(zealot4);
		protossList.add(zealot5);
		protossList.add(zealot6);
		
		for(int i = 0; i <protossList.size(); i++) {
			protossList.get(i).move(50, 70);
		}
		
		HightTemplar highTemplar = new HightTemplar();
		
		highTemplar.tthunderStorm();
		
		//하이템플러도 같이 드래그해서 이동시키고 싶으나
		//ArrayList<Zealot>에 담기지 않는다.
//		protossList.add(highTemplar);
		
		// 이럴때 사용하는게 다형성!!
		// 다형성(Polymorphism)
		// 하나의 객체가 여러 타입을 가질 수 있는 것
		// 자식 객체에서 부모 객체로 형변환 가능
		StarUnit highTemplar2 = new HightTemplar();
		// 자식에서 부모로의 형변환은 자동 형변환이 된다. 따로 괄호 필요없음!
		StarUnit highTemplar1 = highTemplar;
		
		Object obj = highTemplar2;
		Object temp = new Zealot();
		
		ArrayList<StarUnit> starList = new ArrayList<>();
		
		// starList는 StarUnit의 자식 객체들을 다 담을 수 있다.
		// 담기면서 자동형변환 되어 담김
		starList.add(zealot);
		starList.add(zealot2);
		starList.add(zealot3);
		starList.add(zealot4);
		starList.add(highTemplar);
		starList.add(highTemplar2);
		starList.add(marine);
		starList.add(marine2);
		
		for(int i = 0; i < starList.size(); i++) {
			starList.get(i).move(100, 150);
		}
		
		marine.attack(zealot6);
		System.out.println(zealot6);
		
		marine.attack(highTemplar2);
		System.out.println(highTemplar2);
		
		zealot.attack(marine2);
		System.out.println(marine2);
		
		System.out.println("\n===============================================================\n");
		
		// 사용불가 highTemplar(자식)이 StarUnit(부모)으로 형변환 되었기때문
		// 부모가 가지고 있지 않은 메소드 사용 불가
//		starList.get(4).tthunderStorm();
		
		// 자식 -> 부모 상태인 객체를
		// 부모 -> 자식 형변환 한 후 자식의 메소드 사용
		// 부모 -> 자식 자동 형변환 안됨 
		HightTemplar welcome = (HightTemplar)starList.get(4);
		welcome.tthunderStorm();
		
		// 형변환에 우선순위 주고 메소드 사용
		((HightTemplar)starList.get(4)).tthunderStorm();
		
		System.out.println("\n===============================================================\n");
		
		// 하이템플러 -> 스타유닛 -> 하이템플러 (O)
		// 하이템플러 -> 스타유닛 -> 질럿, 마린(x)
//		((HightTemplar)starList.get(1)).tthunderStorm();
		
		// for문을 돌려서 이 객체가 원래는 하이템플러였다면
		// 썬더스톰을 쓰도록 하기
		for(int i = 0; i<starList.size(); i ++) {
			if(starList.get(i).getName().equals("하이템플러")) {
				((HightTemplar)starList.get(i)).tthunderStorm();
			}
			
			// 객체 instanceof 클래스
			// 좌측의 객체가 우측의 클래스로 형변환이
			// 가능하다면 true, 불가능하면 false 리턴
			if(starList.get(i) instanceof HightTemplar) {
				((HightTemplar)starList.get(i)).tthunderStorm();
			}
			
		}
		
		System.out.println("\n===============================================================\n");
		
		// 마린이면 stimpack() 쓰기
		for(int i = 0; i<starList.size(); i ++) {
			if(starList.get(i) instanceof Marine) {
				((Marine)starList.get(i)).stimpack();
			}
		}
		
		// 부모 객체
		StarUnit scv = new StarUnit("SCV",5,60,0);
		
		// 일반적으로 부모 객체는 자식 객체로 형변환 할 수 없다.
		System.out.println(scv instanceof Zealot); // false
		
		// 자식 객체는 부모 객체로 형변환이 가능하다.
		System.out.println(zealot instanceof StarUnit); // true
		
		// 부모 객체에서 자식 객체로 형변환 하는 경우는
		// 부모 객체로 형변환 되었던 자식 객체
		// 다시 자식 타입으로 형변환이 가능하다.
		System.out.println(starList.get(0) instanceof Zealot); // true
	}

}
