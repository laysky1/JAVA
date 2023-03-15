package days06;

import java.util.Scanner;

public class ControlOp_While04 {

	public static void main(String[] args) {
		
		//출력할 구구단의 단을 입력하세요 : 2
		
		//2x1=2
		//2x2=4
		//...
		//2x9=18
		
		//사용자에게서 단을 입력받아 구구단을 출력합니다.
		//사용자가 0을 입력할때까지 출력할 단을 연이어 입력받고 구구단을 출력합니다... 입력-출력-입력-출력
		//while 문을 이용해서 작성해주세요
		
		Scanner sc=new Scanner(System.in);
		int dan=1;
		int i, k;
		while(true) {
		System.out.printf("단을 입력하세요(끝내려면 0입력) : ");
		k=sc.nextInt();
		if(k==0)break;
		i=1;
		while(i<=9) {
			dan=k*i;
			System.out.println(k+"x"+i+"="+dan);
			i++;
			}
		System.out.println("-------------");
		}
		System.out.println("프로그램이 종료됩니다.");
		
		

			
		

	}

}
