package ch04;

public class Exercise4_2 {

	public static void main(String[] args) {
		/*1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을
		  구하시오.
		*/
		
		int sum = 0;
		
		for(int i=1; i<=20; i++) { //20번 반복
			if(i%2!=0 && i%3!=0) { //i가 2 또는 3의 배수가 아니라면
				sum = sum +i; //실행
			}
		}
		System.out.println("sum="+sum);
		
		
		 

	}

}
