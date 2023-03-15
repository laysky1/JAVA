package days16;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Exception06 {

	public static void main(String[] args) {
		
		//순수하게 숫자만으로 이루어진 정수를 입력받는 while과 try-catch를 제작하세요.
		// 입력값에 문자가 섞이거나 하면 에러가 발생되어 "잘못 입력했습니다" 라고 출력
		// Integer.parseInt()메서드는 숫자로 변환될 아라비아 기호(문자)가 아닌 다른 문자 등이 입력되면
		// 에러가 발생합니다.
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.print("숫자를 입력하세요 : ");
		while(true) {
			String s=sc.nextLine();
			try { 
				num=Integer.parseInt(s);	// 현재위치에서 에러발생시 catch 이동. 에러가 없으면 break실행
				break;
			}catch (NumberFormatException e) {
				//최초 catch에 Exception만 쓰고 일부러 에러를 발생하면, e.printStackTrace를 통해
				// Exception 종류를 알아낼 수 있습니다.
				// 이후에 간경하게 수정하세요
				System.out.print("잘못 입력했습니다. 숫자만 입력하세요 : ");
			}
		}
		System.out.println("입력한 정수는 : "+num + "입니다.");
	}
}
