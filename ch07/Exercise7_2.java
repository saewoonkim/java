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
	
	}
	
	//shuffle 메서드 추가
	//배열 card에 담긴 카드의 위치를 뒤 섞는다.
	void shuffle() { //반환타입 없음.
		for(int i=0; i<cards.length; i++) {
			int j=(int)(Math.random()*cards.length);
			
			//cards[i]와 cards[j]의 값을 서로 바꿈.
			SutdaCard tmp = cards[i];
			cards[i] = cards[j];
			cards[j] = tmp;
		}
	}
	//매개변수가 있는 pick 메서드 추가
	SutdaCard pick(int index) {
		return cards[index];
	}
	//매개변수가 없는 pick 메서드 추가
	SutdaCard pick() {
		int index = (int)(Math.random()*cards.length);
		return pick(index);
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

class Exercise7_2{
	public static void main(String args[]) {
		SutdaDeck deck = new SutdaDeck();
		
		System.out.println(deck.pick(0));//tostring 안적어 줬는데 왜 1k 나왔고(프린트 린을 쓰면 자동으로 투스트링이 생략됨 
											//메모리에는 1 하고 k 가들어가있어서 그걸 불러낸거임
		System.out.println(deck.pick());
		deck.shuffle();
		
		for(int i = 0; i< deck.cards.length; i++)
			System.out.print(deck.cards[i] + ",");
		
		System.out.println();
		System.out.println(deck.pick(0));
		
	}
}


