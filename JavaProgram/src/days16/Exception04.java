package days16;

public class Exception04 {

	public static void main(String[] args) {
	
		method01();

	}

	private static void method01() {
		
		try {
			method02();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		/*
		try {	
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		*/
	}

	private static void method02() throws Exception  {
		//꼭 기억해두자~!!
		throw new Exception(); //강제 예외 발생
		// 예외상황에 마우스를 올리고, 풍선도움말 처럼 표시되는 곳에서 메뉴를 선책합니다.
		// 1. add throws declaration
		// 2. surround with try catch
		// 2번을 선택하면 현재위치에서 try catch가 추가되며, 이는 현재메서드에서 에러처리를 마무리 하겠다는 뜻입니다.
		// 또는 수동으로 try catch를 사용해줄 수도 있습니다.
		/*
		 try{
		 	throw new Exception();
		 } catch(Exception e){
		 
		 }
		 */
		
		//1번을 선택하면 현재 메서드의 이름 옆에 throws Exception 라는 구문 붙으면서 
		//method02를 호출하는 명령에 예외처리상황이 이동됩니다.
		
	}

}
