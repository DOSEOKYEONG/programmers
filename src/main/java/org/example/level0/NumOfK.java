package org.example.level0;

public class NumOfK {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120887
    // K의 개수

    public int solution(int i, int j, int k) {
        int answer = 0;
        for(; i<=j; i++){
            for (int a = 0; a < String.valueOf(i).length(); a++){
                if(String.valueOf(String.valueOf(i).charAt(a)).contains(String.valueOf(k))){
                    answer++;
                }
            }
        }
        return answer;
    }
}
