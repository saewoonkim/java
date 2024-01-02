package ch10;

import java.util.Calendar;

public class Ex10_5 {
	//Run -> Run Configurations -> Arguments -> 2019 9 입력.
	public static void main(String[] args) {
		if(args.length !=2) {
			System.out.println("Usage : java Ex10_5 2019 9");
			return;
		}
		int year = Integer.parseInt(args[0]); // "2019". parseInt = 문자열 -> 숫자 변환
		int month = Integer.parseInt(args[1]); // "9"
		int START_DAY_OF_WEEK = 0; //해당되는 일의 요일
		int END_DAY = 0; //끝나는 날
		
		Calendar sDay = Calendar.getInstance(); //시작일
		Calendar eDay = Calendar.getInstance(); //끝일
		
		//월의 경우 0부터 11까지의 값을 가지므로 1을 뺴주어야 한다.
		//예를 들어, 2019년 11월 1일은 sDay,set(2019, 10, 1);과 같이 해줘야 한다.
		
		sDay.set(year, month-1, 1); //달은 0부터 시작하니까 -1
		eDay.set(year, month, 1);
		
		//다음 달의 첫날(12월1일)에서 하루를 빼면 현재달의 마지막 날 (11월30)이 됨.
		eDay.add(Calendar.DATE, -1);
		
		//첫 번째 요일. 1일이 무슨 요일인지 알아야 빈칸 작성 가능.
		START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
		
		//eDay에 지정된 날짜.
		END_DAY = eDay.get(Calendar.DATE);
		
		System.out.println("     " + args[0]+ "년" + args[1] +" 월");
		System.out.println(" SU MO TU WE TH FR SA");
		
		//해당 월의 1일이 어느 요일인지에 따라서 공백을 출력한다.
		// 만일 1일이 수요일이라면 공백을세 번 찍는다.(일요일부터 시작)
		
		for(int i=1; i < START_DAY_OF_WEEK; i++)
			System.out.print("  ");
												 //31일
		for(int i=1, n=START_DAY_OF_WEEK; i <= END_DAY; i++, n++) {
			System.out.print((i<10)? "  " +i : " " +i);
			if(n%7==0) System.out.println();
			
		}

	}

}
