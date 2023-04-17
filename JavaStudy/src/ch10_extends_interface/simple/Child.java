package ch10_extends_interface.simple;

// Child는 Parent가 가진 필드변수, 메소드를 가지고 있는 상태
// private으로 되어있는건 자식 객체에서 접근할 수 없다.
public class Child extends Parent{ // Parent 클래스를 상속받는다. extends (상속받을 클래스명)
	
	@Override
	public void sayHello() {
		System.out.println("응애");
	} // Parent 클래스 내의 메소드를 재정의  // @ : 어노테이션
	
	
	
	public Child() {
		super();
		
	}



	public Child(String name, int age) {
		super(name, age);
		
	}



	@Override
	public String toString() {
		return "Child [getName()=" + super.getName() + ", getAge()=" + getAge() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	// super.getName : 부모의 getName을 실행해줘, 굳이 super 안써도 되긴함
	
	
	
}
