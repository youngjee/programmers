package 정렬;

import java.util.Arrays;

public class K번째수 {

	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] answer = K번째수.solution(array, commands);
		System.out.println(answer.toString());
	}
	
	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int n=0; n<commands.length; n++) {
         	int i= commands[n][0];
        	int j= commands[n][1];
        	int k= commands[n][2];
        	
        	int[] temp = new int[j-i+1];
        	temp = Arrays.copyOfRange(array, i-1, j);
        	
        	Arrays.sort(temp);
        	answer[n] = temp[k-1];
        }
        
        return answer;
    }
}
