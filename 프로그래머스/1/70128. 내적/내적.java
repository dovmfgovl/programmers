class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        int i = 0;
        
        // 배열 a와 배열b의 같은 인덱스 끼리 곱하기 -> 각 자릿 수 더하기
        while (a.length!=i) {
            answer += a[i] * b[i];
            i++;
        }
        
        return answer;
    }
}

// 다른 문제풀이 1 - stream
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] a, int[] b) {
        return IntStream.range(0, a.length).map(index -> a[index] * b[index]).sum();
    }
}

// 다른 문제풀이 2 - for
class Solution {
    public int solution(int[] a, int[] b) {
         int sum = 0;
        for(int i=0;i<a.length;i++){
            sum+= a[i]*b[i];
        }
        return sum;
    }
}
