package test12;

import java.util.Arrays;

public class test03 {

	public static void main(String[] args) {
		//			  01234
		String str = "ABCDE";	// str.length() 는 5
		char ch = str.charAt(4);
		String str2 = str.substring(1, 4);
		String str3 = str.substring(1);
		System.out.println(str2);
		System.out.println(str3);	// BCD
		
		int [] arr = {0,1,2,3,4};	// 1차원 배열 arr
		int[][] arr2D = {{11,12},{21,22}};	// 2차원 배열
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr2D));
		
		
		String[][] str2D = { {"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = { {"aaa","bbb"},{"AAA","BBB"}};
		
		System.out.println(Arrays.deepEquals(str2D, str2D2));
		
		int [] arr2 =Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(arr2));
		
	}
}
