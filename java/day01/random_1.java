package test1;

public class random_1 {

	public static void main(String[] args) {
		
//		System.out.println("업다운! 숫자를 입력해주세요 > ");
		int num = 0;
		
		for(int i =1; i <=5; i++) {
			num = (int)(Math.random() * 6) + 1;
			System.out.println(num);
		}

	}

}
