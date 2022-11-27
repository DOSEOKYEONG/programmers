package org.example.level0;

public class MakeArrayDouble {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120809
    // 배열 두 배 만들기

    public int[] solution(int[] numbers) {
        int[] answer = {};
        answer = new int[numbers.length];

        for(int i = 0; i < numbers.length; i++){
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }
}
