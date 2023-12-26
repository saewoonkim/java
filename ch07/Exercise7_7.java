package ch07;

class Outer5{
	static class Inner{
		int iv = 200;
	}
	
}

public class Exercise7_7 {

	public static void main(String[] args) {
		Outer5.Inner li = new Outer5.Inner();
		/* 스태틱 내부 클래스는 외부 인스턴스 클래스의 객체를 생성하지 않고 사용 가능 */
		/* static 변수를 인스턴스 없이 사용 할 수 있는 것 처럼. */
		System.out.println(li.iv);
	}

}
