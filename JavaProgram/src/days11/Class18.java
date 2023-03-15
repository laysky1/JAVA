package days11;
class Student2{
	private int bunho;
	private String name;
	private int [] scores;
	private int tot;
	private double avg;
	private char grade;
	
	Student2(){ //생성자1
		scores=new int[3];
	}

	 Student2(String s) { //생성자 2
		this(); //this로 형제 생성자를 호출할때는 모든 다른 명령보다 항상 위에서 호출합니다.
		bunho=1;
		this.name=s;
		scores[0]=80;
		scores[1]=90;
		scores[2]=87;
	}

	Student2(String s, int k, int e, int m) { //생성자3
		this();
		bunho=2;
		this.name=s;
		scores[0]=k;
		scores[1]=e;
		scores[2]=m;
	}


	void copy1(Student2 s3) { /* this<-std1  매개변수가 std3 */
		 Student2 temp=new Student2();
			this.bunho=s3.bunho;
			this.name=s3.name;
			this.scores[0]=s3.scores[0];
			this.scores[1]=s3.scores[1];
			this.scores[2]=s3.scores[2];
	}

	 Student2 copy2() {//this <-std5 매개변수가 std2
		Student2 temp=new Student2();
		temp.bunho=this.bunho;
		temp.name=this.name;
		temp.scores[0]=this.scores[0];
		temp.scores[1]=this.scores[1];
		temp.scores[2]=this.scores[2];
		return temp;
	}
	
	 public Student2(Student2 std) {
		 //this에 새로만들어진 인스턴스의 주소가 전달됩니다.
		 this();
		 this.bunho=std.bunho;
		 this.name=std.name;
		 this.scores[0]=std.scores[0];
		 this.scores[1]=std.scores[1];
		 this.scores[2]=std.scores[2];
	}

	
	
}
//디폴트 생성자에서 배열(scores)에 저장공간을 할당해주세요. 정수 3자리 배열. 그 외 동작 없음 o
//String 자료를 전달인수로 하는 생성자에서 전달된 이름을 멤버변수에 저장하고 그외 점수는 임의 점수를 입력하세요o
//String 자료와 점수들을 전달인수로 하는 생성자는 각 전달값을 멤버변수에 저장하세요
//필요한 형제 생성자를 this로 호출해주세요
//copy1와 copy2를 제작 하세요  총 5개 (생성자3개 cp1,cp2) 

public class Class18 {

	public static void main(String[] args) {
		Student2 std1 = new Student2();
		Student2 std2 = new Student2("홍길동");
		Student2 std3 = new Student2("홍길남",98,87,89);

		std1.copy1(std3);
		Student2 std5=std2.copy2();
		
		Student2 std4 = new Student2(std3); //new Student2 에 의해 새공간이 만들어지고
		//그 주소는 std4에 전달되어 저장됩니다. 추가로 생성자에 숨어있는 this에도 주소는 전달됩니다.
				
		
	}

}
