package days15;

import java.util.Scanner;

public class Abcd01 {

	public static void main(String[] args) {
		
		
		int kor, eng, mat, tot, bun;
		double avg;
		String name;
		
		/*
		System.out.println("이름을 입력하세요");
		name = sc.nextLine();
		System.out.println("국어 점수 :");
		kor = Integer.parseInt(sc.nextLine());
		System.out.println("영어 점수 :");
		eng = Integer.parseInt(sc.nextLine());
		System.out.println("수학 점수 :");
		mat = Integer.parseInt(sc.nextLine());
		*/	
		
		name=inputData("이름");
		kor = Integer.parseInt(inputData("국어"));
		eng = Integer.parseInt(inputData("영어"));
		mat = Integer.parseInt(inputData("수학"));
		
		printTitle();
		
		tot = sum(kor,eng,mat);
		avg =average(tot);
		printScore(name,kor, eng, mat,tot,avg);
		
		//학생 한명 추가
		int kor2, eng2, mat2, tot2, bun2;
		double avg2;
		String name2;
		name2=inputData("이름");
		kor2 = Integer.parseInt(inputData("국어"));
		eng2= Integer.parseInt(inputData("영어"));
		mat2 = Integer.parseInt(inputData("수학"));
		tot2 = sum(kor2,eng2,mat2);
		avg2 =average(tot2);
		printScore(name2,kor2, eng2, mat2,tot2,avg2);
		
	}

	private static void printScore(String name,int kor, int eng, int mat, int tot, double avg) {
		System.out.printf("%d\t%s\t\t%d\t%d\t%d\t%d\t%.1f",1,name,kor,eng,mat,tot,avg);
		
	}

	private static double average(int tot) {
		double avg =tot/(double)3.0;
		return avg;
	}

	private static int sum(int k, int e, int m) {
		int tot=k+e+m;
		return tot;
	}

	public static String inputData(String s) {
		Scanner sc = new Scanner(System.in);
		System.out.print(s+" 입력 : ");
		String str=sc.nextLine();
		return str;
	}

	public static void printTitle() {
		System.out.println("\n\t\t=====성적표=====");
		System.out.println("----------------------------------------------------");
		System.out.println("번호\t성명\t\t국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------------------------");
	}
	
}
