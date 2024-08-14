import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        
        // divisor로 나누어지는 값을 list에 저장
        for (int num : arr) {
            if (num % divisor == 0) {
                list.add(num);
            }
        }
        
        // list가 비어있는 경우 -1 반환
        if (list.isEmpty()) {
            return new int[]{-1};
        }
        
        // list를 배열로 변환 후 정렬
        int[] answer = list.stream().mapToInt(i -> i).toArray();        
        Arrays.sort(answer);
        
        return answer;
    }
}