class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        for (int i=0; i<n; i++) {
            answer[i] = (long)x * (i+1);
        }
        
        return answer;
    }
}

// 다른 문제풀이 1
import java.util.stream.LongStream;
class Solution {
  public long[] solution(int x, int n) {
      return LongStream.iterate(x, i->i+x).limit(n).toArray();
  }
}

// 다른 문제풀이 2
import java.util.*;
class Solution {
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;

        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + x;
        }

        return answer;

    }
}
