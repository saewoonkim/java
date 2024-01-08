package ch11;

import java.util.HashSet;

//섯다카드, Hashset에 저장하고 출력,  HashSet에 중복된 카드 x 
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
	
	public boolean equals(Object obj) { //equals 메서드가 두 객체의 메모리
										//주소를 올바르게 판단하지 못할 수 있음.
		if(obj instanceof SutdaCard) {
			SutdaCard c = (SutdaCard)obj;
				return num == c.num && isKwang == c.isKwang;
			}else {
				return false;
			}
		}
		
		public String toString() {
			return num + (isKwang? "K" : "");
		}
		
		public int hashCode() {
			return toString().hashCode();
		}
	}
	
	class Exercise11_5{
		public static void main(String[]args) {
			SutdaCard c1 = new SutdaCard(3, true);
			SutdaCard c2 = new SutdaCard(3, true);
			SutdaCard c3 = new SutdaCard(1, true);
			
			HashSet set = new HashSet(); //원래 HashSet은 중복 허용 x 
										 //그러나 중복된 값이 나오는 이유는
										 //HashCode()를 오버라이딩 하지 않았기 때문.
			set.add(c1);
			set.add(c2);
			set.add(c3);
			
			System.out.println(set);
		}
		
		
	}



