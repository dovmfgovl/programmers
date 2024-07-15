class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        // a가 b보다 클 경우 둘을 바꾸기
        if (a>b) {
            int max = a;
            a = b;
            b = max;
        }
        
        for (int i=a; i<=b; i++) {
            answer += i;
            if (a==b) {
                return a;
            }
        }
        return answer;
    }
}

// 다른 풀이 : 등차수열의 합 사용
class Solution {

    public long solution(int a, int b) {
        return sumAtoB(Math.min(a, b), Math.max(b, a));
    }

    private long sumAtoB(long a, long b) {
        return (b - a + 1) * (a + b) / 2;
    }
}
