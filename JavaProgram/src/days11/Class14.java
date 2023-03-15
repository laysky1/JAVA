package days11;

class Student{
	private int bun;
	private String name;
	private int[] scores;
	
		Student(){
		bun=1;
		name="김은지";
		int []a = {98,89,100};
		scores = a;
	}
		Student(String s) {
		bun=2;
		name=s;
		int []a = {100,100,100};
		scores = a;
	}
		Student(String s,int i, int j, int n){
		bun=3;
		name=s;
		int []a = {i,j,n};
		scores = a;
		/*
		scores=new int[3];
		scores[0]=i;
		scores[1]=j;
		scores[2]=n;
		*/
	}
		 Student(Student s3) {
			 // 이미 new Student는 만들어진 상태
			 // 전달된 값을 copy만 하면 됩니다.
			 // Student(String n, int k, int e, int m)에서와 같이 전달값이 따로 전달되던 것을
			 // s에 담겨서 한번에 전달한 셈입니다.
		bun = 4;
		//bun = s.bun;
		name = s3.name;
		scores=s3.scores;
		}
		public void prn() {
			System.out.printf("%d\t %s\t",bun,name);
			for(int a=0 ;a<scores.length ; a++)
			System.out.printf("%d\t",scores[a]);
			System.out.println();
		}
	
}

//아래 생성자들이 모두 실행가능 하도록 생성자를 제작합니다.
//모든 생성자에서 scores에 정수 세개를 저장할 배열을 만들고 주소를 저장하도록 코딩하세요

//매개변수가 없는 생성자는 모든 변수값(번호,이름,점수)을 임의로 정한값으로
//매개변수에 이름만 전달되는 생성자는 이름을 제외한 모든 변수값을 임의의 값으로
//이름과 점수가 전달되는 생성자는 번호만 임의의 값으로 저장하고, 다른값들은 전달값으로 변수에 대입해주세요.
//prn() 메서드는 멤버변수들의 값을 이용하여 출력하되 양식은 임의로 설정해주세요

//전달인수가 클래스 객체인 경우 새로운 객체에 각 멤버변수 값을 복사한 객체가 만들어지게 코딩하세요.
public class Class14 {

	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student("홍길서");
		Student s3=new Student("홍길남",98,69,87);
		Student s4=new Student(s3);
		s1.prn();		s2.prn();		s3.prn();		s4.prn();

	}

}
