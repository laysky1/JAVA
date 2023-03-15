package days06;

public class ControlOp_For13 {

	public static void main(String[] args) {
		//이중 반복문을 이용해서 구구단 1단부터 9단까지 출력하세요.
		//한개의 단이 출력되는 방향은 세로이든 가로이든 상관 없습니다.
		//1x1=1 1x2=2 1x3=3......1x9=9
		//2x1=2  2x2=4 2x3=6......2x9=18
	
		int a,b ;
		for(a=1;a<=9;a++) {
			for(b=1;b<=5;b++) {
				System.out.printf("%d x %d = %d\n",a,b,a*b);
			}
		}
	}

}
