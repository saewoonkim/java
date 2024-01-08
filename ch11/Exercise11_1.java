package ch11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.TreeSet;

public class Exercise11_1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(3);
		list.add(6);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(7);

		HashSet set = new HashSet(list); //중복 요소 제거. 순서 유지 x 3,6,2,7
		TreeSet test = new TreeSet(set); //오름차순 정렬. 2,3,6,7
		Stack stack = new Stack(); //Stack에 넣었다 꺼내면 저장순서 반대로 됨 : 7,6,3,2 나옴
								  
		stack.addAll(test); //TestSet에 저장된 요소를 stack에 담음.
		
		while (!stack.empty())
			System.out.println(stack.pop()); //stack에 저장된 값을 하나씩 꺼냄.

	}

}
