class Solution {
    public int solution(int[] array) {
        int answer = 0; // 최빈값
        int max = 0;
        int[] count = new int[1000+1]; // array 원소 범위가 0~1000이므로
        
        // 배열 값 중에 같은 값이 있는지 찾기
        for (int i=0; i<array.length; i++) {
            count[array[i]]++; // array배열 값에 해당하는 count 배열의 인덱스 값 증가
            if (max < count[array[i]]) { // 배열 값이 max보다 크면 그 값을 최빈값으로 설정
                max = count[array[i]];
                answer = array[i];
            }
        }
        
        int duplication = 0; // 최빈값이 2개 이상이면 -1 리턴
        for (int j=0; j<1001; j++) {
            if (max == count[j])
                duplication ++;
            if (duplication > 1)
                answer = -1;            
        }
        
        return answer;
    }
}

// 다른 풀이 1
import java.util.*;
class Solution {
    public int solution(int[] array) {
        int maxCount = 0;
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<>();

        // getOrDefault : 찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 기본 값을 반환하는 메서드
        // getPrDefault(Object key, V DefaultValue)
        // 매개변수 : 이 메서드는 두개의 매개변수를 허용
        // key : 값을 가져와야 하는 요소의 키
        // defaultValue : 지정된 키로 매핑된 값이 없는 경우 반환되어야 하는 기본값
        // 반환값 : 찾는 key가 존재하면 해당 key에 매핑되어 있는 값을 반환하고, 그렇지 않으면 디폴트 값이 반환

        for(int number : array) {
            int count = map.getOrDefault(number, 0) + 1;

            if(count > maxCount) {
                maxCount = count;
                answer = number;
            }

            else if(count == maxCount) {
                answer = -1;
            }

            map.put(number, count);
        }

        return answer;
    }
}

// 다른 풀이 2
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        List<Map.Entry<Integer, List<Integer>>> list = new ArrayList<>(Arrays.stream(array).boxed().collect(Collectors.groupingBy(o -> o)).entrySet()).stream().sorted((t0, t1) -> Integer.compare(t1.getValue().size(), t0.getValue().size())).collect(Collectors.toList());
        return list.size() > 1 && list.get(0).getValue().size() - list.get(1).getValue().size() == 0 ? -1 : list.get(0).getKey();
    }
}
