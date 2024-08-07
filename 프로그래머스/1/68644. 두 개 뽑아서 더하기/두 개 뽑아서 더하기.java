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

// 다른 문제풀이 1 - TreeSet을 사용하면 Arrays.sort로 오름차순 하지 않아도 됨
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> sumNumber = new TreeSet();

        for(int i = 0; i < numbers.length-1; i++){
            for(int j = i+1; j < numbers.length; j++){
                sumNumber.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = new int[sumNumber.size()];
        int index = 0;
        Iterator itor = sumNumber.iterator();
        while(itor.hasNext()){
            answer[index] = (int)itor.next();
            index++;
        }

        return answer;
    }
}
