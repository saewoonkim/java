package ch07;

class MyTv {
	private boolean isPowerOn;
	private int channel;
	private int volume;   //private를 붙이면 외부에서 접근 불가.

    private int prevChannel; //이전 채널로 가기
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	//setter 메서드: 값을 설정하는 메서드
	public void setVolume(int volume) {
	
		this.volume = volume;
	}
	
	//getter 메서드: 값을 가지고 오는 메서드
	
	public int getVolume() {
		return volume;
	}
	
	public void setChannel(int channel) {

		prevChannel = this.channel; //현재 채널을 prev(이전 채널)에 저장함.
		this.channel = channel;
		
	}
	
	public int getChannel() {
		return channel;
	}
	
	public void gotoPrevChannel() {
		setChannel(prevChannel);
	}
	
}

public class Exercise7_5 {

	public static void main(String[] args) {
		MyTv t = new MyTv();
		
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setChannel(20);
		System.out.println("CH:" + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());
	}

}
