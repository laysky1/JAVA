package days10;

class Student{
	int bunho;
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	double avg;
}
public class Class02 {

	public static void main(String[] args) {
		
		Student std1 = new Student();
		
		std1.bunho=1;
		std1.name="홍길동";
		std1.kor=89;
		std1.eng=87;
		std1.mat=93;
		
		Student std2 = new Student();
		
		std2.bunho=2;
		std2.name="홍길서";
		std2.kor=87;
		std2.eng=25;
		std2.mat=65;
		
		std1.tot=std1.kor + std1.eng + std1.mat;
		std1.avg = std1.tot/3.0;
		std2.tot=std2.kor + std2.eng + std2.mat;
		std2.avg = std2.tot/3.0;
		
		//각 멤버 변수를 이용하여 성적표를 출력해주세요
		
		System.out.println("\t\t###성적표###\t\t");
		System.out.println("--------------------------------------------------------");
		System.out.println("번호\t이름\t\t국어\t영어\t수학\t총점\t평균");
		System.out.println("--------------------------------------------------------");
		System.out.println(std1.bunho+"\t"+std1.name+"\t\t"+std1.kor+"\t"+std1.eng+"\t"+std1.mat+"\t"+std1.tot+"\t"+(int)std1.avg);
		System.out.println(std2.bunho+"\t"+std2.name+"\t\t"+std2.kor+"\t"+std2.eng+"\t"+std2.mat+"\t"+std2.tot+"\t"+std2.avg);
		System.out.println("--------------------------------------------------------");
	}

}
