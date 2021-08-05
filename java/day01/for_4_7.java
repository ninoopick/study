package test1;

public class for_4_7 {

	public static void main(String[] args) {
		// 문자열 12345 의 각 숫자 합을 구하라 sum = 15
		String str = "12345";
		int sum = 0;
		
		for(int i = 0; i < str.length(); i++) {
			sum += str.charAt(i) -'0'; 
			
		}
		System.out.println("sum = " + sum);
	}

}
