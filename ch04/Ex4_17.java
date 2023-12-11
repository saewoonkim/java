package ch04;

public class Ex4_17 {

	public static void main(String[] args) {
		for(int i=0; i<=10; i++) {
			if(i%3==0) // 3의 배수
				continue;//0부터 10까지 출력 하는데, 3, 6, 9 건너 뜀
						 //break문이면 for문을 완전히 빠져나가야 하는데
						 //3만 빼고 for문을 계속 돔.
			System.out.println(i);
		}

	}

}
