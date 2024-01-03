package ch11;

import java.util.EmptyStackException;
import java.util.Stack;

public class Ex11_3 {
	
	//((3+5) * 8-2);

	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("Usage:java Ex11_3\" EXPRESSION\"");
			System.out.println("Example:java Ex11_3\" ((2+3)*1)+3\"");
			System.exit(0);
		}
		
		Stack st = new Stack();
		
		String expression = args[0];
		
		System.out.println("expression:" + expression);
		
		try {
			for (int i = 0; i < expression.length(); i++) { // expression 길이
				char ch = expression.charAt(i); //charAt을 통해 한글자씩 꺼냄
				
				if( ch == '(') { //여는 괄호면
					st.push(ch + ""); // push. 집어 넣음.
				}else if ( ch == ')') { //닫는 괄호면
					st.pop(); //pop. 꺼냄.
				}
			}
			
			if(st.isEmpty()) { // true면
				System.out.println("괄호가 일치합니다.");
			}else { //false면
				System.out.println("괄호가 일치하지 않습니다.");
			}
			
		}catch (EmptyStackException e) {
			System.out.println("괄호가 일치하지 않습니다22222.");
		}

	}

}
