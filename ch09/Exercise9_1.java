package ch09;

public class Exercise9_1 {
	//다음과 같은 실행 결과를 얻도록 SutdaCard클래스의 equals()를 멤버변수인
	//num,isKwang의 값을 비교하도록 오버라이딩하고 테스트 하시오.
	public static void main(String[] args) {
		SutdaCard c1 = new SutdaCard(3, true);
		SutdaCard c2 = new SutdaCard(3, true);
		
		System.out.println("c1=" + c1);
		System.out.println("c2=" + c1);
		System.out.println("c1.equals(c2)=" + c1.equals(c2));
	}

}

class SutdaCard{
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	
//	public boolean equals(Object obj) {
//		if(obj instanceof SutdaCard) {
//			return num==((SutdaCard)obj).num && isKwang==((SutdaCard)obj).isKwang;
//			}
//		else 
//			return false;
	
	
	//매개변수가 Object 타입이기 때문에 어떤 타입의 인스턴스도 매개변수로 가능함.
	//그렇기 때문에 instanceof로 확인한 후 num과 isKwang을 비교해야 됨.
	//Object로 받는 이유는, Object는 최고 조상이기 때문에 모든 타입을 입력 받을 수 있기 때문임.
	public boolean equals(Object obj) { // equals의 매개변수로 c1.equals(c2)의 c2가 들어 옴.
		if(obj instanceof SutdaCard) { //obj 참조변수가 SutdaCard로 형변환 가능한지 체크 함.
			SutdaCard c = (SutdaCard)obj; //if의 조건이 true라면 obj 참조변수 타입을 SutdaCard로
										  //바꿈
			return num==c.num && isKwang==c.isKwang;
			//num은  c1.equals(c2)의 c1 값이고 
			//c.num은 c1.equals(c2)의 c2 값임
			}//boolean 타입이니까 조건이 만족되면 true를 반환 함.
			return false; //obj instance of SutdaCard가 false 라면
						  //false를 반환함.
	}
	
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
	
	
}
