package ch06;

class Data_1{
	int value; //생성자 자동 추가
}

class Data_2{
	int value; //생성자 자동 추가 안됨.
			   //왜냐하면 생성자를 하나 만들어 주었기 때문임.
			   //Data_2(){}
	Data_2(int x){
		value = x;
	}
	
}

public class Ex6_11 {
	public static void main(String[] args) {
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2();

	}
}
