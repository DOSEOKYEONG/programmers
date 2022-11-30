package org.example.level0;

import java.util.Arrays;

public class MakeMax2 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120862
    // 최댓값 만들기(2)

    public int solution(int[] numbers) {
        int answer = -100000000;

        for(int i = 0; i < numbers.length - 1; i++){
            for(int j = i + 1; j < numbers.length; j++){
                if(answer < numbers[i] * numbers[j]){
                    answer = numbers[i] * numbers[j];
                }
            }
        }
        return answer;
    }
}