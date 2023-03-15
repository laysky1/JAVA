package days04;

import java.util.Scanner;

public class Prac1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String level; //직급을 저장할 변수
		int pay; //판매실적금액 변수
		
		System.out.printf("직급 입력(과장/대리/사원) :");
		level = sc.nextLine();
		
		String s1="과장",s2="대리",s3="사원";
		
		System.out.printf("판매실적금액 입력 : ");
		pay = sc.nextInt();
		
		double r, total=0.0;  // r : 활동비를 계산할 비율저장 변수, total : 판매실적+활동비 를 저장할 변수
		
		// 판매실적 금액에 과장 50%, 대리 25%, 사원 15%의 활동비를 합산하여 출력해주세요
		if(s1.equals(level)) {
			r=pay*0.5;
			total=pay+r;
			System.out.printf("과장의 판매실적은 %d원 이고, 활동비는 %.0f원 이므로 총%.0f원 이다", pay ,r, total );
		}else if(s2.equals(level)){
			r=pay*0.25;
			total=pay+r;
			System.out.printf("대리의 판매실적은 %d원이고, 활동비는 %.0f원이므로 총%.0f원 이다", pay ,r, total );
		}else if(s3.equals(level)){
			r=pay*0.15;
			total=pay+r;
			System.out.printf("사원의 판매실적은 %d원이고, 활동비는 %.0f원이므로 총%.0f원 이다", pay ,r, total );
		}
		
	}

}
