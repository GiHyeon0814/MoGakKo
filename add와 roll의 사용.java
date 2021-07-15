package self_improvemnet;

import java.util.Calendar;

public class add_roll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* add() 특정 필드의 값을 증가시킨다.(다른 필드에도 영향을 준다.)
		 * roll()은 특정 필드의 값을 증가 또는 감소시킨다. (다른 필드에는 영향을 주지 않는다.)
		 */
		
		Calendar date = Calendar.getInstance();
		date.set(2019, 7, 31);
		
		System.out.println("현재 :" + toString(date));
		System.out.println();
		
		System.out.println("1일 후(add)");
		date.add(Calendar.DATE, 1);
		System.out.println(toString(date));
		
		System.out.println("6달 전(add)");
		date.add(Calendar.MONTH, -6);
		System.out.println(toString(date));

		System.out.println("31일 후(roll) ");
		date.roll(Calendar.DATE, 31);
		System.out.println(toString(date));
		
		/* 다른 필드에 영향을 주지 않기 때문에 MONTH의 값이 변하지 않는다.
		 * 1 + 31 = 1일이므로 일은 1로 나온다.
		 * MONTH의 값이 년에게 영향을 주는 식으로 되어도 마찬가지로 년의 값이 바뀌지 않는다. 
		 */
		
		System.out.println("31일 후(add)");
		date.add(Calendar.DATE, 31);
		System.out.println(toString(date));
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년 " +  date.get(Calendar.MONTH) + "월 " + date.get(Calendar.DATE) + "일";
	}
}
