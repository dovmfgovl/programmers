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