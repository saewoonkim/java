package javaTest;
//문제 7,8
public class Car {

    String company = "현대자동차";
    String model = "그랜져";
    String color = "검정";
    int maxSpeed = 350;
    int speed;

    public static void main(String[] args) {
        Car mycar = new Car();

        System.out.println("제작회사 : " + mycar.company);
        System.out.println("모델명 : " + mycar.model);
        System.out.println("색상 : " + mycar.color);
        System.out.println("최고속도 : " + mycar.maxSpeed);
        System.out.println("현재속도 : " + mycar.speed);

        mycar.speed = 60;
        System.out.println("수정된 속도 :" + mycar.speed);
    }
}