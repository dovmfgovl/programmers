class Solution {
    public int solution(int num1, int num2) {
        double answer = 0;
        answer = (double)num1 / num2;
        double multi = answer * 1000;
        return (int)multi;
    }
}

// 다른 문제 풀이
class Solution2 {
    public int solution(int num1, int num2) {
        int answer = 0;
        return num1 * 1000 / num2;
    }
}
