package org.example.level1;

import java.util.*;

public class ReverseAndMakeArray {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12932
    // 자연수 뒤집어 배열로 만들기

    public int[] solution(long n) {
        int[] answer = {};
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (n > 0) {
            arrayList.add((int) (n % 10));
            n = n / 10;
        }
        answer = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }

        return answer;
    }
}
