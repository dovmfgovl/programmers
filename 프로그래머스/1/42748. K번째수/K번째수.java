import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        // answer 배열에 command 배열 길이만큼 초기화
        int[] answer = new int[commands.length];
        
        for (int i=0; i<commands.length; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int k = commands[i][2];
            
            // 배열 자르기 (배열 인덱스는 0부터 시작하므로 1을 빼줌 )
            int[] subArray = Arrays.copyOfRange(array, start-1, end);
            
            // 자른 배열 정렬
            Arrays.sort(subArray);
            
            // 배열의 k번째 숫자를 answer에 저장
            answer[i] = subArray[k-1];
        }
        
        return answer;
    }
}

// 다른 문제풀이 1 - 퀵정렬
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int n = 0;
        int[] ret = new int[commands.length];

        while(n < commands.length){
            int m = commands[n][1] - commands[n][0] + 1;

            if(m == 1){
                ret[n] = array[commands[n++][0]-1];
                continue;
            }

            int[] a = new int[m];
            int j = 0;
            for(int i = commands[n][0]-1; i < commands[n][1]; i++)
                a[j++] = array[i];

            sort(a, 0, m-1);

            ret[n] = a[commands[n++][2]-1];
        }

        return ret;
    }

    void sort(int[] a, int left, int right){
        int pl = left;
        int pr = right;
        int x = a[(pl+pr)/2];

        do{
            while(a[pl] < x) pl++;
            while(a[pr] > x) pr--;
            if(pl <= pr){
                int temp = a[pl];
                a[pl] = a[pr];
                a[pr] = temp;
                pl++;
                pr--;
            }
        }while(pl <= pr);

        if(left < pr) sort(a, left, pr);
        if(right > pl) sort(a, pl, right);
    }
}
