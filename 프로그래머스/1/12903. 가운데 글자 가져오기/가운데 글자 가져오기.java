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