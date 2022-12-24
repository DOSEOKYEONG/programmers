package org.example.level2;

import java.util.*;
public class PickTangerine {
    // https://school.programmers.co.kr/learn/courses/30/lessons/138476
    // 귤 고르기

    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer i : tangerine) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        ArrayList<Integer> arrayList = new ArrayList<>(map.keySet());

        Collections.sort(arrayList, (o1, o2) -> Integer.compare(map.get(o2), map.get(o1)));

        for (Integer num : arrayList) {
            int val = map.get(num);

            if (val >= k) {
                answer++;
                return answer;
            } else {
                k = k - val;
                answer++;
            }
        }

        return answer;
    }
}
