package ch03;

public class Exercise3_2 {

	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c= 'A'; //문자코드 65
		
		System.out.println(y >= 5 || x < 0 && x >2);  //true
		System.out.println(y += 10 - x++); //13 후위형 'y = y + (10 - x++)'
		System.out.println(x += 2); //5
		System.out.println(!('A' <= c && c <='Z')); //false
		System.out.println('C' - c); //2  인트보다 작은 타입일 경우 인트 변환 //유니코드 67-65
		System.out.println('5' - '0'); //53   //유니코드 53-48
		System.out.println(c + 1); //66 
		System.out.println(++c); //B
		System.out.println(c++); //B   //후위형
		System.out.println(c); //C
	

	}

}
