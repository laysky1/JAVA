package days05;

import java.util.Scanner;

public class ControlOp_For04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int dan;
		System.out.printf("출력할 단을 입력하세요(2~9) : ");
		dan = sc.nextInt();
		//입력한 숫자의 구구단을 출력하세요
		/*2 x1 = 2
		.
		.
		.
		2x9=18
		*/
		//dan i  dan*i
		int i;
		for(i=1;i<=9;i++)
			System.out.println(dan+"x"+i+"="+(dan*i));
			//System.out.printf("%dx%d=%d",dan,i,dan*i);
		
		

	}

}
