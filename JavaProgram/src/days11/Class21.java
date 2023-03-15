package days11;

class Student3{
	private int bun;
	private String name;
	private int[]scores;
	private int tot;
	private double avg;
	static int count=0;
	
	Student3(){
		count++;
		bun=count;
	}

	public Student3(String name) {
		this();
		this.name=name;
		this.scores=new int[3];
		this.scores[0]=89;
		this.scores[1]=78;
		this.scores[2]=86;
		
	}

	public Student3(String name, int k, int e, int m) {
		this();
		this.scores=new int[3];
		this.name=name;
		this.scores[0]=k;
		this.scores[1]=e;
		this.scores[2]=m;
	}

	public Student3(Student3 s) {
		this();
		this.scores=new int[3];
		this.name=s.name;
		this.scores[0]=s.scores[0];
		this.scores[1]=s.scores[1];
		this.scores[2]=s.scores[2];
	}

	public void copy(Student3 s) {
		this.name=s.name;
		this.scores=new int[3];
		this.scores[0]=s.scores[0];
		this.scores[1]=s.scores[1];
		this.scores[2]=s.scores[2];
	}

	public void prn() {
		int tot=0;
		System.out.printf("%d\t%s\t\t",bun,name);
		for(int i=0;i<this.scores.length;i++) {
			System.out.printf("%d\t",scores[i]);
			tot += scores[i]; 
		}
			System.out.printf("%d\t",tot);
			System.out.printf("%.2f\t",tot/(double)(this.scores.length));
			System.out.println();
	
	
	}
}
//전달인수 없는 생성자에서 count를 증가하고 번호를 저장합니다.
//그 외 생성자에서는 전달인수 없는 생성자를 호출해서 해당코드가 실행되기 합니다.
//출력은 아래 양식에 맞추고, 전체할생수를 맨 아래 출력하세요.
public class Class21 {

	public static void main(String[] args) {
		Student3 s1 = new Student3();
		Student3 s2 = new Student3("홍길서");
		Student3 s3 = new Student3("홍길동",56,99,55);
		Student3 s4 = new Student3(s3);
		s1.copy(s2);
		
		//성적표 출력
		System.out.println("\t\t===========성적표==============\t\t");
		System.out.println("--------------------------------------------------------");
		System.out.println("번호\t이름\t\t국어\t영어\t수학\t총점\t평균");
		s1.prn();		s2.prn();		s3.prn();		s4.prn();
		System.out.println("---------------------------------------------------------");
		System.out.println("학생 총인원 : "+ (Student3.count));

	
	}
	}


