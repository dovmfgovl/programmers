import java.util.Arrays;

class Solution {
    public long solution(long n) {
        // 정수를 문자열로 변환 -> 문자열 배열로 분리
        String[] arr = String.valueOf(n).split("");
        
        // Arrays.sort()를 사용해 문자열 배열을 내림차순 정렬
        Arrays.sort(arr, (a, b) -> b.compareTo(a)); // 정렬 기준을 정의하는 람다, compareTo는 문자열의 사전적 순서를 비교
        
        // StringBuilder로 배열을 문자열로 변환
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s);
        }    
        
        // 문자열을 long 타입으로 변환
        long answer = Long.valueOf(sb.toString());
        
        return answer;
    }
}