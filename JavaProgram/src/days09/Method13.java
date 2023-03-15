package days09;

import java.util.Scanner;

public class Method13 {

	public static void main(String[] args) {
		
		int kor, eng, mat, tot;
		double ave;
		//String grade;
		kor = myInput(1);//점수입력
		eng = myInput(2);
		mat = myInput(3);
		tot = sum(kor,eng,mat);//총점계산
		ave = avg(kor,eng,mat);//평균계산
		//grade=selectGrade(ave);
		prnTitle();
		prnScore( kor, eng, mat, tot, ave );

	}
	public static void prnScore(int a,int b,int c, int d, double e) {
		System.out.printf("%2d\t %3d\t%3d\t%3d\t%3d\t%.2f\n",1,a, b, c, d, e);
	}
	public static void prnTitle() {
		System.out.printf("\t\t###성적표###\n");
		System.out.printf("----------------------------------------------\n");
		System.out.printf("번호\t국 어\t영 어\t수 학\t총 점\t평 균\n");
		System.out.printf("----------------------------------------------\n");
		
	}
	public static double avg(int a,int b,int c) {
		//double n;
		//return n=(a+b+c)/3.0;
		return sum(a,b,c)/3.0;
	}
	public static int sum(int a,int b, int c) {
		int tot;
		return tot=a+b+c; //return a+b+c;
	}
	public static int myInput(int n) {
		if(n==1) System.out.print("국어 점수를 입력 하세요 : ");
		else if(n==2) System.out.print("영어 점수를 입력 하세요 : ");
		else System.out.print("수학점수를 입력하세요 : ");
		
		Scanner sc=new Scanner(System.in);
		return sc.nextInt();
	}
	
}
