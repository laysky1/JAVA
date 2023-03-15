package days05;

import java.util.Scanner;

public class ControlOp_IF07 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a; //기본급 저장변수
		double b; //총 지급액 저장변수
		double bonus;// 계산된 보너스 금액 저장 변수
		System.out.printf("기본급을 입력하세요 : ");
		a=sc.nextInt();
		// 기본급이 백만원 이상이라면 기본급의 50%를 보너스로 합산
		// 기본급이 백만원 미만이라면 기본급의 60%를 보너스로 합산
		// 총 지급액을 출력하세요
		int c= 1000000;
		
		if(a>=c) {
		bonus=a*0.5;
		//b=bonus+a; 같은 방법으로 계산이 된다면 else 마지막 if문 중괄호 밖에 한번만 써도 된다.
		}else {
	    bonus=a*0.6;
	    //b=bonus+a;
		}
		b=bonus+a;
		System.out.println("총지급액 :"+(int)b+"원");
		System.out.println("추가보너스 :"+(int)bonus+"원");

	}

}
