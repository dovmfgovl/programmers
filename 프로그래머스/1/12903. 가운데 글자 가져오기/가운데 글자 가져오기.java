import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        // s 길이
        int length = s.length();
        
        if (length % 2 == 1) {
            // 홀수
            answer = s.substring(length/2, length/2+1);
        } else {
            // 짝수
            answer = s.substring(length/2-1, length/2+1);
        }
        
        return answer;
    }
}

// 다른 문제풀이 - 3항 연산자
import java.util.Arrays;

class Solution {
    public String solution(String s) {
        // s 길이
        int length = s.length();
        
        return length % 2 == 0 ? s.substring(length/2-1, length/2+1) : s.substring(length/2, length/2+1);
    }
}
