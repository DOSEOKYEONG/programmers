package org.example.level1;

public class StringToInteger {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12925
    // 문자열을 정수로 바꾸기

    public int solution(String s) {
        int answer = 0;
        if (String.valueOf(s.charAt(0)).equals("+")){
            answer = Integer.parseInt(s.substring(1));
        } else if (String.valueOf(s.charAt(0)).equals("-")) {
            answer = -1 * Integer.parseInt(s.substring(1));
        } else {
            answer = Integer.parseInt(s.substring(0));
        }
        return answer;
    }
}
