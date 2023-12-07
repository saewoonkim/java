package ch02;

public class Ex2_12 {

	public static void main(String[] args) {
		String str = "3";
		
		System.out.println(str.charAt(0) - '0');
		System.out.println('3' - '0' + 1);
		System.out.println(Integer.parseInt("3") + 1);//문자를 숫자로 바꿔서 숫자로
		System.out.println("3" + 1); //문자열로 되서
		System.out.println((char)(3+ '0'));
		
	}

}
