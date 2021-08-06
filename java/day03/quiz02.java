package test3;

public class quiz02 {

	//1-1. 입력된 수가 짝수라면 2로 나눕니다. 
	//1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
	//2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
	//500번 작업후 1이 안나오면 -1 리턴 
    public static int solution(long num) {
		int answer = 0;


		for (int i = 0; i < 500; i++) {

			if (num == 1) {
				return i;
			} else {
				if (num % 2 == 0) {
					num = num / 2;
				} else {
					num = (num * 3) + 1;
				}
			}
		
		}
		answer = -1;
        return answer;
        
    }
	
	
	public static void main(String[] args) {
		System.out.println(solution(626331));
	}
}
