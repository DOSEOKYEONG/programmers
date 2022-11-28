package org.example.level1;

public class Average {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12944
    // 평균 구하기

    public double solution(int[] arr) {
        double answer = 0;

        for (Integer i : arr) {
            answer += i;
        }

        answer = answer / arr.length;
        return answer;
    }
}
