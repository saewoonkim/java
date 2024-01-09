package ch12;

import java.util.ArrayList;

class Fruit2  {public String toString() { return "Fruit";}}
class Apple2 extends Fruit2 { public String toString() {return "Apple";}}
class Grape2 extends Fruit2 { public String toString() {return "Grape";}}

class Juice {
	String name;
	Juice(String name)  {this.name = name + "Juice"; }
	public String toString() {return name;           }
	
}

class Juicer { //주서 클래스
	static Juice makeJuice(FruitBox2<? extends Fruit2> box) { //메서드는 가능.
		//스태틱 매서드.매개변수에 와일드카드 적용
		//Fruit2와 그 자손들은 모두 들어올 수 있음.
		String tmp = " ";
		
		for(Fruit2 f : box.getList()) //향상된 for문
			tmp += f + " "; //하나씩 꺼내 f에 대입 후 문자열 결합.
		return new Juice(tmp);
	}
}

public class Ex12_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FruitBox2<Fruit2> fruitBox = new FruitBox2<Fruit2>();
		FruitBox2<Apple2> appleBox = new FruitBox2<Apple2>();
		
		
		fruitBox.add(new Apple2());
		fruitBox.add(new Grape2());
		appleBox.add(new Apple2());
		appleBox.add(new Apple2());
		
		System.out.println(Juicer.makeJuice(fruitBox));
		System.out.println(Juicer.makeJuice(appleBox));
	}

}

class FruitBox2<T extends Fruit2> extends Box2<T> {}

class Box2<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) { list.add(item); }
	T get(int i) { return list.get(i); }
	ArrayList<T> getList() {return list; }
	int size()   { return list.size(); }
	public String toString() {return list.toString();}
}
