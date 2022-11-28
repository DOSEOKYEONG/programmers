package org.example.level0;

public class SharingPizza2 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120815
    // 피자 나눠 먹기(2)

    public int solution(int n) {
        int answer = 0;
        answer++;
        while ((answer * 6) % n !=0){
            answer++;
        }

        return answer;
    }
}
