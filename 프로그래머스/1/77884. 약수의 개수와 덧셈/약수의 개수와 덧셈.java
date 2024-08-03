class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for (int i=left; i <= right; i++) {
            int count = 0;
            
            for (int j=1; j <= i; j++) {
                // 약수라면 count에 +1
                if ( i % j == 0) {
                    count++;
                    System.out.println(count);
                }
            } 
            
            // count가 짝수이면 answer에 +, 홀수이면 answer에 -
            if (count % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }          
        
        return answer;
    }
}

// 다른 문제풀이 1 - 제곱수
class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        // left부터 right까지 모든 숫자에 대해 반복
        for (int i = left; i <= right; i++) {
            // i가 제곱수인지 확인
            // Math.sqrt(i)는 i의 제곱근을 구함
            // i가 제곱수라면, 제곱근을 정수로 나눴을 때 나머지가 0이 됨
            if (i % Math.sqrt(i) == 0) {
                // i가 제곱수인 경우, 약수의 개수가 홀수이므로 i를 빼줌
                answer -= i;
            } else {
                // i가 제곱수가 아닌 경우, 약수의 개수가 짝수이므로 i를 더해줌
                answer += i;
            }
        }

        return answer;
    }
}
