import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        // 배열 숫자 오름차순 정렬
        Arrays.sort(array);
        
        // 중앙값 인덱스 계산
        int medianIndex = array.length / 2;
        
        // array 길이가 홀수이므로, 중앙값은 medianIndex 위치 값
        return array[medianIndex];
    }
}