package JANGYUJEONG.submit14.data;  // 에러나면 경로에 맞게 바꾸기 

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import JANGYUJEONG.submit13.service.MemService;
import JANGYUJEONG.submit14.Service.MenuService;

public class RealJsonParsing {

	public static void main(String[] args) {
		MenuService menuService = MenuService.getInstance();
		
		String path = System.getProperty("user.dir");
		// 100개의 요리에 대한 레시피 데이터 
		FileReader reader = null;
		
		try {
			// 매우 긴 문자열을 여기에 직접 붙여넣게 되면 렉이 걸리므로, 로컬 파일에 데이터를 저장 후 불러온다.
			reader = new FileReader(path + "/src/JANGYUJEONG/submit14/data/recipeData.txt");

			// 불러온 문자열을 담을 StringBuffer 객체
			StringBuffer jsonBuffer = new StringBuffer();
			char[] box = new char[1];
			while(true) {
				int x = reader.read(box);	
				if(x == -1) {
					break;
				}
				jsonBuffer.append(box);
			}
			
			// 잘 담겼는지 확인
			System.out.println(jsonBuffer);
			
			// jsonBuffer의 문자열을 JSONObject로 변환(파싱)
			JSONParser jsonParser = new JSONParser();
			JSONObject json = (JSONObject) jsonParser.parse(jsonBuffer.toString());
			
			// JSON 객체의 COOKRCP01 키값 내 row 키값의 데이터를 꺼냄 (데이터는 배열이므로 JSONArray에 담는다)
			JSONArray dataList = (JSONArray) ((JSONObject)json.get("COOKRCP01")).get("row");

			// "MANUAL01" ~ "MANUAL20" 키값에 해당하는 문자열들을 담는 리스트
			ArrayList<String> manualList = new ArrayList<>();
			for(int i = 1; i <= 20; i++) {
				if(i < 10) {
					manualList.add("MANUAL0" + i);
				}else {
					manualList.add("MANUAL" + i);
				}
			}
			
			// 필요한 데이터에 대한 Menu객체를 담을 리스트
			ArrayList<Menu> menuList = new ArrayList<>();
			
			// 각각의 JSON 객체(JSONObject)에 접근
			System.out.println("유정이의 " + dataList.size() + "가지 레시피");
			for(int i = 0; i < dataList.size(); i++) {
				JSONObject data = ((JSONObject)dataList.get(i));
				
				// 요리명
				String name = (String) data.get("RCP_NM");
				
				// 종류
				String type = data.get("RCP_PAT2") + "";
				
				// 재료
				String parts = data.get("RCP_PARTS_DTLS") + "";
				
				// 조리법
				// "MANUAL01" ~ "MANUAL20" 키값에 데이터가 1~3, 3~6, 1~6 이런식으로 불규칙하게 들어있으므로
				// manualList를 통해 데이터가 들어있는 값만 식별하여 꺼낸다.
				StringBuffer sb = new StringBuffer();
				for(int k = 0; k < manualList.size(); k++) {
					String manualData = ((String) data.get(manualList.get(k))).replace("\n", "");
					// 해당 키값에 데이터가 들어있는 경우에만 sb에 더한다.
					if(manualData.length() > 1) {
						sb.append(manualData + "\n");
					}
				}
				String manual = sb.toString();
				
				System.out.println("메뉴: " + name);
				System.out.println("종류: " + type);
				System.out.println("재료 ============================");
				System.out.println(parts);
				System.out.println("조리법 ============================");
				System.out.println(manual);
				System.out.println();
				
				menuList.add(new Menu(0,name, type, parts, manual,""));
			}
			
			for(int i = 0; i < menuList.size(); i++) {
				System.out.println(menuList.get(i));
				
				// DB에 해당 Menu객체 INSERT
				menuService.registAll(menuList.get(i));
				
				// DB에 너무 빠르게 INSERT하는건 에러가 날 수 있다.
				Thread.sleep(100);
			}
			
			reader.close();
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		
	}

}
