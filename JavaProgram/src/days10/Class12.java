package days10;

class ExClass{
	
	public ExClass(){System.out.println("ExClass 클래스의 디폴트 생성자 호출");
		
	}
	
	 
	
public ExClass(int a){ System.out.println("ExClass 클래스의 int타입 매개변수를 전달받는 생성자 호출");
		 
	 }
	 ExClass(double b){System.out.println("ExClass 클래스의 double 타입 매개변수를 전달받는 생성자 호출");
		 
	 }
}



public class Class12 {

	public static void main(String[] args) {
		ExClass e1=new ExClass();
		ExClass e2=new ExClass(10);
		ExClass e3=new ExClass(12.23);
		// 위와 같은 실행이 가능하도록 ExCclass의 생성자들을 만들어 주세요.
		// 생성자에서는 각각 어떤 매개변수가 있는 생성자인지 출력되게 코딩하세요.
		//예)System.out.println("ExClass 클래스의 디폴트 생성자 호출");
		//System.out.println("ExClass 클래스의 int타입 매개변수를 전달받는 생성자 호출");
		//System.out.println("ExClass 클래스의 double 타입 매개변수를 전달받는 생성자 호출");
	}

}
