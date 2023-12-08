package ch03;

public class Exercise3_4 {
	//사과를 담는데 필요한 바구니 수 구하기.
	public static void main(String[] args) {
		int numOfApples = 123;
		int sizeOfBucker = 10;
		int numOfBucker = (numOfApples/sizeOfBucker + (numOfApples%sizeOfBucker>0?1:0));
		
		System.out.println("필요한 바구니의 수:" +numOfBucker);

	}

}
