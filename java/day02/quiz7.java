package test2;

import java.util.Arrays;

public class quiz7 {

	public static void main(String[] args) {
		//문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수,
		//solution을 완성하세요. 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
		
		
		
		
		String s ="5422";
		int a = 0;
		
		
		
		if (s.length() == 4 || s.length() == 6) {
			for (int i = 0; i < s.length(); i++) {
//			System.out.println(s.charAt(i));
				if (48 <= s.charAt(i) && 57 >= s.charAt(i)) {
//				System.out.println("true");
				} else {
//				System.out.println("false");
					a++;
				}
			}
	
		}else {
			a++;
		}
		
		
		if(a==0) {
			System.out.println("true");
			
		}else {
			System.out.println("flase");
		}
		
		
		
	}
}






