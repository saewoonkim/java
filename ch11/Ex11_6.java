package ch11;

import java.util.*;

public class Ex11_6 {

	public static void main(String[] args) {
		int [] arr = {0,1,2,3,4}; //배열 arr
		int [][] arr2D = {{11,12,13},{21,22,23}}; //2차원 배열
		
		System.out.println("arr="+Arrays.toString(arr)); //1차원 배열 출력
		System.out.println("arr2D="+Arrays.deepToString(arr2D)); //2차원 배열 출력
		
		int [] arr2 = Arrays.copyOf(arr, arr.length); //arr.length = 5
		int [] arr3 = Arrays.copyOf(arr, 3); //0.1.2 복사 x<3
		int [] arr4 = Arrays.copyOf(arr, 7); // 0, 1, 2, 3, 4, 0, 0  복사 x<7
		int [] arr5 = Arrays.copyOfRange(arr, 2, 4);
		int [] arr6 = Arrays.copyOfRange(arr, 0, 7);
		
		System.out.println("arr2="+Arrays.toString(arr2)); //toString으로 출력
		System.out.println("arr3="+Arrays.toString(arr3));
		System.out.println("arr4="+Arrays.toString(arr4));
		System.out.println("arr5="+Arrays.toString(arr5));
		System.out.println("arr6="+Arrays.toString(arr6));
		
		int[] arr7 = new int[5]; //길이가 5인 배열 생성
		Arrays.fill(arr7, 9); // arr = [9,9,9,9,9] //fill로 채움
		System.out.println("arr7="+Arrays.toString(arr7));
		
		Arrays.setAll(arr7, i -> (int)(Math.random()*6)+1); //람다식 랜덤 값 추가
		System.out.println("arr7="+Arrays.toString(arr7));
		
		for(int i : arr7) { //향상된 for문, 배열의 순서대로 꺼내서 i에 집어 넣음
						 	//for(x=0; x<arr7.length; x++){
							//	  int i = arr7[x]; 이랑 같음. 
			char[] graph = new char[i]; //처음이 3니까 graph에 3가 담김
			Arrays.fill(graph, '*'); //3니까 별을 3개 채움
			System.out.println(new String(graph)+i); // *** + i값(2) = ***3
													 //for문 계속 돌림.
		}
		
		String[][] str2D = new String[][] {{"aaa","bbb"},{"AAA","BBB"}}; //2차원 배열
		String[][] str2D2 = new String[][] {{"aaa","bbb"},{"AAA","BBB"}}; //2차원 배열 
		
		System.out.println(Arrays.equals(str2D, str2D2)); //false
		System.out.println(Arrays.deepEquals(str2D, str2D2)); //false
		
		char[] chArr = {'A', 'D', 'C', 'B', 'E'};
		
		System.out.println("chArr="+Arrays.toString(chArr)); //to String 출력
		System.out.println("index of B="+Arrays.binarySearch(chArr, 'B')); //binarySearch 이상한 값.
		System.out.println("=After sorting=");
		Arrays.sort(chArr); //정렬
		System.out.println("chArr="+Arrays.toString(chArr)); //정렬 값 출력
		System.out.println("index of B="+Arrays.binarySearch(chArr,'B')); //정렬 값 검색
		

	}

}
