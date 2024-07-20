class Solution {
    public String solution(String phone_number) {
        
        int length = phone_number.length();
        char[] answer = new char[length];
        
        for (int i=0; i<length; i++) {
            // 마지막 4자리는 제외하고 *로 변환
            if (i < length - 4) {
                answer[i] = '*';
            } else {
                answer[i] = phone_number.charAt(i);
            }
        }
        
        return new String(answer);
    }
}