package days04;

import java.util.Scanner;

public class ControlOp_IF05 {

	public static void main(String[] args) {
		//출생년도를 입력 받아서 나이를 계산하고 2022- 입력년도+1
		//12세 미만 "어린이"
		//12~18세 "청소년"
		//19~25세 "청년"
		//26~40세 "성년"
		//41~60세 "중년"
		//60세 이상(나머지) "노년" 입니다 라고 출력하는 if문 작성
		int year;
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("출생년도 입력 :");
		year=sc.nextInt();
		age = 2022-year+1;

		if(age<12) {System.out.println("어린이 입니다");
	  }else if(age>=12 && age<=18) { System.out.println("청소년 입니다");
	  }else if(age>=19 && age<=25) { System.out.println("청년 입니다");
	  }else if(age>=26 && age<=40) { System.out.println("성년 입니다");
	  }else if(age>=41 && age<=60) { System.out.println("중년 입니다");
	  }else System.out.println("노년 입니다");
		
	}

}
