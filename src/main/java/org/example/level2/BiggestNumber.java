package org.example.level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BiggestNumber {
    // https://school.programmers.co.kr/learn/courses/30/lessons/42746
    // 가장 큰 수

    public String solution(int[] numbers) {
        String answer = "";
        ArrayList<String> arrayList = new ArrayList<>();

        for (int a : numbers) {
            arrayList.add(String.valueOf(a));
        }

        Collections.sort(arrayList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                Long num1 = convertNum(o1, o2);
                Long num2 = convertNum(o2, o1);

                int ss = (int) (num2 - num1);
                return ss;
            }
        });

        for (String s : arrayList) {
            answer += s;
        }

        if (answer.charAt(0) == '0'){
            answer = "0";
        }

        return answer;
    }

    public Long convertNum(String str1, String str2){
        String rs = str1 + str2;

        return Long.parseLong(rs);
    }
}
