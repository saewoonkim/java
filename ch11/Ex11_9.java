package ch11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex11_9 {

	public static void main(String[] args) {
		
		//객체 배열에 문자열 1, 1을 포함하고 있는 Integer 객체, 나머지 문자열이 들어가 있음.
		Object[] objArr = {"1", new Integer(1),"2","2","3","3","4","4","4"};
		Set set = new HashSet(); //HashSet 생성.
		
		//객체 배열에 있는 요소들을
		for(int i=0; i < objArr.length; i++) {
			set.add(objArr[i]); //HashSet에 objArr의 요소들을 저장함.
		}
		
		System.out.println(set); //HashSet에 저장된 요소 출력
		
		Iterator it = set.iterator(); //iterator 메서드로 iterator를 얻어 옴.
		
		while(it.hasNext()) { //hasNext()를 요청해서 읽을 요소가 남아있는지 확인.
			System.out.println(it.next()); //next() 요소 꺼내옴.
		}

	}

}
