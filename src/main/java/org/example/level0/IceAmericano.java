package org.example.level0;

public class IceAmericano {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120819
    // 아이스아메리카노

    public int[] solution(int money) {
        int[] answer = {};
        answer = new int[2];

        answer[0] = money / 5500;
        answer[1] = money % 5500;
        return answer;
    }
}
