package org.example.level0;

import java.util.*;

public class StringSort2 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120911
    // 문자열 정렬하기(2)

    public String solution(String my_string) {
        String answer = "";
        String lowCase = my_string.toLowerCase();
        String[] strList = lowCase.split("");
        Arrays.sort(strList);
        for (int i = 0; i < strList.length; i++) {
            answer += strList[i];
        }
        return answer;
    }
}
