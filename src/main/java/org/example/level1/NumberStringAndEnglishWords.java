package org.example.level1;
import java.util.*;

public class NumberStringAndEnglishWords {
    // https://school.programmers.co.kr/learn/courses/30/lessons/81301
    // 숫자 문자열과 영단어

    public int solution(String s) {
        String answer = "";
        Map<String, String> map = new HashMap<>();
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");

        String[] strArray = s.split("");
        String result = "";
        for (int i = 0; i < strArray.length; i++) {
            if (map.containsValue(strArray[i])) {
                answer += strArray[i];
            } else {
                result += strArray[i];
            }

            if (map.containsKey(result)) {
                answer += map.get(result);
                result = "";
            }
        }
        return Integer.parseInt(answer);
    }
}
