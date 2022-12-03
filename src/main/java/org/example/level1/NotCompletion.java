package org.example.level1;

import java.util.*;

public class NotCompletion {
    // https://school.programmers.co.kr/learn/courses/30/lessons/42576
    // 완주하지 못한 선수

    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();

        for (String par : participant) {
            if (map.containsKey(par)) {
                map.put(par, map.get(par) + 1);
            } else {
                map.put(par, 1);
            }
        }

        for (String com : completion) {
            if (map.containsKey(com)) {
                map.put(com, map.get(com) - 1);
            }
        }

        Set<String> keySet = map.keySet();
        for (String ks : keySet) {
            if (map.get(ks) > 0) {
                answer = ks;
                break;
            }
        }

        return answer;
    }
}
