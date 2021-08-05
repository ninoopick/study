package test1;

import java.util.Scanner;

public class for_ex1 {

	public static void main(String[] args) {
	
		// 자신이 적은 구구단만 나오게 출력
		System.out.println("몇단을 나오게 하고싶은지 적어주세요 > ");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		for(int i = 1; i<=10; i++) {
			System.out.println(num + "*" + i + "=" + num*i);
		}

	}

}
