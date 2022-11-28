package org.example.level0;
import java.util.*;

public class SettingOrderCare {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120835
    // 진료순서 정하기

    public int[] solution(int[] emergency) {
        int[] answer = {};
        answer = new int[emergency.length];
        Map<Integer, Integer> numberMap = new HashMap<>();

        for (int i = 0; i < emergency.length; i++) {
            numberMap.put(emergency[i], i);
        }

        Arrays.sort(emergency);

        for (int i = 0; i < emergency.length; i++) {
            answer[i] = emergency.length - numberMap.get(emergency[i]);
        }

        return answer;
    }
}
