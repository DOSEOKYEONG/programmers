package org.example.level2;

import java.util.*;

public class Printer {
    // https://school.programmers.co.kr/learn/courses/30/lessons/42587
    // 프린터

    public int solution(int[] priorities, int location) {
        int answer = 0;

        Queue<Integer> queue = new LinkedList<>();

        for (Integer num : priorities) {
            queue.add(num);
        }

        Arrays.sort(priorities);

        int length = priorities.length - 1;

        while (!queue.isEmpty()) {
            int i = queue.poll();
            if (i == priorities[length - answer]) {
                answer++;
                location--;
                if (location < 0) {
                    break;
                }
            } else {
                queue.add(i);
                location--;
                if (location < 0) {
                    location = queue.size() - 1;
                }
            }
        }

        return answer;
    }
}
