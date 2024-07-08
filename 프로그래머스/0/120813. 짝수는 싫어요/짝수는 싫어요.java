import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        
        int[] answer;
        int odd = 0;
        
        // int 수에 따른 배열의 변화 : 짝수면 10/2, 홀수면 11/2 + 1
        if (n % 2 == 0) {
            answer = new int[n / 2];
        } else {
            answer = new int[n / 2 + 1];
        }
        
        // for문을 돌려 배열에 값 넣기
        for (int i=1; i <= answer.length; i++) {
            answer[odd++] = i * 2 - 1;
        }
        
        return answer;
    }
}

// 다른 풀이
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n) {
        return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
