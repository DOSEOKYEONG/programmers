package org.example.level2;
import java.util.*;

public class MakeMinimum {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12941
    // 최솟값 만들기

    public int solution(int []A, int []B)
    {
        int answer = 0;

        Arrays.sort(A);
        Integer[] newB = new Integer[B.length];
        for (int i = 0; i < B.length; i++) {
            newB[i] = B[i];
        }
        Arrays.sort(newB, Collections.reverseOrder());

        for (int j = 0; j < A.length; j++) {
            answer += A[j] * newB[j];
        }

        return answer;
    }
}
