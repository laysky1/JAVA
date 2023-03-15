package days10;

import java.util.Scanner;

// int 형 자료를 매개변수로 하는 생성자와 디폴트 생성자를 오버로딩하는 클래스 생성
// 		   전달인수가 있으면 전달인수를 멤버변수 dan에 저장, 전달인수가 없으면 dan에 0 저장
// 멤버변수는 int dan; 생성
// 멤버메서드는 print()하나
//  dan이 0이 아니면 해당 구구단 출력
//  dan이 0이면 2~9단 구구단 모두 출력

class  Gugudan { 
	int dan;
	 Gugudan(int d) {
		dan=d;
	}
	 Gugudan() {
		dan=0;
	}
	public void print() {
		if(dan ==0) {
			
			for(int i=1;i<=9; i++) {
				for(int j=2;j<=5;j++) {
					System.out.printf("%dx%d=%2d ",j,i,j*i);
				}
				System.out.println();
			}
			System.out.println();
			for(int i=1;i<=9; i++) {
				for(int j=6;j<=9;j++) {
					System.out.printf("%dx%d=%2d ",j,i,j*i);
				}
				System.out.println();
			}
		}
				else {
			for (int i=1;i<=9;i++)
				System.out.printf("%dx%d=%2d\n",dan,i,dan*i);
		}
				
		
		
	}

}

public class Class13 {

	public static void main(String[] args) {
	 Gugudan g1= new Gugudan(8);
	 Gugudan g2= new Gugudan();
	 g1.print();
	 g2.print();
	 
	}

}
