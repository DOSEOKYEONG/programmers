package org.example.level2;
import java.util.ArrayList;

public class NArrayCutting {
    // https://school.programmers.co.kr/learn/courses/30/lessons/87390
    // n^2 배열 자르기

    public int[] solution(int n, long left, long right) {
        int[] answer = {};
        answer = new int[(int)(right - left) + 1];

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int k = 0; k < answer.length; k++) {
            int a = (int) (left / n);
            int b = (int) (left % n);
            answer[k] = Math.max(a, b) + 1;
            left++;
        }

        return answer;
    }
}
