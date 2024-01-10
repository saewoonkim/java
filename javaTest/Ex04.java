package javaTest;

import java.util.Scanner;
	
	public class Ex04 {
		public static void main(String[] args) {
			int score = 0;
			char grade = ' ';
			
			System.out.print("점수를 입력하세요.>");
			Scanner sc = new Scanner(System.in);
			score = sc.nextInt();
	
			if(score >=80) {
				grade ='A';
			}else if (score >=60) {
				grade ='B';
			}else if (score >=40) {
				grade ='C';
			}else if (score >=20){
				grade ='D';
			}else {
				grade ='F';
			}
			System.out.println(grade);
		}
}
