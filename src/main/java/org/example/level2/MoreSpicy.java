package org.example.level2;

import java.util.PriorityQueue;
import java.util.Queue;

public class MoreSpicy {
    // https://school.programmers.co.kr/learn/courses/30/lessons/42626
    // 더 맵게

    public int solution(int[] scoville, int K) {
        int answer = 0;

        Queue<Integer> queue = new PriorityQueue<>();

        for (Integer n : scoville) {
            queue.add(n);
        }

        while (queue.peek() < K) {
            answer++;
            if (queue.size() == 1) {
                return -1;
            }
            int num1 = queue.poll();
            int num2 = queue.poll();
            queue.offer(num1 + (num2 * 2));
        }

        return answer;
    }
}
