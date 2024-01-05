package ch11;

import java.util.HashMap;
import java.util.Scanner;

public class Ex11_16 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 password를 입력해 주세요");
			System.out.println("id: ");
			String id = s.nextLine().trim();
			
			System.out.print("password: ");
			String password = s.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) { //containsKey(): id가 키에 포함되어 있는지 알려주는 메소드.
									   //포함되어 있으면 true
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
				continue;
			}
			
			//get(): 지정된 키(key)의 값을 반환. 못찾으면 null 반환.
			if(!(map.get(id)).equals(password)) {
				System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
			}else {
				System.out.println("id와 비밀번호가 일치합니다.");
				break;
			}
		}

	}

}
