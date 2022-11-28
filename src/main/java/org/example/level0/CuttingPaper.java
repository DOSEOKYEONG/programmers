package org.example.level0;

public class CuttingPaper {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120922
    // 종이 자르기

    public int solution(int M, int N) {
        int answer = 0;
        if(M<N){
            answer = (M-1) + M * (N-1);
        }else{
            answer = (N-1) + N * (M-1);
        }
        return answer;
    }
}
