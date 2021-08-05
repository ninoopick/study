package test2;

import java.util.Arrays;

public class arr01 {

	public static void main(String[] args) {

		int [] arr1 = new int[10];
		int [] arr2 = new int[10];
		int [] arr3 = {100,95,80,70,60};
		char[] chArr = {'a','b','c','d'};
		
		
		
		for(int i = 0; i<arr1.length; i++) {
			arr1[i] = i+1;
		}
		
		for(int  i = 0; i<arr2.length; i++) {
			arr2[i] = (int)(Math.random() * 10)+1;
		}
		
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(arr3);// 이렇게 쓰면 오류남
		System.out.println(chArr);
		
	
	}
}
