package org.example.level0;

public class NumOfDuplicateNumbers {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120583
    // 중복된 숫자 개수

    public int solution(int[] array, int n) {
        int answer = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == n){
                answer++;
            }
        }
        return answer;
    }
}
