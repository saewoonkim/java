package algorithm_01;

import java.util.Scanner;

public class a09 {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("A>>>:");
		int a = scanner.nextInt();
		
		System.out.print("B>>>:");
		int b = scanner.nextInt();
		
		System.out.print("C>>>:");
		int c = scanner.nextInt();

		int prize = 0;
		int max = a;
	
		
		if (a==b && b==c)
			prize = 10000+a*1000;
		
		else if (a==b && a!=c)
			prize = 1000+a*100;
		
		else if (a!=b && a==c)
			prize = 1000+a*100;
		
		else if (a!=b && b==c)
			prize = 1000+b*100;
		
		else {
			
			if (b>max)
				max = b;
			
			if (c>max)
				max = c;
			
			prize = max * 100;
			
		}
		
		System.out.println(prize);
		scanner.close();
	}

}

//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	int a = sc.nextInt();
//	int b = sc.nextInt();
//	int c = sc.nextInt();
//	
//	if(a==b && b==c) {
//		System.out.println(10000+a*1000);
//	}else if(a==b || b==c || c==a) {
//		if(a==b) {
//			System.out.println(1000+a*100);
//		}else {
//			System.out.println(1000+c*100);
//		}
//	}else {
//		int max = Math.max(a,Math.max(b, c));
//		System.out.println(max*100);
//	}
//
