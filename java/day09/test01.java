package test09;

// for 문부터 복습

public class test01 {
	public static void main(String[] args) {
	
		
//		for(int i = 1; i<=5; i++) {
//			System.out.println("*********");
//		}
		for(int i = 1; i<=5;i++) {
			for(int j =1 ; j<=10;j++) {
				System.out.print("*");
			}			
			System.out.println();
		}
		
		
		int sum = 0;
		int i = 0;
		// i 를 1씩 증가해 sum 에 계속 더해나간다.
		while(sum <= 100) {
			System.out.printf("%d - %d%n",i,sum	);
			sum += ++i;
		}
		
		
		
		
		
	}
}
