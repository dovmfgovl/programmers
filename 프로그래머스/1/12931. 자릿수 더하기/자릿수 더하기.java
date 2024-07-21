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

        char[] arr = Integer.toString(n).toCharArray();

        for(int i = 0; i < arr.length; i++){
            answer += arr[i] - 48;
        }

        return answer;
    }
}

// 다른 문제풀이 2 : String 변환
import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        String num = String.valueOf(n);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        for(int i = 0 ; i < num.length() ; i ++){
            answer += Integer.parseInt(String.valueOf(num.charAt(i)));
        }

        return answer;
    }
}

// 다른 문제풀이 3 : String 배열 변환
import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] array = String.valueOf(n).split("");
        for(String s : array){
            answer += Integer.parseInt(s);
        }
        return answer;
    }
}
