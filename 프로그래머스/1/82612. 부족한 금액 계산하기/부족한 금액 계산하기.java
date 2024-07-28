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

// 다른 문제풀이 1 - 등차수열의 합
class Solution {
    public long solution(int price, int money, int count) {      
        return Math.max((long)price * count * (count+1) / 2 - money, 0);
    }
}

// 다른 문제풀이 2 
class Solution {

    public long solution(int price, int money, int count) {

        long answer = money;

        for (int cnt = 0; cnt < count; ++cnt) {
            answer -= (price * (cnt + 1));
        }

        return (answer > 0 ? 0 : -answer);
    }
}
