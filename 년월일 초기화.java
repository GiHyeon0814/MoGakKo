package self_improvemnet;

import java.util.Calendar;

public class cleatTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(clear.Difference("20010103", "20010101"));
		System.out.println(clear.Difference("20010103", "20010103"));
		System.out.println(clear.Difference("20010103", "200103"));
	}

}

class clear {
	
	public static int Difference(String ymd1, String ymd2) {
		int diff = 0;
		try {
			int year1 = Integer.parseInt(ymd1.substring(0, 4));
			int month1 = Integer.parseInt(ymd1.substring(4, 6)) - 1;
			int day1 = Integer.parseInt(ymd1.substring(6, 8));
			int year2 = Integer.parseInt(ymd2.substring(0, 4));
			int month2 = Integer.parseInt(ymd2.substring(4, 6)) - 1;
			int day2 = Integer.parseInt(ymd2.substring(6, 8));
			
			/* month에다가 -1을 하는 이유는? 컴퓨터는 month를 0부터 11까지의 값을 받으므로 실제 달보다 1을 적게 넣어야 한다 */
			
			Calendar date1 = Calendar.getInstance();
			Calendar date2 = Calendar.getInstance();
			
			date1.clear();
			date2.clear();
			
			/* clear를 쓰지 않았을 때 이론상 1월 3일과 1월 1은 2일의 차이이므로 결과값 2를 반환해야 한다.
			 * 그러나 처음이 1로 나온다. 실수값으로 확인하면 거의 1.999998 정도의 차이이다. (int형으로 해서 1)
			 * 그 이유는 처음 date1과 date2를 지정할 때, "현재"의 시간을 반환하므로 두 반환 사이에 약간의 시간차가 난다.
			 * 따라서 clear를 통하여 시간을 초기화 시킨 후 처리하면 결괏값 2를 얻을 수 있다.
			 * 정보) clear의 초기화는 1970년 1월 1일이다.
			 */
			
			date1.set(year1,  month1, day1);
			date2.set(year2,  month2, day2);
			
			diff = (int) ((date1.getTimeInMillis() - date2.getTimeInMillis()) / (24 * 60 * 60 * 1000));
			/* 날짜 단위 */
			
			
		} catch (Exception e) {
			diff = 0; // 날짜가 같거나, 8자리의 형식이 아닐 경우
		}
		
		return diff;
	}
}