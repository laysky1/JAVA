package days06;

import java.util.Scanner;

public class pt {

	public static void main(String[] args) {
		
		int a=1;
		while(a<=10) {
			a++;
			System.out.printf("둠칫");
		}
		System.out.println("------------------------------------");
		
		
			
		//10부터 50사이의 짝수의 출력 : while 문을 이용해주세요
		/*
		int i=10;
		while(i<=50) {
			if(i%2==0) System.out.printf("%d ",i);
			i++;
		}*/
		System.out.println("------------------------------------");
		//사용자에게서 단을 입력받아 구구단을 출력합니다.
		//사용자가 0을 입력할때까지 출력할 단을 연이어 입력받고 구구단을 출력합니다... 입력-출력-입력-출력
		//while 문을 이용해서 작성해주세요
		
		Scanner sc=new Scanner(System.in);
		int dan=1;
		int i, k;
		while(true) {
		System.out.print("구구단을 알아봅시다(0을 입력하면 종료) : ");
		i=sc.nextInt();
		if(i==0) break;
		k=1;
		while(k<=9) {
			dan=k*i;
			System.out.printf("%d x %d = %d\n",i,k,dan);
			k++;
		}
		}
		System.out.print("종료합니다.");
		}
	}

	
