package ch04;

public class Exercise4_5 {

	public static void main(String[] args) {
		/* 다음의 for문을 while문으로 변경하시오 */
		
		/*  for(int i=0; i<=10; i++) { //11번 반복
				for( int j=0; j <= i; j++) //11번 반복
					System.out.println("*");
				System.out.println();
		   }
		*/
		
			int i = 0;
			while( i<= 10) {
				int j=0;
				while(j<=i) {
					System.out.println("*");
					j++;
				}
				System.out.println();
				i++;
			}
	

	}

}
