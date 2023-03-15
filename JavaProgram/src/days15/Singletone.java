package days15;

class Singletonex{
	private Singletonex() {		
	}
	private static Singletonex s=new Singletonex();
	
	public static Singletonex getInstance() {
		return s;
	}
}

public class Singletone {

	public static void main(String[] args) {
		Singletonex a=Singletonex.getInstance(); //Singletonex a=new Singletonex();는 에러에러

	}

}
