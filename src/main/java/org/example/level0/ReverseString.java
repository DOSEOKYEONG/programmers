package org.example.level0;

public class ReverseString {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120822
    // 문자열 뒤집기

    public String solution(String my_string) {
        String answer = "";

        for(int i = 0; i < my_string.length(); i++){
            answer = answer + my_string.charAt(my_string.length() - 1 - i);
        }

        return answer;
    }
}
