package test1;

public class random_4_8 {

	public static void main(String[] args) {
		// Math.random()을 이용해서 1~6사이의 임의의 정수를 변수 value 에 저장하는 코드를 완성하여라
		int value = (int) (Math.random()*6) + 1;
		
		
		System.out.println("value:" + value);
	}
}
