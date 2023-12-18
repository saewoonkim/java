package ch06;

public class Exercise6_2 {

	public static void main(String[] args) {
		Student s = new Student("홍길동", 1, 1, 100, 60, 76);
		
		String str = s.info();
		System.out.println(str);

	}

}

class Student {
	//인스턴스 객체 정의
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	//생성자
	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}
	//메소드 정의
	public String info() { //매개변수가 없는 메서드
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + ","
				+ (kor+eng+math) +"," + (Math.round((kor+eng+math)/3f *10)/10f);
}					  //총점 
	
}