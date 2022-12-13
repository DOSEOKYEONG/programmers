package org.example.level2;
import java.util.*;

public class HIndex {
    // https://school.programmers.co.kr/learn/courses/30/lessons/42747
    // H-Index

    public int solution(int[] citations) {
        int answer = 0;

        Integer[] numArray = new Integer[citations.length];

        for (int i = 0; i < citations.length; i++) {
            numArray[i] = citations[i];
        }

        Arrays.sort(numArray, Collections.reverseOrder());

        for (int j = 0; j < numArray.length; j++) {
            if (numArray[j] >= j + 1) {
                answer = j + 1;
            } else{
                break;
            }
        }

        return answer;
    }
}
