package JANGYUJEONG.submit12_answer.no2;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;

public class DateBoardMain {

	public static void main(String[] args) throws ParseException {
            // dbList에 랜덤 날짜를 가지는 DateBoard 객체 100개 삽입
		ArrayList<DateBoard> dbList = new ArrayList<DateBoard>();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");

		for(int i = 0; i < 100; i++) {
			int randDay = (int)(Math.random() * 365) + 1;		// 1~365	
			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.DATE, randDay * -1);
					
			String strDate = sdf.format(cal.getTime());
			dbList.add(new DateBoard((i+1) + "번째 생성된 글", strDate));
		}
				
		for(int i = 0; i < dbList.size(); i++) {
			System.out.println(dbList.get(i));
		}

        // TODO 코드작성 시작 ~!!
		// 날짜정렬
		// 1. 버블정렬
//		for(int k = 0; k < dbList.size() -1 ; k++) {
//					
//			for(int i = 0; i < dbList.size() -1; i++) {
//				// 날짜 비교
//				// String  date
//				// 2023.02.21 12:34:56 -> Date 객체 with sdf.parser
//				
//				Date left = sdf.parse(dbList.get(i).getDate());
//				Date right = sdf.parse(dbList.get(i+1).getDate());
//				
//				if(left.getTime() > right.getTime()) {
//					DateBoard t = dbList.get(i);
//					dbList.get(i) = dbList.get(i+1);
//					dbList.get(i+1) = t;
//				}
//				
//			}
//			
//		}
//		
//		System.out.println("\n==============================================\n");
//		
//		Collections.sort(dbList, (dbA, dbB) ->{
//			//dbA == dbList.get(i) dbB == dbList.get(i+1)
//			Date left = sdf.parse(dbA.getDate());
//			Date right = sdf.parse(dbB.getDate());
//		});
//		
//		Collections.sort(dbList, new Comparator<DateBoard>() {
//			
//			@Override
//			public int compare(DateBoard dbA, DateBoard dbB) {
//				int result = 1;
//				try {
//					Date left = sdf.parse(dbA.getDate());
//					Date right = sdf.parse(dbA.getDate());
//					
//					if(left.getTime() - right.getTime()<0) {
//						result = -1;
//					}
//				} catch (Exception e) {
//					// TODO: handle exception
//					e.printStackTrace();
//				}
//				return result;
//			}
//		});
		
		System.out.println("\n==============================================\n");
		
		Calendar cal = Calendar.getInstance();
		
		// 한달 전 날짜로 세팅
		cal.add(Calendar.MONTH, -1);
//		cal.add(Calendar.DATE, -30);
		
		// 한달전 날짜 밀리초를 담은것
		Date today = new Date();
		long diff = today.getTime() - (1000*60*60*24*30L);
		
		for(int i = 0; i < dbList.size(); i++) {
			Date temp = sdf.parse(dbList.get(i).getDate()); //dbList.get(i).getDate() => string
			
			// temp를 밀리초로 나타낸 것이
			// 한달 전 날짜를 밀리초로 나태낸 것보다 크면
			// 최근 한달 내 데이터를 의미한다
			if(temp.getTime() > cal.getTime().getTime()) {
				System.out.println(dbList.get(i));
			}
		}
		
		System.out.println("\n====================================================\n");
		// 이번달 게시글
		Calendar toMonth = Calendar.getInstance();
		
		int year = toMonth.get(Calendar.YEAR);
		int month = toMonth.get(Calendar.MONTH);
		
//		System.out.println(year);
//		System.out.println(month);
		
		for(int i = 0; i < dbList.size(); i++) {
			Date temp = sdf.parse(dbList.get(i).getDate());
			Calendar tempCal = Calendar.getInstance();
			tempCal.setTime(temp);
			
			int tempYear = tempCal.get(Calendar.YEAR);
			int tempMonth = tempCal.get(Calendar.MONTH);
			
			if(year == tempYear && month == tempMonth) {
				System.out.println(dbList.get(i));
			}
		}
		
		
		
		
		
	}

}
