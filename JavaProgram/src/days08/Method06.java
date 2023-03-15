package days08;

public class Method06 {

	public static void main(String[] args) {
		
		int[]a= {111,222,333};
		
		System.out.println("\nmain 에서 출력 : ");
		for(int k : a)System.out.printf("%d ", k);
		 
		System.out.println();
		
		updateValue( a );
		//전달되는 곳에 있는 변수가 저장한 값이 참조값이라는 건... 참조값의 복사본이 전달된다는 뜻
		
		System.out.println("\nmain 에서 출력 : ");
		for(int k : a)System.out.printf("%d ", k);
		System.out.println();
	}
	//전달인수가 주소라면, 매개변수도 그 주소를 저장할 수 있는 변수이어야합니다.
	//참조값을 전달인수로 한 메서드 호출시 호출한곳에 호출당한곳이 하나의 자료를 공유해서 사용하겠다는 뜻입니다. 
	public static void updateValue(int[]b) {
		b[0] = 444; b[1]=555; b[2]=666;
		System.out.println("\nupdateValue 에서 출력 : ");
		for(int k: b)System.out.printf("%d ",k);
		System.out.println("");
		
	}
	//이와 같이 전달인수로 주소(참조값)를 보내는 호출을 Call by Referrance 라고 부릅니다.
}
