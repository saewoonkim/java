package ch04;

public class Exercise4_10 {

	public static void main(String[] args) {
		/*
		 	숫자맞히기 게임.
		 	1~100사이의 값을 반복적으로 입력.
		 	컴퓨터가 생각한 값 맞히기.
		 	(1)컴퓨터가 생각한 숫자 (2)도전 횟수
		 */
		
		// 1~100 사이의 임의의 값을 얻어서 answer에 저장.
		int answer = (int)(Math.random()*100)+1;
		int input = 0; //사용자 입력을 저장할 공간
		int count = 0; //시도횟수를 세기위한 변수
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		do {
			count ++;
			System.out.print("1과 100사이의 값을 입력하세요 :");
			input = s.nextInt(); //입력받은 값을 변수 input에 저장
			
			if(answer > input) {
				System.out.println("더 큰 수를 입력하세요.");
			}else if (answer < input){
				System.out.println("더 작은 수를 입력하세요.");
			}else{
				System.out.println("정답입니다.");
				System.out.println("시도 횟수는" +count+"입니다");
				break;
			}
			
		}while(true); //무한반복문 
		
		
	}

}
