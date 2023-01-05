package org.example.level2;
import java.util.*;

public class SerialPartNumberSums {
    // https://school.programmers.co.kr/learn/courses/30/lessons/131701
    // 연속 부분 수열 합의 개수

    Set<Integer> integers;

    public int solution(int[] elements) {
        int answer = 0;
         integers = new LinkedHashSet<>();
        for (int i = 1; i <= elements.length; i++) {
            add(elements, i);
        }

        answer = integers.size();

        return answer;
    }

    public void add(int[] nums, int size) {
        int total = 0;
        for (int j = 0; j < nums.length; j++) {
            for (int k = 0; k < size; k++) {
                total += nums[(j + k)%nums.length];
            }
            integers.add(total);
            if (nums.length == size) {
                break;
            }
            total = 0;
        }
    }
}
