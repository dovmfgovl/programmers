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

// 다른 문제 풀이 1
class Solution {
  public String solution(String s) {

        String answer = "";
        int cnt = 0;
        String[] array = s.split("");

        for(String ss : array) {
            cnt = ss.contains(" ") ? 0 : cnt + 1;
            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase(); 
        }
      return answer;
  }
}

// 다른 문제 풀이 2
class Solution {
  public String solution(String s) {
        char[] chars = s.toCharArray();
        int idx = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ')
                idx = 0;
            else
                chars[i] = (idx++ % 2 == 0 ? Character.toUpperCase(chars[i]) : Character.toLowerCase(chars[i]));
        }

        return String.valueOf(chars);
  }
}
