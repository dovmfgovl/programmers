class Solution {
    public int solution(int n) {
        
        int pizza = 0;
        
        for (int i=0; i<=n; i++) {
            if (i % 7 == 1) {
                pizza++;
            }
        }
        return pizza;
    }
}

// 다른 풀이 1
class Solution {
    public int solution(int n) {
        return (n + 6) / 7;
    }
}

// 다른 풀이 2
class Solution {
    public int solution(int n) {
        return n % 7 == 0 ? n/7 : n/7 + 1;
    }
}
