package ch04;

public class Ex4_19 {

	public static void main(String[] args) {
		
		//for문에 Loop1이라는 이름을 부여.
		Loop1: for(int i=2; i <=9; i++) {
			for(int j=1; j <=9; j++) {
				if(j==5)
				break Loop1;
				//break   // break문을 그냥 쓰면, 바로 위 반복문만 빠져나옴.
				//continue Loop1; //바로 위 if문이 참이면
								  //5는 제외하고 반복되는데
								  //거의 쓰지 않음.
				//continue;       //거의 쓰지 않음.
			  System.out.println(i+"*"+j+"="+i*j);	
			}
			System.out.println();
			
		}

	}

}
