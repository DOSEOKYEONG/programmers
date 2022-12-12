package org.example.level2;

public class LongJump {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12914
    // 멀리 뛰기

    public long solution(int n) {
        long answer = 0;

        // 1칸 씩
        answer++;

        // 2 조합
        for (int i = 1; i * 2 <= n; i++) {
            answer += combination(n - i, i);
        }

        return answer;
    }

    public static int combination(int n, int k) {

        if (k == 0 || n == k) {
            return 1;
        } else if (k == 1) {
            return n;
        } else {
            return combination(n - 1, k - 1) + combination(n - 1, k);
        }
    }
}
