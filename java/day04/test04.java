package test4;


// 클래스 초기화 블럭은 처음 메모리에 로딩될 때 한번만 수행되지만, 인스턴스 초기화 블럭은 인스턴스가 생성될 때 마다 수행되었다.

class test04{
	 static {
		 System.out.println("static {  }");
	 }
	 {
		 System.out.println("{ }");
	 }
	 public test04() {
		System.out.println("생성자");
	 }


	public static void main(String[] args) {
		System.out.println("test04 bt = new test04(); ");
		test04 bt = new test04();
		
		System.out.println("test04 b2 = new test04(); ");
		test04 bt2 = new test04();
	}
}
