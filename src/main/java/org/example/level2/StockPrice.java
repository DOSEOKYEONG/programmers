package org.example.level2;

import java.util.LinkedList;
import java.util.Queue;

public class StockPrice {
    // https://school.programmers.co.kr/learn/courses/30/lessons/42584
    // 주식가격

    public int[] solution(int[] prices) {
        int[] answer = {};
        answer = new int[prices.length];

        Queue<Integer> queue = new LinkedList<>();

        for (Integer i : prices) {
            queue.add(i);
        }

        int second = 0;
        int index = 0;
        while (!queue.isEmpty()) {
            int num = queue.poll();
            if (queue.size() == 0) {
                answer[index] = 0;
            }else {
                for (Integer a : queue) {
                    second++;
                    if (num > a) {
                        answer[index] = second;
                        break;
                    } else {
                        answer[index] = second;
                    }
                }
            }
            index++;
            second = 0;
        }

        return answer;
    }
}
