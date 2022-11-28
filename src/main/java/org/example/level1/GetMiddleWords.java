package org.example.level1;

public class GetMiddleWords {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12903
    // 가운데 글자 가져오기

    public String solution(String s) {
        String answer = "";
        if (s.length() % 2 == 0){
            answer += s.substring((s.length() / 2)-1, (s.length() / 2)+1);
        } else {
            answer += s.charAt(s.length()/ 2);
        }
        return answer;
    }
}
