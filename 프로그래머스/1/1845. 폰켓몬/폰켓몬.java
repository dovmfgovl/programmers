import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        // 배열에서 중복된 폰켓몬 제거하여 전체 폰켓몬 종류, 개수 파악
        // 전체 폰켓몬 종류 수와 N/2 중 작은 값이 최대 종류 수가 됨
        
        // HashSet으로 중복된 포켓몬 제거 -> 종류 수 파악
        HashSet<Integer> set = new HashSet<>();
        
        // 모든 포켓몬 번호를 HashSet에 추가
        for (int num: nums) {
            set.add(num);
        }
        
        // 최대 선택할 수 있는 포켓몬 종류 수 : N/2 or set.size() 중 더 작은 값
        int kind = Math.min(set.size(), nums.length / 2);
        
        return kind;
    }
}