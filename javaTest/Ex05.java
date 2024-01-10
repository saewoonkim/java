package javaTest;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		System.out.print("구구단을 입력하세요.>");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		 for( int i = 1 ; i<10 ; ++i ) {

			  System.out.println(a+"*"+i+"="+a*i);	
			}
		 sc.close();
	}
}
