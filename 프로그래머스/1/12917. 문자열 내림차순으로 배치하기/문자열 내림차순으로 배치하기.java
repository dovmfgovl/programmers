import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        // 문자열을 문자 배열로 변환
        Character[] charArray = new Character[s.length()];
        
        for (int i=0; i<s.length(); i++) {
            charArray[i] = s.charAt(i);
        }
        
        // 문자 배열을 내림차순으로 정렬
        Arrays.sort(charArray, Collections.reverseOrder());
        
        // 문자 배열을 다시 문자열로 변환
        StringBuilder sb = new StringBuilder(charArray.length);
        for (char c : charArray) {
            sb.append(c);
        }
        
        return sb.toString();
    }
}

// 다른 문제풀이 1
import java.util.Arrays;

public class ReverseStr {
    public String reverseStr(String str){
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return new StringBuilder(new String(arr)).reverse().toString();
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        ReverseStr rs = new ReverseStr();
        System.out.println( rs.reverseStr("Zbcdefg") );
    }
}

// 다른 문제풀이 2
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Comparator;

public class ReverseStr {
    public String reverseStr(String str){
        return Stream.of(str.split(""))
    .sorted(Comparator.reverseOrder())
    .collect(Collectors.joining());
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        ReverseStr rs = new ReverseStr();
        System.out.println( rs.reverseStr("Zbcdefg") );
    }
}
