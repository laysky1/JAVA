package days19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IO11 {

	public static void main(String[] args) throws IOException {
		//abc.txt 파일의 내용을 읽어 와서 콘솔창에 출력하세요

		File dir = new File("D:\\JAVA01\\java_se\\temp");
		if(!dir.exists())dir.mkdir();
		
		
		File fileText = new File(dir,"abc.txt");
		FileReader frText = new FileReader(fileText);
		
		int dataText;
		while((dataText=frText.read())!=-1)
		System.out.print((char)dataText);
		
		frText.close();
		

		
	}

}
