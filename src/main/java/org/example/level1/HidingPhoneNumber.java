package org.example.level1;

public class HidingPhoneNumber {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12948
    // 핸드폰 번호 가리기
    public String solution(String phone_number) {
        String answer = "";
        int index = phone_number.length() - 4;
        for (int i = 0; i < index; i++) {
            answer += "*";
        }
        answer += phone_number.substring(index);
        return answer;
    }
}
