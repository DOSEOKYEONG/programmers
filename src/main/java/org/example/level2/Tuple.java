package org.example.level2;

import java.util.*;

public class Tuple {
    // https://school.programmers.co.kr/learn/courses/30/lessons/64065
    // 튜플

    public int[] solution(String s) {
        int[] answer = {};

        String str1 = s.replace("{", "");
        String str2 = str1.replace("}", "");

        String[] strArray = str2.split(",");

        Map<String, Integer> map = new HashMap<>();

        for (String st : strArray) {
            if (!map.containsKey(st)) {
                map.put(st, 1);
            } else {
                map.put(st, map.get(st) + 1);
            }
        }

        ArrayList<String> arrayList = new ArrayList<>(map.keySet());

        Collections.sort(arrayList, (o1, o2) -> Integer.compare(map.get(o2), map.get(o1)));

        answer = new int[map.size()];

        for (int i = 0; i < arrayList.size(); i++) {
            answer[i] = Integer.parseInt(arrayList.get(i));
        }

        return answer;
    }
}
