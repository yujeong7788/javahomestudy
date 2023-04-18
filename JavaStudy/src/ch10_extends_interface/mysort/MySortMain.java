package ch10_extends_interface.mysort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import ch09_class.school.Student;

public class MySortMain {

	public static void main(String[] args) {
		ArrayList<Student> stuList = new ArrayList<>();
		
		stuList.add(new Student("준호", 90, 82, 77));
		stuList.add(new Student("동욱", 80, 92, 78));
		stuList.add(new Student("유정", 80, 82, 68));
		stuList.add(new Student("혜라", 90, 88, 79));
		stuList.add(new Student("현진", 81, 89, 87));
		stuList.add(new Student("민경", 82, 91, 75));
		
		// 콜백함수
		// 인터페이스(Comparator)의 추상메소드(compare)를  미리 다른 메소드(sort)
		// 미리 다른 메소드(sort)에서 사용하고,
		// 추상메소드(compare)의 구현은 해당 메소드(sort)를
		// 실행하는 쪽에서 구현한다.
		Collections.sort(stuList, new Comparator<Student>() { // 어떤 객체 t 두개가 들어오면 두개를 비교해라
// new , ctrl + space comparator
		
			@Override
			public int compare(Student stuA, Student stuB) {
				double diff = stuA.getAvg()-stuB.getAvg();
				return (diff < 0) ? 1 : -1 ;
			}
		});
		
		
		Collections.sort(stuList,(stuA, stuB) ->
			(stuA.getAvg()-stuB.getAvg() < 0) ? 1 : -1 
		);
		
		
		for(int i = 0; i < stuList.size(); i++) {
			System.out.println((i+1)+"등."+stuList.get(i));
		}
		
		MyCollections.mySort(stuList,new MyComparator<Student>() {
			@Override
			public boolean myCompare(Student stuA, Student stuB) {
				return stuA.getAvg() < stuB.getAvg();
			}
		});
		
		MyCollections.mySort(stuList, (stuA,stuB) -> stuA.getAvg() < stuB.getAvg()); // 파라미터 stuA,stuB에 대해서 -> 리턴값
		
		for(int i = 0; i < stuList.size(); i++) {
			System.out.println((i+1)+"등."+stuList.get(i));
		}
	}

}
