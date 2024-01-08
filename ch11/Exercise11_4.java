package ch11;

import java.util.*;

//BanNoAscending 클래스를 완성하여, ArrayList에 담긴 Student 인스터스들이
//반과 번호로 오름차순 되게 정렬하시오.
class Studnet{
		String name;
		int ban;
		int no;
		int kor;
		int eng;
		int math;
		
		Studnet(String name, int ban, int no, int kor, int eng, int math){
			this.name = name;
			this.ban = ban;
			this.no = no;
			this.kor = kor;
			this.eng = eng;
			this.math = math;
		}
		
		int getTotal() {
			return kor + eng + math;
		}
		
		float getAverage() {
			return (int) ((getTotal()/ 3f) * 10 + 0.5) / 10f;
		}
		
		public String toString() {
			return name
					+"," + ban
					+"," + no
					+"," + kor
					+"," + eng
					+"," + math
					+"," + getTotal()
					+"," + getAverage();
		}
	}
	
	class BanNoAscending implements Comparator { //Comparator. Comparable 아님.
		
		public int compare(Object o1, Object o2) {
			if(o1 instanceof Student && o2 instanceof Student) {
				Student s1 = (Student)o1;
				Student s2 = (Student)o2;
				
				int result = s1.ban - s2.ban; // 반이 같은지 비교
											  // 반이 같다면 0
				                              // 반이 다르면 반이 더 큰 쪽에서 작은 쪽을 뺸 값이 
											  // 저장 됨.
				
				if(result ==0) { //반이 같으면, 번호를 비교
					return s1.no -s2.no;
				}
				return result;
			}
				
				return -1;
			}
		}

	
class Exercise11_4 {	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Student("이자바", 2, 1, 70, 90, 70));
		list.add(new Student("안자바", 2, 2, 60, 100, 80));
		list.add(new Student("홍길동", 1, 3, 100, 100, 100));
		list.add(new Student("남궁성", 1, 1, 90, 70, 80));
		list.add(new Student("김자바", 1, 1, 80, 80, 90));
		
		Collections.sort(list, new BanNoAscending()); //list를 BanNoAscending 객체를 사용하여 정렬.
													  //compare 메서드 사용.
		Iterator it = list.iterator();
		
		while (it.hasNext())
			System.out.println(it.next());
	}

}
