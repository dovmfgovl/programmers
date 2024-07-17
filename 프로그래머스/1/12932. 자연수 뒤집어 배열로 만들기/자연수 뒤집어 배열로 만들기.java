class Solution {
    public int[] solution(long n) {
        String s = String.valueOf(n); // 숫자를 문자열로 변환
        int[] answer = new int[s.length()]; // 문자열로 변환한 값을 배열로 선언        
        
        int index = 0;
        while(n!=0) {
            answer[index++] = (int)(n%10); // 각 자리의 숫자를 배열에 저장
            n /= 10;
        }
        return answer;
    }
}