import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        // 해시맵 생성하여 참가자의 이름과 수를 저장
        HashMap<String, Integer> map = new HashMap<>();
        
        // 참가자 목록을 해시맵에 넣기
        for (String player : participant) {
            // 참가자 이름은 키로 사용. 이미 있으면 값 증가
            map.put(player, map.getOrDefault(player, 0) + 1);
        }
        
        // 완주한 선수 목록을 순회하며 해시맵에서 해당 이름의 값을 감소시킴
        for (String player : completion) {
            map.put(player, map.get(player) - 1);
        }
        
        // 해시맵을 순회하며 값이 0이 아닌 이름 찾기. 0이 아닌 이름이 완주하지 못한 선수
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() != 0) {
                return entry.getKey();
            }
        }
        
        // 예외 : 모든 선수가 완주한 경우는 없다.
        return "";
    }
}