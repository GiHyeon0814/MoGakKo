package self_improvemnet;

import java.util.ArrayList;
import java.util.Collections;

public class July0715_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer (6));
		list1.add(new Integer (4));
		list1.add(new Integer (1));
		list1.add(new Integer (3));
		list1.add(new Integer (7));
		list1.add(new Integer (2));
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4)); // 인덱스 1부터 인덱스 3까지의 list값을 바로 뽑아 객체로 생성한다.
		System.out.println(list1 + "\n" + list2);
		
		Collections.sort(list1);
		Collections.sort(list2);
		
		System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2)); // 포함관계 : list2가 list1에 포함되어 있으므로 True
		
		list2.add("B");
		list2.add("C");
		list2.add(3, "A");
		
		System.out.println(list1 + "\n" + list2);
		
		list2.set(3, "AA");
		System.out.println(list1 + "\n" + list2);
		
		System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2)); // 교집합의 원소 존재 : True
		
		System.out.println(list1 + "\n" + list2);
		
		int i;
		for(i = 0; i < list2.size() - 1; i++) {
			if(list1.contains(list2.get(i))) {
				list2.remove(i);
			}
			System.out.println(list1 + "\n" + list2);
		}
		
	}

}
