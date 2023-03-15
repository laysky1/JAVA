package days13;  //시험문제 equals 오버라이딩 시험문제에 나온다   
class Human{
	private String name;
	private int age;
	public Human(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
		public String toString() {
			return "이름 : "+this.name+", 나이 : "+this.age;
		}
	
		public boolean equals(Object obj) {
			if(!(obj instanceof Human))return false;
			Human target=(Human)obj;
			return (this.name.equals(target.name))&&(this.age==target.age);
			/*
			 public boolean equals(Object obj) {
			if(!(obj instanceof Human)) return false;
			Human target=(Human)obj;
			return (this.name.equals(target.name))&&(this.age==target.age);
			 */
		}
	
	
	
	
	
	// 오버라이딩 되는 메서드의 조건 : 리턴값의 유형, 매개변수의 유형-갯수-순서가 같아야 합니다.
	// equals메서드는 어떤 클래스 내부에서도 오버라이딩 될 준비를 해야하므로
	// 매개변수를 모든 클래스가 전달 간으하도록 모든 클래스의 부모클래스인  Ocject 자료형으로 정해져있습니다.
//	public boolean equals( Object obj ) {
		// s1.equals(s2);
		// this<-s1   obj <-s2
		// this.name와 obj.name의 비교, this.age와 obj.age의 비교
		// obj는 부모참조변수이므로 자식 클래스의 멤버변수에 접근이 안됩니다.
		// 접근하려면 다시 Human 형으로 변환 (강제 캐스팅)을 해야합니다.
		
		// Human이 아닌 다른 클래스의 인스턴스 주소가 전달인수로 전달되었다면 , 바로 return false로 종료
	//	if(!(obj instanceof Human)) return false;
		//if문 조건이 false여서 지나쳤으면 형변환
		//Human target = (Human)obj;
		
		// 아까와는 사정이 달라졌어요
		// this.name와 target.name, this.age와 target.age를 비교합니다.
		//boolean flag_name = this.name.equals(target.name);		// 여기가
		//boolean flag_age = this.age==(target.age);						//  시험문제로
		//boolean result = flag_name&&flag_age;								//	나온다
		//return result;
	
	
	
	
	
}
public class Extends09_Object04test {

	public static void main(String[] args) {
		
		Human s1 =new Human("홍길동", 21);
		Human s2 =new Human("홍길동", 21);
		Human s3 =new Human("홍길서", 22);
		System.out.println("Human1의 정보 - "+s1);		
		System.out.println("Human2의 정보 - "+s2);		
		System.out.println("Human3의 정보 - "+s3);		
		
		//레퍼런스 변수들간의 비교
		if(s1==s2)
			System.out.println("s1 변수와 s2 변수는 같습니다(s1==s2)");
		else
			System.out.println("s1 변수와 s2 변수는 다릅니다(s1==s2)");
		//s1 변수와 s2 변수는 다릅니다(s1==s2)

		/*
		//.equals 메서드를 사용하여 비교(equals 메서드 오버라이드 이전)
		if(s1.equals(s2))
			System.out.println("s1 변수와 s2 변수는 같습니다(s1.equals(s2))");
		else
			System.out.println("s1 변수와 s2 변수는 다릅니다(s1.equals(s2))");
		//결과 : s1 변수와 s2 변수는 다릅니다(s1.equals(s2))
		//Object 클래스의 equals 메소드는 기본적으로 두 객체의 레퍼런스 값을 비교하는 연산만을 수행합니다.
		 */
		
		//equals 메서드를 사용하여 비교(equals메서드 오버라이드 이후)
		if(s1.equals(s2))
			System.out.println("s1 변수와 s2 변수는 같습니다(s1.equals(s2))");
		else
			System.out.println("s1 변수와 s2 변수는 다릅니다(s1.equals(s2))");
		
		if(s1.equals(s3))
			System.out.println("s1 변수와 s3 변수는 같습니다(s1.equals(s3))");
		else
			System.out.println("s1 변수와 s3 변수는 다릅니다(s1.equals(s3))");
		
	}

}
