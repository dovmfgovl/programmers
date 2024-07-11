class Solution {
    public int solution(int slice, int n) {
        // n%slice == 0 이면 n/slice
        // n%slice == 1 이면 n/slice + 1 
        return n % slice == 0 ? n / slice : n / slice + 1;
    }
}