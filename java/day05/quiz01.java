package test5;

import java.util.Arrays;

// 함수 solution은 정수 n을 매개변수로 입력받습니다. 
// n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
// 예를들어 n이 118372면 873211을 리턴하면 됩니다.

// Arrays.sort
// Collection


public class quiz01 {
	
    public static long solution(long n) {
        
        
        String a = String.valueOf(n);		// long 을 String 으로 변환하는 기술
        System.out.println(a);
        
        String[]arr = a.split("");			// 변환된 String을 배열로 만들어주는 기술 "" 안에 아무것도 안쓰면 띄어쓰기가 자동으로 인식
        System.out.println(Arrays.toString(arr));
        
        Arrays.sort(arr);					// 오름 차순으로 정렬 하는 것
        System.out.println(Arrays.toString(arr));
        

        String arr2 = "";					// 배열을 다시 문자열로 변환
        for(int i = 0; i<arr.length; i++) {
        	arr2 += arr[i];
        }
        System.out.println(arr2);
        
        StringBuilder arr3 = new StringBuilder(arr2);
        System.out.println(arr3.reverse());		// 내림차순으로 
        
        String arr4 = new String(arr3);
        System.out.println(arr4 instanceof String);
        
        Long.valueOf(arr4);
        
        
        long answer = Long.valueOf(arr4);
        
        return answer;
    }
	
	
	
	
	public static void main(String[] args) {
		System.out.println(solution(11837));
	
		
	}

}
