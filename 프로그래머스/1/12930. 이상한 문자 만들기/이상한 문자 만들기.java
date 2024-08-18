class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] words = s.split(" ", -1); // 공백 기준 단어 분리 및 공백 유지
        
        for (int j=0; j<words.length; j++) {
            String word = words[j];
            for (int i=0; i<word.length(); i++) {
                if (i % 2 == 0) {
                    answer.append(Character.toUpperCase(word.charAt(i)));
                } else {
                    answer.append(Character.toLowerCase(word.charAt(i)));
                }
            }
            if (j < words.length - 1) {
                answer.append(" "); // 각 단어 사이에 공백 추가
            }
        }
        
        return answer.toString();
    }
}