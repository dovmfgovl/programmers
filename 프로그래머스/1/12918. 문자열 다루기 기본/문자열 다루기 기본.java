class Solution {
    public boolean solution(String s) {
        // 길이가 4인지 6인지 확인
        if (s.length() == 4 || s.length() == 6) {
            // 문자열이 숫자로만 이루어져 있는지 확인
            for (int i=0; i<s.length(); i++) {
                // 숫자가 아닌 문자가 하나라도 있으면 false 반환
                if (!Character.isDigit(s.charAt(i))) {
                    return false;
                }
            }
            // 모든 조건 만족 시 true 반환
            return true;
        }
        // 길이가 4 또는 6이 아니면 false 반환
        return false;
    }
}

// 다른 문제풀이 1 - 정규식
import java.util.*;

class Solution {
  public boolean solution(String s) {
        if (s.length() == 4 || s.length() == 6) return s.matches("(^[0-9]*$)");
        return false;
  }
}

// 다른 문제풀이 2 - 삼항연산자
class Solution {
  public boolean solution(String s) {
    return (s.length() != 4 && s.length() != 6) || (s.split("[0-9]").length > 0) ? false:true;
  }
}
