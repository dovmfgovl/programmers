import java.util.Arrays;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        
        // A,B 오름차순
        Arrays.sort(A);
        Arrays.sort(B);
        
        // A는 순서대로 B는 역순으로 접근하여 곱셉 후 누적
        for (int i=0; i<A.length; i++) {
            answer += A[i] * B[B.length - 1 - i];
        }

        return answer;
    }
}

// 다른 문제풀이 1 - while문 사용
import java.util.Arrays;

class Solution
{
    public int solution(int[] A, int[] B)
    {
        int answer = 0;
        int n = A.length;

        Arrays.sort(A);
        Arrays.sort(B);

        while(n > 0){
            answer += (A[A.length - n] * B[n - 1]);
            n--;
        }

        return answer;
    }
}
