package javaTest;

//문제 13, 14, 15, 16
class People {
		public String name;
		public String ssn;
		
	public People(String name, String ssn) {
	    	this.name = name;
	    	this.ssn = ssn;
	    
	}
}


class Student2 extends People {
		public int studentNo;
		
		public Student2 (String name, String ssn, int studentNo) {
		
			super(name, ssn);
			this.studentNo = studentNo;	
		}

}

class Ex13_16{
public static void main(String[] args) {

	    Student2 student = new Student2("홍길동", "123456-123456", 1);


	    System.out.println("Name: " + student.name);
	    System.out.println("SSN: " + student.ssn);
	    System.out.println("Student: " + student.studentNo);
	}
}
