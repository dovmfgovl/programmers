import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        // 중복되는 값을 제거하기 위해 HashSet 사용
        Set<Integer> resultSet = new HashSet<>();
        
        // 두 개의 수를 더해 resultSet에 추가
        for (int i=0; i<numbers.length; i++) {
            for (int j=i+1; j<numbers.length; j++) {
                resultSet.add(numbers[i] + numbers[j]);
            }
        }
        
        // Set을 배열로 변환 후 정렬
        int[] answer = new int[resultSet.size()];
        int index = 0;
        for (int num : resultSet) {
            answer[index++] = num;
        }
        Arrays.sort(answer);
            
        return answer;
    }
}