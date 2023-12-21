package ch07;

class Product2 {
	int price; // 제품가격
	int bonusPoint; // 물건을 사게 되면 떨어지는 보너스 점수
	
	Product2(int price){
		this.price = price; //제품가격
		bonusPoint = (int)(price/10.0); // 총금액에 나누기 10을 해서 보너스포인트로 계산
	}
	
	Product2() {} // 기본 생성자가 있어야지 조상 클라스가 자손 클라스에 들어갈수있다
}

class Tv2 extends Product2 {//조상 클라스 생성자 여기에 프로덕트 2가들어가면서  가격및 보너스 포인트 계산 이 같이 들어감 
	Tv2(){super(100);} // 물건의가격, 물건
	
	public String toString() {return "TV";}
}

class Computer2 extends Product2 {
	Computer2() {super(200); }//물건의 가격 및 물건
	public String toString() {return "Computer";}
}

class Audio2 extends Product2 {
	Audio2() {super(50);}//물건의가격, 물건
	public String toString() {return "Audio";}
}

class Buyer2 {
	int money = 1000; // 바이어가 가지고있는 돈
	int bonusPoint = 0; // 보너스 포인트 값
	Product2[] cart = new Product2[10]; //프로덕트에주는 공간은 총 10 개 0~9
	int i = 0;//초기화값 0부터 카운터
	
	void buy(Product2 p) {
		if(money < p.price) { // 물건 값이 돈보다 많으면 프린트린으로 돈이없다고 출력
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price; // 물건가격에 돈 빼기
		bonusPoint += p.bonusPoint; // 보너스 포인트 추가
		cart[i++] = p; //카트 안에 물건들이 하나씩 골라지면서 물건을 구입했다고 나올꺼임 (tv, computer, audio, null(나오지않음))
		System.out.println(p +"을/를 구입하셨습니다.");
	}
	
	void summary() { // 서머리 구입물품에 대한 토탈 정보
		int sum = 0; // 가격 합계
		String itemList = ""; // 구입한 물품 목록
		
		for(int i=0; i<cart.length; i++) {// 카트에 담은 랭스 만킁(10) 1씩 차다가 그게 다차면 I는 널과 같아지면서 브레이크로 멈추게 된다
			if(cart[i]==null) break; // 카트 안에들어있는 물건이 다 차고 널로 채워자면 브레이크로멈추게된다
			sum += cart[i].price; // 카트 I 에들어있던 물건의 총합
			itemList += cart[i] + ", "; //I안에 들어있던 물건 리스트의 물건 만큼표시
		}
		System.out.println("구입하신 물품의 총금액은" + sum + "만원입니다.");
		System.out.println("궁비하신 제품은 " + itemList + "입니다.");
	
	}
}


public class Ex7_9 {

	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		
		b.buy(new Tv2());
		b.buy(new Computer2());
		b.buy(new Audio2());
		b.summary();

	}

}
