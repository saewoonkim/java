package ch11;

import java.util.*;

public class Ex11_11 {

	public static void main(String[] args) {
		HashSet set = new HashSet(); //해쉬셋 생성
		set.add("abc"); //abc 저장
		set.add("abc"); //abc 중복이라 저장 안됨.
		set.add(new Person("David",10)); //equals와 hashcode가 없어서 중복 제거 안됨.
		set.add(new Person("David",10)); //두 객체가 서로 다른 메모리 주소를 가짐.
										 //그렇기 때문에 직접 오버라이딩 해 줘야 됨. 
										//상단 소스에 제너레이트 해쉬코드엔 이퀄스 누르면 오버라이딩도미
										//[David:10, abc, David:10]
										//[abc, David:10]이렇게 나옴

		System.out.println(set);

	}
}
	class Person {
		String name;
		int age;
		
		Person(String name, int age){
			this.name = name;
			this.age = age;
		}
		
		public String toString() {return name+":" + age;}
	}


