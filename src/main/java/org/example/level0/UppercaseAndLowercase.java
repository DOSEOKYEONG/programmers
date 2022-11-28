package org.example.level0;

public class UppercaseAndLowercase {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120893
    // 대문자와 소문자

    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++){
            if(Character.isLowerCase(my_string.charAt(i))){
                answer += String.valueOf(my_string.charAt(i)).toUpperCase();
            } else {
                answer += String.valueOf(my_string.charAt(i)).toLowerCase();
            }
        }
        return answer;
    }
}
