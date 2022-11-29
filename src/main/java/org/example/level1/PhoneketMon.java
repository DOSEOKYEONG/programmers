package org.example.level1;
import java.util.*;

public class PhoneketMon {
    // https://school.programmers.co.kr/learn/courses/30/lessons/1845
    // 폰켓몬

    public int solution(int[] nums) {
        int answer = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (Integer num : nums) {
            if (!arrayList.contains(num)) {
                arrayList.add(num);
            }
        }
        if (arrayList.size() > nums.length / 2) {
            answer = nums.length / 2;
        } else {
            answer = arrayList.size();
        }

        return answer;
    }
}
