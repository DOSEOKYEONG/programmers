package org.example.level0;

public class BacterialGrowth {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120910
    // 세균 증식

    public int solution(int n, int t) {
        int answer = 0;
        answer +=n;
        for(int i = 0; i < t; i++){
            answer = answer * 2;
        }

        return answer;
    }
}
