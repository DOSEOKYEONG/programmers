package org.example.level1;

import java.util.*;

public class FailureRate {
    // https://school.programmers.co.kr/learn/courses/30/lessons/42889
    // 실패율

    public int[] solution(int N, int[] stages) {
        int[] answer = {};
        answer = new int[N];
        Map<Integer, Double> map = new HashMap<>();

        int denominator = stages.length;
        for (int i = 1; i <= N; i++) {
            int count = 0;
            for (Integer num : stages) {
                if (num == i) {
                    count++;
                }
            }
            if (count == 0) {
                map.put(i, (double) 0);
            } else {
                map.put(i, (double)count / denominator);
            }

            denominator -= count;
        }

        List<Integer> keyList = new ArrayList<>(map.keySet());

        Collections.sort(keyList, (o1, o2) -> Double.compare(map.get(o2), map.get(o1))); // value 값 기준으로 내림차순

        for (int j = 0; j < N; j++) {
            answer[j] = keyList.get(j);
        }

        return answer;
    }
}
