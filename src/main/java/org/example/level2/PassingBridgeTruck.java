package org.example.level2;

import java.util.*;

public class PassingBridgeTruck {
    // https://school.programmers.co.kr/learn/courses/30/lessons/42583
    // 다리를 지나는 트럭

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> passingQueue = new LinkedList<>(); // 건너는 트럭

        for (int i = 0; i < bridge_length; i++) {
            passingQueue.add(0);
        }

        int total = 0 ;
        int index = 0;

        while (true) {

            if (passingQueue.isEmpty() && index == truck_weights.length) {
                break;
            }

            passingQueue.poll(); // 첫 번째 삭제

            total = 0;
            for (int n : passingQueue) {
                total += n;
            }

            if (index < truck_weights.length) {
                if (total + truck_weights[index] <= weight) {
                    passingQueue.add(truck_weights[index]);
                    index++;
                }
                else {
                    passingQueue.add(0);
                }
            }

            answer++;
        }

        System.out.println(answer);

        return answer;
    }
}
