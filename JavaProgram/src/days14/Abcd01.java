package days14;

import java.util.Scanner;

public class Abcd01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String level; //직급을 저장할 변수
		int pay; //판매실적금액 변수
		System.out.printf("직급 입력(과장/대리/사원) :");
		level =sc.nextLine();
		System.out.printf("판매실적금액 입력 :");
		pay=sc.nextInt();
		
		double r,total; //r : 활동비 비율, total : 활동비 + 판매실적금액
		//판매식절 금액에 과장 40%, 대리 15%, 사원 10%의 활동비를 합산하여 출력해주세요
		/*
		if(level.equals("과장")) {
			r=pay*0.4;
			total=pay+r;
		}else if(level.equals("대리")) {
			r=pay*0.15;
			total=pay+r;
		}else {
			r=pay*0.1;
			total=pay+r;
		}
		*/
		switch(level){
			case "과장" :
				r=0.4; 
				break;
			case "대리" : 
				r=0.15;
				break;
			case "사원" :
				r=0.1;
				break;
			default:
				r=0.0;
		}
		
		double actualPay=pay*r;
		total=pay+actualPay;
		
		System.out.println(total);
		
	}
	
}
