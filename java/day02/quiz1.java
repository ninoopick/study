package test2;

public class quiz1 {
	public static void main(String[] args) {
		// arr안의 모든 값의 합계를 구하라
		int [] arr= {10,20,30,40,50};
		int sum = 0;
		
		for(int i = 0; i<arr.length;i++) {
			sum += arr[i];
		}
		System.out.println("합계 = " + sum);
	}
}
