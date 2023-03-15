package days03;

public class PrintEx {

	public static void main(String[] args) {
		int a , b , plusResult , minusResult , multiplyResult;
		char c;
		double divideResult;
		a = 16;
		b = 52;
		c= '+';
		plusResult = a + b;
		System.out.printf("%d %c %d = %d\n", a, c, b,plusResult);
		minusResult = a - b;
		c = '-';
		System.out.printf("%d %c %d = %d\n", a, c, b,minusResult);
		multiplyResult = a*b;
		c = '*';
		System.out.printf("%d %c %d = %d\n", a, c, b,multiplyResult);
		divideResult = a / (double)b; //정수와 정수의 연산을 결과가 정수
	    c = '÷';
	    System.out.printf("%d %c %d = %.2f\n", a, c, b,divideResult);
	    
	    
	    //위의 네개의 출력은 println으로 바꿔서 출력하세요
	    String s = "";
	    c= '+';
	   // System.out.println(a+c+b+"="+plusResult);
	    System.out.println(a+""+c+""+b+"="+plusResult);
	     //char 변수는 int 변수와 호환성이 존재합니다. 그래서 15+'A' ->80
	    //'A'의 이진수 코드값이 정수로 변해서 다른 정수와 산술 덧셈이 된다는 뜻입니다.
	    //다른 형식의 자료들이 산술연산되지 않고 이어붙이기가 되려면 피연산자중 반드시 하나는 String 이어야 합니다.
	    //그건 "" " "상관 없이 적용됩니다.
	   // System.out.println(a+c);
	    c= '-';
	    System.out.println(a+""+c+""+b+"="+minusResult); //15+""->"15"
	    c= 'x';
	    System.out.println(a+""+c+""+b+"="+multiplyResult);
	    c='÷';
	    System.out.println(a+""+c+""+b+"="+divideResult);
	    System.out.println(a+s+c+s+b+"="+plusResult);
	    
	    //int와 char간의 관계
	    System.out.println("\n");
	    char ch = 'A';
	   
	    //int와 char사이에는 자료형 간 호환성이 존재합니다.
	    System.out.printf("ch 변수의 값 : %c(%d)\n", ch, (int)ch);
	    System.out.printf("ch 변수의 값 다음 글자 : %c(%d)\n",ch+1, (int)ch+1);
	    System.out.printf("알파벳 A : %d\n",(int)'A');
	    System.out.printf("알파벳 Z : %d\n",(int)'Z');
	    System.out.printf("알파벳 a : %d\n",(int)'a');
	    System.out.printf("알파벳 z : %d\n",(int)'z');
	    System.out.printf("아라비아 기호 0 : %d\n",(int)'0');
	    System.out.printf("아라비아 기호 9 : %d\n",(int)'9');
	    System.out.printf("연산기호 + : %d\n",(int)'+');
	    System.out.printf("연산기호 - : %d\n",(int)'-');
	    System.out.printf("연산기호 * : %d\n",(int)'*');
	    System.out.printf("연산기호 ÷ : %d\n",(int)'÷');
	    // 이 숫자들을 아스키코드라고 부릅니다.
	    
	    System.out.printf("아스키코드 65: %c\n",65);
	    System.out.printf("아스키코드 90: %c\n",90);
	    System.out.printf("아스키코드 97: %c\n",97);
	    System.out.printf("아스키코드 122: %c\n",122);
	    
	    ch = 122;
	    int d = 'a';
	    
	    System.out.println("ch변수값 : " + ch + ",정수형 변수 d값 :"+d);
	    
	    
	    int today =2022; //변수값은 변수 생성(선언)과 동시에 초기화(대입)할 수 있습니다.
	    int myYear = 1995;
	    int year = 28;
	    b = 2;
	    c = '-';
	    
	    //현재는 2022년 입니다.
	    //저의 출생년도는 1995년 입니다.
	    //한국 나이는 28세 
	    //만 나이는 생일이 지나지 않았으므로 만 26세입니다.
	    //printf와 println 둘다 출력하세요.
	    // 연산결과를 별도의 변수를 생성해서 사용해도 되고, 연산식을 print 안에 넣어도 됩니다.
	    
	    System.out.printf("현재는 %d년 입니다\n",(int) today);
	    System.out.println("현재는"+today+"년 입니다");
	    System.out.printf("저의 출생년도는 %d년 입니다\n",(int) myYear);
	    System.out.println("저의 출생년도는"+myYear+"년 입니다");
	    System.out.printf("한국 나이는 %d세\n",(int) year);
	    System.out.println("한국 나이는"+year+"세");
	    System.out.printf("만 나이는 생일이 지나지 않았으므로 만%d입니다.\n",today-myYear-1);
	    System.out.println("만 나이는 생일이 지나지 않았으므로 만"+(today-myYear-1)+"세입니다");
	    
	    System.out.println("\n");
	    
	    
	    //정수형 변수 세개를 만듭니다 (kor,eng,mat)
	    //printf 또는 println을 이용해서 성적표를 출력하세요
	    //점수는 임의의아무 점수나 대입을 하고 총점 평균 출력
	    // 두명의 학생을 출력하 되, 각 학생의 점수는 한줄 성적표 출력 후 점수를 바꿔서 대입하고 두번째 성적을 출력
	    //1번학생 - 이름 :홍길동 국어 : 88 영어 : 45 수학 : 100
	    //2번학생 - 이름 :김은지 국어 : 89 영어 : 100 수학 : 89
	    
	    int kor = 50 , eng = 80 , mat= 75;
	   
	    System.out.printf("\t\t###성적표###\n");
		System.out.printf("----------------------------------------------------------\n");
		System.out.printf("번 호\t이 름\t\t 국 어\t영 어\t수 학\t총 점\t평 균\n");
		System.out.printf("----------------------------------------------------------\n");
		System.out.printf("%d\t%s\t\t%d\t%d\t%d\t%d\t%f\n",1,"홍길동",kor,eng,mat,kor+eng+mat,(kor+eng+mat)/3.0);
		
				
		kor = 100; 
		eng = 95; 
		mat= 50;
	    System.out.println("2"+"\t"+"김은지"+"\t\t"+(kor)+"\t"+(eng)+"\t"+(mat)+"\t"+(kor+eng+mat)+"\t"+(kor+eng+mat)/3.0);
	
	}

}
