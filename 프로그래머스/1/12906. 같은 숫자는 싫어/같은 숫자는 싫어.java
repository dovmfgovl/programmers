import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        // stream의 distinct로 중복 값 제거 -> 연속적으로 나타나는 숫자는 하나만 남기는 것....이거 쓰면 안됨
        //arr = Arrays.stream(arr).distinct().toArray();
        
        // Que(FIFO) 사용
        Queue<Integer> que = new LinkedList<>();
        
        // 첫 번째 요소를 먼저 추가해 ArrayIndexOutOfBoundsException 발생하지 않도록
        que.add(arr[0]);
        
        for (int i=1; i<arr.length; i++) {
            // 현재 요소와 이전 요소가 다를 때만 추가
            if (arr[i] != arr[i-1]) {
                que.add(arr[i]);
            }            
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        //while (!que.isEmpty()) {
        //    System.out.println(que.poll());    
        //} 
        
        //Queue를 배열로 변환
        int[] answer = new int[que.size()];
        int index = 0;
        for (int num : que) {
            answer[index++] = num;
        }

        return answer;
    }
}

// 다른 문제풀이 1 - Stack
import java.util.*;

public class Solution {
    public Stack<Integer> solution(int []arr) {

        Stack<Integer> stack = new Stack<>();

        for(int num : arr){
            if(stack.size() == 0 || stack.peek() != num){
                stack.push(num);
            }
        }

        return stack;
    }
}
