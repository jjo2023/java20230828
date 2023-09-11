package ch99leetcode;

import java.util.HashSet;
import java.util.Set;

public class Solution771 {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> jewelSet = new HashSet<>();

        //  보석(jewels) 문자열을 Set에 추가
        for (char c : jewels.toCharArray()){
            jewelSet.add(c);
        }
        int count = 0;

        //돌(stones) 문자열을 순회하면서 보석인지 확인
        for (char stone : stones.toCharArray()){
            if (jewelSet.contains(stone)){
                count++;
            }
        }

        return count;
    }
}
