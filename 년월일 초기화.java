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
			
			/* month���ٰ� -1�� �ϴ� ������? ��ǻ�ʹ� month�� 0���� 11������ ���� �����Ƿ� ���� �޺��� 1�� ���� �־�� �Ѵ� */
			
			Calendar date1 = Calendar.getInstance();
			Calendar date2 = Calendar.getInstance();
			
			date1.clear();
			date2.clear();
			
			/* clear�� ���� �ʾ��� �� �̷л� 1�� 3�ϰ� 1�� 1�� 2���� �����̹Ƿ� ����� 2�� ��ȯ�ؾ� �Ѵ�.
			 * �׷��� ó���� 1�� ���´�. �Ǽ������� Ȯ���ϸ� ���� 1.999998 ������ �����̴�. (int������ �ؼ� 1)
			 * �� ������ ó�� date1�� date2�� ������ ��, "����"�� �ð��� ��ȯ�ϹǷ� �� ��ȯ ���̿� �ణ�� �ð����� ����.
			 * ���� clear�� ���Ͽ� �ð��� �ʱ�ȭ ��Ų �� ó���ϸ� �ᱣ�� 2�� ���� �� �ִ�.
			 * ����) clear�� �ʱ�ȭ�� 1970�� 1�� 1���̴�.
			 */
			
			date1.set(year1,  month1, day1);
			date2.set(year2,  month2, day2);
			
			diff = (int) ((date1.getTimeInMillis() - date2.getTimeInMillis()) / (24 * 60 * 60 * 1000));
			/* ��¥ ���� */
			
			
		} catch (Exception e) {
			diff = 0; // ��¥�� ���ų�, 8�ڸ��� ������ �ƴ� ���
		}
		
		return diff;
	}
}