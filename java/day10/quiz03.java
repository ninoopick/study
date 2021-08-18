package test09;

// 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
// n은 0 이상 3000이하인 정수입니다.
// ex) 12의 약수는 1, 2, 3, 4, 6, 12입니다. 이를 모두 더하면 28입니다.

public class quiz03 {

    public static int solution(int n) {
    
    	int answer = 0;

    	for(int i = 1; i<=n; i++) {
    		if(n%i == 0) {
    			answer +=i;
    		}
    		
    	}
    	
    	
    	
    	
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(12));
		
	}
}
