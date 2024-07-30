import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int length = d.length;
        int answer = 0;
        int sum = 0;
        
        // 오름차순 정렬 - 최대한 많은 부서에 물품을 지원해야하니까
        Arrays.sort(d);
        
        for (int i=0; i<length; i++) {
            if (sum + d[i] <= budget) {
                sum += d[i];
                answer++;
            }
        }
        
        return answer;
    }
}