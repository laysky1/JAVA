package days05;

import java.util.Scanner;

public class ControlOp_For07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int fact = 1;
		int i, k;
		System.out.printf("출력할 팩터리얼을 입력하세요 : ");
		k = sc.nextInt();
		//입력한 숫자의 팩터리얼 계산 후 출력
		// 6을 입력했다면
		// 6!= 720
		// 6!=6x5x4x3x2x1=720
		
		for(i=1;i>1;i--)
		fact=fact*i;
		System.out.printf( "%d!= ",k) ;
		for(i=1;k-1>=i;i++)
		System.out.printf( "%dx",i); 	
		System.out.printf( "1=%d",fact); 

	}

}
