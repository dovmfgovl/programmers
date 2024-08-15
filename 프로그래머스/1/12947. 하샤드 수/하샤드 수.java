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