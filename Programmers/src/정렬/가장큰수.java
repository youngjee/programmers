package 정렬;

import java.util.Arrays;
import java.util.Comparator;

public class 가장큰수 {
	public static void main(String[] args) {
		가장큰수 sol = new 가장큰수();
		int numbers[] = {0, 0, 0, 0};
		System.out.println(sol.solution(numbers));
	}
	
	public String solution(int[] numbers) {
        String answer = "";
        String numStr[] = new String[numbers.length];
        for(int i=0; i<numbers.length; i++) {
        	numStr[i] = Integer.toString(numbers[i]);
        }
        
        Arrays.sort(numStr, new Comparator<String>() {
			@Override
			
			public int compare(String o1, String o2) {
				return -1*(Integer.parseInt(o1+o2)-Integer.parseInt(o2+o1));
			}
		});
        
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<numStr.length; i++) {
        	sb.append(numStr[i]);
        }
        answer = sb.toString();
        if(answer.charAt(0)=='0') answer = "0";
        return answer;
    }
}
