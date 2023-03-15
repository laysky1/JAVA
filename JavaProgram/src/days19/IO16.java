package days19;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class IO16 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		File dir = new File("D:\\JAVA01\\Java_se\\temp");
		if(!dir.exists())dir.mkdir();
		File file = new File(dir,"MyClass.dat");
		
		ObjectInputStream ois
		= new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));

		MyClass obj=(MyClass)ois.readObject();	//파일에서 객체를 담을 내용을 객체단위로 읽어옵니다.
		System.out.println(obj.name);
		ois.close();
	}

}
