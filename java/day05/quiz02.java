package test5;

// 정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
// num은 int 범위의 정수입니다.
// 0은 짝수입니다.

public class quiz02 {

    public static String solution(int num) {
        String answer = "Odd";
        
        if(num%2 == 0) {
        	answer = "Even";
        	return answer;
        }else {
        	return answer;        	
        }
        
    }
    
    public static void main(String[] args) {
		System.out.println(solution(123));
	}
}
