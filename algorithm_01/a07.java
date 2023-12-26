package algorithm_01;

import java.util.Scanner;

public class a07 {

	public static void main(String[] args) {
		
		int x;
		int y;
		
		System.out.print("불기년도를 입력하세요>>>:");
		Scanner scanner = new Scanner(System.in);
		y = scanner.nextInt();
		
		if (1000<= y && y <=3000) {
			
			x = y-543;
			System.out.println(x);
		}
		else {
			System.out.println("년도를 확인해주세요");
		}
		
	}

}

//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	int y = sc.nextInt();
//	System.out.println(y-543);
//
//}