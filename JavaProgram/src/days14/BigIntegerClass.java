package days14;

import java.math.BigInteger;

public class BigIntegerClass {

	public static void main(String[] args) {
		// BigInteger 클래스 : int와 long형 자료를 담아낼 수 없이 큰 숫자를 다룰 수 있게 만들 클래스
		// BigInteger bi = 1; //에러 //단순 숫자 자료는 모두 int형
		// BigInteger bi = (long)1; //에러 //long 로 캐스팅 해도 BigInteger에는 입력이 불가능 합니다.
		BigInteger bi = BigInteger.ONE;
		System.out.println(bi);
		
		BigInteger fact=BigInteger.ONE;
		
		for(int n=1;n<=40;n++) {
			fact = BigInteger.ONE;
			//1~n까지 곱셈 그리고 반복을 마치고 결과 출력
			//팩토리얼 계산하는 반복실행문을 제어해주는 변수도 BigInteger이어야 계산이 가능합니다.
			BigInteger start=BigInteger.ONE; //반복제어 변수
			BigInteger end=BigInteger.valueOf(n);
			for(start=BigInteger.ONE;start.compareTo(end)<=0;
					start=start.add(BigInteger.ONE)) { //start(1) 부터 end(n)까지 1씩 늘리며 반복
				fact=fact.multiply(start);
			}
			System.out.printf("%d!=%s\n", n, fact.toString());
		}
		
	}

}
