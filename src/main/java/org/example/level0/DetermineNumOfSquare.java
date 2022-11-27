package org.example.level0;

public class DetermineNumOfSquare {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120909
    // 제곱수 판별하기

    public int solution(int n) {
        int answer = 0;
        answer = 2;
        for(int i = 1; i <= (n/2); i++){
            if(i * i == n){
                answer = 1;
            }
        }
        return answer;
    }
}
