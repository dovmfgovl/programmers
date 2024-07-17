class Solution {
    public int[] solution(long n) {
        String s = String.valueOf(n); // 숫자를 문자열로 변환
        int[] answer = new int[s.length()]; // 문자열로 변환한 값을 배열로 선언        
        
        int index = 0;
        while(n!=0) {
            answer[index++] = (int)(n%10); // 각 자리의 숫자를 배열에 저장
            n /= 10;
        }
        return answer;
    }
}

// 다른 문제풀이 1
import java.util.stream.IntStream;

class Solution {
    public int[] solution(long n) {
        return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
    }
}

// 다른 문제풀이 2
class Solution {
  public int[] solution(long n) {
      String a = "" + n;
        int[] answer = new int[a.length()];
        int cnt=0;

        while(n>0) {
            answer[cnt]=(int)(n%10);
            n/=10;
            System.out.println(n);
            cnt++;
        }
      return answer;
  }
}
