package org.example.level0;

public class RotatingArray {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120844
    // 배열 회전시키기

    public int[] solution(int[] numbers, String direction) {
        int[] answer = {};
        answer = new int[numbers.length];
        if(direction.equals("right")){
            for(int i = 0; i < numbers.length; i++){
                if(i == 0){
                    answer[i] = numbers[numbers.length - 1];
                } else {
                    answer[i] = numbers[i-1];
                }

            }
        } else {
            for(int i = 0; i < numbers.length; i++){
                if(i == numbers.length - 1){
                    answer[i] = numbers[0];
                } else {
                    answer[i] = numbers[i+1];
                }
            }
        }
        return answer;
    }
}
