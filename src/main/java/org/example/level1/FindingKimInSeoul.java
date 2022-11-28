package org.example.level1;

public class FindingKimInSeoul {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12919
    // 서울에서 김서방 찾기

    public String solution(String[] seoul) {
        String answer = "";
        int i = 0;
        for (String str : seoul) {
            if (str.equals("Kim")) {
                return "김서방은 " + i + "에 있다";
            }
            i++;
        }
        return answer;
    }
}
