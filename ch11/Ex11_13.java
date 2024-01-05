package ch11;

import java.util.Set;
import java.util.TreeSet;

public class Ex11_13 {

	public static void main(String[] args) {
		
		Set set = new TreeSet(); //자동정렬 됨. 범위검색, 정렬 필요 없음.
		//트리셋이 정렬에 유리함 해쉬 셋 보다 더 유리함
		//들어가는 요소가 Comparable을 구현하고 있다면
		//내부적으로 이진 검색 트리를 사용하는 TreeMap에 의해
		//정렬이 이루어진다.
		
		for (int i =0; set.size() < 6; i++) {
			int num = (int)(Math.random()*45) +1;
			set.add(num); // set.add(new Integer(num));
		}
		
		System.out.println(set);

	}

}
