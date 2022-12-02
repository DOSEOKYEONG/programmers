package org.example.level1;

import java.util.*;

public class WorkoutClothes {
    // https://school.programmers.co.kr/learn/courses/30/lessons/42862
    // 체육복

    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        ArrayList<Integer> resArrayList = new ArrayList<>();
        ArrayList<Integer> lostArrayList = new ArrayList<>();
        Arrays.sort(reserve);
        Arrays.sort(lost);

        for (Integer los : lost) {
            lostArrayList.add(los);
        }

        for (Integer res : reserve) {
            if (lostArrayList.contains(res)) {
                lostArrayList.remove(lostArrayList.indexOf(res));
            } else {
                resArrayList.add(res);
            }
        }

        int success = 0;
        for (int i = 0; i < lostArrayList.size(); i++) {
            if (resArrayList.contains(lostArrayList.get(i)-1)) {
                resArrayList.remove(resArrayList.indexOf(lostArrayList.get(i) - 1));
                success++;
            } else if (resArrayList.contains(lostArrayList.get(i)+1)) {
                resArrayList.remove(resArrayList.indexOf(lostArrayList.get(i) + 1));
                success++;
            }
        }

        answer = n - lostArrayList.size() + success;

        return answer;
    }
}
