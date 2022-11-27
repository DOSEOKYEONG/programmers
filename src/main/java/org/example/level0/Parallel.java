package org.example.level0;

import java.util.*;

public class Parallel {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120875
    // 평행

    public int solution(int[][] dots) {
        int answer = 0;
        ArrayList<Double> arr = new ArrayList<>();
        for (int i = 0; i < dots.length - 1; i++) {
            if (answer == 1) {
                break;
            } else {
                for (int j = i + 1; j < dots.length; j++) {
                    double tmp = (double) (dots[i][1] - dots[j][1]) / (dots[i][0] - dots[j][0]);
                    if (arr.contains(tmp)) {
                        answer = 1;
                        break;
                    } else {
                        arr.add(tmp);
                    }
                }
            }
        }
        return answer;
    }
}
