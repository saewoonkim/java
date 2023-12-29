package ch09;

public class Ex9_16 {

	public static void main(String[] args) {
		int i = 10;
		
		Integer intg = (Integer)i; //Integer intg = Integer.valueOf(i);
								   //컴파일러가 바꿔 줌
		Object obj = (Object)i;    //기본형을 객체타입으로 바꿔 줌 ->오토박싱
		
		Long 	lng = 100L;
		
		int i2 = intg +10;         // 참조형이 기본형으로 바뀜 -> 언박싱
		long l =intg + lng;
		
		Integer intg2 = new Integer(20);
		int i3 = (int)intg2;
		
		Integer intg3 = intg2 + i3;
		
		System.out.println(" i         ="+i);
		System.out.println(" intg 	   ="+intg);
		System.out.println(" obj       ="+obj);
		System.out.println(" lng       ="+lng);
		System.out.println(" intg+10   ="+i2);
		System.out.println(" intg +lng ="+l);
		System.out.println(" intg2     ="+intg2);
		System.out.println(" i3        ="+i3);
		System.out.println(" intg2+i3  ="+intg3);
		

	}

}
