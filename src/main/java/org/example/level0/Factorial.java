package org.example.level0;

public class Factorial {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120848
    // 팩토리얼

    public int solution(int n) {
        int answer = 0;
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                num = num * j;
            }
            if (n < num) {
                return answer;
            }
            answer++;
            num = 1;
        }
        return answer;
    }
}
