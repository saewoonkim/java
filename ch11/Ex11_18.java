package ch11;

import java.util.*;

public class Ex11_18 {

	public static void main(String[] args) {
		String[] data = {"A", "K", "A", "K", "D", "K", "A","K","K","K","Z","D"};
		
		HashMap map = new HashMap();
		
		for(int i=0; i < data.length; i++) {
			if(map.containsKey(data[i])) { //data[i] "A"를 넣고, Key를 포함하고 있는지 확인.
										   // 처음 넣는거라, HashMap에 A가 없음	
										   //그렇기 때문에 else로 넘어감.
				int value = (int)map.get(data[i]); 
				map.put(data[i], value +1); //존재하는 키면 값을 1 증가
			} else {
				map.put(data[i], 1); //존재하지 않았던 키는 값을 1로 저장.
			}
		}
		
		Iterator it = map.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry entry = (Map.Entry)it.next();
			int value = (int)entry.getValue();
			System.out.println(entry.getKey() + " : " 
					+ printBar('#', value) + " " + value);
		}
		
	} //main
	public static String printBar(char ch, int value) {
		char[] bar = new char[value];
		
		for(int i=0; i < bar.length; i++)
			bar[i] = ch;
		
		return new String(bar); //String(char[] chrr)
		
			
		}
}


