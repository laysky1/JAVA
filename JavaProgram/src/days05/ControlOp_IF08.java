package days05;

import java.util.Scanner;

public class ControlOp_IF08 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int kor, eng, mat, tot;
		double ave; 
		
		// 국어 영어 수학점수를 입력받아서
		// 총점 평균을 계산하고
		
		// 평균 60점 이상이면서 모든 과목 40이상이면 합격
		// 그렇지 않다면 불합격을 출력하되
		
		//해당되는 불합격 사유(평균 미달,국어 과락, 영어 과락, 수학과락)를 모두 함께 출력하세요.
		//((ave<60)||(kor<40)||(eng<40)||(mat<40))
		System.out.println("국어 점수를 입력하세요 :");
		kor=sc.nextInt();
		System.out.println("영어 점수를 입력하세요 :");
		eng=sc.nextInt();
		System.out.println("수학 점수를 입력하세요 :");
		mat=sc.nextInt();
		tot=kor+eng+mat;
		ave=tot/3.0;
		if((ave>=60)&&(kor>=40)&&(eng>=40)&&(mat>=40)) 
			 System.out.println("합격");
			 else{
			 System.out.printf("불합격\t");
			 if(ave<60) System.out.printf("평균미달\t");
			 if(kor<40) System.out.printf("국어 과락\t");
			 if(eng<40) System.out.printf("영어 과락\t");
			 if(mat<40) System.out.printf("수학 과락\t");
			 }
		/*내가 한 풀이
		 if((ave>=60)&&(kor>=40)&&(eng>=40)&&(mat>=40)) {
			System.out.println("해당학생은 합격입니다.");
		}else if(ave<60){
			System.out.println("해당학생은 평균미달 불합격 입니다.");
		}else if(kor<40)	{
		  System.out.println("해당학생은 국어 과락으로 불합격 입니다.");
		}else if(eng<40) {
			System.out.println("해당학생은 영어 과락으로 불합격 입니다.");
		}else{
			System.out.println("해당학생은 수학 과락으로 불합격 입니다.");
		}	
		*/ 
		/* 맞지만 100점 만점의 60점 풀이
		 if((ave>=60)&&(kor>=40)&&(eng>=40)&&(mat>=40)) {
			System.out.println("해당학생은 합격입니다.");
		}else if((ave<60)&&(kor>=40)&&(eng>=40)&&(mat>=40)){
			System.out.println("해당학생은 평균미달 불합격 입니다.");
		}else if((ave>=60)&&(kor<40)&&(eng>=40)&&(mat>=40))	{
		  System.out.println("해당학생은 국어 과락으로 불합격 입니다.");
		}else if((ave>=60)&&(kor>=40)&&(eng<40)&&(mat>=40)) {
			System.out.println("해당학생은 영어 과락으로 불합격 입니다.");
		}else{
			System.out.println("해당학생은 수학 과락으로 불합격 입니다.");
			
			...경우의 수 24
		 */
		/* 선생님의 풀이 (간단하면서 미달된 것을 다 출력해준다!)
		  if((ave>=60)&&(kor>=40)&&(eng>=40)&&(mat>=40)) {
			 System.out.println("합격");
			 else{
			 System.out.printf("불합격\t");
			 if(ave<60) System.out.printf("평균미달\t");
			 if(kor<40) System.out.printf("국어 과락\t");
			 if(eng<40) System.out.printf("영어 과락\t")
			 if(mat<40) System.out.printf("수학 과락\t")
			 }
		*/	 
		}
		
	
	}


