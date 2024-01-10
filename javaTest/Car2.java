package javaTest;

//문제 9.10.11.12
public class Car2 {

	String model;
	int speed;
	

	Car2(String model, int speed){
		this.model = model;
		this.speed = speed;
	}
	
    void setSpeed(int up) {
        speed = up;
 
    }	

    
    void run() {
        for (int i = 10; i <= 50; i += 10) {
            this.setSpeed(i);
            System.out.println(this.model + "가 달립니다. (시속 " + this.speed + "km/h)");
        }  
    }
    
    public static void main(String[] args) {
        Car2 myCar1 = new Car2("Benz", 10);
        Car2 myCar2 = new Car2("Lambo", 10);
        myCar1.run();
        myCar2.run();
    }

}   


