package org.example.level1;

public class StringControlBasic {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12918
    // 문자열 다루기 기본

    public boolean solution(String s) {
        boolean answer = true;

        String str = s.replaceAll("[0-9]", "");

        if (s.length() == 4 || s.length() == 6){
            if (str.length() > 0) {
                answer = false;
            } else {
                answer = true;
            }
        } else {
            answer = false;
        }
        return answer;
    }
}
