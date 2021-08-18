package test09;

import java.util.Arrays;

// 두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요. 
// 배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다.
// 예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.

// 유클리드 오제법
// public static int gcd(int x, int y) {
// if(y == 0) return x;
// else return gcd(y, x % y);
// }

// public static int lcm(int x, int y) {
// return (x * y) / gcd(x, y);
// }


public class quiz01 {

    public static int[] solution(int n, int m) {

//    	int low = 0;
//    	int hight = 0;
//    	if(m%n == 0) {
//    		hight = n;
//    	}else {
//    		hight = n*m;
//    	}
    	
    	int[] answer = new int[2];
    	answer[0] = gcd(n,m);
    	answer[1] = lcm(n,m);
    	

        return answer;
           
    }
    
    static int gcd( int x , int y) {
    	if(y==0) return x;
    	else return gcd(y,x % y);
    }
    
    static int lcm (int x, int y) {
    	return (x*y) / gcd(x,y);
    }
	
    
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution (2,5)));
		
	}
}










