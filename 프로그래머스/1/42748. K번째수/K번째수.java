import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        // answer 배열에 command 배열 길이만큼 초기화
        int[] answer = new int[commands.length];
        
        for (int i=0; i<commands.length; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int k = commands[i][2];
            
            // 배열 자르기 (배열 인덱스는 0부터 시작하므로 1을 빼줌 )
            int[] subArray = Arrays.copyOfRange(array, start-1, end);
            
            // 자른 배열 정렬
            Arrays.sort(subArray);
            
            // 배열의 k번째 숫자를 answer에 저장
            answer[i] = subArray[k-1];
        }
        
        return answer;
    }
}