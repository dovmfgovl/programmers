class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
       
        for(int i = 0; i < arr.length; i++){
            int number = Integer.parseInt(arr[i]);
            
            min = Math.min(min, number);
            max = Math.max(max, number);
        }
        answer = min+" "+max;
        return answer;
    }
}