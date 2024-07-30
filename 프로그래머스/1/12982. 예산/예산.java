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

// 댜른 문제풀이 1 - 빼기 연산
import java.util.*;

class Solution {
  public int solution(int[] d, int budget) {
      int answer = 0;

        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            budget -= d[i];

            if (budget < 0) break;

            answer++;
        }

        return answer;
  }
}

// 다른 문제풀이 2 - while문
import java.util.Arrays;
class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int cnt = 0;
        while((budget -= d[cnt]) >= 0 && ++cnt < d.length);
        return cnt;
    }
}
