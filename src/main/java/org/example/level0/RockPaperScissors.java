package org.example.level0;

public class RockPaperScissors {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120839
    // 가위 바위 보

    public String solution(String rsp) {
        String answer = "";
        for (int i = 0; i < rsp.length(); i++) {
            if (String.valueOf(rsp.charAt(i)).equals("2")){
                answer += "0";
            } else if (String.valueOf(rsp.charAt(i)).equals("0")){
                answer += "5";
            } else {
                answer += "2";
            }
        }
        return answer;
    }
}
