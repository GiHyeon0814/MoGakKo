package self_improvemnet;

import java.util.Calendar;

public class add_roll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* add() Ư�� �ʵ��� ���� ������Ų��.(�ٸ� �ʵ忡�� ������ �ش�.)
		 * roll()�� Ư�� �ʵ��� ���� ���� �Ǵ� ���ҽ�Ų��. (�ٸ� �ʵ忡�� ������ ���� �ʴ´�.)
		 */
		
		Calendar date = Calendar.getInstance();
		date.set(2019, 7, 31);
		
		System.out.println("���� :" + toString(date));
		System.out.println();
		
		System.out.println("1�� ��(add)");
		date.add(Calendar.DATE, 1);
		System.out.println(toString(date));
		
		System.out.println("6�� ��(add)");
		date.add(Calendar.MONTH, -6);
		System.out.println(toString(date));

		System.out.println("31�� ��(roll) ");
		date.roll(Calendar.DATE, 31);
		System.out.println(toString(date));
		
		/* �ٸ� �ʵ忡 ������ ���� �ʱ� ������ MONTH�� ���� ������ �ʴ´�.
		 * 1 + 31 = 1���̹Ƿ� ���� 1�� ���´�.
		 * MONTH�� ���� �⿡�� ������ �ִ� ������ �Ǿ ���������� ���� ���� �ٲ��� �ʴ´�. 
		 */
		
		System.out.println("31�� ��(add)");
		date.add(Calendar.DATE, 31);
		System.out.println(toString(date));
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "�� " +  date.get(Calendar.MONTH) + "�� " + date.get(Calendar.DATE) + "��";
	}
}
