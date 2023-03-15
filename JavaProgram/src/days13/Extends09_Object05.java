package days13;

class Circle{
	private int x;	//원의 중점 x좌표
	private int y;	//원의 중점 y좌표
	private int radius; // 반지름
	Circle(int x, int y, int radius){
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Circle)) return false;
		Circle target=(Circle)obj;
		
		boolean flag_x=this.x==(target.x);
		boolean flag_y=this.y==(target.y);
		boolean flag_radius=this.radius==(target.radius);
		boolean result= flag_x&&flag_y&&flag_radius;
		return result;
		
		//return(this.x==target.x)&&(this.y==target.y)&&(this.radius==target.radius);
		
	}
}
public class Extends09_Object05 {

	public static void main(String[] args) {
		Circle c1 = new Circle(5,7,10);
		Circle c2 = new Circle(5,7,10);
		Circle c3 = new Circle(6,9,5);

		System.out.println("원c1의 정보 - "+c1);  //x좌표 :xx , y좌표 : xx, 반지름: xx
		System.out.println("원c2의 정보 - "+c2);
		System.out.println("원c3의 정보 - "+c3);
		
		if(c1.equals(c2))
			System.out.println("c1 변수와 c2 변수는 같습니다");
		else System.out.println("c1 변수와 c2 변수는 다릅니다");
		
		if(c1.equals(c3))
			System.out.println("c1 변수와 c3 변수는 같습니다");
		else System.out.println("c1 변수와 c3 변수는 다릅니다");
		
	}

}
