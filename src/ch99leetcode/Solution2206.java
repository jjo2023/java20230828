package ch99leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution2206 {
    public boolean divideArray(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        // 정수형 key와 정수형 값(value)로 이루어진 map 변수 생성
        // 이 map은 각 정수가 몇 번 나타났는지 추적함
        for (int num : nums) {
            // ↑ nums 배열(line 7)의 각 요소를 반복해서 가져옴
            if (map.containsKey(num)) { // map이 해당 num값을 가지고 있는지 확인
                map.put(num, map.get(num) + 1); // 존재하면 해당 키의 값을 1 증가
            } else { // 아니면..( = 여기서는 해당키가 존재하지 않는다면)
                map.put(num, 1); //해당키를 새로 추가하고, 값을 1로 초기화
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                                               // ↑ map의 모든 엔트리(키&값)를 가져오는 메소드
                                               // entrySet에 커서 놓고 알트엔터
            int value = entry.getValue();
                        // ↑ 현재 엔트리의 값(value)을 가져옴

            if (value % 2 == 1) { // 출현횟수가 홀수라면
                return false; // flase를 반환
            }
        }

        return true;
    }
}
