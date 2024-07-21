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