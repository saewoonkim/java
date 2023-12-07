package ch03;

public class Ex3_02 {

	public static void main(String[] args) {
		int i=5, j=0;
		
		j = i ++;
		System.out.println("j= i++; 실행 후, i=" + ", j=" +j);
		
		i=5;
		j=0;
		
		j= ++ i;
		System.out.println("j= ++i; 실행 후, i=" + ", j=" +j);
	}

}
