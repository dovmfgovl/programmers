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