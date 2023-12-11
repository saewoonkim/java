package ch04;

public class Ex4_16 {

	public static void main(String[] args) {
		int sum =0;
		int i = 0;
		
		while(true) { //true는 무한 반복. 조건이 참이니까.
			if(sum>100)
				break;
			++i;
			sum += i;
			
		}
		System.out.println("i=" + i); //값이 100보다 클 때 까지 14번 돔
		System.out.println("sum=" + sum); //1부터 14까지 더한 값
					

	}

}
