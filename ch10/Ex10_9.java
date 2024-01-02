package ch10;

import java.util.*;
import java.text.*;

public class Ex10_9 {

	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
		DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");

		try {
			Date d = df.parse("2019년 11월 23일"); //문자열을 날짜 형태로 바꿈
			System.out.println(df2.format(d));   //날짜를 문자열로 바꿈
		}catch(Exception e) {}
	}

}
