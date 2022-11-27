package org.example.level0;

public class Protractor {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120829
    // 각도기

    public int solution(int angle) {
        int answer = 0;

        if (angle > 0 && angle < 90){
            answer = 1;
        } else if(angle == 90){
            answer = 2;
        } else if(angle > 90 && angle < 180){
            answer = 3;
        } else{
            answer = 4;
        }

        return answer;
    }
}
