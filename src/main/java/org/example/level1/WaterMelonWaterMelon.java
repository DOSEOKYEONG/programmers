package org.example.level1;

public class WaterMelonWaterMelon {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12922
    // 수박수박수박수박수박수?

    public String solution(int n) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                answer += "수";
            } else {
                answer += "박";
            }
        }
        return answer;
    }
}
