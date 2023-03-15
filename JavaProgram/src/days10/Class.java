package days10;

// 앞선 예제 Class09과 같이 클래스 내부에 생성자를 꺼내어 따로 정의하지 않으면,
// 컴파일러는 자동으로 클래스 내부에 숨어있는 생성자(디폴트 생성자)를 호출합니다.
// 디폴트 생성자 : Bclass(){}와 같이 생겨서 기본 형태만 설정된 생성자
// 아래와 같이 내용없이 생성자를 따로 정의하는 것은, 따로 생성자를 아예 기술하지 않는것과 같습니다.
class Bclass{
	private int age;
	//Bclass(){
		
	//}  //디폴트 생성자
	//내용없이 디폴트 생성자를 꺼내는 것은 그냥 안꺼낸것과 같습니다
	// 그러나 아래처럼 매개변수가 생기거나 추가 명령이 필요하다면 꺼내놓고 추가 기술을 해서 이용합니다.
	// 생성자라도 리턴값만 없을 뿐, 매서드이므로 매개변수를 사용할 수 있습니다.
	Bclass(int a){
		age=a;
	}
	
}

public class Class {

	public static void main(String[] args) {
		
		//Bclass b = new Bclass();
		//별도의 생성자가 없으면, 컴파일러가 클래스 내부에 숨어있는 "디폴트생성자"를 호출합니다.
		
		Bclass b1 = new Bclass(40);
		Bclass b2 = new Bclass(50);
		//생성자가 매개변수를 활용하는 경우 각각의 객체마다 서로 다른 값을 가질 수 있습니다.

	}

}
