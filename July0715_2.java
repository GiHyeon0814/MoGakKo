package self_improvemnet;

import java.util.Vector;

public class July0715_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector v = new Vector(5);
		v.add("1");
		v.add("2");
		v.add("3");
		System.out.println(v);
		
		v.trimToSize(); // �� ������ ���ִ� �޼ҵ�
		System.out.println(v.size() + " " + v.capacity());
		
		v.ensureCapacity(6); // �뷮���� �ø��� �޼ҵ�
		System.out.println(v.size() + " " + v.capacity());
		
		v.setSize(7); // size�� ����
		System.out.println(v.size() + " " + v.capacity());
		
		/* ����
		 * Vector�� size�� ������ �� size�� ���� capacity�� ������� ���� ��� ���ο� �ν��Ͻ��� �����Ѵ�.
		 * �̶� �ν��Ͻ��� capacity�� �ڵ������� ������ ũ�⺸�� 2��� �����ȴ�.
		 * ������ capacity�� 6�̾���, ����� size�� 7�� ����� ����̾����Ƿ� �뷮 12�� ���� ���ο� �ν��Ͻ��� �����ȴ�.
		 */
		
		v.clear(); //size�� 0���� �ʱ�ȭ, �뷮�� �״��
		System.out.println(v.size() + " " + v.capacity());
		
	}

}
