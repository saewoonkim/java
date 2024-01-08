package ch11;

import java.util.*;
//Student 클래스가 Comparable 인터페이스를 구현하도록 변경해서
//이름(name)이 기본 정렬기준이 되도록 하시오

class Student implements Comparable { // Comparable 인터페이스 구현
		String name;
		int ban;
		int no;
		int kor, eng, math;
		
		Student(String name, int ban, int no, int kor, int eng, int math){
			this.name = name;
			this.ban = ban;
			this.no = no;
			this.kor=kor;
			this.eng = eng;
			this.math = math;
		}
		
		int getTotal() {
			return kor+eng+math;
		}
		
		float getAverage() {
			return(int)((getTotal()/3f)*10+0.5)/10f;
		}
		
		public String toString() {
			return name + "," + ban + "," + no +"," + kor +"," + eng +"," +
									math + "," + getTotal() + "," + getAverage();
		}
		
		public int compareTo(Object o) {  //Object o :비교할 대상 객체
			if(o instanceof Student) {    //형변환 가능한지 확인. 
									      //형변환 가능 하다면
									   
				Student tmp = (Student)o; //Student로 형변환. 
				
				return name.compareTo(tmp.name); //String 클래스의 compareTo() 호출
												 //name과 tmp.name을 비교하고 비교 결과에 따라 정수 반환.
												 //음수: name이 tmp.name 보다 앞에 있음
												 // 0: name과 tmp.name이 동일
												 // 양수: name이 tmp.name 보다 뒤에 있음.
			}else {
				return -1;
			}
			
		}
	}
	
class Exercise11_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();  //저장순서 o 중복 o
		list.add(new Student("홍길동", 1, 1, 100, 100, 100));
		list.add(new Student("남궁성", 1, 2, 90, 70, 80));
		list.add(new Student("김자바", 1, 3, 80, 80, 90));
		list.add(new Student("이자바", 1, 4, 70, 90, 70));
		list.add(new Student("안자바", 1, 5, 60, 100, 80));
		
		Collections.sort(list); //Collections.sort를 사용하면 ArrayList에 저장된 요소들을
								//쉽게 정렬 가능.
		
								//그러나ArrayList에 저장된 요소들은 Comparable 인터페이스를
							    //구현하고 있어야 됨. Comparble 인터페이스 안에는 CompareTo메서드가
								//정의되어 있는데, CompareTo 메서드는
								//Collections.sort(List list)에 의해 호출되에 정렬 기준을 제공 함.
		Iterator it = list.iterator();//정렬된 결과를 출력하기 위해 iterator 사용.
		
		while(it.hasNext())
			System.out.println(it.next());
	}

}
