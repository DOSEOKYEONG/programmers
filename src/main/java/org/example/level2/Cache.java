package org.example.level2;
import java.util.*;

public class Cache {
    // https://school.programmers.co.kr/learn/courses/30/lessons/17680
    // [1차] 캐시

    public int solution(int cacheSize, String[] cities) {
        int answer = 0;

        List<String> lru = new LinkedList<>();

        for (String str : cities) {
            if (!lru.contains(str.toLowerCase())) {
                answer += 5;
                lru.add(str.toLowerCase());
                if (lru.size() > cacheSize) {
                    lru.remove(0);
                }
            } else {
                answer += 1;
                lru.remove(lru.indexOf(str.toLowerCase()));
                lru.add(str.toLowerCase());
            }
        }

        return answer;
    }
}
