class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long fee = 0;
        
        // for문 실행 -> fee += (price * count 하나씩)
        for (int i=1; i<=count; i++) {
            fee += price * i;
        }
        
        if (money < fee) {
            answer = fee - money;
        } else {
            answer = 0;
        }
        
        return answer;
    }
}