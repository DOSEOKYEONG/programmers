package org.example.level2;

import java.util.ArrayList;

public class Fibonacci {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12945
    // 피보나치 수

    public int solution(int n) {
        int answer = 0;

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);

        for (int i = 2; i <= n; i++) {
            arrayList.add((arrayList.get(i - 2) + arrayList.get(i - 1)) % 1234567);
        }
        answer = arrayList.get(n);
        return answer;
    }
}
