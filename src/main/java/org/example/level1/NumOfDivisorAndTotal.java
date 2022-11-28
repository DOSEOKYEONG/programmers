package org.example.level1;

public class NumOfDivisorAndTotal {
    // https://school.programmers.co.kr/learn/courses/30/lessons/77884
    // 약수의 개수와 덧셈

    public int solution(int left, int right) {
        int answer = 0;
        int numOfDivisor;
        for (int i = left + 0; i <= right; i++) {
            numOfDivisor = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    numOfDivisor++;
                }
            }
            if (numOfDivisor % 2 == 0) {
                answer = answer + i;
            } else {
                answer = answer - i;
            }
        }
        return answer;
    }
}
