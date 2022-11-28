package org.example.level1;

public class CalculateInsufficientAmount {
    // https://school.programmers.co.kr/learn/courses/30/lessons/82612
    // 부족한 금액 계산하기

    public long solution(int price, int money, int count) {
        long answer = -1;

        long pay = 0;

        for (int i = 1; i <= count; i++) {
            pay += i * price;
        }
        if (pay - money > 0) {
            answer = Math.abs(pay - money);
        } else {
            answer = 0;
        }

        return answer;
    }
}
