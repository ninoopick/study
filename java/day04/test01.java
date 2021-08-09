package test4;
// p 195 자바의 정석 생성자 시작

class Data_1 {
	int value;
}
class Data_2{
	int value;
	
	Data_2(int x){
		value =x;
	}
}

public class test01 {

	public static void main(String[] args) {
		Data_1 d1 = new Data_1();
		// Data_2 d2 = new Data_2();	// compile error발생
	}
}
