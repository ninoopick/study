package test2;

import java.util.Scanner;

public class quiz4 {

	public static void main(String[] args) {
		//이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다. 별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("세로길이를 정해주세요 : ");
		int i = sc.nextInt();
		System.out.println("가로길이를 정해주세요 : ");
		int j = sc.nextInt();
		
		for(int x=0; x < i; x++) {
			for(int y = 0; y < j; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
