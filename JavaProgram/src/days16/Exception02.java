package days16;

public class Exception02 {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);	//실행되지 ㅇ낳는다.
		}catch(ArithmeticException e) { //종류별 예외 처리 1
			
			e.printStackTrace();		//java.lang.ArithmeticException : /by zero
			System.out.println("예외 메세지 : " + e.getMessage());
			
		}catch(Exception e) {	//종류별 예외 메세지
			
			System.out.println("Exception" );
			
		}
		System.out.println(5);
	}

}
