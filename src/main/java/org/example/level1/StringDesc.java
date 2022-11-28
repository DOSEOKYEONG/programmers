package org.example.level1;

import java.util.*;

public class StringDesc {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12917
    // 문자열 내림차순으로 배치하기

    public String solution(String s) {
        String answer = "";
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            arrayList.add(String.valueOf(s.charAt(i)));
        }

        Collections.sort(arrayList, Collections.reverseOrder());

        for (String str : arrayList) {
            answer += str;
        }

        return answer;
    }
}
