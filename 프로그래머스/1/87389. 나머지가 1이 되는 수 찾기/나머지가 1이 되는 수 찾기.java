class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // for문으로 n의 크기만큼 i를 증가시키며 n을 x로 나눈 나머지가 1이 되도록 하기 - 충족했다면 break
        for (int i=1; i<=n; i++) {
            if (n % i == 1) {
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}