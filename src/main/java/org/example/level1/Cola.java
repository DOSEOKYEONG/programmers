package org.example.level1;

public class Cola {
    // https://school.programmers.co.kr/learn/courses/30/lessons/132267
    // 콜라 문제

    public int solution(int a, int b, int n) {
        int answer = 0;
        int serviceCola;
        int leftCola;

        // a = 2, b = 1, n = 20
        while (n >= a){
            answer += (n / a) * b; // + 10
            serviceCola = (n / a) * b; // + 10
            leftCola = n % a; // 10 % 2; 0
            n = serviceCola + leftCola;
        }

        return answer;
    }
}
