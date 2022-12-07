package org.example.level2;

import java.util.ArrayList;

public class NumberExpression {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12924
    // 숫자의 표현

    public int solution(int n) {
        int answer = 0;

        ArrayList<Integer> arrayList = new ArrayList<>();

        if (n % 2 == 1) {
            arrayList.add(2);
            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    if (i % 2 == 1) {
                        arrayList.add(i);
                    }
                }
            }
        } else {
            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    if (i % 2 == 1) {
                        arrayList.add(i);
                    }
                }
            }
        }

        answer = arrayList.size();

        return answer;
    }
}
