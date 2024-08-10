class Solution {
    public int solution(String s) {
        // 배열 인덱스에 따라 영단어를 숫자로 변환
        String[] words = {
            "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
        };
        
        // 배열을 순회하며 문자열 s에 포함된 영단어를 숫자로 변환
        for (int i=0; i<words.length; i++) {
            if (s.contains(words[i])) {
                s = s.replace(words[i], String.valueOf(i));
            }
        }
        
        // 변환된 문자열을 정수로 변환하여 반환        
        return Integer.parseInt(s);
    }
}