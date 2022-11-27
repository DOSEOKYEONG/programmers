package org.example.level0;

public class ConsecutiveNums {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120923
    // 연속된 수의 합

    public int[] solution(int num, int total) {
        int[] answer = {};
        // (n(2a + (n - 1)d) / 2
        // num = 4, total = 14
        answer = new int[num];
        int a = (((2 * total) /num) + 1 - num) / 2;

        for(int i = 0; i < answer.length; i++){
            answer[i] = a + i;
        }
        return answer;
    }
}
