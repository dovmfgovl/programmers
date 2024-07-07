class Solution {
    public int[] solution(int[] numbers) {
            
        for (int i=0; i<numbers.length; i++) {
            numbers[i] *= 2;
        }
        
        return numbers;
    }
}


// stream을 사용한 문제풀이
// Mapping : 스트림 내 요소들을 하나씩 특정 값으로 변환하는 작업. 값을 변환하기 위한 람다를 인자로 받는다.
            // 스트림을 원하는 모양의 새로운 스트림으로 변환하고싶을 때 사용.
import java.util.Arrays;

class Solution2 {
    public int[] solution(int[] numbers) {
        return Arrays.stream(numbers).map(i -> i * 2).toArray();
    }
}
