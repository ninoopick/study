package test6;

public class test01 {

	// 자바의 정석 기초부터 다시 보는 날
	
	// 숫자를 문자열로 변환할때는  123+"" 하면 된다.
	

	// 기본형과 참조형
	// 기본형 : (논리형 boolean,) (문자열 char,) (정수형 byte, short, int, long,) (실수형 float, double)
	// 참조형 : String , System
	
	// 정밀도는 float 보다 double
	
	public static void main(String[] args) {
		
//		System.out.println(10.0/3);
	
//		System.out.printf("%d%n",15);
//		System.out.printf("%#o%n",15);
//		System.out.printf("%#x%n",15);
//		System.out.printf("%s",Integer.toBinaryString(15));
		
//		float f = 123.456789f;
//		System.out.printf("%f%n",f);
//		
//		double x = 123.456789;
//		System.out.printf("%f%n",x);
//		System.out.printf("%e%n",x);
//		System.out.printf("%g%n",x);
		
		System.out.printf("[%5d]%n",1234567);	// %5라고 했지만 값이 잘리지않고 더 나온다.
		System.out.printf("[%-5d]%n",10);
		System.out.printf("[%05d]%n",10);
		
		double d = 1.23456789;
		System.out.printf("%f%n",d);
		System.out.printf("%14.10f%n",d);
		System.out.printf("%14.6f%n",d);
		
		
		System.out.printf("[%s]%n","www.codechhobo.com");
		System.out.printf("[%20s]%n","www.codechhobo.com");
		System.out.printf("[%-20s]%n","www.codechhobo.com");
		System.out.printf("[%.10s]%n","www.codechhobo.com");
		

		
	}
}
