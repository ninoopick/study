package test3;

public class object04 {

	public static void main(String[] args) {
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.hight = " + Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은" + c1.kind +", " + c1.number + "이며, 크기는(" + c1.width+"," + c1.height + ")");
		System.out.println("c2은" + c2.kind +", " + c2.number + "이며, 크기는(" + c2.width+"," + c2.height + ")");
		System.out.println("c1의 width 와 height를 각각 50, 80 으로 변경합니다.");
		c1.width = 50;
		c1.height = 80;
		
		System.out.println("c1은" + c1.kind +", " + c1.number + "이며, 크기는(" + c1.width+"," + c1.height + ")");
		System.out.println("c2은" + c2.kind +", " + c2.number + "이며, 크기는(" + c2.width+"," + c2.height + ")");
		// width, height를 같은 변수 사용해서 하나를 바꿔도 같이 바뀐다. 
	}
}
class Card{
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}
