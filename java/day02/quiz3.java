package test2;

public class quiz3 {

	public static void main(String[] args) {
		// 1~9 사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램
		int [] ballArr = {1,2,3,4,5,6,7,8,9};
		int [] ball3 = new int[3];
		
		// 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
		for(int i = 0; i<ballArr.length; i++) {
			int j = (int)(Math.random() * ballArr.length);
			int tmp =0;
			
			
		}
		
		// 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다.
		
		for(int i = 0; i<ball3.length;i++) {
			System.out.print(ball3[i]);
		}
	}
}
