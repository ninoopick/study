package test14;

// 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.
// 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

public class quiz03 {

    public static String solution(String s) {
        String answer = "";
        String [] arr = s.split("");
        
        if(arr.length%2 == 0) {
        	
        	answer+=arr[(arr.length/2-1)];
        	answer+=arr[(arr.length/2)];
        	
        }else {
        	answer = arr[(arr.length/2)];
        	
        }
        
        
        
        return answer;
    }
	
	
	public static void main(String[] args) {
		System.out.println(solution("qwer"));
	}
}
