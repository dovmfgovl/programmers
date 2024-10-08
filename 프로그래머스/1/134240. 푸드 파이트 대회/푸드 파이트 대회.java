class Solution {
    public String solution(int[] food) {
        StringBuilder left = new StringBuilder();
        String zero = "0";

        // 음식의 절반을 나눠 왼쪽에 위치
        for (int i=1; i<food.length; i++) {
            int count = food[i] / 2;
            for (int j=0; j<count; j++) {
                left.append(i);
            }
        }
        
        // 왼쪽 배열 뒤집어 오른쪽 배열 생성
        String right = left.reverse().toString();
        
        
        // 중앙에 물을 배치하고 왼쪽과 오른쪽 배열 결합
        String answer = left.reverse().toString() + zero + right;
        
        return answer;
    }
}

// 다른 문제풀이 1
class Solution {
    public String solution(int[] food) {
        String answer = "0";

        for (int i = food.length - 1; i > 0; i--) {
            for (int j = 0; j < food[i] / 2; j++) {
                answer = i + answer + i; 
            }
        }

        return answer;
    }
}

// 다른 문제풀이 2
class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            sb.append(Integer.toString(i).repeat(food[i] / 2));
        }
        return sb.toString() + "0" + sb.reverse().toString();
    }

}
