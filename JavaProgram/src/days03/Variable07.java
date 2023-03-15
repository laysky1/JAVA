package days03;

import java.util.Scanner;

public class Variable07 {

	public static void main(String[] args) {
		
		//(입력)포장을 기다리는 사과 갯수 입력 int a1
		//(입력)상아 하나에 담길 수 있는사과의 갯수 입력 int b1
		
		
		//(출력)입력조건으로 포장했을때, (포장된 박스갯수, 남은 사과 갯수) 출력
		//박스갯수 : XX
		//남은 사과 : XX
		
		int a1; //총 사과 갯수
		int b1; //상자 안에 들어가는 사과 갯수
		int app1; //포장된 박스갯수
				
		Scanner sc=new Scanner(System.in);	
		System.out.printf("포장을 기다리는 사과의 갯수는 몇개인가 : ");		
		a1=sc.nextInt();
		
		System.out.printf("한 상자에 몇개의 사과가 담기는가 : ");		
		b1=sc.nextInt();
		
		System.out.printf("포장된 박스갯수 : %d\n", a1/(int)b1);	
	    app1 = a1/b1; // 자동 완성 단축키 ctrl + space
		System.out.printf("남은 사과 : %d\n", a1-(app1*b1));	

		
		

	}

}
