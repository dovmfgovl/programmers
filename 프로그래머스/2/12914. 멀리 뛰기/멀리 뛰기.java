class Solution {
    public long solution(int n) {
        // 초기 조건
        if (n == 1) return 1;
        if (n == 2) return 2;
        
        long prev1 = 1; // f(n-2)
        long prev2 = 2; // f(n-1)        
        long answer = 0; // 현재 n에서의 방법 수
        
        for (int i=3; i<=n; i++) {
            answer = (prev1 + prev2) % 1234567; // 현재 값 계산 및 모듈러 연산
            prev1 = prev2; // 이전 값 업데이트
            prev2 = answer; // 이전 값 업데이트
        }
        
        return answer;
    }
}