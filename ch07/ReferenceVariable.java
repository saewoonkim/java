package ch07;

class Tv2{
	boolean power;
	int channel;
	void channelUp() {++channel;}
	void channelDown() {--channel;}
	
}

class VCR{
	boolean power;
	boolean stop;
	int counter =0;
	void power() {power = !power;}
	void stop() {stop = !stop;}
}


class TVCR extends Tv2{
	VCR vcr = new VCR();
	
	void power() {
		
	}
	void stop() {
		
	}
}

public class ReferenceVariable {
	public static void main(String[] args) {
		
	

	}

}
