package test1;

import java.util.Scanner;

public class random_ex1 {

	public static void main(String[] args) {
		
		// 100 up down 문제 
		
		int num =0;
		int man = 0;
		num = (int) (Math.random() * 100) +1;
		System.out.println(num);
		Scanner sc = new Scanner(System.in);
	
		while(true){
			System.out.println("번호를 입력해 주세요 > ");
			man = sc.nextInt();
			if(num == man) {
				System.out.println("정답입니다. 번호는 "+num+"번이네요");
				break;
				
			}else if(man >num) {
				System.out.println("틀린번호입니다. 적으신 번호보다 적습니다. > ");
			}else {
				System.out.println("틀린번호입니다. 적으신 번호보다 큽니다. > ");
			}
		}
	}

}
