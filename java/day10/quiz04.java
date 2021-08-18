package test09;

import java.util.Arrays;

// 시저 암호 
// 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다. 
// 예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. 
// "z"는 1만큼 밀면 "a"가 됩니다. 
// 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.

// 조건
// 공백은 아무리 밀어도 공백입니다.
// s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
// s의 길이는 8000이하입니다.
// n은 1 이상, 25이하인 자연수입니다.

public class quiz04 {

    public static String solution(String s, int n) {
        String answer = "";
        
        char [] arr = new char[s.length()];
        
        for( int i = 0; i<s.length(); i++) {
        	arr[i] = s.charAt(i);
        }
        
        for(int i = 0; i<arr.length; i++) {
        	if(arr[i] != ' ') {
        		if((char)(arr[i])<=90) {			// 대문자
        			if((char)(arr[i]+n) > 90) {
        				arr[i] = (char)(arr[i]+n-26);        			
        			}else {        			
        				arr[i] = (char)(arr[i]+n);        			
        			}        			
        		}else {
        			if((char)(arr[i]+n) > 122) {	// 소문자
        				arr[i] = (char)(arr[i]+n-26);        			
        			}else {        			
        				arr[i] = (char)(arr[i]+n);        			
        			}
        		}
        	}
        }
        answer = String.valueOf(arr);
        
        return answer;
        
      //  System.out.println((char)(arr[0]+1));        
    }
	
	
	
	
	public static void main(String[] args) {
		System.out.println(solution("z", 1));
	}
}

















