package test8;

// 자바 복습 중 
// 

public class test01 {
	public static void main(String[] args) {	
		// int i; // scope 범위) - 선언위치부터 서언된 블럭의 끝까지 유효 
		for(int i = 1; i <= 3; i++) {	// 괄호() 안의 문장을 3번 반복 
			System.out.println("Hello");
		}
		for(int x = 1, y = 10; x<=10; x++ , y--) {
			System.out.println("x="+x+",y=" + y); 
		}
	
		// 예제
		for(int i = 2; i<=9; i++) {
			for(int j =1; j<=9; j++) {
				System.out.println(i + "*" + j +"=" +(i*j));
			}
			System.out.println();
		}
		
		
	}
}
