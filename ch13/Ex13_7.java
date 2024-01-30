package ch13;

public class Ex13_7 implements Runnable{
	
	static boolean autoSave =false;

	public static void main(String[] args) {
		
		/* runable r = new Ex13_7();
		   Thread t2 = new Thread(r);
		*/
		Thread t = new Thread(new Ex13_7());
		
		t.setDaemon(true);
	
		t.start();
		
		for(int i =1; i<= 10; i++) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {}
			System.out.println(i);
			
			if(i==5) autoSave = true;
		}
		
		System.out.println("프로그램을 종료합니다.");

}

public void run() {
	while(true) {
		try {
			Thread.sleep(3*1000);
		}catch(InterruptedException e) {}
	
		if(autoSave) autoSave();
	}
}

public void autoSave() {
	System.out.println("작업파일이 자동저장되었습니다.");
}
}