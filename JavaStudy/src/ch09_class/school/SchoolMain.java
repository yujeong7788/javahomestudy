package ch09_class.school;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import ch09_class.commons.UtillClass;

public class SchoolMain {

	public static void main(String[] args) {
		// 국어, 영어, 수학, 평균 점수를 가지는 학생 객체
		Student yesl = new Student("예슬",85,80,87);
		
		System.out.println(yesl);
		
		// 캡슐화 적용
		System.out.println(yesl); // 같은 폴더 내에 있는 클래스라면 private만 아니면 다 접근가능
		
		// avg에 대한 Setter를 지워서 평균은 수정할 수 없도록 함
//		yesl.setAvg(100);
		System.out.println(yesl);
		
		System.out.println(yesl.getKor());
		System.out.println(yesl.getAvg());
		
		// 국어 점수 바꾸기
		yesl.setKor(93);
		System.out.println(yesl);
		
		
		System.out.println("\n===========================\n");
		
		Student hyera = new Student("혜라", 90,80,87, UtillClass.weRound((90+80+87)/3.0, 1));
		System.out.println(hyera);
		
		hyera.setEng(86);
		System.out.println(hyera);
		
		
		// 평균을 넣지 않아도 적용되도록 생성자 추가
		Student yujeong = new Student("유정",92,92,78);
		System.out.println(yujeong);
		
		yujeong.setEng(83);
		System.out.println(yujeong);
		
		System.out.println("\n============================\n");
		
		ArrayList<Student> stuList = new ArrayList<>();
		
		stuList.add(yesl);
		stuList.add(hyera);
		stuList.add(yujeong);
		stuList.add(new Student("준호", 80, 82, 77));
		stuList.add(new Student("동욱", 80, 92, 78));
		
		for(int i = 0; i < stuList.size(); i++) {
			System.out.println(stuList.get(i));
		}
		
		System.out.println("\n============================\n");
		
		// 학생들의 평균을 이용해서
		// 1등. [혜라, 국어: 90, 영어: 86, 수학: 87, 평균: 87.7]
		// 2등. 예슬
		// 이런식으로 출력되도록

		for(int k = 0; k < stuList.size() -1 ; k++) {
			for(int i = 0; i < stuList.size() -1; i++) {
				if(stuList.get(i).getAvg() < stuList.get(i+1).getAvg()) { //private여서 avg 하면 안됨
					Student t = stuList.get(i);
					stuList.set(i, stuList.get(i+1));
					stuList.set(i+1, t);
				}
			}
		}
		
		for(int i = 0; i < stuList.size(); i++) {
			System.out.println((i+1)+"등. "+stuList.get(i));
		}
		
		System.out.println("\n=====================================\n");
		
		// Collections.sort()
//		Collections.sort(stuList,(stuA, stuB) -> stuA.getAvg() - stuB.getAvg());
//		Collections.sort(stuList, new Comparator<T>() {
//
//			@Override
//			public int compare(T o1, T o2) {
//				return 0;
//			}
//			
//		});
		Collections.sort(stuList, new Comparator<Student>(){
			@Override
			public int compare(Student stuA, Student stuB){
				double diff = stuB.getAvg() - stuA.getAvg();
				// 양의 소수, 음의 소수
				if(diff < 0) {
					// 음의 정수
					return -1;
				}
				return 1;
			}
		});
		
		
		
		Collections.sort(stuList,(stuA,stuB) -> (stuB.getAvg() - stuA.getAvg()>0) ? (1) : (-1));
		
		
		
		for(int i = 0; i < stuList.size(); i++) {
			System.out.println((i+1)+"등. "+stuList.get(i));
		}
		
		
		
	}

}
