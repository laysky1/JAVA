package days03;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);	
		// 삼각형의 밑변과 높이를 입력받아서 넓이를 출력
	  // 삼각형의 넓이 : 밑변x높이÷2 (밑변x높이x0.5)
		/*
		int a,b;
		int result1;
		double result2;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("삼각형의 밑변 : ");
		a=sc.nextInt();
		System.out.println("삼각형의 높이 : ");
		b=sc.nextInt();
		
		result1=a*b;
		result2=result1/(double)2;
		System.out.printf("삼각형의 넓이는 %.1f ",result2);
		*/
		//반지름을 입력받아서 원의 넓이와, 둘레의 길이를 출력합니다.
		//입력1개, 출력2개
		//필요한 변수의 이름은 임의로 지어서 사용합니다.
		//출력양식
		//입력한 원의 넓이 : xx.xx , 둘레의 길이 : xx.xx
				
		//넓이 -반지름x반지름x3.141592  둘레-2x반지름x3.141592
		//결과는 소수점 둘째자리 까지만 표시. printf, println 중 선택은 본인이
		/*
		Scanner sc=new Scanner(System.in);	
		int van;
		System.out.println("반지름을 입력하시오");
		van=sc.nextInt();
		double result1 = van*van*3.14;
		double result2 = 2*van*3.14;
		System.out.printf("원의 넓이 : %.2f", result1);
		System.out.printf("원의 둘레 : %.2f", result2);
		*/
		//이름, 국어,영어,수학 점수를 입력받아서 1명의 성적표를 총점 평균과 함께 기존 성적표 양식에 맞춰 출력하세요
		//문자(이름)을 입력 받는 명령 ->sc.nextLine()
		//입력 받을때 반드시 이름부터 입력받으세요  순서 : 이름, 국어, 영어, 수학
		//평균은 소수점 첫째자리 까지
		//이름 :김은지 국어 : 45 영어 : 85 수학 : 90
		
		/*
		String s;
		int kor, eng, mat, tot;
		double result2;
		System.out.println("이름을 입력하시오 : ");
		s=sc.nextLine();
		System.out.println("국어점수 : ");
		kor=sc.nextInt();
		System.out.println("영어점수 : ");
		eng=sc.nextInt();
		System.out.println("수학점수 : ");
		mat=sc.nextInt();
		tot=kor+eng+mat;
		result2=tot/3.0;
		System.out.printf("이름\t\t국어\t 영어\t 수학\t 총점\t 평균\n");
		System.out.printf("%s\t\t%d\t %d\t %d\t %d\t %.1f ",s,kor,eng,mat,tot,result2);
		*/
		
		//(입력)포장을 기다리는 사과 갯수 입력 int a1
		//(입력)상아 하나에 담길 수 있는사과의 갯수 입력 int b1
				
				
		//(출력)입력조건으로 포장했을때, (포장된 박스갯수, 남은 사과 갯수) 출력
		//박스갯수 : XX
		//남은 사과 : XX
				
		int a1; //총 사과 갯수
		int b1; //상자 안에 들어가는 사과 갯수
		int result;
		double result1;
		int app1; //포장된 박스갯수
		System.out.println("포장을 기다리는 사과의 갯수 : ");
		a1=sc.nextInt();
		System.out.println("상자에 담길 수 있는 사과의 갯수 : ");
		b1=sc.nextInt();
		app1=a1/b1; //포장된 박스 갯수
		System.out.printf("포장된 박스갯수 :%d 상자",app1);
		result=a1%b1;
		System.out.printf("남은 사과의 갯수 :%d 개",result);
	}

}
