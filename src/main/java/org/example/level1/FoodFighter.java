package org.example.level1;

public class FoodFighter {
    // https://school.programmers.co.kr/learn/courses/30/lessons/134240
    // 푸드파이터 대회

    public String solution(int[] food) {
        String answer = "";

        for (int i = 1; i < food.length; i++) {
            if (food[i] % 2 == 0) { // 짝수일 경우
                for (int j = 0; j < food[i] / 2; j++) {
                    answer += i;
                }
            } else { // 홀수일 경우
                for (int j = 0; j < (food[i] - 1) / 2; j++) {
                    answer += i;
                }
            }
        }

        StringBuffer stringBuffer = new StringBuffer(answer);
        String answerReverse = stringBuffer.reverse().toString();

        answer = answer + "0" + answerReverse;

        return answer;
    }
}
