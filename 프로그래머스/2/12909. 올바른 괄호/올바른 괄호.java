import java.util.Stack;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        // 문자열 s를 왼쪽부터 차례대로 탐색하며, ( 가 나오면 스택에 추가
        // ) 가 나오면 스택에서 가장 최근에 추가된 ( 는 제거
        // 위 과정에서 스택이 비어있는데 ) 괄호가 나오면 false 반환
        // 모든 문자 처리 후에도 스택이 비어 있지 않다면 ( 가 닫히지 않은 것이므로 false 반환
        // 모든 문자 처리 후 스택 비어 있다면_모든 괄호 올바르게 짝지어진 것이므로 true 반환
        
        // 문자열 하나씩 처리
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            
            // '(' 라면 스택에 추가
            if (c == '(') {
                stack.push(c);
            }
            
            // ')' 라면
            else {
                // 스택 비어 있으면 false
                if (stack.isEmpty()) {
                    return false;
                }
                // 스택에서 ( 하나 제거
                stack.pop();                
            }
        }
    
        // 모든 처리 끝난 후 스택 비어있으면 true, 비어있지 않으면 false
        return stack.isEmpty();
    }
}

// 다른 문제풀이 1
class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int count = 0;
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i) == '('){
                count++;
            }
            if(s.charAt(i) == ')'){
                count--;
            }
            if(count < 0){
                break;
            }
        }
        if(count == 0){
            answer = true;
        }

        return answer;
    }
}
