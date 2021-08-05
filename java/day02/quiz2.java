package test2;

public class quiz2 {

	public static void main(String[] args) {
		// 2차원배열 arr 에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하세요
		
		int[][] arr = {
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
		};
		int total = 0;
		float average = 0;
		int cnt = 0;
		
		for(int i = 0; i<arr.length;i++) {
			for(int j =0; j<arr[i].length;j++) {
				total += arr[i][j];
				cnt++;								// 반복할 때 마다 하나씩 늘어나니 그걸 나눠주면 된다.
			}
		}
		average = (float)total/cnt;
		
		System.out.println("합계 : " + total);
		System.out.println("평균 : " + average);
	}
}
