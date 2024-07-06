class Solution {
    public int solution(int num1, int num2) {
        double answer = 0;
        answer = (double)num1 / num2;
        double multi = answer * 1000;
        return (int)multi;
    }
}