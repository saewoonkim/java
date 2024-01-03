package ch11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex11_2 {

	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new LinkedList();
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("= Stack =");
		while(!st.empty()) { //empty() 스택이 비었는지 확인
			System.out.println(st.pop());
		}
		
		System.out.println("=Queue=");
		while(!q.isEmpty()) { //isEmpty() 큐가 비었는지 확인
			System.out.println(q.poll());
		}
	}

}
