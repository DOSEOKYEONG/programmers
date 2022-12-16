package org.example.level2;

import java.util.*;

public class PhoneNumberList {
    // https://school.programmers.co.kr/learn/courses/30/lessons/42577
    // 전화번호 목록

    public boolean solution(String[] phone_book) {
        boolean answer = true;

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < phone_book.length; i++) {
            map.put(phone_book[i], i);
        }

        for (String s : phone_book) {
            for (int j = 1; j < s.length(); j++) {
                String str = s.substring(0, j);
                if (map.containsKey(str)) {
                    return false;
                }
            }
        }

        return answer;
    }
}
