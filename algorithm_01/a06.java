package algorithm_01;

public class a06 {

	public static void main(String[] args) {
		//for문에 Loop1이라는 이름을 부여.
		Loop1: for(int i=2; i <=10; i++) {
			for(int j=1; j <=10; j++) {
				if(j==10)
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

//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	int N = sc.nextInt();
//	for(int i=1; i<10; i++) {
//		System.out.println(N+"*"+i+"="+N*i);
//	}