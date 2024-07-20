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

// 다른 문제풀이 1 - toCharArray, valueOf
class Solution {
  public String solution(String phone_number) {
     char[] ch = phone_number.toCharArray(); // 문자열을 문자 배열로 변환
     for(int i = 0; i < ch.length - 4; i ++){
         ch[i] = '*'; // 전화번호의 처음 부분을 '*'로 대체
     }
     return String.valueOf(ch); // 문자 배열을 문자열로 변환하여 반환
  }
}

// 다른 문제풀이 2 - 정규식 전방긍정탐색
class Solution {
  public String solution(String phone_number) {
    return phone_number.replaceAll(".(?=.{4})", "*");
  }
}
