import java.util.*;

public class Solution {
    public int solution(int n) {
        int sum = 0;
        
        while (n > 0) {
            sum += n % 10; // n의 마지막 자릿수를 sum에 더하기
            n /= 10; // n의 마지막 자릿수 제거
        }
       
        return sum;
    }
}

// 다른 문제풀이 1 : 아스키 코드
import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        char[] arr = Integer.toString(n).toCharArray(); // 정수를 문자열로 변환 -> 문자 배열로 변환

        for(int i = 0; i < arr.length; i++){
            answer += arr[i] - 48; // 문자 아스키 값에서 '0'의 아스키 값 48을 빼서 정수로 변환 (ex) 49 - 48 = 1) 후 합산
        }

        return answer;
    }
}

// 다른 문제풀이 2 : String 변환
import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        String num = String.valueOf(n); // 정수를 문자열로 변환
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        for(int i = 0 ; i < num.length() ; i ++){
            answer += Integer.parseInt(String.valueOf(num.charAt(i))); // 각 자릿수를 정수로 변환하여 합산
        }

        return answer;
    }
}

// 다른 문제풀이 3 : String 배열 변환
import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] array = String.valueOf(n).split(""); // 정수를 문자열로 변환 후 각 자릿 수 분리
        for(String s : array){
            answer += Integer.parseInt(s); // 문자열을 다시 정수로 변환하여 합산
        }
        return answer;
    }
}
