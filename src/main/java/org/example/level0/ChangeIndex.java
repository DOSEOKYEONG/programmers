package org.example.level0;

public class ChangeIndex {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120895
    // 인덱스 바꾸기

    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String temp1 = String.valueOf(my_string.charAt(num1));
        String temp2 = String.valueOf(my_string.charAt(num2));
        for(int i = 0; i < my_string.length(); i++){
            if(i == num1){
                answer += temp2;
            } else if(i == num2){
                answer += temp1;
            } else {
                answer += String.valueOf(my_string.charAt(i));
            }
        }
        return answer;
    }
}
