package org.example.level2;
import java.util.*;

public class Carpet {
    // https://school.programmers.co.kr/learn/courses/30/lessons/42842
    // 카펫

    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        answer = new int[2];
        int total = brown + yellow;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= Math.sqrt(total); i++) {
            if (total % i == 0) {
                map.put(i, total / i);
            }
        }

        int max = 0;
        for (Integer num : map.keySet()){
            if ((num - 2) * (map.get(num) - 2) == yellow) {
                answer[0] = map.get(num);
                answer[1] = num;
            }
        }

        return answer;
    }
}
