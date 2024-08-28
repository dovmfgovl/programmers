class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 10진수 -> 2진수로 변환 + 1비트 개수 반환하는 메서드 : Integer.bitCount()
        int bitCnt = Integer.bitCount(n);
        
        // n보다 큰 숫자부터 시작
        int nextNum = n + 1;
        
        while (true) {
            int bitCntNext = Integer.bitCount(nextNum);
            if (bitCnt == bitCntNext) {
                return nextNum;
            }
            
            nextNum++;
        }
    }
}