package days13;

class Meat{
	public void sound() {
		System.out.println("고기 굽는 소리");
	}
}
class Pig extends Meat{
	public void sound() {
		System.out.println("치이이이익-");
	}
}
class Dack extends Meat{
	public void sound() {
		System.out.println("보글보글");
	}
}
public class Extends_ex {

	public static void main(String[] args) {
		Meat m=new Meat();
		m.sound();
		Pig p=new Pig();
		p.sound();
		Dack d=new Dack();
		d.sound();
	}

}
