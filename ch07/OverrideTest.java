package ch07;

class Mypoint {
	int x;
	int y;
	String getLocation() {
		return "x:" +x+ ", y" +y;
	}	
}

class MyPoint3D extends Mypoint{
	int z;
	String getLocation() {
		return "x:" +x+", y"+y+", z:"+z; 
	}
}

public class OverrideTest {

	public static void main(String[] args) {
		MyPoint3D p = new MyPoint3D();
		p.x=3;
		p.y=5;
		p.z=7;
		System.out.println(p.getLocation());
	}

}
