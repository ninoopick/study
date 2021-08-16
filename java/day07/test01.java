package test7;

// 자바 복습 
// 산술 > 비교 > 논리 > 대입 대입이 젤 마지막
// 단항 > 이항 > 삼항  단항연산자의 우선순의가 이항 연산자보다 높다
// 모든 연산은 왼쪽에서 오른쪽이지만 단항,대입만 오른쪽에서 왼쪽이다.
// 단항 연산자와 대입 연산자를 제외한 모든 연산의 진행방향은 왼쪽에서 오른쪽이다.

public class test01 {

	public static void main(String[] args) {
		int i = 5, j = 0;
		
		j=i; // 후위형
		i++;
		System.out.println("j=i++; 실행후, i =" + i + " ,j ="+j);
		
		i=5;
		j=0;
		
		++i;
		j = i; // 전위형
		System.out.println("j=++i;실행 후, i=" + i + ",j=" + j);
		
		int x = 1_000_000;	// 1,000,000 1백만 = 10의 6제곱
		int y = 2_000_000;  // 2,000,000 2백만 = 10의 6제곱
		
		// 10의 12제고브 int의 범위는 10의 9제곱
		long c = (long)x*(long)y;		// a*b = 2,000,000,000,000 ?
		
		System.out.println(c);
		
		
	}
}
