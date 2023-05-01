package ch15_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput {

	public static void main(String[] args) {
		// 자바에서 파일에 내용 쓰기
		String filePath = "/home/pc04/today/test.txt";
		
		File test = new File(filePath);
		
		// new FileOutPutStream(test) -> 기존 파일 내용을 덮어씀
		// new FileOutPutStream(test,true) -> 기존 파일 내용을 이어씀
		// 사용할 객체를 미리 선언, 알아서 클로즈도 해줌
		try(FileOutputStream  fos = new FileOutputStream(test,true)) {
			String temp = "\n월요일도 쉬지롱~~~~~";
			
			// String 에 .getBytes()하면 byte[] 를 리턴
			byte[] tempByte = temp.getBytes();
			
			fos.write(tempByte);
			System.out.println("작성 완료");
		// 예외처리 두번째 것 선택
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
		
	}

}
