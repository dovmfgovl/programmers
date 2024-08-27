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

// 다른 문제풀이 1
import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {

            HashSet<Integer> hs = new HashSet<>();

            for(int i =0; i<nums.length;i++) {
                hs.add(nums[i]);
            }

            if(hs.size()>nums.length/2)
                return nums.length/2;

            return hs.size();
    }
}

// 다른 문제풀이 2
import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.collectingAndThen(Collectors.toSet(),
                        phonekemons -> Integer.min(phonekemons.size(), nums.length / 2)));
    }
}
