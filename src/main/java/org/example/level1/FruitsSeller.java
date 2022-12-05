package org.example.level1;
import java.util.*;

public class FruitsSeller {
    // https://school.programmers.co.kr/learn/courses/30/lessons/135808
    // 과일 장수

    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int total = 0;
        Integer[] scoreArray = new Integer[score.length];
        for (int j = 0; j < score.length; j++) {
            scoreArray[j] = score[j];
        }
        Arrays.sort(scoreArray, Collections.reverseOrder());
        int[] array = new int[m];
        for (int i = 0; i < score.length / m; i++) {
            for (int a = 0; a < m; a++) {
                array[a] = scoreArray[a + (i * m)];
            }
            total = array[m - 1] * m;
            answer += total;
        }

        return answer;
    }
}
