package org.example.level1;

import java.util.*;

public class DividedNumsArray {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12910
    // 나누어 떨어지는 숫자 배열

    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (Integer num : arr) {
            if (num % divisor == 0) {
                arrayList.add(num);
            }
        }
        if (arrayList.size() == 0) {
            answer = new int[]{-1};
        } else {
            answer = new int[arrayList.size()];

            int index = 0;
            for (Integer nums : arrayList) {
                answer[index] = nums;
                index++;
            }
        }

        Arrays.sort(answer);

        return answer;
    }
}
