class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        int i = 0;
        
        // 배열 a와 배열b의 같은 인덱스 끼리 곱하기 -> 각 자릿 수 더하기
        while (a.length!=i) {
            answer += a[i] * b[i];
            i++;
        }
        
        return answer;
    }
}