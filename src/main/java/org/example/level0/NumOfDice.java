package org.example.level0;

public class NumOfDice {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120845
    // 주사위의 개수

    public int solution(int[] box, int n) {
        int answer = 0;
        answer = (box[0]/n) * (box[1]/n) * (box[2] / n);
        return answer;
    }
}
