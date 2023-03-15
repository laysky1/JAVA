package days15;

import java.util.Scanner;

class Student{
	private int bunho;
	private int kor, eng, mat, tot;
	private String name;
	private double avg;
	private String grade;
	
	static int count=0;
	
	Student(){
		count++;
		this.bunho = count;
	}
	
	public void input() {	//this <- std1
		Scanner sc=new Scanner(System.in);
		// 앞선 예제에서 처럼 리턴 값을 이용해서 각 변수에 값을 저장할 수도 있지만,
		// 입력 받는 곳에 저장할 변수도 있는 셈이기 때문에 따로 리턴하지 않습니다.
		// 메서드를 호출한 객체가 this에 와있기 때문에 this를 이용해서 멤버변수에 입력값을 저장할 겁니다.
		System.out.print("이름 : ");
		this.name = sc.nextLine();
		System.out.println("국어 점수 :");
		this.kor = Integer.parseInt(sc.nextLine());
		System.out.println("영어 점수 :");
		this.eng = Integer.parseInt(sc.nextLine());
		System.out.println("수학 점수 :");
		this.mat = Integer.parseInt(sc.nextLine());
	}
	public void sum_avg() {
		this.tot = kor+eng+mat;
		this.avg=tot/3.0;
	}
	public static void printTitle() {
		System.out.println("\n\t\t=====성적표=====");
		System.out.println("----------------------------------------------------");
		System.out.println("번호\t성명\t\t국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println("----------------------------------------------------");
	}
	public void printScore() {
		System.out.printf("%d\t%s\t\t%d\t%d\t%d\t%d\t%.1f\t%s\n",bunho,name,kor,eng,mat,tot,avg,grade);
	}
	public void selectGrade() {
		
		if(this.avg>=90) grade="A";
		else if(this.avg>=80)grade="B";
		else if(this.avg>=70)grade="C";
		else if(this.avg>=60)grade="D";
		else grade="F";
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
}
// 인스턴스 변수 bunho, 스태틱변수 count 만들어서 생성되는 학생에게 새로운 번호를 부여하고 출력되게 작성해주세요
// String형 grade 멤버변수를 생성하고, grade를 평균값에 따라 결정하는 멤버메서드를 생성하세요



public class Abcd02 {

	public static void main(String[] args) {
		
		
		
		Student std1 = new Student();
		
		std1.input();
		std1.sum_avg();
		std1.selectGrade();
		
		//학생 한명 추가
		Student std2 = new Student();
		std2.input();
		std2.sum_avg();
		
		Student.printTitle();
		std1.printScore();
		
		//std2.selectGrade();
		
		double avg=std2.getAvg();
		String grade = "";
		if(avg>=90) grade="A";
		else if(avg>=80)grade="B";
		else if(avg>=70)grade="C";
		else if(avg>=60)grade="D";
		else grade="F";
		
	
		std2.setGrade(grade);
		std2.printScore();
		
		
		/*
		System.out.print("이름 : ");
		std1.name = sc.nextLine();
		System.out.println("국어 점수 :");
		std1.kor = Integer.parseInt(sc.nextLine());
		System.out.println("영어 점수 :");
		std1.eng = Integer.parseInt(sc.nextLine());
		System.out.println("수학 점수 :");
		std1.mat = Integer.parseInt(sc.nextLine());
		// 이 코드를 객체를 대상으로 쓰지 않는 이유는 대부분의 멤버변수가 private으로 보호될 예정이기 때문에
		*/
	}

}
