class Solution {
    public double solution(int[] arr) {
        double answer = 0;        
        int i = 0;
        
        // 배열 내 정수 갯수만큼 for문 실행 
        for (i=0; i<arr.length; i++) {            
            answer += arr[i];
        }        
        
        return answer / i;
    }
}