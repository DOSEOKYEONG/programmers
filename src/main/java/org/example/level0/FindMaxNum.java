package org.example.level0;

public class FindMaxNum {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120899
    // 가장 큰 수 찾기

    public int[] solution(int[] array) {
        int[] answer = {};
        answer = new int[2];
        int max = 0;
        for(int i = 0; i < array.length - 1; i++){
            int temp = Math.max(array[i], array[i + 1]);
            if(max < temp){
                max = temp;
            }
        }

        answer[0] = max;
        for (int i = 0; i < array.length; i++){
            if(array[i] == max){
                answer[1] = i;
            }
        }
        return answer;
    }
}
