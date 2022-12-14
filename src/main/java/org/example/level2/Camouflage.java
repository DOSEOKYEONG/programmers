package org.example.level2;

import java.util.*;

public class Camouflage {
    // https://school.programmers.co.kr/learn/courses/30/lessons/42578
    // 위장

    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> map = new HashMap<>();
        for(String[] strArray : clothes){
            String key = strArray[1];

            if(map.containsKey(key)){
                map.put(key, map.get(key) + 1);
            } else{
                map.put(key, 1);
            }
        }

        Set<String> ks = map.keySet();

        for (String str : ks) {
            answer = answer * (map.get(str) + 1);
        }

        return answer - 1;
    }
}