package days03;

import java.util.Scanner;

public class Variable05 {

	public static void main(String[] args) {
		//이름, 국어,영어,수학 점수를 입력받아서 1명의 성적표를 총점 평균과 함께 기존 성적표 양식에 맞춰 출력하세요
		//문자(이름)을 입력 받는 명령 ->sc.nextLine()
		//입력 받을때 반드시 이름부터 입력받으세요  순서 : 이름, 국어, 영어, 수학
		//평균은 소수점 첫째자리 까지
		
		String name;
		int kor , eng , mat, total ;
		double average ;
		Scanner sc = new Scanner(System.in);
		
		//입력->연산->출력
	
		System.out.printf("학생 이름 : ");
		name = sc.nextLine();
		System.out.printf("국어 점수 : ");
		kor = sc.nextInt();
		System.out.printf("영어 점수 : ");
		eng = sc.nextInt();
		System.out.printf("수학점수 : ");
		mat = sc.nextInt();
		
		
		total = kor+eng+mat;
		average = total/3.0;

		
		
		System.out.printf("\t\t###성적표###\n");
		System.out.printf("----------------------------------------------------------\n");
		System.out.printf("번 호\t이 름\t\t 국 어\t영 어\t수 학\t총 점\t평 균\n");
		System.out.printf("%d\t%s\t\t %d\t%d\t%d\t%d\t%.2f\n",1,name,kor,eng,mat,total,average);
		System.out.printf("----------------------------------------------------------\n");
		System.out.println(1+"\t"+ name +"\t\t"+kor+"\t"+eng+"\t"+mat+"\t"+total+"\t"+(int)(average*100)/100.0);
		//


	  
			
	}

}
