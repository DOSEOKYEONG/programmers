package org.example.level1;

public class XGapNNums {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12954
    // x만큼 간격이 있는 n개의 숫자

    public long[] solution(int x, int n) {
        long[] answer = {};
        answer = new long[n];

        for (int i = 0; i < n; i++) {
            answer[i] = (long) x * (i + 1);
        }
        return answer;
    }
}
