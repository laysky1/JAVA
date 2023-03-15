package days09;

import java.util.Scanner;

public class Method11 {

	public static void main(String[] args) {
		
		int year=inputYear();
		boolean a;
		Scanner sc=new Scanner(System.in);
		System.out.println(" 년도 입력 : ");
		year = sc.nextInt();
		
		a=yoon(year);//년도를 전달인수로 전달하여 윤년이면  true,평년이면  false를 리턴
		prn(a); //변수 a 값을 전달받아 윤년 또는 평년을 출력하는 메서드
	}

	private static int inputYear() {
		// TODO Auto-generated method stub
		return 0;
	}

	//매서드 사용에 따른 매서드 형태
	//abc()-전달인수 없고 리턴값도 없는 형태
	//abc(10,20)-전달인수 2개, 리턴값없음
	//k=abc() -전달인수 없고, 리턴값있는 형태
	//k=abc(10,20)전달인수 2개, 리턴값 있는 형태
	//###################################
	//개발자 필요에 의해 만들어지는 매서드는 반드시 클래스 안에 정의되어야 하며
	//생성된 매서드들 간에는 자유롭게 서로를 호출하여 사용할 수 있습니다.
	//그들은 그들을 둘러싼 클래스에 속해 있는 멤버들이라고도 부릅니다.
	//다만 서로를 자유롭게 호출하는 대상에서 main 메서드는 제외합니다.
	//main을 호출한다는 건 프로그램을 시작한다는 뜻이며, 개발자에 의해 임의 호출될 수 없습니다.
	//###################################
	public static boolean yoon(int year) {
		//return(year%4==00)&&(year%100 !=00)||(year%400==00);			
		if((year%4==00)&&(year%100 !=00)||(year%400==00))
			return true;
		else
			return false;
		}
	public static void prn(boolean a) {
		if(a) System.out.println("입력한 년도는 윤년입니다");
		else System.out.println("입력한 년도는 평년입니다");
	}
	
}
