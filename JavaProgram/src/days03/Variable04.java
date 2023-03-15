package days03;

import java.util.Scanner;

public class Variable04 {

	public static void main(String[] args) {
		//반지름을 입력받아서 원의 넓이와, 둘레의 길이를 출력합니다.
		//입력1개, 출력2개
		//필요한 변수의 이름은 임의로 지어서 사용합니다.
		//출력양식
		//입력한 원의 넓이 : xx.xx , 둘레의 길이 : xx.xx
		
		//넓이 -반지름x반지름x3.141592  둘레-2x반지름x3.141592
		//결과는 소수점 둘째자리 까지만 표시. printf, println 중 선택은 본인이
		
		int van = 10;
		double cir = 3.14;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("원의 반지름 : ");
		van = sc.nextInt();
		System.out.printf("원의 넓이 : %.2f\n",van*van*cir);
		System.out.printf("원의 둘레 : %.2f\n",2*van*cir);

		System.out.println("원의 넓이 :" + (int)van*van*cir);
		System.out.println("원의 둘레 :" +(int)2*van*cir );

	}

}
