package ch13_thread.issac;

public class Issac { // 토스트를 관리
	int toast = 0;
	
	// 싱글톤 적용 (Issac 객체가 하나만 존재하도록)
	private Issac() {}
	
	private static Issac instance = new Issac();
	
	public static Issac getInstance() {
		return instance;
	}
	
	// 토스트 만들기 (Chef 클래스에서 사용)
	public synchronized void makeToast() {
		toast +=1;
		System.out.println("토스트를 하나 만들었습니다.");
		System.out.println("현재 수량: " + toast);
		
		// wait Set에서 대기중인 임의의 스레드를
		// (랜덤) 하나 깨운다.
//		notify();
		
		// 대기중인 모든 스레드를 깨운다.
		notifyAll();
	}
	
	// 토스트 구매 (Customer 클래스에서 사용)
	public synchronized void buyToast(int count, String name) { // synchronized 동기화
		
		// 토스트 수량이 구매하려는 개수보다 작은 경우
		if(toast < count) {
			// 대기
			try {
				// wait()를 실행한 스레드는
				// 다른 스레드에서 notify()로 깨울때까지
				// 대기 상태에 놓인다.
				System.out.println(name + ": 힝..");
				wait();
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			buyToast(count,name); //재귀함수 메소드, 또 실행하도록
		}else {
			toast -= count;
			System.out.println(name + "씨가 토스트를" + count + "개 구매하였습니다.");
		}
	}

}
