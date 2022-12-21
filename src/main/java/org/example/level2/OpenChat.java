package org.example.level2;

import java.util.*;

public class OpenChat {
    // https://school.programmers.co.kr/learn/courses/30/lessons/42888
    // 오픈채팅방

    public String[] solution(String[] record) {
        String[] answer = {};
        Map<String, String> map = new HashMap<>(); // Id, NickName 구조

        int size = 0;
        for (String s : record) {
            String[] strArray = s.split(" ");
            if (strArray[0].equals("Enter")) {
                map.put(strArray[1], strArray[2]);
                size++;
            } else if (strArray[0].equals("Leave")) {
                size++;
            } else { //
                map.put(strArray[1], strArray[2]);
            }
        }

        answer = new String[size];

        int index = 0;
        for (String s : record) {
            String[] strArray = s.split(" ");
            if (strArray[0].equals("Enter")) {
                answer[index] = map.get(strArray[1]) + "님이 들어왔습니다.";
                index++;
            } else if (strArray[0].equals("Leave")) {
                answer[index] = map.get(strArray[1]) + "님이 나갔습니다.";
                index++;
            }
        }

        return answer;
    }
}
