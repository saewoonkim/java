package algorithm_01;

import java.util.Scanner;

public class a10 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String[]Kda = sc.nextLine().split("/");
			int k = Integer.parseInt(Kda[0]);
			int d = Integer.parseInt(Kda[1]);
			int a = Integer.parseInt(Kda[2]);
			if(k+a<d || d==0) {
				System.out.println("hasu");
			}else {
			System.out.println("gosu");
		}
	}
}


