package org.example.level2;
import java.util.*;

public class FunctionDevelopment {
    // https://school.programmers.co.kr/learn/courses/30/lessons/42586
    // 기능개발

    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            queue.add((int) (Math.ceil((100.0 - progresses[i]) / speeds[i])));
        }

        ArrayList<Integer> arrayList = new ArrayList<>();

        while (!queue.isEmpty()) {
            int day = queue.poll();
            int clear = 1;

            while(!queue.isEmpty() && day >= queue.peek()){
                clear++;
                queue.poll();
            }
            arrayList.add(clear);
        }

        answer = new int[arrayList.size()];

        for (int j = 0; j < arrayList.size(); j++) {
            answer[j] = arrayList.get(j);
        }

        return answer;
    }
}
