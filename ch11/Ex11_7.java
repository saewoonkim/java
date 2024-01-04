package ch11;

import java.util.*;

public class Ex11_7 {
	public static void main(String[] args) {
	String[] strArr = {"cat", "Dog", "lion", "tiger"};
	
	
	Arrays.sort(strArr); //String 클래스 안에 Comparable 인터페이스를 구현하고 있음.
						 //Comparable 기본 정렬. 
						 //Comparator 기본 정렬 외 다른 기준 정렬.
							
	System.out.println("strArr=" + Arrays.toString(strArr));
	//제일 처음에 Dog가 나오는 이유는. 대문자가 사전적으로 먼저 오기 때문.
	//Arrays.toString(strArr));
	
	Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); //대소문자 구분 x
	//CASE_INSENSITIVE_ORDER : String 안에 들어가 있음.
	//정렬은 늘, 정렬 대상과 기준이 있어야 된다.
	//Arrays.sort(strArr) 이 친구는 String 안에 Comparable(정렬기준)을 가지고 있기 때문에 가능.
	//즉 String 클래스가 이미. Comaprable을 구현하고 있음.
	
	
	System.out.println("strArr=" + Arrays.toString(strArr));
	
	Arrays.sort(strArr, new Descending()); //아래에서 역순 정렬 정의. 
	
	System.out.println("strArr=" + Arrays.toString(strArr));
	}
}

class Descending implements Comparator { //Comparator는 인터페이스이기 때문에 미완성 메소드를 구현 해야 됨.
										 //Comparator는 Compare라는 메서드를 가지고 있음.
										 //int compare(T o1, T o2);
										 //o1과 o2를 비교해서 정수값으로 반환
										 //결과가 같으면 0
										 //양수면 왼쪽 큼
										 //음수면 오른쪽 큼
	public int compare(Object o1, Object o2) { 
		if( o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1; 
			Comparable c2 = (Comparable)o2;
			return c1.compareTo(c2) * -1; //기본정렬 compareTo에 -1을 해줌.
										  //-1을 해주면, 양수는 음수가 되고 음수는 양수가 됨.
		}
		return -1;
		
	}
}