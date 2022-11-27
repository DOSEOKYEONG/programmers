package org.example.level0;

public class LambSkewers {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120830
    // 양꼬치

    public int solution(int n, int k) {
        int answer = 0;

        k = k - (n / 10);

        answer = (n * 12000) + (2000 * k);
        return answer;
    }
}
