package org.example.level2;

public class ExpectedBracket {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12985
    // 예상 대진표

    public int solution(int n, int a, int b) {
        int answer = 1;

        while(true){

            a = (a+1)/2;
            b = (b+1)/2;

            if(a == b)
                break;

            answer++;

        }

        return answer;
    }
}
