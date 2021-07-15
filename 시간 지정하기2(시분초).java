package self_improvemnet;

import java.util.Calendar;

public class setTime2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] TIME = {3600, 60, 1};
		String[] NAME = {"시간", "분", "초"};
		
		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();
		
		/* 알아야 할 것
		 * 1) 년, 월, 일은 set(년, 월, 일)을 통해 한번에 설정이 가능하지만
		 * 2) 시, 분, 초의 경우에는 각각 set을 통해 따로따로 설정해야 한다.
		 * 3) 이때 set(Calendar.MINUTE, 30)의 형식을 따른다.
		 */
		
		time1.set(Calendar.HOUR_OF_DAY, 10);
		time1.set(Calendar.MINUTE, 20);
		time1.set(Calendar.SECOND, 30);
		
		time2.set(Calendar.HOUR_OF_DAY, 20);
		time2.set(Calendar.MINUTE, 30);
		time2.set(Calendar.SECOND, 10);
		
		System.out.println("time1 : " + time1.get(Calendar.HOUR_OF_DAY) + "시 " + time1.get(Calendar.MINUTE) + "분 " + time1.get(Calendar.SECOND) + "초");
		System.out.println("time2 : " + time2.get(Calendar.HOUR_OF_DAY) + "시 " + time2.get(Calendar.MINUTE) + "분 " + time2.get(Calendar.SECOND) + "초");
		
		long difference = (time2.getTimeInMillis() - time1.getTimeInMillis()) / 1000;
		System.out.println(difference + "초가 차이납니다.");
		
		String temp = "";
		int i;
		
		for(i = 0; i < TIME.length; i++) {
			temp = temp + difference/TIME[i] + NAME[i] + " ";
			difference = difference % TIME[i];
					
			/* 동전이 3180원이 있고, 500원, 100원으로 나눈다고 하자.(정수형)
			 * 3180 / 500 = 6이므로 500원 동전은 6개가 필요하다.
			 * 그리고 3180 % 500 = 180이므로 500원짜리를 제외한 나머지 동전 종류에서 또 세면 된다.
			 * 이 반복문도 위와 같은 방법을 통해 큰 단위인 시간, 분, 초 단위 순서대로 진행한 것이다.
			 * 컴과사(손코딩) 1학년 1학기 시험에 나온 적이 있다.(최미선 교수님)
			 */
		}
		
		System.out.println("시분초로 변환하면 " + temp + "입니다.");
	}

}
