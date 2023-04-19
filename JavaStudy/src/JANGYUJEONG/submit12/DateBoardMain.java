package JANGYUJEONG.submit12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;

import ch09_class.nextit.NextStudent;

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

		System.out.println("--------------------궁금한거 찍어보는곳-----------------------");
		System.out.println(dbList.get(2).getDate());
		Date oneDate = sdf.parse(dbList.get(2).getDate());
		long longOneDate = sdf.parse(dbList.get(2).getDate()).getTime();
		System.out.println(longOneDate);
		System.out.println("------------------------------------------------------");
		
            // TODO 코드작성 시작 ~!!
		
		
			// 3. 날짜순 정렬 최신/오래된순
			ArrayList<Long> LongDateList = new ArrayList<Long>();
			
			for(int i = 0; i <dbList.size(); i++) {
				sdf = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
				LongDateList.add(sdf.parse(dbList.get(i).getDate()).getTime());
				dbList.get(i).setLongdate(LongDateList.get(i));
			}
			
			// 오름차순
			for(int k = 0; k < dbList.size() -1 ; k++) {
				for(int i = 0; i < dbList.size() -1; i++) {
					if(dbList.get(i).getLongdate() < dbList.get(i+1).getLongdate()) {
						DateBoard t = dbList.get(i);
						dbList.set(i, dbList.get(i+1));
						dbList.set(i+1, t);
					}
				}
			}
			
			System.out.println("날짜별로 출력(최신순)");
			for(int i = 0; i < dbList.size(); i++) {
				System.out.println(dbList.get(i));
			}
			
			System.out.println("\n===================================\n");
			// 내림차순
			for(int k = 0; k < dbList.size() -1 ; k++) {
				for(int i = 0; i < dbList.size() -1; i++) {
					if(dbList.get(i).getLongdate() > dbList.get(i+1).getLongdate()) {
						DateBoard t = dbList.get(i);
						dbList.set(i, dbList.get(i+1));
						dbList.set(i+1, t);
					}
				}
			}
			System.out.println("날짜별로 출력(오래된순)");
			for(int i = 0; i < dbList.size(); i++) {
				System.out.println(dbList.get(i));
			}

			// 4. dbList에서 최근 한달 내(오늘기준 30일 전까지)로 작성된 게시글만 출력해주세요.
			
			
			

	}

}
