package org.example.level0;

public class AddN {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120906
    // 자릿수 더하기
    public int solution(int n) {
        int answer = 0;
        while(n > 0){
            answer += n % 10;
            n = n / 10;
        }
        return answer;
    }
}
