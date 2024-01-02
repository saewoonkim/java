package ch10;

import java.text.DecimalFormat;

public class Ex10_7 {

	public static void main(String[] args) {
		//단위 구분자가 있는 10진수를
		DecimalFormat df = new DecimalFormat("#,###.##");  
		//지수형식의 문자열로 바꿈.
		DecimalFormat df2 = new DecimalFormat("#.###E0");
		
		try { //try catch: 예외처리
			  //df.parse("1,234,567.89");에 변환할 수 없는 형태의 문자열이 들어오면 예외가 발생 함.
			//format() : 숫자 -> 문자열
			//parse()  : 문자열 -> 숫자
			Number num = df.parse("1,234,567.89"); //parse 
			System.out.print("1,234,567.89" + " -> ");
			
			double d = num.doubleValue();
			System.out.print(d + " -> ");
			
			System.out.println(df2.format(num)); //format
		}catch(Exception e) {} //예외가 발생하면 빈 블록으로 처리. 콘솔창에 아무것도 나타나지 않음.

	}

}
