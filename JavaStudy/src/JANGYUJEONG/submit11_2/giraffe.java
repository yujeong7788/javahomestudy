package JANGYUJEONG.submit11_2;

import java.util.ArrayList;
import java.util.Scanner;

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
		this.gaze += 30;
		head = " ＊    ＊\n" + 
				"  \\ __ /\n" + 
				"(  ●  ●   )  "  +  "\n|     |" + "\n|     |";
		height += (int)(Math.random() * 26) + 15;
			if(gaze % 30 == 0) {
				neck += "\n|     |";
			}
		return neck;
	}
	
	public String zz() {
		this.gaze += 20;
		height += (int)(Math.random() * 21) + 10;
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
		height += (int)(Math.random() * 21) + 10;
		head =  " ＊    ＊\n" + 
				"  \\ __ /\n" + 
				"(  ♥  ♥   )  "  +  "\n|     |" + "\n|     |";
			if(gaze % 30 == 0) {
				neck += "\n|     |";
			}
		return neck;
	}
	
	public String longNeck() {
		neck += "\n|     |";
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
	
	
	
	public void rsp(String name) {
		// TODO 가위,바위,보 이모지로 바꾸기
		// 1. 가위 2. 바위 3. 보

		  while(true) {
				Scanner scan = new Scanner(System.in);
				System.out.println("가위~~ 바위~~ 보~~!");
				System.out.println("1. 가위 | 2. 바위 | 3. 보");
				System.out.println(">>>");
				int rscNo = Integer.parseInt(scan.nextLine());
				int giraRand = (int)(Math.random() * 3) + 1;
				
				if(rscNo == 1) {
					if(giraRand == 2) {
						System.out.println(name + ": ✊");
						System.out.println("당신 : ✌");
						System.out.println(name+"(이)가 이겼습니다.");
						this.gaze += 10;
						height += 30;
						break;
					}else if(giraRand == 3) {
						System.out.println(name + ": 🖐");
						System.out.println("당신 : ✌");
						System.out.println("당신이 이겼습니다.");
						height -= 10;
						this.gaze -= 10;
						break;
					}else {
						System.out.println(name + ": ✌");
						System.out.println("당신 : ✌");
						System.out.println("비겼습니다.");

					}
				}else if(rscNo == 2) {
					if(giraRand == 1) {
						System.out.println(name + ": ✌");
						System.out.println("당신 : ✊");
						System.out.println("당신이 이겼습니다.");
						height -= 10;
						this.gaze -= 10;
						break;
					}else if(giraRand == 3) {
						System.out.println(name + ": 🖐");
						System.out.println("당신 : ✊");
						System.out.println(name+"(이)가 이겼습니다.");
						this.gaze += 10;
						height += 30;
						break;
					}else {
						System.out.println(name + ": ✊");
						System.out.println("당신 : ✊");
						System.out.println("비겼습니다.");

					}
				}else {
					
					if(giraRand == 1) {
						System.out.println(name + ": ✌");
						System.out.println("당신 : 🖐");
						System.out.println(name+"(이)가 이겼습니다.");
						this.gaze += 10;
						height += 35;
						break;
					}else if(giraRand == 2) {
						System.out.println(name + ": ✊");
						System.out.println("당신 : 🖐");
						System.out.println("당신이 이겼습니다.");
						height -= 10;
						this.gaze -= 10;
						break;
					}else {
						System.out.println(name + ": 🖐");
						System.out.println("당신 : 🖐");
						System.out.println("비겼습니다.");

					}
				}
			}
	}

	public String shortNeck() {
		if(this.neck.length() >= 8) {
		this.neck = this.neck.substring(0, this.neck.length()-8);
		}
		return neck;
	}
	
	public void griaAll() {
		System.out.println(head + neck + body); 
	}
	
	public void sad() {
		head =  " ＊    ＊\n" + 
				"  \\ __ /\n" + 
				"(  ㅠ  ㅠ  )  "  +  "\n|     |" + "\n|     |";
	}
	
	public void happy() {
		head =  " ＊    ＊\n" + 
				"  \\ __ /\n" + 
				"(  ^   ^  )  "  +  "\n|     |" + "\n|     |";
	}
	
	public void sorry() {
		head =  " ＊    ＊\n" + 
				"  \\ __ /\n" + 
				"(  •᷄ •᷅ )  "  +  "\n|     |" + "\n|     |";
	}
}
