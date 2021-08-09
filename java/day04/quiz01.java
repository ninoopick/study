package test4;

public class quiz01 {

	
	// 함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 
	// 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
	// x는 -10000000 이상, 10000000 이하인 정수입니다.
	// n은 1000 이하인 자연수입니다.
	
	public static long[] solution(long x, int n) {
//	    long[] answer = {};
	    
	    long[] arr = new long[n];	    
	
	    if(n<=1000) {
	    	for(int i = 1; i<=n; i++) {
	    		long a = x*i;
	    		arr[i-1] = (long)a;
	    	}	    	
	    }
	    
	    return arr;
	}

	public static void main(String[] args) {

		long[] arr = solution(2,1000);
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);			
		}
		
		
		
		
	}
}
