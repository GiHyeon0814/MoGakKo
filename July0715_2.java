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
		
		v.trimToSize(); // 빈 공간을 업애는 메소드
		System.out.println(v.size() + " " + v.capacity());
		
		v.ensureCapacity(6); // 용량만을 늘리는 메소드
		System.out.println(v.size() + " " + v.capacity());
		
		v.setSize(7); // size의 설정
		System.out.println(v.size() + " " + v.capacity());
		
		/* 주의
		 * Vector는 size를 설정할 때 size에 따른 capacity가 충분하지 않을 경우 새로운 인스턴스를 생성한다.
		 * 이때 인스턴스의 capacity는 자동적으로 기존의 크기보다 2배로 증가된다.
		 * 기존의 capacity는 6이었고, 명령이 size를 7로 만드는 명령이었으므로 용량 12를 가진 새로운 인스턴스가 생성된다.
		 */
		
		v.clear(); //size를 0으로 초기화, 용량은 그대로
		System.out.println(v.size() + " " + v.capacity());
		
	}

}
