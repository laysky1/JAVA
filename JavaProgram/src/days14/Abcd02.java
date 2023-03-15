package days14;

import java.util.Scanner;

public class Abcd02 {

	public static void main(String[] args) {
	
		System.out.print("정수를 입력하세요 : ");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		
		// 입력받은 숫자가 prime number인지를 계산하고 출력하세요 
		// 1~number로  number를 나눠봐서 나눠 떨어진 경우가 2번뿐인 경우
		// "소수입니다" 라고 출력입니다.
		// for(변수 =반복실행 시작값; 반복을 계속할 비교연산식; 변수의 증감){ }
		int count=0;
		//반복해야할 사항 number를 일련의 숫자들로 나눗셈 합니다.(정확히는 나눈 나머지를 계산합니다.)
		/*
		for(int i=1; i<=number; i++) {
			if(number%i==0) count++;
		}
		*/
		//for 문->while문
		
		
		int i=1;
		while(i<=number) {
			if(number%i==0)count++;
			i++;
		}
			if(count==2)System.out.println("입력한 숫자"+ number +"는 소수입니다");
			else System.out.println("입력한 숫자"+ number +"는 소수가 아닙니다");
			
	}
}
