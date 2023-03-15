package days05;

import java.util.Scanner;

public class Forex {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		System.out.printf("년 입력 : "); 
		int y =sc.nextInt();
		System.out.printf("월 입력 : ");
		int m = sc.nextInt();
		System.out.printf("일 입력 : ");
		int d = sc.nextInt();
		int days = 365*(y-1);
		int i;		
		//해당연도가 4의 배수이면서,(and) 100의 배수가 아니거나(or) 400의 배수인 해// y
		// 1부터 y-1 까지 반복하면서 해당 숫자가 /윤년에 해당하는 년도와 같은 숫자라면 days에 1(days=days+1)을 더합니다
			for(i=1;i<=y-1;i++) {
			if((i%4==0)&&(i%100!=0)||(i%400==0))
			days=days+1;
			}
		//for(; ;){if();}

			
		//입력한 년도가 윤년이라면 (if) 아래 switch문의 2월에 해당하는 숫자를 29로 바꿔서 계산합니다.
		switch(m) {
		case 12 :	days+=30;
		case 11 :	days+=31;	
		case 10 :	days+=30;
		case  9  :	days+=31;
		case  8  :	days+=31;
		case  7  :	days+=30;
		case  6  :	days+=31;
		case  5  :	days+=30;
		case  4  :	days+=31;
		
		case  3  : days+=28;
		if((y%4==0)&&(y%100!=0)||(y%400==0)) {
		 days+=29;
		}else days+=28;
				
		case  2  :	days+=31;
		case  1 :	days+=0;
		}
		
		days = days + d;
		
		int temp= days%7;
		
		switch(temp) {	
		case 1 :System.out.println("월요일입니다.");break;
		case 2 :  System.out.println("화요일입니다.");break;
		case 3 :  System.out.println("수요일입니다.");break;
		case 4 : System.out.println("목요일입니다.");break;
		case 5 : System.out.println("금요일입니다.");break;
		case 6 : System.out.println("토요일입니다.");break;
		case 0 : System.out.println("일요일입니다.");break;
		 }

	}

}
