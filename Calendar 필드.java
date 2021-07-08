package self_improvemnet;

import java.util.Calendar;

public class practicce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar today = Calendar.getInstance();
		
		System.out.println("년 : " + today.get(Calendar.YEAR));
		System.out.println("월_0부터시작 : " + today.get(Calendar.MONTH));
		System.out.println("년_몇쨰주 : " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("달_몇째주 : " + today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("달_몇일 : " + today.get(Calendar.DATE));
		System.out.println("달_몇일 : " + today.get(Calendar.DAY_OF_MONTH));
		System.out.println("해_몇일 : " + today.get(Calendar.DAY_OF_YEAR));
		System.out.println("요일_1(일요일)~7(토요일) : " + today.get(Calendar.DAY_OF_WEEK));
		System.out.println("달_몇째요일 : " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("오전(0)_오후(1)" + today.get(Calendar.AM_PM));
		System.out.println("시간(0~11) : " + today.get(Calendar.HOUR));
		System.out.println("시간(0~23) : " + today.get(Calendar.HOUR_OF_DAY));
		System.out.println("분(0~59) : " + today.get(Calendar.MINUTE));
		System.out.println("초(0~59) : " + today.get(Calendar.SECOND));
		System.out.println("1000분의 1초(0~999)" + today.get(Calendar.MILLISECOND));
		System.out.println("TimeZone(-12 ~ +12) : " + today.get(Calendar.ZONE_OFFSET) / 360000);
		System.out.println("이 달의 마지막 날 : " +today.getActualMaximum(Calendar.DATE));
			
	}
}