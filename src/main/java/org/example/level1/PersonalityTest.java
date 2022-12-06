package org.example.level1;

import java.util.*;

public class PersonalityTest {
    // https://school.programmers.co.kr/learn/courses/30/lessons/118666
    // 성격 유형 검사하기

    public String solution(String[] survey, int[] choices) {
        String answer = "";
//      survey	choices	result
//      ["AN", "CF", "MJ", "RT", "NA"]	[5, 3, 2, 7, 5]	"TCMA"
//      ["TR", "RT", "TR"]	[7, 1, 3]	"RCJA"
//      지표 번호	성격 유형
//      1번 지표	라이언형(R), 튜브형(T)
//      2번 지표	콘형(C), 프로도형(F)
//      3번 지표	제이지형(J), 무지형(M)
//      4번 지표	어피치형(A), 네오형(N)
        Map<String, Integer> map = new HashMap<>();
        map.put("R", 0);
        map.put("T", 0);
        map.put("C", 0);
        map.put("F", 0);
        map.put("J", 0);
        map.put("M", 0);
        map.put("A", 0);
        map.put("N", 0);
        for (int i = 0; i < survey.length; i++) {
            int cho = choices[i];
            if (cho < 4) {
                int score = Math.abs(cho - 4);
                String sur = survey[i].split("")[0];
                map.put(sur, map.get(sur) + score);
            } else{
                int score = Math.abs(cho - 4);
                String sur = survey[i].split("")[1];
                map.put(sur, map.get(sur) + score);
            }
        }

        if (map.get("R") > map.get("T")) {
            answer += "R";
        } else if (map.get("R") == map.get("T")) {
            answer += "R";
        } else {
            answer += "T";
        }

        if (map.get("C") > map.get("F")) {
            answer += "C";
        } else if (map.get("C") == map.get("F")) {
            answer += "C";
        } else {
            answer += "F";
        }

        if (map.get("J") > map.get("M")) {
            answer += "J";
        } else if (map.get("J") == map.get("M")) {
            answer += "J";
        } else {
            answer += "M";
        }

        if (map.get("A") > map.get("N")) {
            answer += "A";
        } else if (map.get("A") == map.get("N")) {
            answer += "A";
        } else {
            answer += "N";
        }

        return answer;
    }
}
