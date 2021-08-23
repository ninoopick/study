package test12;

import java.util.Arrays;

// 오전 노마드코더 자바스크립 공부
// 자바의 정석 배열 부분 복습 ( 유튜브 강의 보기 자바의 정석)

public class test01 {

	public static void main(String[] args) {
		// index : 0~2
		String[] strArr = {"가위", "바위", "보"};
		System.out.println(Arrays.toString(strArr));
		
		for(int i = 0; i<10; i++) {
			int tmp = (int)(Math.random()*3);  
			System.out.println(strArr[tmp]);	// 0~2
		}
	}
	
	
	
}
