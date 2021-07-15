package self_improvemnet;

import java.util.Calendar;

public class setTime2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] TIME = {3600, 60, 1};
		String[] NAME = {"�ð�", "��", "��"};
		
		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();
		
		/* �˾ƾ� �� ��
		 * 1) ��, ��, ���� set(��, ��, ��)�� ���� �ѹ��� ������ ����������
		 * 2) ��, ��, ���� ��쿡�� ���� set�� ���� ���ε��� �����ؾ� �Ѵ�.
		 * 3) �̶� set(Calendar.MINUTE, 30)�� ������ ������.
		 */
		
		time1.set(Calendar.HOUR_OF_DAY, 10);
		time1.set(Calendar.MINUTE, 20);
		time1.set(Calendar.SECOND, 30);
		
		time2.set(Calendar.HOUR_OF_DAY, 20);
		time2.set(Calendar.MINUTE, 30);
		time2.set(Calendar.SECOND, 10);
		
		System.out.println("time1 : " + time1.get(Calendar.HOUR_OF_DAY) + "�� " + time1.get(Calendar.MINUTE) + "�� " + time1.get(Calendar.SECOND) + "��");
		System.out.println("time2 : " + time2.get(Calendar.HOUR_OF_DAY) + "�� " + time2.get(Calendar.MINUTE) + "�� " + time2.get(Calendar.SECOND) + "��");
		
		long difference = (time2.getTimeInMillis() - time1.getTimeInMillis()) / 1000;
		System.out.println(difference + "�ʰ� ���̳��ϴ�.");
		
		String temp = "";
		int i;
		
		for(i = 0; i < TIME.length; i++) {
			temp = temp + difference/TIME[i] + NAME[i] + " ";
			difference = difference % TIME[i];
					
			/* ������ 3180���� �ְ�, 500��, 100������ �����ٰ� ����.(������)
			 * 3180 / 500 = 6�̹Ƿ� 500�� ������ 6���� �ʿ��ϴ�.
			 * �׸��� 3180 % 500 = 180�̹Ƿ� 500��¥���� ������ ������ ���� �������� �� ���� �ȴ�.
			 * �� �ݺ����� ���� ���� ����� ���� ū ������ �ð�, ��, �� ���� ������� ������ ���̴�.
			 * �İ���(���ڵ�) 1�г� 1�б� ���迡 ���� ���� �ִ�.(�ֹ̼� ������)
			 */
		}
		
		System.out.println("�ú��ʷ� ��ȯ�ϸ� " + temp + "�Դϴ�.");
	}

}
