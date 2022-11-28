package org.example.level0;

public class ThrowBall {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120843
    // 공 던지기

    public int solution(int[] numbers, int k) {
        int answer = 0;
        answer = numbers[0];
        for(int i = 1; i < k; i ++){
            answer = numbers[ (2 * i) % numbers.length];
        }
        return answer;
    }
}
