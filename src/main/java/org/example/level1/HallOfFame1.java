package org.example.level1;
import java.util.*;

public class HallOfFame1 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/138477
    // 명예의 전당 (1)

    public int[] solution(int k, int[] score) {
        int[] answer = {};
        answer = new int[score.length];
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            if (arrayList.size() < k) {
                arrayList.add(score[i]);
                Collections.sort(arrayList, Collections.reverseOrder());
                answer[i] = arrayList.get(arrayList.size() - 1);
            } else{
                arrayList.add(score[i]);
                Collections.sort(arrayList, Collections.reverseOrder());
                answer[i] = arrayList.get(k -1);
            }
        }
        return answer;
    }
}
