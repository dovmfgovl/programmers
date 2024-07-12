class Solution {
    public double solution(int[] numbers) {
        double len = numbers.length;
        double result = 0;
        
        // numbers 배열 안의 수 모두 더한 뒤
        for (int i=0; i<numbers.length; i++) {
            result += numbers[i];
        }
        
        // 갯수로 나누기        
        return result / len;
    }
}