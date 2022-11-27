package org.example.level0;
import java.util.*;

public class HateEven {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120813
    // 짝수는 싫어요

    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                numbers.add(i);
            }
        }

        answer = new int[numbers.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = numbers.get(i);
        }

        return answer;
    }
}
