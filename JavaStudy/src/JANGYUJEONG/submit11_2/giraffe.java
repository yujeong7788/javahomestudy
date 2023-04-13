package JANGYUJEONG.submit11_2;

import java.util.ArrayList;

public class giraffe {
	String name;
//	String state = giraffe.state();
	int height = 180;
	int gaze = 0; // 성장게이지
	
	String head = " ＊    ＊\n" + 
			"  \\ __ /\n" + 
			"(  ●  ●   )  "  +  "\n|     |" + "\n|     |";
	
	String neck = "";
	
	String body = "\n|   @  ----------------_\n" + 
			"  @      @      @       |-------＊＊＊\n" + 
			"      @     @      @     |\n" + 
			" @   ___  _______@______|\n" + 
			"|  |  |  |    |  |   | @|\n" + 
			"|  |  |@ |    |@ |   |  |\n" + 
			"| @|  |  |    |  |   |  |\n" + 
			"|  |  | @|    | @|   | @|";
	
	
	String giraffe = " ＊    ＊    \n" + 
			"  \\ __ /                \n" + 
			"(  ●  ●   )      \n" + 
			"|     |         \n" + 
			"|     |          \""+ name +"\"\n" + 
			"|   @  ----------------_\n" + 
			"  @      @      @       |-------＊＊＊\n" + 
			"      @     @      @     |\n" + 
			" @   ___  _______@______|\n" + 
			"|  |  |  |    |  |   | @|\n" + 
			"|  |  |@ |    |@ |   |  |\n" + 
			"| @|  |  |    |  |   |  |\n" + 
			"|  |  | @|    | @|   | @|\n" + 
			"";
	

	public giraffe() {
		super();
		this.name = name;
		this.gaze = gaze;
		this.head = head;
		this.neck = neck;
		this.body = body;
	}
	
	@Override
	public String toString() {
		return "giraffe [name=" + name + ", gaze=" + gaze + ", head=" + head + ", neck=" + neck + ", body=" + body
				+ ", giraffe="  + "]";
	}
	
	public void level1(String name){
		String giraffe = " ＊    ＊    \n" + 
				"  \\ __ /                \n" + 
				"(  ●  ●   )      \n" + 
				"|     |         \n" + 
				"|     |          \""+ name +"\"\n" + 
				"|   @  ----------------_\n" + 
				"  @      @      @       |-------＊＊＊\n" + 
				"      @     @      @     |\n" + 
				" @   ___  _______@______|\n" + 
				"|  |  |  |    |  |   | @|\n" + 
				"|  |  |@ |    |@ |   |  |\n" + 
				"| @|  |  |    |  |   |  |\n" + 
				"|  |  | @|    | @|   | @|\n" + 
				"";
		System.out.println(giraffe); 
	}
	
	public void motion(String word){
		System.out.println(head + "      " + word + neck + body);
	}
	
	public String eat() {
		this.gaze += 10;
		height += (int)(Math.random() * 10) + 1;
			if(gaze % 50 == 0) {
				neck += "\n|     |";
			}
		return neck;
	}
	
	public String zz() {
		this.gaze += 10;
		height += (int)(Math.random() * 10) + 1;
		head =  " ＊    ＊\n" + 
				"  \\ __ /\n" + 
				"(  ㅡ  ㅡ )  "  +  "\n|     |" + "\n|     |";
			if(gaze % 30 == 0) {
				neck += "\n|     |";
			}
		return neck;
	}
	
	public String love() {
		this.gaze += 20;
		height += (int)(Math.random() * 10) + 1;
		head =  " ＊    ＊\n" + 
				"  \\ __ /\n" + 
				"(  ♥  ♥   )  "  +  "\n|     |" + "\n|     |";
			if(gaze % 30 == 0) {
				neck += "\n|     |";
			}
		return neck;
	}
	
	public String state() {
		ArrayList<String> state = new ArrayList<>();
		state.add("행복한");
		state.add("기분나쁜");
		state.add("배고픈");
		state.add("졸린");
		state.add("심심한");
		
		int rand = (int)(Math.random() * state.size());
		return state.get(rand);
	}
	
	
	
	public void rsp(int n) {
		int giraRand = (int)(Math.random() * 3) + 1;
		if(n == giraRand) {
			System.out.println("비겼다");
		}else if(n == 1 && giraRand == 2){
			System.out.println("이겼다");
		}
	}

	public String shortNeck() {
		this.neck = this.neck.substring(0, this.neck.length()-9);
		return neck;
	}
}
