package org.example.level0;

public class RemoveDuplicateCharacters {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120888
    // 중복된 문자 제거

    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            if (!answer.contains(String.valueOf(my_string.charAt(i)))) {
                answer += String.valueOf(my_string.charAt(i));
            }
        }
        return answer;
    }
}
