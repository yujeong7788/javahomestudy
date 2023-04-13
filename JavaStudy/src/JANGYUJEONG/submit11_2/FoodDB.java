package JANGYUJEONG.submit11_2;

import java.util.ArrayList;

import ch09_class.quiz.Movie;
import ch09_class.quiz.MovieDB;

public class FoodDB {
	
	private ArrayList<Food> foodList = new ArrayList<>();
	
	private FoodDB() {
		foodList.add(new Food("피자","ㅍㅈ","2글자","밀가루,치즈,토마토소스,올리브,햄,양파,피망"));
		foodList.add(new Food("떡볶이","ㄸㅂㅇ","3글자","떡,고추장,파,어묵"));
		foodList.add(new Food("된장찌개","ㄷㅈㅉㄱ","4글자","된장,양파,고추,물"));
		foodList.add(new Food("김밥","ㄱㅂ","2글자","김,밥,참기름,단무지,햄,계란,시금치"));
		foodList.add(new Food("카레","ㅋㄹ","2글자","카레가루,물,감자,양파,당근,돼지고기"));
		foodList.add(new Food("떡국","ㄸㄱ","2글자","떡,파,다진고기,계란,멸치육수"));
	}
	
	private static FoodDB instance = new FoodDB();
	
	public static FoodDB getInstance() {
		return instance;
	}
	
	public  ArrayList<Food> getFoodList(){
		return foodList;
	}
}
