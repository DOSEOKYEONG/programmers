package org.example.level0;

public class AntLegion {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120837
    // 개미 군단

    public int solution(int hp) {
        int answer = 0;
        int general = 5;
        int soldier = 3;
        int work = 1;

        while(hp > 0){
            if(hp >= 5){
                answer += hp / general;
                hp = hp % general;
            } else if(hp >=3 && hp < 5){
                answer += hp / soldier;
                hp = hp % soldier;
            } else{
                answer += hp / work;
                hp = hp % work;
            }
        }

        return answer;
    }
}
