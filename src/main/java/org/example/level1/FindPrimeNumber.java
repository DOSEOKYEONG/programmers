package org.example.level1;

import java.util.*;

public class FindPrimeNumber {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12921
    // 소수 찾기

    boolean isPrimeNumber(int x) {
        int end = (int) Math.sqrt(x);
        for (int i = 2; i <= end; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }

    public int solution(int n) {
        int answer = 0;

        for (int cnt = 2; cnt <= n; cnt++) {
            if (isPrimeNumber(cnt)) {
                answer++;
            }
        }

        return answer;
    }
}
