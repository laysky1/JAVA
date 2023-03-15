package days06;

public class ControlOp_For12 {

	public static void main(String[] args) {
	
		int i;
		int j;
		for(j=1;j<=10;j++) {
		for(i=1;i<=10;i++) {
		System.out.printf("(%d,%d)",j,i);
		}
		System.out.println();
		}
		//j가 1일때, i가 1~10까지 반복
		//j가 2일때, i가 1~10까지 반복
		//j가 3일때, i가 1~10까지 반볻
		//.....
		//j가 10일때, i가 1~10까지 반복
		
		
		
		System.out.println();
		
		int a, b;
		
		for(a=1;a<=5;a++) {
		for(b=1;b<=5;b++) {
			System.out.printf("(%d ,%d) ",a,b);
		}
		System.out.println();
		}
		
	}

}
