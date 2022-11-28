package org.example.level1;

public class EvenAndOdd {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12937
    // 짝수와 홀수

    public String solution(int num) {
        String answer = "";

        if (num % 2 == 0) {
            answer = "Even";
        } else {
            answer = "Odd";
        }
        return answer;
    }
}
