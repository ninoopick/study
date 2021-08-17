package test09;

import java.util.Arrays;

public class test06 {

	public static void main(String[] args) {
		int [] iArr = {100, 95,80,70,60};	// 길이가 5인 int 배열
		for(int i = 0; i<iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		// for(inti i = 0; i<iArr1.length; i++){
		// 		System.out.print(iArr1[i]+",");
		//}					// 이게 밑에 Arrays.toString(iArr));이다
		
		System.out.println(Arrays.toString(iArr));
	}
}
