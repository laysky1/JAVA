package days14;

import java.util.Calendar;

public class CalendarClass03 {

	public static void main(String[] args) {

		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();

		time1.set(Calendar.HOUR_OF_DAY,10);
		time1.set(Calendar.MINUTE,20);
		time1.set(Calendar.SECOND,30);
		
		time2.set(Calendar.HOUR_OF_DAY,11);
		time2.set(Calendar.MINUTE,30);
		time2.set(Calendar.SECOND,10);
		
		printTime(time1);
		printTime(time2);
		//00시 00분 00.000초
		
		System.out.println(time1.getTimeInMillis());
		// 밀로초-초-분-시-날짜 모두 밀리초로 변경
		System.out.println(time2.getTimeInMillis());
		
		long dif = (time2.getTimeInMillis() -time1.getTimeInMillis());
		System.out.println("time1과 time2의 차이는 "+dif +"밀리초 입니다" );
		System.out.println("time1과 time2의 차이는 "+(dif/1000) +"밀리초 입니다" );
		
	}

	private static void printTime(Calendar t) {
		System.out.println("time : "+
				t.get(Calendar.HOUR_OF_DAY)+"시"+
				t.get(Calendar.MINUTE)+"분"+
				t.get(Calendar.SECOND)+"."+
				t.get(Calendar.MILLISECOND)+"초");
		
	}

}
