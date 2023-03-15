package days14;

import java.util.Scanner;

public class Abcd03 {

	public static void main(String[] args) {
		//int i = 1;
		int input;
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.print("메뉴를 선택하세요(1:안녕하세요 2: 반갑습니다. 3: 종료 )");
			 input=Integer.parseInt(sc.nextLine());
			if(input==3)break;
			//i++;
			switch(input) {
			case 1: System.out.println("안녕하세요."); break;
			case 2:System.out.println("반갑습니다."); break;
			}
		}
		System.out.println("프로그램을 종료합니다");

	}

}
