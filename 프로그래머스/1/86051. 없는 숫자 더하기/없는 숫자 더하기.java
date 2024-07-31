class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        // 0~9까지 있는 배열 선언
        int[] numArr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        for (int num : numArr) {
            boolean found = false; // 현재 숫자가 numbers 배열에 있는지 확인하는 플래그
            for (int number : numbers) {
                if (num == number) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                answer += num;
            }
        }
        
        return answer;
    }
}