package days05;

import java.util.Scanner;

public class ControlOp_Switch02 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.printf("월 입력 : ");
		int m = sc.nextInt();
		System.out.printf("일 입력 : ");
		int d = sc.nextInt();
		
		int days =0; //합산한 날짜 수가 저장될 변수
		/*
		if(m==1) days =0;
		else if(m==2) days =31;
		else if(m==3) days =31+28;
		else if(m==4) days =31+28+31;
		else if(m==5) days =31+28+31+30;
		else if(m==6) days =31+28+31+30+31;
		else if(m==7) days =31+28+31+30+31+30;
		else if(m==8) days =31+28+31+30+31+30+31;
		else if(m==9) days =31+28+31+30+31+30+31+31;
		else if(m==10) days=31+28+31+30+31+30+31+31+30;
		else if(m==11) days=31+28+31+30+31+30+31+31+30+31;
		else if(m==12) days=31+28+31+30+31+30+31+31+30+31+30;
		*/
		switch(m) {
			case 1 :
			days =0;
			break;
			case 2 :
			days =31;
			break;
			case 3 :
			days =31+28;
			break;
			case 4 :
				days =31+28+31;
			break;
			case 5 :
				days =31+28+31+30;
			break;
			case 6 :
				days =31+28+31+30+31;
			break;
			case 7 :
				days =31+28+31+30+31+30;
			break;
			case 8 : days =31+28+31+30+31+30+31; break;
			case 9 : days =31+28+31+30+31+30+31+31; break;
			case 10 : days=31+28+31+30+31+30+31+31+30; break;
			case 11: days=31+28+31+30+31+30+31+31+30+31; break;
			case 12 : days=31+28+31+30+31+30+31+31+30+31+30; break;
			
			
		}
		days = days + d;
		
		int temp= days %7;
		/*
		if(temp== 1) System.out.println("토요일입니다.");
		else if (temp== 2) System.out.println("일요일입니다.");
		else if (temp== 3) System.out.println("월요일입니다.");
		else if (temp== 4) System.out.println("화요일입니다.");
		else if (temp== 5) System.out.println("수요일입니다.");
		else if (temp== 6) System.out.println("목요일입니다.");
		else if (temp== 0) System.out.println("금요일입니다.");
		*/
		
		switch(temp) {
		case 1 :
			System.out.println("토요일입니다.");
		break;
		case 2 :  
			System.out.println("월요일입니다.");
		break;
		case 3 :  
			System.out.println("화요일입니다.");
			break;
		case 4 : 
			System.out.println("수요일입니다.");
			break;
		case 5 : 
			System.out.println("목요일입니다.");
			break;
		case 6 : 
			System.out.println("금요일입니다.");
			break; 
			}
		
	}

}
