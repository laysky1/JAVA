package days03;

//연산자

//대입연산 : =
//산술-사(오)칙연산자 : +,-,/,*,%
//논리 연산자 : &&(And), ||(Or), !(Not)
public class Operator01 {
	public static void main(String[] args) {
		int n1 = 10, n2 = 7, result1;
		double result2;
		result1 = n1+n2;
		System.out.println(n1 +"+"+n2+"="+result1);
		result1 = n1-n2;
		System.out.println(n1 +"-"+n2+"="+result1);
		result1 = n1*n2;
		System.out.println(n1 +"x"+n2+"="+result1);
		result2 = n1/(double)n2;
		System.out.println(n1 +"/"+n2+"="+result2);
		double result3 =(int)(result2*100)/100.0;
		System.out.println(n1 +"÷"+n2+"="+result3);
		System.out.println();

	
		//연산명령의 형식
		//연산결과가 저장될 변수 = 피연산자1 연산기호 피연산자2
	
		int n=50;
		System.out.println("n변수의 최초값= "+n);
		// 피연산자로 쓰인 변수와 연산의 결과를 저장변수가 같은 연산
		n= n+10;   //n+10 와 같은 표현
		// 1. n변수에 저장된 값과 10을 덧셈연산하고, 
		// 2.그 결과를 다시 n변수에 저장
		// 연산을 하고 나면 n변수의 원래 50은 사라지고, 연산결과인 60이 저장된채로 남습니다.
		System.out.println("n=n+10 연산의 결과 -> n : "+n);
		//위와 같은 연산을 간단히 쓰기 위해 n+=10이라고 표현하기도 합니다.
		
		System.out.println("n변수의 최초값= "+n);
		n=n-10; //n-=10;
		System.out.println("n=n-10 연산의 결과 -> n : "+n);
		
		System.out.println("n변수의 최초값= "+n);
		n=n*10; //n*=10;
		System.out.println("n=n*10 연산의 결과 -> n : "+n);
		
		double d=50.0;
		System.out.println("d변수의 최초값= "+d);
		d=d/10; //d/=10;
		System.out.println("d=d/10 연산의 결과 -> n : "+n);
		
		System.out.println("n변수의 최초값= "+n);
		n=n%10; //n%=10;
		System.out.println("n=n%10 연산의 결과 -> n : "+n);
		
		
		System.out.println();
		//n=n+1; n=n-1;
		//n+=1; n-=1;
		//n++;   n--;
		//특정 변수의 값을 1 증가하거나, 감소시킬수 있는 연산자
		//대입연산자(=)를 사용하지 않고 값을 변경합니다.
		
		n = 50;
		System.out.println("n변수의 원래값 ="+n);
		n++; //n+=1; n=n+1;
		System.out.println("n++ 연산의 결과=>n : "+n);
		++n;
		System.out.println("++n 연산의 결과->n : "+n);
		// 위와 같은 단향연산일때는 ++나 --를 앞 또는 뒤에 어느곳에 붙여도 똑같이 연산됩니다.
		System.out.println(); 
		
		//++,-- 연산기호가 앞 또는 뒤에 있을때 차이가 나는 경우는 다른연산에 섞여있을때 입니다.
		n=10;
		System.out.println("현재 n값 :"+n); 
		//++,-- 연산기호가 앞 또는 뒤쪽에 있는 경우 : 현재값으로 속해있는 연산에 참여후, 1증가
		int k = n++;
		System.out.println("k :"+k); //10출력  //++가 뒤에 있어 먼저 n의 값이 오기 때문에 k:10
		System.out.println("n :"+n); //11출력 //앞의 연산이 10이 였기때문에 n : 11
		
		n= 10;
		System.out.println("현재n값 : "+n);
		// ++,-- 연산이 앞쪽에 있는 경우 :1 증가 후 다른 연산에 참여
		k= ++n;
		System.out.println("k :"+k); //11출력
		System.out.println("n :"+n); //11출력
		
		//시험문제에 출제



		
		
	}
}
