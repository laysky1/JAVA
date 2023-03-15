package days06;

import java.util.Scanner;

public class ControlOp_For08 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.printf("년 입력 : "); //추가
		int y =sc.nextInt();
		System.out.printf("월 입력 : ");
		int m = sc.nextInt();
		System.out.printf("일 입력 : ");
		int d = sc.nextInt();
		
		//년월일을 입력받아서 해당날짜의 요일을 출력
		//*서기 1년 1월 1일(월요일)부터 입력한 날짜까지 몇일이 지난지 계산하고, 그 날짜수를 7로 나눈 나머지 계산
		//   계산결과를 해당요일을 출력합니다.
		//1. 1년부터 입력한 전년도까지 날짜를 계산합니다.
		//2. 1월부터 입력한 월의 전월까지 날짜를 합산합니다.
		//3. 입력한 일을 합산합니다.
		//4. 7로 나머지로 요일을 계산합니다.
		
		//1.
		int days = 365*(y-1);
		int i;		
		
		//해당연도가 4의 배수이면서,(and) 100의 배수가 아니거나(or) 400의 배수인 해// y
		// 1부터 y-1 까지 반복하면서 해당 숫자가 /윤년에 해당하는 년도와 같은 숫자라면 days에 1(days=days+1)을 더합니다
		//for(; ;){if();}
		for(i=1;i<=y-1;i++) { //for(f=1;i<y;i++)도 가능
			if((i%4==0)&&(i%100!=0)||(i%400==0))
			days=days+1;
			}
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
		
		case  3  :
			if((y%4==0)&&(y%100!=0)||(y%400==0)){
				days+=29;
				}else {
				  days+=28;
				 }	
		//조건문 위치를 고민 (if 조건을 실행해라- 윤년일땐 +29 ,아닐땐 28)
	
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
