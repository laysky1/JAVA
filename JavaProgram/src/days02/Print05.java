package days02;

public class Print05 {

	public static void main(String[] args) {
		//1번학생 - 이름 :홍길동 국어 : 88 영어 : 45 수학 : 100
	    //2번학생 - 이름 :홍길남 국어 : 89 영어 : 100 수학 : 89
	    //3번학생 - 이름 :홍길서 국어 : 100 영어 : 88 수학 : 78
		
		// 위 자료와 System.out.println을 이용해서 성적표를 출력해주세요
		// 자리수 조절은 안해도됩니다. 소수점 자리도 맞추지 않아도 됩니다.

		System.out.println("\t\t###성적표###");
		System.out.println("-------------------------------------------------------------");
		System.out.println("번호\t성명\t\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-------------------------------------------------------------");
		System.out.println("1\t홍길동\t\t88\t45\t100\t" + (88+45+100) + "\t" +(int)( (88+45+100)/3.0*10)/10.0);
		System.out.println("2\t홍길남\t\t89\t100\t89\t" + (89+100+89) + "\t" + (int)((89+100+89)/3.0*10)/10.0);
		System.out.println("3\t홍길서\t\t100\t88\t78\t" + (100+88+78) + "\t" +(int)( (100+88+78)/3.0*10)/10.0);
		System.out.println("-------------------------------------------------------------");
		//연산의 순서 
		//1. (88+45+100) 계산
		//2. (88+45+100)/3.0 계산
		//3. "11\t홍길동\t88\t45\t100\t"와 (88+45+100)계산 결과 이어붙이기
		//3-1. 3번 연산의 결과와 "\t" 이어붙이기
		//4. 3-1번의 연산결과와 (88+45+100)/3.0 계산결과 이어붙이기
		
		// 1.  88.6666667  *10 -> 886.666667
		// 2. 소수점 아래를 버립니다.  (int)886.66667 ->886
		// 3. 886/ 10.0 ->88.6




	}

}
