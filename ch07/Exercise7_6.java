package ch07;

class Outer{
	class Inner{
		int iv = 100;
	}
}
public class Exercise7_6 {

	public static void main(String[] args) {
		//내부 클래스의 인스턴스를 생성하기 위해서는 먼저 외부 클래스의 인스턴스를 생성해야 됨.
		Outer o = new Outer();
		Outer.Inner li = o.new Inner();
		System.out.println(li.iv);
	}

}
