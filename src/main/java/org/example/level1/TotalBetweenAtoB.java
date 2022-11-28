package org.example.level1;

public class TotalBetweenAtoB {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12912
    // 두 정수 사이의 합
    public long solution(int a, int b) {
        long answer = 0;

        if (a > b) {
            for (int i = b + 0; i <= a; i++) {
                answer += i;
            }
        } else {
            for (int i = a + 0; i <= b; i++) {
                answer += i;
            }
        }

        return answer;
    }
}
