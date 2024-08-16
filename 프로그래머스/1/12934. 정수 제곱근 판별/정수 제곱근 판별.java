class Solution {
    public long solution(long n) {
        long x = (long) Math.sqrt(n); // n의 제곱근 계산
        
        // 제곱근을 제곱한 값이 n과 동일한지 확인
        return n == x*x ? (x+1)*(x+1) : -1;
    }
}