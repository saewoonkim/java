package ch02;

public class Ex2_9 {

	public static void main(String[] args) {
		String url = "www.codechobo.com";
		float f1 = .10f;
		float f2 = 1e1f; 
		float f3 = 3.14e3f;
		double d = 1.23456789;
		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
		//%f = 부동소수점의 형식으로 출력 
		//%e = 지수 형식으로 출력
		//%g = 값을 간단하게 출력
		System.out.printf("f1=%f, %e, %g%n", f2, f2, f2);
		//%n은 엔터
		System.out.printf("f1=%f, %e, %g%n", f3, f3, f3);
		System.out.printf("d=%f%n", d);
		System.out.printf("d=%14.10f%n", d);
		//소주점 자리 지정. 전체 14자리 중 소수점 10자리
		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%s]%n",url);
		//문자열 출력
		System.out.printf("[%20s]%n",url);
		//20자리 공간 확보 우측 정렬
		System.out.printf("[%-20s]%n",url);
		//20자리 공간 확보 좌측 정렬
		System.out.printf("[%.8s]%n", url);
		//좌측에서 8글자만 출력

	}

}
