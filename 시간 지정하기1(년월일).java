package self_improvemnet;

import java.util.Calendar;

public class setTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] DAY_OF_WEEK = {"", "��", "��", "ȭ", "��", "��", "��", "��" };
		
		/* �� ���� �����ؾ� �� ��
		 * 1) DAY_OF_WEEK�� �Ͽ��Ϻ��� ����ϱ��� 1 ~ 7�� ���� ��ȯ�Ѵ�. 0�� ����.
		 * 2) Calendar���� Month�� 0 ~ 11�� ���� ������. (+1�� �ؾ���)
		 */
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		date1.set(2020, 6, 25); // 2020�� 7�� 25��
		
		System.out.println("date1 : " + toString(date1) + " " + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "����");
		System.out.println("date2 : " + toString(date2) + " " + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)] + "����");
		
		long difference = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000;
		
		System.out.println(difference + "�ʰ� �������ϴ�.");
		System.out.println(difference / (24 * 60 * 60) + "���� �������ϴ�.");
		
	}
		public static String toString(Calendar date) {
			return date.get(Calendar.YEAR) + "�� " + (date.get(Calendar.MONTH) + 1) + "�� " + date.get(Calendar.DATE) + "��"; 
		}
}



