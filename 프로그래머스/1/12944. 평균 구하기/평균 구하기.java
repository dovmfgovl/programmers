class Solution {
    public double solution(int[] arr) {
        double answer = 0;        
        int i = 0;
        
        // 배열 내 정수 갯수만큼 for문 실행 
        for (i=0; i<arr.length; i++) {            
            answer += arr[i];
        }        
        
        return answer / i;
    }
}

// 다른 문제풀이 1 : forEach문
class Solution {
    public double solution(int[] arr) {
        double sum = 0;

        // 배열 내 모든 정수의 합을 구하는 for-each 문
        for (int num : arr) {
            sum += num;
        }
        
        // 평균 계산
        double answer = sum / arr.length;
        
        return answer;
    }
}

// 다른 문제풀이 2 : Stream API
import java.util.*;
import java.lang.*;

class Solution {
    public double solution(int[] arr) {

        return Arrays.stream(arr).average()./*getAsDouble()*/orElse(0.0);
    }
}
// Arrays.stream(arr) : int 배열 arr를 IntStream으로 변환
// .average() : 스트림 평균값 계산. 반환타입은 OptionalDouble(double값을 담는 컨데이너. 값이 있을수도 없을수도 있음).
// .getAsDouble() : OptionalDouble에서 실제 double값 추출. OptionalDouble이 비어있으면 NoSuchElementExceiption 발생시킴.
// .orElse(0.0) : average()는 값이 비어있는 경우 OptionalDouble.empty()를 반환함. 따라서 안전하게 값을 추출하려면 값이 비어있을 때 0.0을 반환하도록 orElse를 사용하는 것이 좋다.
