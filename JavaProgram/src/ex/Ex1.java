package ex;



class Super{
	Super(){
		this("");
		System.out.println("Super()"); //4
	}
	Super(int i){
		
		System.out.println("Super(int)"); //1
	}
	Super(double d){
		this(3);
		System.out.println("Super(double)"); //2
	}
	Super(String s){
		this(123.42);
		System.out.println("Super(String)"); //3
	}
}
class Sub extends Super{
	
	Sub(){//8
	this("");
		System.out.println("Sub()"); 
	}
	Sub(int i){//5
		super();
		System.out.println("Sub(int)"); 
	}
	Sub(double d){//6
		this(2);
		System.out.println("Sub(double)"); 
	}
	Sub(String s){//7
		this(123.57);
		System.out.println("Sub(String)");
	}
}
public class Ex1 {

	public static void main(String[] args) {
	
		Sub s=new Sub();
		
	}

}
