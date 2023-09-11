package ch99leetcode;

import java.util.HashSet;
import java.util.Set;

public class Solution1684 {
    public int countConsistentStrings(String allowed, String[] words) {

        // 문자열 allowed의 문자를 Set에 저장
        Set<Character> allwedSet = new HashSet<>();

        for (char c : allowed.toCharArray()){
            // ↑ 문자열을 다룰 때 각 문자를 개별적으로 처리해야 하는 경우
            // char 타입을 사용하는 것이 일반적
            allwedSet.add(c);
        }




        int consistentCount =0; // 일관된 문자열의 개수를 추적

        for (String word : words){
                        // ↑ words 배열의(line 7) 각 문자열을 변수 word에 하나씩 가져옴
            boolean isConsistent = true;
            for (char c:word.toCharArray()){
                if (!allwedSet.contains(c)){
                    isConsistent=false;
                    break;
                }
            }
            if (isConsistent){
                consistentCount++;
            }
        }

        return consistentCount;
    }
}
