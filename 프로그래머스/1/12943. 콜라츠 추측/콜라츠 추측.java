class Solution {
    public int solution(int num) {
        int result = 0;
        long n = num;
        
        // 1인 경우 바로 0 반환
        if (num == 1) {
            return 0;
        }
        
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;  // 짝수라면 2로 나눔
            } else {
                n = n * 3 + 1;  // 홀수라면 3을 곱하고 1을 더함
            }
            result++;  // 작업 횟수 증가
            
            // 작업 횟수가 500번 초과하면 -1 반환
            if (result > 500) {
                return -1;
            }
        }
        
        return result;
    }
}