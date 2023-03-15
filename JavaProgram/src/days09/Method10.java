package days09;

import java.util.Scanner;

public class Method10 {

	public static void main(String[] args) {
		
		int ban;
		double n,d ;
		Scanner sc=new Scanner(System.in);
		System.out.print("반지름을 입력하세요");
		ban = sc.nextInt();
		
		n =calculate1(ban); //원의 넓이를 구하는 메서드
		d =calculate2(ban); //원의 둘레를 구하는 메서드
		prn(n,d); //넓이와 둘레를 출력하는 메서드
	}

		public static double calculate1(int ban) {
			double n=3.14*ban*ban;
			return n;
	}
		
		public static double calculate2(int ban) {
			double d=2*ban*3.14;
			return d;
		}
		
		public static void prn(double a,double b) {
			System.out.printf("원의 넓이 : %.2f, 원의 둘레 : %.2f\n",a,b);
			
		}
	
}
