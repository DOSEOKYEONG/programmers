package org.example.level1;

public class GcdAndLcm {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12940
    // 최대공약수와 최소공배수

    public int[] solution(int n, int m) {
        int[] answer = {};
        answer = new int[2];

        if (n > m) {
            answer[0] = gcd(n, m);
            answer[1] = (n * m) / answer[0];
        } else {
            answer[0] = gcd(m, n);
            answer[1] = (n * m) / answer[0];
        }
        return answer;
    }

    public static int gcd(int a, int b) {
        if(b == 0){
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
