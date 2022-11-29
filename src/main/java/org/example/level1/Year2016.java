package org.example.level1;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Year2016 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12901
    // 2016년

    public String solution(int a, int b) {
        String answer = "";
        LocalDate date = LocalDate.of(2016, a, b);

        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int dayOfWeekNum = dayOfWeek.getValue();
        if (dayOfWeekNum == 1){
            answer = "MON";
        } else if (dayOfWeekNum == 2){
            answer = "TUE";
        } else if (dayOfWeekNum == 3){
            answer = "WED";
        } else if (dayOfWeekNum == 4){
            answer = "THU";
        } else if (dayOfWeekNum == 5){
            answer = "FRI";
        } else if (dayOfWeekNum == 6){
            answer = "SAT";
        } else if (dayOfWeekNum == 7){
            answer = "SUN";
        }
        return answer;
    }
}
