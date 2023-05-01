package ch15_file;

import java.io.File;

public class TreasureHunter {

	public static void main(String[] args) {
		
		String path = "/home/pc04/today/treasure";
		
		File treasure = new File(path);
		System.out.println(treasure.exists());
		
//		File[] treasureArray = treasure.listFiles();
//		
//		for(int i = 0; i < treasureArray.length; i++) {
//			// .getName()하면 파일명만 리턴
//			System.out.println(treasureArray[i]);
//		}
//	
		
		// 프로젝트에 대해 자바에서 File 객체 생성하기
		// 파일의 생성자 () 안에는 풀경로 입력
		File proj = new File(path);
		
		// proj 내의 파일목록 출력
		// .listFiles()
		// 해당 File 객체 폴더의 파일목록을 배열(Array)로 리턴
		File[] fileArray= proj.listFiles();
		for(int i = 0; i < fileArray.length; i++) {
			// 해당 File 객체의 풀경로를 리턴(경로 + 파일명)
			System.out.println(fileArray[i]);
		}
		
		System.out.println("\n===================\n");
		for(int i = 0; i < fileArray.length; i++) {
			// 해당 File 객체의 풀경로를 리턴(경로 + 파일명)
			System.out.println(fileArray[i]);
			String temp = "/home/pc04/today/treasure/"+fileArray[i].getName();
			File treasure2 = new File(temp);
			File[] fileArray2= treasure2.listFiles();
			System.out.println("\n====================\n");
			for(int j = 0; j < fileArray2.length; j++) {
				System.out.println(fileArray2[j]);
				String temp2 = "/home/pc04/today/treasure/"+fileArray[j].getName();
				File treasure3 = new File(temp2);
				File[] fileArray3= treasure3.listFiles();
				System.out.println("\n====================\n");
				for(int t = 0; t < fileArray3.length; t++) {
					System.out.println(fileArray3[t]);
				}
			}
			
		}
		
		System.out.println("\n===========forans========\n");
		for(int i = 0; i < fileArray.length; i++) {
			// 해당 File 객체의 풀경로를 리턴(경로 + 파일명)
			System.out.println(fileArray[i]);
			String temp = "/home/pc04/today/treasure/"+fileArray[i].getName();
			File treasure2 = new File(temp);
			File[] fileArray2= treasure2.listFiles();
			System.out.println("\n====================\n");
			for(int j = 0; j < fileArray2.length; j++) {
				System.out.println(fileArray2[j]);
				String temp2 = "/home/pc04/today/treasure/"+fileArray[j].getName();
				File treasure3 = new File(temp2);
				File[] fileArray3= treasure3.listFiles();
				System.out.println("\n====================\n");
				for(int t = 0; t < fileArray3.length; t++) {
					System.out.println(fileArray3[t]);
				}
			}
			
		}
		
		
		
		System.out.println("\n=============================정답!!==========================\n");
		File folder = new File(path);
		System.out.println(folder);
		
		findFile(folder);
		
	}// main 끝

	public static void findFile(File floder) {
		File[] inner = floder.listFiles();
		for(int i = 0; i < inner.length; i++) {
			if(inner[i].isDirectory()) {
				findFile(inner[i]); // 재귀 함수!@
			}else {
				System.out.println(inner[i]);
			}
		}
		
	}
	
	
}
