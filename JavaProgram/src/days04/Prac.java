package days04;

public class Prac {

	boolean result;
	public static void main(String[] args) {
		//year변수에 저장된 년도가 윤년이면 true, 평년이면 false 를 출력
		int year = 2022;
		//(mon1==0) && (mon2 != 0)||(mon3==0) ->윤년
		//해당연도가 4의 배수이면서,(and) 100의 배수가 아니거나(or) 400의 배수인 해
		boolean result1 = year>= 4;
		boolean result2 = !(year>=100);
		boolean result3 = year>=400;
		boolean result = (result1 && result2)||result3 ;
		System.out.println(year+"은 윤달이다 :"+result);
	}

}
