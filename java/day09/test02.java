package test09;

import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
		// 10 으로 나머지가 연산을 하려면 마지막 자리를 얻는다.
		// System.out.println(12345%10);
		
//		int num = 12345, sum = 0;
//		// num = 12345, 1234, 123, 12, 1
//		for(num = 12345; num > 0; num = num/ 10) {
//			System.out.println(num%10);
//			sum += num % 10;
//		}
//		
//		System.out.println("각 자리수의 합 : " + sum);
		
		int input = 0, answer = 0;
		
		answer = (int)(Math.random() * 100) + 1;	// 1~100 사이의 자연수
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		
		do {
			System.out.println("1과 100 사이의 정수를 입력하세요. > ");
			input = sc.nextInt();
			
			if(input > answer) {
				System.out.println("더 작은 수로 다시 시도하세요.");
			}else if(input < answer) {
				System.out.println("더 큰 수로 다시 시도하세요");
			}
		}while(input != answer); 
		
	}
}
