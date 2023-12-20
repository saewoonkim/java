package ch07;

public class Ex7_7 {

	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;
//		car.water();
		fe2 = (FireEngine)car;
		fe2.water();
	}

}

class Car{
	String color;//기능
	int door;//기능
	
	void drive() {
		System.out.println("drive, Brrr~");
	}//기능
	
	void stop() {
		System.out.println("stop!!!");
	}//기능
}

class FireEngine extends Car{
	void water() {
		System.out.println("water!!!");
 }
}