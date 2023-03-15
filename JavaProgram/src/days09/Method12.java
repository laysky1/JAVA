package days09;

import java.util.Scanner;

public class Method12 {

	public static void main(String[] args) {
		//밑변과 높이를 입력받아서 삼각형의 넓이를 계산하여 출력(메서드 사용)
		int a,b;
		double c;
		a=myInput(1);//밑변을 입력받음. "밑변을 입력하세요"라고 안내
		b=myInput(2);//높이를 입력받음. "높이를 입력하세요"라고 안내
		c=calculate(a,b);//넓이를 계산
		prn(c); //넓이 출력
	}
	public static int myInput(int a) {
		Scanner sc=new Scanner(System.in);
		if(a==1) {
		System.out.print("밑변을 입력하세요 : ");
		a=sc.nextInt();
		return a;
		}
		else System.out.print("높이를 입력하세요 : ");
		a=sc.nextInt();
		return a ;
		//return sc.nextInt();
	}
	
	public static double calculate(int a,int b) {
		double c=(a*b)/2.0;
		//return a*b*0.5; 
		return c;
	}
	public static void prn(double c) {
		System.out.printf("넓이는 : %.1f",c);
	}
	
}
