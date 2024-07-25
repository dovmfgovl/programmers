class Solution {
    public String solution(int n) {
        String answer = "";
        String su = "수";
        String bak = "박";
        
        for (int i=0; i<n; i++) {
            if (i % 2 == 0) {
                answer += su;
            } 
            else if (i % 2 == 1) {
                answer += bak;
            }
        }
        
        return answer;
    }
}

// 다른 문제풀이 1
public class WaterMelon {
    public String watermelon(int n){
        // 새로운 문자열을 생성하여 "수박수박수박..." 패턴을 만든 후, 처음 n 문자까지 자른다
        return new String(new char [n/2+1]).replace("\0", "수박").substring(0,n);
    }

    // 실행을 위한 테스트코드입니다.
    public static void  main(String[] args){
        WaterMelon wm = new WaterMelon();
        System.out.println("n이 3인 경우: " + wm.watermelon(3));
        System.out.println("n이 4인 경우: " + wm.watermelon(4));
    }
}

// 다른 문제풀이 2 - 삼항연산자
public class WaterMelon {
    public String watermelon(int n){
    String result = "";

 for(int i=0;i<n;i++) {
   result +=(i%2==0)? "수":"박";
 }

        return result;
    }

    // 실행을 위한 테스트코드입니다.
    public static void  main(String[] args){
        WaterMelon wm = new WaterMelon();
        System.out.println("n이 3인 경우: " + wm.watermelon(3));
        System.out.println("n이 4인 경우: " + wm.watermelon(4));
    }
}

// 다른 문제풀이 3 - StringBuffer
class Solution {
  public String solution(int n) {
       StringBuilder answer = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            answer.append(i%2==0?"박":"수");
        }
        return answer.toString();
  }
}

// 다른 문제풀이 4 - while문
public class WaterMelon {
    public String watermelon(int n){
    boolean flag = true;
    String result = "";
        while(n-- > 0){

      result += flag ? "수":"박";
      flag = !flag;
    }
        return result;
    }

    // 실행을 위한 테스트코드입니다.
    public static void  main(String[] args){
        WaterMelon wm = new WaterMelon();
        System.out.println("n이 3인 경우: " + wm.watermelon(3));
        System.out.println("n이 4인 경우: " + wm.watermelon(4));
    }
}
