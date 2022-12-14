package org.example.level2;

import java.util.*;

public class Printer {
    // https://school.programmers.co.kr/learn/courses/30/lessons/42587
    // 프린터

    public int solution(int[] priorities, int location) {
        int answer = 0;

        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < priorities.length; i++) {
            queue.add(priorities[i]);
        }

        while (!queue.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == queue.peek()) {
                    if (i == location) {
                        answer++;
                        return answer;
                    }
                    queue.poll();
                    answer++;
                }
            }
        }

        return -1;
    }
}
