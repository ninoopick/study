// array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수,
// solution을 작성해주세요.
// divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

// arr은 자연수를 담은 배열입니다.
// 정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
// divisor는 자연수입니다.
// array는 길이 1 이상인 배열입니다.
package test14;

import java.util.Arrays;

public class quiz04 {

    public static int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int a = 0;
        for(int i = 0; i<arr.length; i++) {
        	if(arr[i]%divisor == 0) {		//5,10
        		a++;
        	}
        }
        // 배열 길이 구하기~!!!!!!
        
        answer= new int[a];
        int b = 0;
        
        if(a == 0 ) {
        	return new int [] {-1} ;
        }else {
        	for(int j = 0; j<arr.length; j++) {
        		if(arr[j]%divisor == 0) {		
        			answer[b] = arr[j];
        			b++;
        		}
        	}
        }
        Arrays.sort(answer);
        return answer;
    }
	
	public static void main(String[] args) {
		int [] arr = {3,2,6};
		System.out.println(Arrays.toString(solution(arr, 10)));
	}
}


