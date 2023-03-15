package days06;

import java.util.Scanner;

public class ControlOp_For11 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int num1, num2;
		int i, small;
		System.out.printf("첫번째 정수 입력 :");
		num1=sc.nextInt();
		System.out.printf("두번째 정수 입력 :");
		num2=sc.nextInt();
		
		//입력받은 두개의 공약수들을 출력하세요
		// 12 36을 입력한 경우 1 2 3 4 5 12
		// 공약수 : 두개의 숫자를 나눴을때 동시에 나눠 떨어지는 숫자
		/* 내가 한것
		for(i=1;i<=num2;i++) {
		if((num1%2==0)&&(num2%2==0)) {
		small=num1;
		}else {
		small=num2;
		}
		}
		System.out.printf("%d와 %d의 공약수 : %d",num1,num2, small );
		*/
		if(num1>num2) small =num2;
		else small =num1;
		
		int X;
		for(X=1 ; X<=small;X++ ) {
		if((num1%X==0)&&(num2%X==0))
			System.out.printf("%d ",X);
		}
	}

}
