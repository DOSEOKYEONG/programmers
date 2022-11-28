package org.example.level1;

public class InnerProduct {
    // https://school.programmers.co.kr/learn/courses/30/lessons/70128
    // 내적

    public int solution(int[] a, int[] b) {
        int answer = 1234567890;
        answer = 0;
        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }
        return answer;
    }
}
