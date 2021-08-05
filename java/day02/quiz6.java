package test2;

import java.util.Arrays;

public class quiz6 {

	public static void main(String[] args) {
		// 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
		// 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다
		
		
//		int [] arr= {3,2,1,4};
		int [] arr= {8,9,4,7};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		if(arr.length<=1) {
			System.out.println("-1");
		}
		else {
			for(int i = 1; i<arr.length; i++) {
				System.out.print(arr[i]);
			}
		}
		
		
		
//		1 ~ arr.length 까지 출력 하면 된다.		
		
		
		
//		int min = arr[0];
//		
//		if(arr.length<=1) {
//			System.out.println("-1");
//			
//		}else {
//			
//			for(int i =0; i<arr.length; i++) {
//				if(arr[i]<min) {
//					min = arr[i];
//				}
//			}
//			
//			System.out.println(arr);
//		}
	}
}
