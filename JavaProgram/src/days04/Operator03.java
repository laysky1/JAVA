package days04;

public class Operator03 {

	public static void main(String[] args) {
		
		// 논리연산자 &&(AND), ||(OR), !(NOT)
		// 다수개의 관계(비교)연산식 결과(true/false)값을 대상으로 연산하여 하나의 boolean 값을 결과로 얻는 연산
		// 피연산자 = boolean , 연산의 결과 : boolean
		
		boolean result = true && false; //true false와 같은 boolean 데이터가 연산의 대상, 결과 : boolean
		System.out.printf("%b && %b -> %b\n", true,false,result);
		System.out.println("");
		//AND 연산 - &&
		//좌항과 우항이 모두 true 일때만 결과가 true 이고, 나머지는 모두 false
		//좌항과 우항에 하나라도 false가 있으면 결과가 false
		System.out.printf("F && F = %b\n",false && false);
		System.out.printf("T && F = %b\n",true && false);
		System.out.printf("F && T = %b\n",false && true);
		System.out.printf("T && T = %b\n",true && true);
		
		System.out.println("");
		// OR 연산 - ||
		// 좌항과 우황 중 하나라도 true가 있다면 결과는 true
		// 둘다 모두 false일때 결과가 false
		System.out.printf("F || F = %b\n",false || false);
		System.out.printf("T || F = %b\n",true || false);
		System.out.printf("F || T = %b\n",false || true);
		System.out.printf("T || T = %b\n",true || true);
		
		System.out.println("");
		
		// NOT연산 - !
		//단항연산(피연산자1개)
		//true/false 값을 현재값의 반대로 변경하는 연산
		result = false;
		System.out.printf("Not-%b = %b\n",result,!result);
		
		System.out.println("");

		
		// 입력받은 정수(점수)가 50이상이면서 100이하이면 true 출력, 그렇지 않으면 false
		int a = 80;
		
		boolean result1 = a >= 50;
		boolean result2 = a <= 100;
		
		result = result1 && result2; // 둘의 관계연산 결과가 모두 true일때 result 변수에 true값이 저장됩니다.
		//result =(a >= 50) && (a <= 100);
		

		System.out.printf("result && result2 -> %b\n",result);

		System.out.printf("입력한 정수는 50이상이면서 100이하입니다 : %b\n",result);
		
		System.out.println("");

		
		// 입력받은 정수가 100이상이거나, 40 미만이라면 true 그렇지 않으면 false
		a = 30;
		result1 = a>=100;
		result2 = a<40;
		result = result1 || result2;
		System.out.printf("입력한 %d는 100이상이거나 40 미만입니다 : %b\n",a,result);
		
		System.out.println("");
		
		a = 60;
		result1 = a>=100;
		result2 = a<40;
		result = result1 || result2;
		System.out.printf("입력한 %d는 100이상이거나 40 미만입니다 : %b\n",a,result);
		
		System.out.println("");

		//점수가 80점 이상이면서 90점 이하이면 true, 아니면 false 출력 
		int number = 80;
		boolean number1 = number >= 80;
		boolean number2 =	 number <= 90;
		result = number1 && number2;
		 System.out.printf("점수가 80점 이상이면서 90점 이하입니다 : %b\n",result);
			System.out.println("");
		//점수가 100이상이거나 50미만이면 true, 아니면 false (이거나, 또는)
		boolean number3 = number>= 100;
		boolean number4 = number<50;
		result = number3 || number4;
	    System.out.printf("점수가 100점 이상이면서 50점 미만입니다 : %b\n",result);
		System.out.println("");
		int kor=35, eng=98, mat= 95;
		double avg;
		avg=(kor*eng*mat)/3.0;
		System.out.println("");
		//평균이 80이상이면서 영어점수가 75점 이상이고, 국어점수가 80이상이면 true 출력, 아니면 false출력
		boolean school1 = avg>= 80;
		boolean school2 = eng>= 75;
		boolean school3 = kor>=80;
		result1 = school1 && school2 && school3 ;
		System.out.printf("평균이 80점 이상이면서 영어점수가 75점 이상이고, 국어점수가 80점이상이다 :%b\n",result1);		
		System.out.println("");
		
		//국어:50이상, 영어:60이상, 수학:70이상이면 true, 모두 40이상 false 출력
		//(kor>=50)&& (eng>=60)&&(mat>=70)
		//result1 && result2 && result3
	
		result = (kor>=50)&& (eng>=60)&&(mat>=70);
		
		System.out.println("실행결과 :"+result);
		System.out.println("");
		//세 과목중 한과목이라도 40미만이라면 true, 모두 40이상 false 출력
		result1 =kor >=40;
		result2 =eng >=40; 
		boolean result3 = mat >=40;
		result =!(result1&&result2&& result3);
		System.out.println("실행결과2 :"+result);
		
		//평균 60미만이거나 한과목이라도 40미만이라면 true, 아니면 false출력
		result1 = avg<60;
		result2 = eng<40;
		result3 = mat<40;
		boolean result4 = kor<40;
		result = result1||result2||result3||result4;
		System.out.println("실행결과3 :"+result);
		
		// 국어 점수가 짝수이면 true, 홀수이면 false
		
		int re= kor % 2;
		int re1 = mat %2;
		result = re == 0;
		System.out.printf("국어점수 짝수? : %b\n",result);
		System.out.println();

		//year변수에 저장된 년도가 윤년이면 true, 평년이면 false 를 출력
		int year = 2022;
		
		//해당연도가 4의 배수이면서,(and) 100의 배수가 아니거나(or) 400의 배수인 해
		
		
		int mon1 = year % 4;
		int mon2 = year%100;
		int mon3 = year%400;
		
		result = (mon1==0) && (mon2 != 0)||(mon3==0);
		System.out.println(year+"년은 윤년?"+result);
		
		
		;
		 
		 
		
		
		
		

	}

}
