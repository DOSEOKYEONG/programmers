package org.example.level2;

public class JadenCaseString {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12951
    // JadenCase 문자열 만들기

    public String solution(String s) {
        String answer = "";
        String[] strArray = s.split(" ", -1);

        for (int i = 0; i < strArray.length; i++) {
            String str = strArray[i];
            if (str.equals("")) {
                answer += "";
            } else {
                String first = str.substring(0, 1).toUpperCase();
                answer += first;
                answer += str.substring(1).toLowerCase();
            }
            if (i != strArray.length - 1) {
                answer += " ";
            }
        }
        return answer;
    }
}
