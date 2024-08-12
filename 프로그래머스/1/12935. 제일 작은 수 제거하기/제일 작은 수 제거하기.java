class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        
        // 가장 작은 수 찾기
        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        
        int index = 0;
        // 가장 작은 수 제외하고 복사
        for (int num : arr) {
            if (num != min) {
                answer[index++] = num;
            }
        }
        
        if (arr.length == 1) {
            return new int[]{-1};
        }
        
        return answer;
    }
}