package test4;

class test08 {
	public static void main(String[] args) {
		Child2 c = new Child2();
		c.method();
	}
}
class Parent2 { int x = 10; /* super.x와 this.x둘다 가능*/}

class Child2 extends Parent2{
	void method() {
		System.out.println("x="+x);
		System.out.println("this.x="+ this.x);
		System.out.println("super.x="+ super.x);
	}
}
