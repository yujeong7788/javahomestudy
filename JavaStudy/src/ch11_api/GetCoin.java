package ch11_api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class GetCoin {

	public static void main(String[] args) throws IOException, ParseException {
		
		printCode();
		
		Scanner scan = new Scanner(System.in); 
		System.out.println("코드를 입력해주세요.");
		System.out.print(">>> ");
		
		String code = scan.nextLine(); 
		
		printDetailCode(code);
		
		
	}// main 끝
	
	// 코드 출력 메소드
	public static void printCode() throws IOException, ParseException  {
		String url = "https://api.upbit.com/v1/market/all";
		String url_detail = "https://api.upbit.com/v1/ticker?markets=";
		URL call_url;
		try {
			call_url = new URL(url);
			try {
				HttpURLConnection connection = (HttpURLConnection) call_url.openConnection();
				connection.setRequestMethod("GET");
				connection.setRequestProperty("Accept","application/json");
				if(connection.getResponseCode() != 200) {
					throw new RuntimeException("failed:"+ connection.getResponseCode());
				}
				BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
				StringBuilder result = new StringBuilder();
				String line;
				while((line = br.readLine()) != null) {
					result.append(line);
				}
				// JSONParser를 이용해 파싱
				System.out.println("JSON response:" + result.toString()); // result.toString() 문자열
				JSONParser parser = new JSONParser();
				JSONArray arr = (JSONArray) parser.parse(result.toString());
				System.out.println("JSONArray:" + arr.toJSONString());
				for(Object obj : arr) {
					JSONObject jsonObj = (JSONObject) obj;
					System.out.println(jsonObj.get("market"));
				}
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		}
	}
	
	
	
	// 코드 상세정보 출력 메소드
	public static void printDetailCode(String code) throws IOException, ParseException  {
		String url_detail = "https://api.upbit.com/v1/ticker?markets=";
		URL call_url;
		try {
			call_url = new URL(url_detail + code);
			try {
				HttpURLConnection connection = (HttpURLConnection) call_url.openConnection();
				connection.setRequestMethod("GET");
				connection.setRequestProperty("Accept","application/json");
				if(connection.getResponseCode() != 200) {
					throw new RuntimeException("failed:"+ connection.getResponseCode());
				}
				BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
				StringBuilder result = new StringBuilder();
				String line;
				while((line = br.readLine()) != null) {
					result.append(line);
				}
				// JSONParser를 이용해 파싱
				System.out.println("JSON response:" + result.toString()); // result.toString() 문자열
				JSONParser parser = new JSONParser();
				JSONArray arr = (JSONArray) parser.parse(result.toString());
				System.out.println("JSONArray:" + arr.toJSONString());
				for(Object obj : arr) {
					JSONObject jsonObj = (JSONObject) obj;
//					System.out.println(jsonObj.get("korean_name"));
				}
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		}
	}

}
