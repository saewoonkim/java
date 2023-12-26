package algorithm_01;

import java.util.Scanner;

public class a05 {

	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';
		
		System.out.print("점수를 입력하세요.>");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();

		if(score >=90) {
			grade ='A';
		}else if (score >=80) {
			grade ='B';
		}else if (score >=70) {
			grade ='C';
		}else {
			grade ='D';
		}
		System.out.println(grade);
	}

}

//public static void main(String[] args) {
//	Scanner scanner = new Scanner(System.in);
//	int Score = scanner.nextInt();
//	if(Score >= 90) {
//		System.out.println("A");
//	}else if(Score >= 80) {
//		System.out.println("B");
//	}else if(Score >= 70) {
//		System.out.println("C");
//	}else if(Score >= 60) {
//		System.out.println("D");
//	}else {
//		System.out.println("F");
//	}
