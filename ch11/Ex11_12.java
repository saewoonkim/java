package ch11;

import java.util.HashSet;
import java.util.Iterator;

public class Ex11_12 {

	public static void main(String[] args) {
		HashSet setA = new HashSet();
		HashSet setB = new HashSet();
		HashSet setHab = new HashSet();
		HashSet setKyo = new HashSet();
		HashSet setCha = new HashSet();
		
		setA.add("1"); setA.add("2"); setA.add("3");
		setA.add("4"); setA.add("5");
		System.out.println("A= " +setA);
		//HashSet은 정렬x 순서x인데 왜 순서o로 출력이 되는걸까? 생각해보기.
		
		setB.add("4"); setB.add("5"); setB.add("6");
		setB.add("7"); setB.add("8");
		System.out.println("B =" +setB);//toString 이 포함되어있어 정렬도 같이됨.
		
		//교집합
		Iterator it = setB.iterator(); //Iterator .모든 컬렉션에 공통 적용.
		while(it.hasNext()) { //읽어 올 요소가 있는지 확인
			Object tmp = it.next(); //다음 요소 읽어 옴.
			if(setA.contains(tmp)) // boolean contains(Object o)
								   // 지정된 객체를 포함하고 있는지 알려줌.
								   //중복된 값 setKyo에 저장
				setKyo.add(tmp);
		}
		
		//차집합
		it =setA.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(!setB.contains(tmp)) //setB에 없는 것만 setCha에 저장
				setCha.add(tmp);
		}
		
		//합집합
		it = setA.iterator();  //A에 있는 모든 요소를 setHab에 넣음
		while(it.hasNext())
			setHab.add(it.next());
		
		it = setB.iterator(); //B에 있는 모든 요소를 setHab에 넣음
		while(it.hasNext())
			setHab.add(it.next());
		
		System.out.println("A ∩ B = " + setKyo);
		System.out.println("A ∪ B = " + setHab);
		System.out.println("A - B = " + setCha);
		
	}

}
