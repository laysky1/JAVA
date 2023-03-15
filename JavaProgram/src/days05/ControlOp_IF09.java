package days05;

import java.util.Scanner;

public class ControlOp_IF09 {
	
	int comNum = (int)(Math.random()*3);
	//System.out.println(comNum);
	String com;
	
	

	public static void main(String[] args) {
		
		String com="가위";
		
		Scanner sc=new Scanner(System.in);
		String user;
		System.out.print("가위/바위/보 중 하나를 입력하세요");
		user=sc.nextLine();
		
		System.out.println("컴퓨터 :"+ com+", 플레이어 :"+user);
		//사용자 입력과 컴퓨터가 가진 텍스트를 각각 비교해서 이겼습니다, 졌습니다, 무승부입니다 출력	
		if(com.equals("가위")&&user.equals("가위"))System.out.println("비겼습니다");	
		else if(com.equals("가위")&&user.equals("바위"))System.out.println("이겼습니다");	
		else if(com.equals("가위")&&user.equals("보"))System.out.println("졌습니다");	
		else if(com.equals("바위")&&user.equals("가위"))System.out.println("졌습니다");
		else if(com.equals("바위")&&user.equals("바위"))System.out.println("비겼습니다");	
		else if(com.equals("바위")&&user.equals("보"))System.out.println("이겼습니다");	
		else if(com.equals("보")&&user.equals("가위"))System.out.println("이겼습니다");	
		else if(com.equals("보")&&user.equals("바위"))System.out.println("졌습니다");	
		else if(com.equals("보")&&user.equals("보"))System.out.println("비겼습니다");	
			
		
		/*
		if(com.equals("가위")&& user.equals("바위"))
			System.out.println("이겼습니다");	
		else if(com.equals("바위")&& user.equals("보"))
		 	System.out.println("이겼습니다");	
		else if(com.equals("보")&& user.equals("가위"))
		 	System.out.println("이겼습니다");	
		 else if(com.equals(user))
		 	System.out.println("비겼습니다");	
		 else
		  	System.out.println("졌습니다");	
		 */ //간단한 방법도 있다
	
	
			

	}

}
