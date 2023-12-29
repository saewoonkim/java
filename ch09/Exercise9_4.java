package ch09;

public class Exercise9_4 {
	
	//indexOf(int ch) 주어진 문자(ch)가 문자열에 존재하는지 확인하여 위치를 알려 줌. -334p
	//못 찾으면 -1 반환
	public static boolean contains(String src, String target) {
		//메서드명:contains 반환타입:boolean, 매개변수: String src, String target
		return src.indexOf(target) != -1; 
	}
	
	public static void main(String[] args) {
		System.out.println(contains("12345", "23"));
		System.out.println(contains("12345", "67"));

	}

}
