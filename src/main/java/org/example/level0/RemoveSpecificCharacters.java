package org.example.level0;

public class RemoveSpecificCharacters {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120826
    // 특정 문자 제거하기

    public String solution(String my_string, String letter) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++){
            if(!Character.toString(my_string.charAt(i)).equals(letter)){
                answer += my_string.charAt(i);
            }
        }

        return answer;
    }
}
