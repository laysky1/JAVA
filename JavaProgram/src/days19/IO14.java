package days19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO14 {

	public static void main(String[] args) throws IOException {
		//"D:\\JAVA01\\Java_se\\temp" 폴더안의 "eclipse-inst-jre-win64.exe"파일을
		//"D:\\JAVA01\\Java_se\\copy"폴더로 복사
		//이진 형식으로 읽어... 바로 써넣는 방식
		
		File dir = new File("D:\\JAVA01\\Java_se\\temp");		//원본 폴더 경로
		File dir1 = new File("D:\\JAVA01\\Java_se\\copy");		// 복사 폴더 경로
		if(!dir1.exists())dir1.mkdirs();			//사본 폴더만 없으면 생성
		
		File fileOriginal = new File(dir, "eclipse-inst-jre-win64.exe");
		File fileCopy = new File(dir1, "eclipse-inst-jre-win64.exe");
		
		
		BufferedInputStream bis =new  BufferedInputStream(new FileInputStream(fileOriginal));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fileCopy));
		
		//int data;
		//while((data=bis.read())!=-1);		bos.write(data);
		
		byte[]data = new byte[1024];
		int size;	//맨 마지막 입력은 1kb 안될 수도 있으니 size를 사용하여 입력받은 만큼의 출력을 실행합니다.
		while ((size=bis.read(data))!=-1)bos.write(data,0,size);
		
		bis.close();
		bos.close();	
	}

}
