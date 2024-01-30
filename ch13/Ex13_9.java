package ch13;

import javax.swing.JOptionPane;

public class Ex13_9 {

	public static void main(String[] args) {
		ThreadEx9_1 th1 = new ThreadEx9_1();
		th1.start();
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은" + input + "입니다.");
		th1.interrupt(); 
		System.out.println("isInterrupted():" + th1.isInterrupted());
	}

}

class ThreadEx9_1 extends Thread {
	public void run() {
		int i = 10;
		
		try {
		while(i !=0 && !isInterrupted()) {
			System.out.println(i--);
			Thread.sleep(1000);
		}
		}catch(InterruptedException e) {
		
	}
		System.out.println("카운트가 종료되었습니다.");
	}
}
