package org.example.level0;
import java.util.*;

public class SearchingMostUsedNum {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120812
    // 최빈값 구하기

    public int solution(int[] array) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;

        for(Integer i : array){
            if(!map.containsKey(i)){
                map.put(i, 1);
                if (max < map.get(i)) {
                    max = map.get(i);
                }
            } else {
                map.put(i, map.get(i) + 1);
                if (max < map.get(i)) {
                    max = map.get(i);
                }
            }
        }

        int maxCount = 0;
        for (Integer j : map.keySet()){
            if (max == map.get(j)){
                answer = j;
                maxCount++;
            }
        }

        if (maxCount > 1){
            answer = -1;
        }

        return answer;
    }
}
