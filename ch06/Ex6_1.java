package ch06;

public class Ex6_1 {

	public static void main(String[] args) {
		Tv t;
		t = new Tv();
		t.channel = 7;
		t.channelDown();
		System.out.println("현재 채널은" + t.channel +" 입니다.");
	}
}
		
class Tv{
	String color;
	boolean power;
	int channel;
			
	void power() {power =!power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
		
}

//여기 클라스를 주석 처리하면 6_2번째 에서 작동을 못한다 왜냐하면 클라스값이 없어지기때문에