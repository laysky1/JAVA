package days06;

import java.util.Scanner;

public class ControlOp_While03 {

	public static void main(String[] args) {
	
		//정수를 입력받아서 입력된 정수의 팩터리얼을 출력해주세요
		//while 문을 이용합니다.
		//6을 입력하면 6!=1x2x3x4x5x6 =720
		
		Scanner sc = new Scanner(System.in);
		int fact = 1;
		int i, k;
		System.out.printf("출력할 팩터리얼을 입력하세요 : ");
		k = sc.nextInt();
		i=1;
		while(i<=k) {
			fact=fact*i;
			i++;
		}
		System.out.printf( "%d!= ",k) ; 
		i=k;
		while(i>1) {
			System.out.printf( "%dx",i); 	
			i--;
		}
		System.out.printf( "1 =%d", fact ); 
	
		System.out.println("\n---------------------------");
		System.out.printf( "%d!= ",k) ;
		i=1;
		while(i<k) {
			System.out.printf( "%dx",i); 
			i++;
		}
		System.out.printf( "%d =%d",k, fact ); 
		
		
		
			
		}
		
		

	

}
