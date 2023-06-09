package days13;

class SuperG{}
class SubG1 extends SuperG {}
class SubG2 extends SuperG {}
class SubG3 extends SuperG {}

public class Extends08_TypeCasting03 {

	public static void main(String[] args) {
		SuperG s = new SuperG();
		SubG1 s1 = new SubG1();
		SubG2 s2 = new SubG2();
		SubG3 s3 = new SubG3();

		if(s instanceof SubG1)
			System.out.println("SubG1 클래스 타입");
		if(s instanceof SubG2)
			System.out.println("SubG2 클래스 타입");
		if(s instanceof SubG3)
			System.out.println("SubG3 클래스 타입");
		if(s instanceof SuperG)
			System.out.println("SuperG 클래스 타입");
		
		// instanceof 연산자를 사용하여 부모와 자식클래스의 타입을 비교하는 경우 반드시 부모클래스는 마지막에 비교합니다.
		// 부모클래스로의 캐스팅 검사가 자식 캐스팅 검사보다 뒤에 있다면 자식 캐스팅 검사들의 기회가 없어질 수 있습니다.
		if(s1 instanceof SubG1)
			System.out.println("SubG1 클래스 타입");
		else if(s1 instanceof SuperG)
			System.out.println("SuperG 클래스 타입");
		
	}

}
