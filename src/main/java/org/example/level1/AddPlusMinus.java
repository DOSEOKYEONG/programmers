package org.example.level1;

public class AddPlusMinus {
    // https://school.programmers.co.kr/learn/courses/30/lessons/76501
    // 음양 더하기

    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 123456789;
        answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i] == true){
                answer += absolutes[i];
            } else {
                answer += -1 * absolutes[i];
            }
        }
        return answer;
    }
}
