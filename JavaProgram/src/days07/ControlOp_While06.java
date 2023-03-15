package days07;

import java.util.Random;
import java.util.Scanner;

public class ControlOp_While06 {

	public static void main(String[] args) {
		
		
		int com, user ;
		Scanner sc=new Scanner(System.in);
		Random rd = new Random();
		//com은 랜덤한 숫자(0~2)로 저장, user는 입력받습니다.
		//0:가위 1:바위 2:보 프로그램 내에서 사용한 규칙을 정합니다.
		
		
		while(true) {
		System.out.print("가위(0) 바위(1) 보(2) 중 하나를 입력하세요(숫자입력,종료(9)) - ");
		user=sc.nextInt();
		
		if(user==9) break;
		com=rd.nextInt();
		if(com<0)com=com*(-1);
		com= com%3;
		
		String coms, users;
		if(com==0)coms ="가위";
		else if(com==1)coms ="바위";
		else coms ="보";
		
		if(user==0)users ="가위";
		else if(user==1)users ="바위";
		else users ="보";
		
		System.out.println("컴퓨터 : "+com+"유저 : "+user);
		//그 둘을 비교해서 가위바위보의 결과를 출력합니다.
		   if((com==0&&user==1)) System.out.println("이겼습니다");
		   else if((com==1&&user==2)) System.out.println("이겼습니다");
		   else if((com==2&&user==0)) System.out.println("이겼습니다");
		   else if(com==user) System.out.println("무승부입니다");
		   else System.out.println("졌습니다");
		//위 내용을 바탕으로 가위바위보 게임을 9를 누르기 전까지 끝나지 않고 계속 이어갈 수 있게 코딩해주세요.
	}

}
}
