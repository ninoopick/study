package test5;

import java.util.Arrays;

// 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 
// 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

public class quiz03 {
	
    public static int[] solution(long n) {
        
        String a = String.valueOf(n);	// 문자열로 바꿔 길이 구하기
        System.out.println(a);
        
        int[] answer = new int[a.length()];	// 담을 int 배열의 길이는 위 문자열에서 가져옴
        
        int x = 0;

        while(n>0) {
        	answer[x] = (int)(n%10);
        	n = (long)n/10;
        	x++;
        	System.out.println(n);
        }
    
        return answer;
    }
	
	
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(solution(1L)));
		
		
	}
}
 