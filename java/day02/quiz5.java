package test2;

import java.util.Scanner;

public class quiz5 {

	public static void main(String[] args) {
		// 프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
		// 전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수
		// , solution을 완성해주세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("전화번호를 입력하세요:");
		String input = sc.nextLine();
		String sum = "";
//		01091662202
//		*******2202
		
		
		for(int i = 0; i<input.length()-4; i++	) {
			sum += "*";
			
		}
		System.out.println(sum);

		String t1 = input.substring(input.length()-4);		// 뒷4자리 뽑아내기
		System.out.println(sum+t1);
	
//		System.out.println(t1);				
		
		
	}
}
