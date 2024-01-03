package ch11;

import java.util.ArrayList;
import java.util.Collections;

public class Ex11_1 {

	public static void main(String[] args) {
		//기본 길이가 10인 ArrayList 생성
		//ArrayList(int initialCapacity) 생성자 사용.
		ArrayList list1 = new ArrayList(10);
		
		//ArrayList는 객체만 저장 가능. 그렇기 때문에 객체를 저장해 줌.
		
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		
		//ArrayList(Collection c) 생성자 사용.
		//subList를 통해, 또 다른 ArrayList를 만듬.
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		
		
		print(list1, list2);
		
		//Collection은 인터페이스, Collections는 유틸클래스.
		//Math 클래스 처럼 컬렉션을 다루는데 필요한 메소드를 제공함.
		Collections.sort(list1); //list1 정렬
		Collections.sort(list2); //list2 정렬
		
		print(list1, list2);
		
		//결과 값 true. list1이 list2의 모든 요소를 포함하고 있는지 확인.
		System.out.println("list1.containsAll(list2):" + list1.containsAll(list2));
		
		//list2에 B,C 추가 
		list2.add("B");
		list2.add("C");
		
		//추가할 위치. 추가할 문자.
		//추가하면 부담 적용.
		list2.add(3,"A");
		print(list1, list2);
		
		//set은 변경.
		//기존의 A 사라지고, AA 저장
		list2.set(3,  "AA");
		print(list1, list2);
		
		//retainAll = list1 에서 list2와 겹치는 부분 남기고 나머지는 삭제.
		System.out.println("list1.retainAll(list2):" + list1.retainAll(list2));
		
		print(list1, list2);
		
		// list2에서 list1에 포함된 객체 삭제.
		// 1. get(i)로 list2에서 하나씩 꺼냄.
		// 2. contains()로 꺼낸 객체가 list1에 있는지 확인.
		// 3. remove(i)로 해당 객체를 list2에서 삭제.
		for(int i = list2.size()-1; i>=0; i--) {
			if(list1.contains(list2.get(i)))
				//contains: 객체가 존재하는지 찾음. 있으면 true 없으면 false 
				list2.remove(i);
			
		}
		print(list1, list2);
	}
		static void print(ArrayList list1, ArrayList list2) {
			System.out.println("list1:" + list1);
			System.out.println("list2:" + list2);
			System.out.println();
		}

}
