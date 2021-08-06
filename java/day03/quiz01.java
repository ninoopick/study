package test3;

public class quiz01 {
	
	// 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
	// n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요
	
	public static long solution(long n) {

		long a = (long) Math.sqrt(n);
		long answer = 0;
		if ((long) Math.pow(a, 2) == n) {
			answer = (long) (Math.pow(a + 1, 2));
			return answer;
		} else {
			return -1;
		}

	}
	
	
	
	

	public static void main(String[] args) {
		
//		double a = Math.pow(3, 2);
//		double b = Math.sqrt(4);
//		System.out.println(b);
		
		System.out.println(solution(100));

		
		
		
//		int a = 0;
//		int n = 152399025;
//		while (true) {
//			if(n < 1) {
//				System.out.println(-1);
//				break;
//			}else {
//				if (a * a == n) {
//					System.out.println((a + 1) * (a + 1));
//					break;
//				} else {
//					a++;
//				}
//				if (a > 25000000) {
//					System.out.println(-1);
//					break;
//				}
//				
//			}
//
//		}
		
		
		
		
		
	}
	
	
}
