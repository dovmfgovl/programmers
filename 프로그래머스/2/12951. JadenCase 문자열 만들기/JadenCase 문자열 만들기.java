class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.toLowerCase().split("");
        boolean boo = true;
        
        for(String sr: str){
            answer += boo ? sr.toUpperCase() : sr;
            boo = sr.equals(" ") ? true : false;
        }          
        
        return answer;
    }
}
// 1.split으로 공백 없애고 문자 분리
// 2. 전체 소문자로 바꿈
// 3. 첫 글자는 대문자로 바꿈

// 1. sp라는 String 배열에 문자열 s의 모든 글자를 소문자로 만들고 split()을 사용해 sp에 담았다. 
// 2. flag를 하나 선언했다.
// 3. for문에서는 answer에 누적 저장을 하는데, flag가 true이면 ss문자열을 대문자로, 아니면 소문자인 상태로 대입한다. 그리고 flag에 ss가 공백이면 true를 대입, 아니면 false로 대입하게 했다.