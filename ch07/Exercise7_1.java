package ch07;

//섯다카드 20장 한벌 정의
//Sutda배열 초기화
//섯다카드는 1부터 10까지의 숫자가 적힌 카드가 한쌍
//숫자가 1,3,8인 경우 둘 중의 한 장은 Kwang이어야 됨.


class SutdaDeck{
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		for(int i = 0; i<cards.length; i++) {
			int num = i%10+1;
			boolean isKwang = (i < 10) && (num==1 || num==3 || num==8);
			
			cards[i] = new SutdaCard(num,isKwang);
		}
		//생성자를 정의하는 문제.
		//20장의 카드 중 1~10까지의 숫자가 적힌 카드가 두 쌍.
		//int num = 1%10+1 ( 자바에서 %는 정수형 나누기. 
		//					 그렇기 때문에 0%10의 몫은 0이고 나머지는 0이 됨.
		//                             1%10의 몫은 0이고 나머지는 1.
	}

}
class SutdaCard{
	int num;
	boolean isKwang;
	
	SutdaCard(){
		this(1,true);
	}
	
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	// info()대신 Object클래스의 toString()을 오버라이딩했다.
	public String toString() {
		return num + (isKwang ? "K":"");
	}
}

class Exercise7_1{
	public static void main(String args[]) {
		SutdaDeck deck = new SutdaDeck();
		
		for(int i = 0; i< deck.cards.length; i++)
			System.out.print(deck.cards[i] + ",");
		
		
	}
}


