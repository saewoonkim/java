package ch11;

import java.util.*;

public class Exercise11_6 {

	public static void main(String[] args) {
		Set set = new HashSet(); // HashSet은 중복 허용 x 순서 유지 x
								 // 숫자를 읨의의 순서로 저장한다 해도
								 //한 숫자가 고정된 위치에 저장 됨.
		int[][] board = new int [5][5];
		
		for (int i = 0; set.size() < 25; i++) {
			set.add((int) (Math.random() * 30) +1 +"");
		}
		
		ArrayList list = new ArrayList(set);
		Collections.shuffle(list); //그렇기 때문에 shuffle 메서드를 사용해야 됨.
		Iterator it = list.iterator();
		
		
		
		for( int i =0; i < board.length; i++) {
			for (int j= 0; j < board[i].length; j++) {
				board[i][j] = Integer.parseInt((String) it.next());
				System.out.print((board[i][j] < 10? "" : "") + board[i][j]);
			}
			System.out.println();
		}

	}

}
