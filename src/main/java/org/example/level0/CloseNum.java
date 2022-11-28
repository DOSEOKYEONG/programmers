package org.example.level0;
import java.util.*;

public class CloseNum {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120890
    // 가까운 수

    public int solution(int[] array, int n) {
        int answer = 0;
        int[] decreaseArray = new int[array.length];
        Arrays.sort(array);
        for(int i = 0; i < array.length; i++){
            decreaseArray[i] = Math.abs(n - array[i]);
        }
        Arrays.sort(decreaseArray);
        int min = decreaseArray[0];

        for (int i = 0; i < array.length; i++) {
            if (Math.abs(n - array[i]) == min) {
                return array[i];
            }
        }

        return answer;
    }
}
