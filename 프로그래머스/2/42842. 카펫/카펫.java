class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        // 카펫 사이즈의 경우의 수 구하기 (0x0)
        // brown 격자 수 + yellow 격자 수의 약수 구하기
        int sum = brown + yellow;
        
        // 단, 약수를 구할 때, 가운데 노란 격자가 위치하려면 가로, 세로 길이가 모두 3이상이여야 함.
        // yellow의 개수 = (가로 -2) * (세로 -2)
        for (int i = 3; i < sum; i++) {
            int width = sum / i;
            if (width >= i) { // 가로가 세로보다 길고
                if ((i - 2) * (width - 2) == yellow) { // yellow 개수를 만족하면
                    answer[0] = width;
                    answer[1] = i;
                    break;
                }
            }
            
        }
            
            
        return answer;
    }
}

// 다른 문제풀이 1
import java.util.*;
class Solution {
    public int[] solution(int brown, int red) {
        int a = (brown+4)/2;
        int b = red+2*a-4;
        int[] answer = {(int)(a+Math.sqrt(a*a-4*b))/2,(int)(a-Math.sqrt(a*a-4*b))/2};
        return answer;
    }
}
