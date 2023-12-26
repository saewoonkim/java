package ch07;

class MyTv {
	private boolean isPowerOn;
	private int channel;
	private int volume;   //private를 붙이면 외부에서 접근 불가.
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	//setter 메서드: 값을 설정하는 메서드
	public void setVolume(int volume) {
		if(volume>MAX_VOLUME || volume < MIN_VOLUME)
			return;
		this.volume = volume;
	}
	
	//getter 메서드: 값을 가지고 오는 메서드
	
	public int getVolume() {
		return volume;
	}
	
	public void setChannel(int channel) {
		if(channel > MAX_CHANNEL || channel < MIN_CHANNEL)
			return;
		this.channel = channel;
	}
	
	public int getChannel() {
		return channel;
	}
	
}

public class Exercise7_4 {

	public static void main(String[] args) {
		MyTv t = new MyTv();
		
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setVolume(20);
		System.out.println("VOL:" + t.getVolume());

	}

}
