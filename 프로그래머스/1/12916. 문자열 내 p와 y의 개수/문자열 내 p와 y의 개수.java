class Solution {
    boolean solution(String s) {
        
        // 대문자와 소문자를 구별하지 않기 위해 모두 소문자로 변경
        s = s.toLowerCase();

        // 'p'와 'y'의 개수를 저장할 변수 초기화
        int countP = 0;
        int countY = 0;

        // 문자열 s를 순회하면서 'p'와 'y'의 개수 세기
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'p') {
                countP++;
            } else if (ch == 'y') {
                countY++;
            }
        }

        // 'p'와 'y'의 개수가 같으면 true, 다르면 false 반환
        return countP == countY;
    }
}