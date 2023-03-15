package days13;

class Human1{
	private String name;
	private int age;
	public Human1(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public boolean equals(Object obj) {
		if( !(obj instanceof Human1)) return false;
		Human1 target=(Human1)obj;
		return (target.name.equals(this.name))&&target.age==this.age;
		
	}
	
}


public class Overriding {

	public static void main(String[] args) {
		Human s1 =new Human("김은지", 28);
		Human s2 =new Human("홍길동", 21);
		Human s3 =new Human("김은지", 28);
		System.out.println("Human1의 정보 - "+s1);		
		System.out.println("Human2의 정보 - "+s2);		
		System.out.println("Human3의 정보 - "+s3);		
		
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
