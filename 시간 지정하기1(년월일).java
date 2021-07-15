package self_improvemnet;

import java.util.Calendar;

public class setTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] DAY_OF_WEEK = {"", "일", "월", "화", "수", "목", "금", "토" };
		
		/* 두 가지 유의해야 할 점
		 * 1) DAY_OF_WEEK는 일요일부터 토요일까지 1 ~ 7의 값을 반환한다. 0은 없다.
		 * 2) Calendar에서 Month는 0 ~ 11의 값을 가진다. (+1을 해야함)
		 */
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		date1.set(2020, 6, 25); // 2020년 7월 25일
		
		System.out.println("date1 : " + toString(date1) + " " + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "요일");
		System.out.println("date2 : " + toString(date2) + " " + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)] + "요일");
		
		long difference = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000;
		
		System.out.println(difference + "초가 지났습니다.");
		System.out.println(difference / (24 * 60 * 60) + "일이 지났습니다.");
		
	}
		public static String toString(Calendar date) {
			return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1) + "월 " + date.get(Calendar.DATE) + "일"; 
		}
}



