package test12;

public class test02 {

	public static void main(String[] args) {
		int[][] score = {{100,100,100},{20,20,20},{10,10,10},{30,30,30}};
		
		int sum = 0;
		
		for(int i = 0; i<score.length; i++) {
			for(int j = 0; j<score[i].length; j++) {
				System.out.printf("score[%d][%d] = %d%n", i, j ,score[i][j]);
				sum += score[i][j];
			}
		}
		System.out.println("sum = " + sum);
	}
}
