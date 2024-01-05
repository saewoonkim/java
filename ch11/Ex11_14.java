package ch11;

import java.util.TreeSet;

public class Ex11_14 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet(); //범위 검색에 유리 (from~to)
		
		String from ="b";
		String to = "d";
		
		set.add("abc"); set.add("alien"); set.add("bat");
		set.add("car"); set.add("Car"); set.add("disc");
		set.add("dance"); set.add("dZZZ"); set.add("dzzz");
		set.add("elephant"); set.add("elevator"); set.add("fan");
		set.add("flower");
		
		System.out.println(set);
		System.out.println("range serach : from " + from +" to " + to);
		System.out.println("result1 :" + set.subSet(from, to));
		System.out.println("result2 :" + set.subSet(from,  to + "zzz"));
		//subSet(Object fromElement, Object toElement)
		//범위 검색(from~to 사이)의 결과를 반환. 
		//시작은 포함이 되는데 끝은 포함이 안됨  set.add("dZZZ"); set.add("dzzz");
		//대문자 zzz가 앞에있어서 
	}

}
