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
			System.out.println("\n===================================\n");
			
			Date today = new Date(); //오늘
			String strToday = sdf.format(today);
			Date todayDate = sdf.parse(strToday);
			long longToday = todayDate.getTime();
			
			System.out.println("최근 한달 내 게시글");
			for(int i = 0; i < dbList.size(); i++) {
				if((longToday - dbList.get(i).getLongdate())/(1000*60*60*24) < 30) {
					System.out.println(dbList.get(i));
				}
			}
			
			// 5.dbList에서 이번달에 작성된 게시글만 출력해주세요. 
			Calendar firstThisMonth = Calendar.getInstance();
			firstThisMonth.set(firstThisMonth.get(Calendar.YEAR),firstThisMonth.get(Calendar.MONTH),firstThisMonth.getActualMinimum(Calendar.DAY_OF_MONTH));
			Date ftm = firstThisMonth.getTime();
			String strFTM = sdf.format(ftm);
			Date strFTMDate = sdf.parse(strFTM);
//			System.out.println(strFTMDate.getTime());
			
			Calendar lastThisMonth = Calendar.getInstance();
			lastThisMonth.set(lastThisMonth.get(Calendar.YEAR),lastThisMonth.get(Calendar.MONTH),lastThisMonth.getActualMaximum(Calendar.DAY_OF_MONTH));
			Date ltm = firstThisMonth.getTime();
			String strLTM = sdf.format(ltm);
			Date strLTMDate = sdf.parse(strLTM);
//			System.out.println("ltm"+ltm);
//			System.out.println("1682780400000 비교비교" + strLTMDate.getTime());
			
			System.out.println("\n===================================\n");
			System.out.println("이번달 작성된 게시물");
//			for(int i = 0; i < dbList.size(); i++) {
//				if(dbList.get(i).getLongdate() >= strFTMDate.getTime() && (dbList.get(i).getLongdate() <= strLTMDate.getTime())){
//					System.out.println(dbList.get(i));
//				}
//			}
			for(int i = 0; i < dbList.size(); i++) {
				if(dbList.get(i).getLongdate() >= strFTMDate.getTime()){
					System.out.println(dbList.get(i));
				}
			}
			
			
			// dbList에서 2월에 작성된 게시글만 출력해주세요.
			System.out.println("2월에 작성된 게시글");
			for(int i = 0; i < dbList.size(); i++) {
				String temp = dbList.get(i).getDate();
				Calendar calTemp = Calendar.getInstance();
				calTemp.setTime(sdf.parse(temp));
				if(calTemp.get(Calendar.MONTH) == 1) {
					System.out.println(dbList.get(i));
				}
			}
			
			
			//2022년 2월 14일부터 2022년 3월 21일까지 작성된 게시글만 출력해주세요.
			String start = "2022.02.14 00:00:00";
			Date startDate = sdf.parse(start);
			long startLong = startDate.getTime();
			String end = "2022.3.21 00:00:00";
			Date endDate = sdf.parse(end);
			long endLong = endDate.getTime();
			
//			System.out.println(endLong);
//			System.out.println("테스트"+startLong + dbList.get(3).getLongdate());
			// 왜안되지..ㅠㅠ
			System.out.println("2022.02.12 - 2022.03.21 사이 게시물");
			for(int i = 0; i < dbList.size(); i++) {
				if( startLong < dbList.get(i).getLongdate() && dbList.get(i).getLongdate() < endLong) {
					System.out.println(dbList.get(i));
				}
			}
			
			
			

	}

}
