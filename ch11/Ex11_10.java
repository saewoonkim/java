package ch11;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Ex11_10 {

	public static void main(String[] args) {
		Set set = new HashSet();
		
		for(int i =0; set.size()<6; i++) {
			int num = (int)(Math.random()*45) +1;
			set.add(new Integer(num));
		}
		
		List list = new LinkedList(set); 
		//List는 LinkedList의 상위 인터페이스
		//new LinkedList(set)은 결국 LinkedList(Collection c) 생성자를 사용한 것.
		//sort의 매개변수로는 List만 올 수 있음. 그렇기 때문에 set을 List로 옮기고
		//List를 정렬해야 됨.
		Collections.sort(list);
		System.out.println(list);

	}

}
