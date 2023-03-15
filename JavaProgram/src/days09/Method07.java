package days09;

public class Method07 {

	public static void main(String[] args) {
		int[]a= {56,54,87,89,25,36,57,98};
		//아래 명령 sum(a);이 정상 실행되어서 배열내 값들의 합계와 평균을 출력하도록 
		//sum 함수를 제작하세요
		System.out.println("int[]a의 출력 : ");
		for (int k : a)System.out.printf("%d ",k);
		System.out.println();
		
		sum(a);
		

	}
	public static void sum(int[]b) {
		
		b[0] =56; b[1] =54; b[2] =87; b[3] =89; b[4] =25; b[5] =36; b[6] =57; b[6] =98;
		int sum=0;
		double avg;
		for(int i=0;i<b.length;i++)
			sum=sum +b[i];
			avg=sum/(double)b.length;
		System.out.printf
		("합계 : %d, 평균 : %.2f\n",sum,avg);
		
	}
}
