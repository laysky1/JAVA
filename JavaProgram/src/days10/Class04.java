package days10;


class Std{//같은 패키지 안에서는 클래스 이름이 중복될 수 없습니다. 그래서 Student 대신 Std라는 이름을 사용합니다.
	private int bun;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double avg;
	public void input() {
		bun=1;
		name="홍길동";
		kor=88;
		eng=77;
		mat=99;		
	}
	public void input(int b, String n, int k, int e, int m) {
		bun=b;
		name=n;
		kor=k;
		eng=e;
		mat=m;
		tot=k+e+m;
		avg=tot/3.0;
		
	}
	public void prn() {
		System.out.printf("%d\t%s\t\t",bun,name);
		System.out.printf("%d\t%d\t%d\t%d\t%.1f\n",kor,eng,mat,tot,avg);
	}
	

}

public class Class04 {

	public static void main(String[] args) {
		
		Std s1=new Std();
		Std s2=new Std();
		
		s1.input(1,"홍길동",88,77,99);
		s2.input(2,"홍길서",89,98,78);
		
		System.out.println("\t\t###성적표###\t\t");
		System.out.println("--------------------------------------------------------");
		System.out.println("번호\t이름\t\t국어\t영어\t수학\t총점\t평균");
		System.out.println("--------------------------------------------------------");
		s1.prn(); // 출력 양식에 맞게 멤버변수가 출력되는 메서드 제작
		s2.prn();
		System.out.println("--------------------------------------------------------");
		
	}
	
		
	}

