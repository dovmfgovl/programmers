class Solution {
    public boolean solution(int x) {
        int num = 0;
        int ogX = x;
        
        while (x > 0) {
            num += x % 10;
            x /= 10;
        }
        
        return ogX % num == 0;
    }
}

// 다른 문제풀이 1
class Solution {
    public boolean solution(int x) {
        int sum = String.valueOf(x).chars().map(ch -> ch - '0').sum();
        return x % sum == 0;
    }
}
