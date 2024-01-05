package ch11;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex11_17 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("김자바", 90);
		map.put("김자바", 100); //김자바가 두명이라 90이 100으로 바뀜.
		map.put("이자바", 100);
		map.put("강자바", 80);
		map.put("안자바", 90);
		
		Set set = map.entrySet(); //entrySet(). key와 value 한 쌍을 다 가지고 옴.
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			//Entry : .getKey : Key  가지고 옴
			//         .getValue: Value 가지고 옴 
			System.out.println("이름: " + e.getKey() + ", 점수 : " + e.getValue());
		}
		
		set = map.keySet(); // Key의 모든 값을 가지고 올 때는 KeySet
		System.out.println("참가자 명단:" + set); //이름만 출력 

		Collection values = map.values();  //value 값 가지고 옴.
		it = values.iterator();
		
		int total = 0;
		
		while(it.hasNext()) {
			int i = (int)it.next(); 
			total += i; // 모두 더해줌. 총점
		}
		
		System.out.println("총점 : " + total);
		System.out.println("총점 : " + (float)total/set.size());
		System.out.println("총점 : " + Collections.max(values));
		System.out.println("총점 : " + Collections.min(values));
	}

}
