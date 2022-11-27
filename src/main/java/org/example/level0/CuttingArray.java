package org.example.level0;

public class CuttingArray {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120833
    // 배열 자르기

    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = {};
        answer = new int[num2-num1+1];

        for(int i = 0; num1 <= num2; num1++){
            answer[i] = numbers[num1];
            i++;
        }

        return answer;
    }
}
