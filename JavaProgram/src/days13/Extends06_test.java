package days13; //시험문제에 나온다  순서 대로 출력하는 방법(?)
// 부모클래스도 여러개 오버로딩
// 자식클래스도 여러개 오버로딩
class SuperD{
	SuperD(){
		this(3);
		System.out.println("SuperD()"); //3.
	}
	SuperD(int i){
		this(123.4);
		System.out.println("SuperD(int)"); //2.
	}
	SuperD(double d){this("");
		
		System.out.println("SuperD(double)"); //1.
	}
	SuperD(String s){
		
		System.out.println("SuperD(String)");//4.
	}
}
class SubD extends SuperD{
	SubD(){
		this(1);
		System.out.println("SubD()"); //8.
	}
	SubD(int i){
		this(1.1);
		System.out.println("SubD(int)"); //5.
	}
	SubD(double d){
		this("");
		System.out.println("SubD(double)"); //6.
	}
	SubD(String s){
		
		System.out.println("SubD(String)");//7.
	}
}
public class Extends06_test {

	public static void main(String[] args) {
		SubD d=new SubD();

	}

}
