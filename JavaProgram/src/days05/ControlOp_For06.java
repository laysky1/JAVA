package days05;

import java.util.Scanner;

public class ControlOp_For06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int fact = 1;
		int i, k;
		System.out.printf("출력할 팩터리얼을 입력하세요 : ");
		k = sc.nextInt();
		//입력한 숫자의 팩터리얼 계산 후 출력
		// 6을 입력했다면
		// 6!= 720
		// 6!=1x2x3x4x5x6=720
		
			for(i=1;i<=k;i++)	
			fact=i*fact;
		
		
			System.out.printf( "%d! = ",k); //6!=
			for(i=1; i<=k-1;i++)
			System.out.printf("%d x ",i);//1x2x3x4x5x6x
		    System.out.printf("%d= %d",k, fact); //=720
		    
		    
		
		
		
		
		

	}

}
