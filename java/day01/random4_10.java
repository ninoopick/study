package test1;

import java.util.Scanner;

public class random4_10 {

	public static void main(String[] args) {
		// 1~100사이의 랜덤 숫자 생성후 막추는 것
		Scanner sc = new Scanner(System.in);
		int answer = 0;
		int input = 0;
		int count = 0;
		
		answer = (int) (Math.random()*100)+1;
		
		do {
			count++;
			System.out.println("1~100사이의 숫자를 입력하세요");
			input = sc.nextInt();
			if(input > answer) {
				System.out.println("작은수로 입력하세요");
			}else if(input <answer) {
				System.out.println("큰수를 입력하세요");
			}else {
				System.out.println("정답입니다.총 "+count+"번 만에 맞추셨네요");
				break;
			}
		}while(true);
			
	}
}
