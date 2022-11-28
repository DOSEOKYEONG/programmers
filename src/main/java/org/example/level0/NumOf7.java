package org.example.level0;

public class NumOf7 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120912
    // 7의 개수

    public int solution(int[] array) {
        int answer = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < String.valueOf(array[i]).length(); j++){
                if(String.valueOf(String.valueOf(array[i]).charAt(j)).equals("7")){
                    answer++;
                }
            }
        }
        return answer;
    }
}
