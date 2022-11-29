package org.example.level1;

import java.util.*;

public class StringSortAsMyWill {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12915
    // 문자열 내 마음대로 정렬하기

    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        answer = new String[strings.length];

        ArrayList<String> arrayList = new ArrayList<>();

        for (String str : strings) {
            if (!arrayList.contains(String.valueOf(str.charAt(n)))) {
                arrayList.add(String.valueOf(str.charAt(n)));
            }
        }
        Arrays.sort(strings);
        Collections.sort(arrayList);

        int index = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            String getArrayList = arrayList.get(i);
            for (int j = 0; j < strings.length; j++) {
                if (!strings[j].equals("")) {
                    if (getArrayList.equals(String.valueOf(strings[j].charAt(n)))) {
                        answer[index] = strings[j];
                        strings[j] = "";
                        index++;
                    }
                }
            }
        }
        return answer;
    }
}
