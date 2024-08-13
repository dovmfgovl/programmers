class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int currentBottles = n; // 현재 가진 빈 병 수
        
        // 현재 빈 병 수가 a보다 클 때까지
        while (currentBottles >= a) {
            // 현재 가진 빈 병으로 받을 수 있는 콜라 수
            int newCokes = (currentBottles / a) * b;
            // 총 받은 콜라의 병 수 업데이트
            answer += newCokes;
            // 교환 후 남은 빈 병 수 업데이트
            currentBottles = (currentBottles % a) + newCokes;
        }
        
        return answer;
    }
}