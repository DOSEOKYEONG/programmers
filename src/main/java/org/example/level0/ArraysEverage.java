package org.example.level0;

public class ArraysEverage {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120817
    // 배열의 평균값

    public double solution(int[] numbers) {
        double answer = 0;

        for(int i =0; i < numbers.length; i++){
            answer += numbers[i];
        }

        answer = answer / numbers.length;

        return answer;
    }
}
